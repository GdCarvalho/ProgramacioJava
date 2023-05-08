import java.util.*;
import java.util.Map.Entry;
;

public class mapas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, factura> facturasPendientes=new HashMap<String, factura>();
		facturasPendientes.put("12345678A",new factura("A1",300));
		facturasPendientes.put("34567890S",new factura("A2",433));
		facturasPendientes.put("34246889I",new factura("A3",444));
		facturasPendientes.put("12345678A",new factura("A4",556));
		
		
		//Visualizar las entradas de un mapa
		//Obtener previamente la coleccion de valores
		Collection<factura> facturas=facturasPendientes.values();
		//y ahora si podemos usar un for each 
		for(factura f:facturas) {
			System.out.println(f);
		}
		
		System.out.println("Impresión de DNI's");
		//para poder ver también las claves
		Set<String>clientes=facturasPendientes.keySet();
		//y ahora podemos usar un for each
		for(String s: clientes) {
			System.out.println(s);
		}
		
		//SI QUIERO HACERLO TODO CON UN SOLO FOR
		Set<Entry<String,factura>>entradas= facturasPendientes.entrySet();
		
		for(Entry<String,factura> e: entradas) {
			System.out.println("DNI: "+e.getKey()+" "+e.getValue());
				
		}
		
		//El punto fuerte de los mapas es realizar búsquedas por clave:
		factura f1=facturasPendientes.get("12345678A");
		
		
		//Para obtenr el DNI asociado a una factura cuyo código es a1
		//1ro obtenemos el conjunto de entradas, en este caso es facturas pendiente
		System.out.println("MOSTRAR DNI asociado a factura A3");
		for(Entry<String,factura> f:entradas) {
			if(f.getValue().getCodigo().equals("A3")){
				System.out.println(f.getKey());
			}
		}
		
		
		
		
		
		
		
	}

}
