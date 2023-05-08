package ejercicio01;

import java.util.Arrays;
import java.util.Scanner;

public class PruebaFestival {

	public static void main(String[] args) {
		// Creamos un festival
		Festival f = new Festival("Festimad", 5); // es un festival con 5 gurpos
		f.getGrupoFestival()[0] = new Grupo("Queen", 120, 5, 300); // inicializamos 2 grupos
		f.getGrupoFestival()[1] = new Grupo("Beatles", 60, 7, 50);

		
		System.out.println(f); //mostramos por pantalla esos grupos.

		int opcion;
		boolean salir = false;

		do {
			System.out.println("1. Añadir un grupo");
			System.out.println("2. Buscar grupo");
			System.out.println("3. Obtener coste total del festival");
			System.out.println("4. Mostrar los 3 grupos más caros.");
			System.out.println("5. Mostrar los grupos más populares");
			System.out.println("6. Mostrar toda la info del festival");
			System.out.println("7. Salir");

			Scanner lector = new Scanner(System.in);
			System.out.print("Introduce número de la opción deseada: ");
			opcion = lector.nextInt();

			switch (opcion) {

			case 1:
				System.out.println("Introduzca el nombre del grupo");
				String nombre = new Scanner(System.in).nextLine();
				System.out.println("Introduzca el tiempo de actuación del concierto, en minutos.");
				int tiempo = new Scanner(System.in).nextInt();
				System.out.println("Introduzca indice de popularidad, del 0 al 10");
				int popular = new Scanner(System.in).nextInt();
				System.out.println("Introduzca el coste del grupo");
				float coste = new Scanner(System.in).nextFloat();

				// Creamos el grupo
				Grupo Grupo1 = new Grupo(nombre, tiempo, popular, coste);

				if (f.addGrupo(Grupo1)) { //llamamos al metodo para añadir grupo
					System.out.println("Grupo añadido con éxito"); 
					System.out.println(Grupo1);
					

				} else {
					System.out.println("Error");  //si no consigue añadir el grupo imprime error
				}
				break;

			case 2:
				System.out.println("Introduzca nombre del grupo:");
				String nombre01 = new Scanner(System.in).nextLine();
				for (int i = 0; i < f.getGrupoFestival().length; i++) { //bucle que recorre la matriz programa formada por los grupos.
					if (f.getGrupoFestival()[i] != null) { //si encuentra una posicion que no esta vacia
						if (f.getGrupoFestival()[i].getNombre().equals(nombre01)) { //compara el nombr edel grupo con el nombre añadido
							System.out.println("El grupo está en la posición: " + i); //y printea la posicion
						}

					}

				}

				break;

			case 3:

				float costeTotalFestival = 0; //inicializamos variable a 0
				for (int i = 0; i < f.getGrupoFestival().length; i++) { //bucle que recorre la matriz programa formada por los grupos.
					if (f.getGrupoFestival()[i] != null) { //si encuentra una posicion que no esta vacia
						costeTotalFestival = costeTotalFestival + f.getGrupoFestival()[i].calcularPrecioFinal(f.getGrupoFestival()[i].getPopularidad(),f.getGrupoFestival()[i].getCoste());
					} //actualiza la variable llamando al coste, que a su vez se calcula llamando al método calcularPrecioFinal
				}
				System.out.println("El coste total del festival es de: " + costeTotalFestival + " €");

				break;
				
				
				
			case 4:
				float[] matrizAux = new float[f.getGrupoFestival().length]; // creamos una matriz auxiliar de dimension
																			// la cantidad de grupos que haya en el festival

				for (int i = 0; i < f.getGrupoFestival().length; i++) { // bucle que recorre la matriz de grupos
					if (f.getGrupoFestival()[i] != null) { // si no está vacia la posicion
						matrizAux[i] = f.getGrupoFestival()[i].getCoste(); // le asigna a la matriz auxiliar el coste que tiene ese grupo en esa posición.								
					}
				}
				Arrays.sort(matrizAux);// Ordenamos la matriz auxiliar
				// System.out.println(Arrays.toString(matrizAux));
				for (int i = 0; i < f.getGrupoFestival().length; i++) { // bucle que recorre la matriz de grupos
					if (f.getGrupoFestival()[i] != null) { // si la posicion de i no está vacia
						if (f.getGrupoFestival()[i].getCoste() == matrizAux[matrizAux.length - 1]) { // si el coste del
					// grupo en la matriz principal coincide con la posicion que alberga el último coste en la auxiliar																			
							System.out.println("El primer grupo más caro es: " + f.getGrupoFestival()[i].getNombre()); // imprime mensaje																								 
						}
						if (f.getGrupoFestival()[i].getCoste() == matrizAux[matrizAux.length - 2]) {
							System.out.println("El segundo grupo más caro es: " + f.getGrupoFestival()[i].getNombre());
						}
						if (f.getGrupoFestival()[i].getCoste() == matrizAux[matrizAux.length - 3]) {
							System.out.println("El tercer grupo más caro es: " + f.getGrupoFestival()[i].getNombre());
						}
					}
				}

				break;

			case 5: // obtener los grupos más populares

				System.out.println(
						"Introduzca indice de popularidad del 0 al 10 y se mostrará los grupos con mayor popularidad que esa.");
				int popular01 = new Scanner(System.in).nextInt();

				for (int i = 0; i < f.getGrupoFestival().length; i++) { //bucle que recorre la matriz programa formada por los grupos.
					if (f.getGrupoFestival()[i] != null) { // si no está vacia la posicion
						if (f.getGrupoFestival()[i].getPopularidad() > popular01) { //si la pupularidad del grupo es mayor que la añadida
							System.out.println("Los grupos con mayor popularidad que " + popular01 + " son: " 
									+ f.getGrupoFestival()[i].getNombre());//imprime el nombre del grupo
						}
					}
				}
				
				break;
				
			case 6:
				System.out.println(f); //imprime la festival
				float costeTotalFestival01 = 0; //mismo procedimiento usado par el case 3
				for (int i = 0; i < f.getGrupoFestival().length; i++) {
					if (f.getGrupoFestival()[i] != null) {
						costeTotalFestival01 = costeTotalFestival01 + f.getGrupoFestival()[i].calcularPrecioFinal(f.getGrupoFestival()[i].getPopularidad(),f.getGrupoFestival()[i].getCoste());
					}
				}
				System.out.println("El coste total del festival es de: " + costeTotalFestival01 + " €");

				int duracionTotal=0; //mismo procedimiento usado para el case 3 pero ahora con la duracion.
				for(int i=0;i<f.getGrupoFestival().length;i++) {
					if(f.getGrupoFestival()[i]!=null) {
						duracionTotal=duracionTotal +f.getGrupoFestival()[i].getTiempoActuacion();
					}
				}
				System.out.println("La duración total del festival es de: "+duracionTotal +" minutos");
				
				System.out.println();
				
				break;
				
			case 7:
				salir = true;
				break;
			default:
				System.out.println("Pulse 7 para salir");
				
			}// Fin del switch

		} while (!salir);
	}
}
