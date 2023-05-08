import java.time.LocalDate;

public class testGestorFacturas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		gestorFacturas miGestor =new gestorFacturas();
		gestorFacturas nuevoGestor=new gestorFacturas(50);
		
		
		miGestor.guardarFactura(new factura("we34",LocalDate.of(2022,11, 01), 1300));
		miGestor.guardarFactura(new factura("wr44",LocalDate.of(2022,11, 01), 1560));
		miGestor.mostrarFacturas();
		System.out.println("TotalFacturaro"+miGestor.totalFacturado());
		
	}

}
