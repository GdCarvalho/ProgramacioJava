import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class testFacturas {

	public static void main(String[] args) {
		// Creamos una matriz de facturas

		factura facturas[] = new factura[100];
		facturas[0] = new factura("ow34", LocalDate.now(), 345.67f);
		facturas[1] = new factura("RT54", LocalDate.of(2022, 10, 29), 666f);
		facturas[2] = new factura("ff66", LocalDate.of(2022, 02, 15), 1302.00f);

		// Mostrar por pantalla toda la info de las facturas

		for (factura f : facturas) {
			if (f != null) {
				System.out.println(f);
			}
		}

		char opcion;
		boolean salir = false;

		do {
			Scanner lector = new Scanner(System.in);
			System.out.println("a.Introducir una nueva factura");
			System.out.println("b. Buscar una factura apartir de su código");
			System.out.println("c. Buscar factura por fecha");
			System.out.println("d. Eliminar una factura.");
			System.out.println("e. Calcular total facturado");
			System.out.println("f. Salir");
			opcion = lector.nextLine().charAt(0);

			switch (opcion) {

			case 'a':
				System.out.println("Introduzca el cógido");
				String codigo = new Scanner(System.in).nextLine();
				System.out.println("Introduzca la fecha dd-mm-aaaa");
				String fecha = new Scanner(System.in).nextLine();
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
				LocalDate fechaFactura = LocalDate.parse(fecha, formatter);
				System.out.println("Introduzca el importe");
				Float importe = new Scanner(System.in).nextFloat();
				// Creamos el objeto factura
				factura f = new factura(codigo, fechaFactura, importe);
				if (MetodosFacturas.guardarFactura(f, facturas)) {
					System.out.println("Factura guardada con éxito");
					MetodosFacturas.mostrarFacturas(facturas);

				} else {
					System.out.println("No hay espacio para esta factura");
				}

				break;

			case 'b':
				// buscar factura a partir del código
				System.out.println("Introducir código de la factura");
				String codigo01 = new Scanner(System.in).nextLine();
				factura fBuscada = MetodosFacturas.buscarFactura(codigo01, facturas);
				if (fBuscada != null) {
					System.out.println(fBuscada);
				} else {
					System.out.println("La factura no está el la base de datos");
				}
				break;

			case 'c': // mostrar factura por fecha

				System.out.println("Introduzca la fecha dd-mm-aaaa");
				String fechaBuscada = new Scanner(System.in).nextLine();
				LocalDate fecha01 = Utiles.stringToLocalDate(fechaBuscada);
				// Recorrer la matriz buscando la fecha

				for (factura fac : facturas) {
					if (fac != null) {
						if (fac.getFecha().isEqual(fecha01)) {
							System.out.println(fac);
						}
					} else {
						break;
					}
				}
			case 'd':
				// Eliminar factura
				System.out.println("Introducir código de la factura a eliminar");
				String codigo02 = new Scanner(System.in).nextLine();
				if (MetodosFacturas.eliminarFactura(codigo02, facturas)) {
					System.out.println("Factura eliminada correctamente");
				} else {
					System.out.println("No se ha podido eliminar la factura");
				}
				break;

			case 'e':
				// calcular total facturado
				float total = 0;
				for (factura fa : facturas) {
					if (fa != null) {
						total = total + fa.getImporte();
					}
					// else { no podemos salir del bucle porque nuestra factura no está ordenada y
					// puede haber un null por en medio
					// break;
					// }
				}
				System.out.println("Total facturado:" + total);
				break;

			case 'f':
				salir = true;
				break;
			default:
				System.out.println("Pulse f para salir");

			}// fin del switch

		} while (!salir);

	}
}
