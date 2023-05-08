import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Empleado plantilla[] = new Empleado[10];
		boolean salir = false;
		int opcion = 0;
		do {
			// Guardar un empleado en la primera posición vacía
			System.out.println("1.Guardar un empleado");
			System.out.println("2.Guardar un directivo");
			System.out.println("3.Guardar un administrativo");
			System.out.println("4.Actualizar salariosde todos los empleados");
			System.out.println("5.Activar bono a todos los directivos de la empresa");
			opcion = new Scanner(System.in).nextInt();
			switch (opcion) {
			case 1:
				Scanner lector = new Scanner(System.in);
				System.out.println("Introduce datos del empleado:");
				System.out.println("Nombre:");
				String nombre = lector.nextLine();
				System.out.println("DNI: ");
				String dni = lector.nextLine();
				System.out.println("Introduzca la fecha de nacimiento dd-mm-aaaa");
				String fecha = new Scanner(System.in).nextLine();
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
				LocalDate fechaNacimiento = LocalDate.parse(fecha, formatter);
				System.out.println("Introduzca la fecha de contratación dd-mm-aaaa");
				String fechaC = new Scanner(System.in).nextLine();
				DateTimeFormatter formatter01 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
				LocalDate fechaContratacion = LocalDate.parse(fechaC, formatter01);

				// Busco la primera posición vacía
				for (int i = 0; i < plantilla.length; i++) {
					if (plantilla[i] == null) {
						plantilla[i] = new Empleado(dni, fechaNacimiento, fechaContratacion, nombre);
						break;
					}
				}
				//Mostrar los empleados de la empresa
				System.out.println("Los empleados de la empresa son");
				for(Empleado e: plantilla) {
					if(e!=null) {
						System.out.println(e);
					}
				}
				
				break;
			case 2:
				//Guardar in directivo
				
				Scanner lector01 = new Scanner(System.in);
				System.out.println("Introduce datos del empleado:");
				System.out.println("Nombre:");
				String nombre01 = lector01.nextLine();
				System.out.println("DNI: ");
				String dni01 = lector01.nextLine();
				System.out.println("Introduzca la fecha de nacimiento dd-mm-aaaa");
				String fecha01 = new Scanner(System.in).nextLine();
				DateTimeFormatter formatter02 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
				LocalDate fechaNacimiento01 = LocalDate.parse(fecha01, formatter02);
				System.out.println("Introduzca la fecha de contratación dd-mm-aaaa");
				String fechaC01 = new Scanner(System.in).nextLine();
				DateTimeFormatter formatter03 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
				LocalDate fechaContratacion01 = LocalDate.parse(fechaC01, formatter03);
				System.out.println("Numero de telefono: ");
				String telefono=lector01.nextLine();

				// Busco la primera posición vacía
				for (int i = 0; i < plantilla.length; i++) {
					if (plantilla[i] == null) {
						plantilla[i] = new Directivo(dni01, fechaNacimiento01, fechaContratacion01, nombre01,telefono);
						break;
					}
				}
				//Mostrar los empleados de la empresa
				System.out.println("Los empleados de la empresa son");
				for(Empleado e: plantilla) {
					if(e!=null) {
						System.out.println(e);
					}
				}
				
				break;
				
			case 3:
				//Guardar in directivo
				
				Scanner lector02 = new Scanner(System.in);
				System.out.println("Introduce datos del empleado:");
				System.out.println("Nombre:");
				String nombre02 = lector02.nextLine();
				System.out.println("DNI: ");
				String dni02 = lector02.nextLine();
				System.out.println("Introduzca la fecha de nacimiento dd-mm-aaaa");
				String fecha02 = new Scanner(System.in).nextLine();
				DateTimeFormatter formatter04 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
				LocalDate fechaNacimiento02 = LocalDate.parse(fecha02, formatter04);
				System.out.println("Introduzca la fecha de contratación dd-mm-aaaa");
				String fechaC02 = new Scanner(System.in).nextLine();
				DateTimeFormatter formatter05 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
				LocalDate fechaContratacion02 = LocalDate.parse(fechaC02, formatter05);
				System.out.println("Código portátil ");
				String codigoPortatil=lector02.nextLine();

				// Busco la primera posición vacía
				for (int i = 0; i < plantilla.length; i++) {
					if (plantilla[i] == null) {
						plantilla[i] = new Administrativo(dni02, fechaNacimiento02, fechaContratacion02, nombre02,codigoPortatil);
						break;
					}
				}
				//Mostrar los empleados de la empresa
				System.out.println("Los empleados de la empresa son");
				for(Empleado e: plantilla) {
					if(e!=null) {
						System.out.println(e);
					}
				}
				
				break;
				
			case 4: //calcular salario de todos los empleados
				for(Empleado e:plantilla) {
					if(e!=null) {
						e.calcularSalario();
					}
				}
				break;
				
			case 5: //activar bono
				//Cómo sé en qué posiciones están los directivos?
				for(Empleado e:plantilla) {
					if(e!=null) {
						if(e instanceof Directivo) {
						//downcasting convirtiendo la referencia de tipo empleado a tipo directivo
						Directivo d =(Directivo)e;
						d.activarBono();
					}
				}
				}
				
				break;
				
				
			case 6:
				salir = true;
				break;

			}// Fin del switch

		} while (!salir);
		
	
	}

}
