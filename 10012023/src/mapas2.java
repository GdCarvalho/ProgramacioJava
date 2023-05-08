import java.util.*;

public class mapas2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//aSOCIAR UNA LISTA DE FACTURAS Y ASOCIARLAS A UN CLIENTE
		ArrayList<factura> facturas=new ArrayList<factura>();
		facturas.add(new factura("A1",456));
		facturas.add(new factura("A2",233));
		facturas.add(new factura("A3",578));
		facturas.add(new factura("A4",722));
		facturas.add(new factura("A5",5));
		facturas.add(new factura("A6",65));
		facturas.add(new factura("A7",95));
		
		
		ArrayList<factura> facturas2=new ArrayList<factura>();
		facturas2.add(new factura("B1",456));
		facturas2.add(new factura("B2",233));
		facturas2.add(new factura("B3",578));
		facturas2.add(new factura("B4",722));
		
		
		HashMap<String,ArrayList<factura>> contabilidad=new HashMap<String,ArrayList<factura>>();
		
		contabilidad.put("12345678A", facturas);
		contabilidad.put("14444678A", facturas2);
		
		//Obtener el total facturado de un cliente
		
		String dniCliente="12345678A";
		ArrayList<factura> f1=contabilidad.get(dniCliente);
		float suma=0;
		for(factura f: f1) {
			suma=suma+f.getImporte();	
		}
		
		System.out.println("Total facturado cliente" +dniCliente+" "+suma );
		
		
	}

}
