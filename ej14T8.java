package t8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class ej14T8 {
	public static void main(String[] args) {
	HashMap <String,Double[]> listaCompra=new HashMap <String,Double[]> ();
	
	
	rellenaDatos(listaCompra );
	muestraDatos(listaCompra);
	sumaDatos(listaCompra);
	
 	}
	public static void rellenaDatos(HashMap<String, Double[]> listaCompra) {
		Scanner t =new Scanner (System.in); 
		String clave , tira[] ;
		Double valor ;
		Double [] precioYCantidad;
		
		do {
			System.out.println("Dime un articulo ,la cantidad y su precio");
			tira=t.nextLine().split(" ");
			clave=tira[0];
			precioYCantidad=new Double [2];
			precioYCantidad[0]=new Double (tira[1]); // Cantidad
			precioYCantidad[1]=new Double (tira[2]); //Precio
		
			listaCompra.put(clave, precioYCantidad);
		}while(!clave.equals("0")&& !precioYCantidad[0].equals(0) && !precioYCantidad[1].equals(0));
		listaCompra.remove("0");
	}
	public static void muestraDatos(HashMap<String, Double[]> listaCompralistaCompra) {
		Object clave ;
		float aux;
		
		System.out.println("Tiquet de la compra");
		System.out.println("Articulo     Cantidad    Precio     Subtotal");
			
		Set<String> s =listaCompralistaCompra.keySet();
		
		Iterator<String> it =s.iterator();
		while(it.hasNext()){
			clave=it.next();
			aux=(float) (listaCompralistaCompra.get(clave)[0]*listaCompralistaCompra.get(clave)[1]);
			System.out.println(clave.toString()+"         "+ listaCompralistaCompra.get(clave)[0]+"        " +listaCompralistaCompra.get(clave)[1]+"        " +aux);
		}
	
	
	}
	public static void sumaDatos(HashMap<String, Double[]> listaCompralistaCompra) {
		Double total = 0.0;
		Object clave;
		
		Set<String> s =listaCompralistaCompra.keySet();
		
		Iterator<String> it =s.iterator();
		while(it.hasNext()){
			clave=it.next();
			total=total+listaCompralistaCompra.get(clave)[0]*listaCompralistaCompra.get(clave)[1];
		}
		System.out.println("Total="+"                                   "+total);
		
		
		
		
		
	}
}
