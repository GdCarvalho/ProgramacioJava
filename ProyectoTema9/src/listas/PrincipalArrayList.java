package listas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrincipalArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> matriculas =new ArrayList<String>();
		matriculas.add("4567PIU");
		matriculas.add("4533FRU");
		matriculas.add("2214ARD");
		
		ArrayList<String> alumnos =new ArrayList<String>(2); //A pesar de que del tamaño sea de 2, con este método podemos ir matiendo más, ya que al ser una lista, se irá redimensionando.
		alumnos.add("José");
		alumnos.add("María");
		alumnos.add("Pedro");
		
		ArrayList<String> matriculados =new ArrayList<String>(alumnos); //Se crea una nueva.
		
		List<String> bonodescuentoAlumnos =matriculados.subList(0, 2); //para crear una sublista con los alumnos que tengan bonodescuento. En este caso sabemos que son los dos primeros alumnos
		
		//Recuperar objetos guardados en un arrays
		String alumnoCero =alumnos.get(0);
		//Nos devuelve el objeto que ocupa la posición que le indicamos, en este caso, 0.
		
		
	    //Para hacer una busqueda
		int posicion=alumnos.indexOf("María"); //nos da la posicion, si no lo encuentra devuelve -1
		
		
		
		
		//Visualizar una lista
				System.out.println("Alumnos");
				for(int i=0; i<alumnos.size();i++) {
					System.out.println(alumnos.get(i));
				}
		
		//Para eliminar objetos: remove(), clear()
		
		//Eliminar alumno posicion 0
		alumnos.remove(0); //y el objeto que estaba en la posicion 1 pasa a ocupar la posicion 0
		//Eliminar por valor
		alumnos.remove("María");
		
				System.out.println("Alumnos despues de eliminaciones");
				for(int i=0; i<alumnos.size();i++) {
					System.out.println(alumnos.get(i));
				}
				
				
		//for each. 
				//Mostrar alumnos por cuyo nombre empiece por P
				for(String al:alumnos) {
					if(al.startsWith("P")) {
					System.out.println(al);
				}
				}
				
		//ELIMINACIONES DE ELEMENTOS DE LA LISTA
				
				ArrayList<String> apellido=new ArrayList<String>();
				apellido.add("Gomes");
				apellido.add("Blanco");
				apellido.add("Vazquez");
				apellido.add("Vera");
				
				//eliminar los que empiecen por V
				
				/*for(int i=0; i<apellido.size();i++) {
					if(apellido.startsWith("V")) {
					apellido.remove(apellido);
					i--;
				}
				}
				
				
				//eliminar los que empiecen por V con for each
				/*for(String ap:apellido) { //no funciona porque es como un iterador, está recorriedo el array y como lo modifica(borrando), da error
					if(ap.startsWith("V")){
						apellido.remove(ap);
						
					}
				}
				
				
				//Iterador para recorrer arrays (es como un for each)
				Iterator<String> it=apellido.iterator(); //cada vez que añado o borro objetos, habrá que crear un nuevo iterador
				
				while(it.hasNext()) {
					System.out.println(it.next());
				}*/
				
				
				
		
		//alumnos.clear();//elimina todos lo elementos de la lista
		
		
		
		
		
		
		
		

	}

}
