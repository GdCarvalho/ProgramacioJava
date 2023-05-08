package ejercicio01;

import java.util.Arrays;

public class Festival {

	private String nombre;
	private int duracion;
	private float coste;
	private Grupo[] programa;

	// Constructor
	public Festival(String nombre, int numeroGrupos) {
		this.nombre = nombre;
		this.programa = new Grupo[numeroGrupos];

	}
	
		// Métodos de acceso

	public void setGrupoFestival(Grupo[] programa) {
		this.programa = programa;
	}

	public Grupo[] getGrupoFestival() {
		return programa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setCoste(float coste) {
		//for(int i=0;i<programa.length;i++) {
			//if(programa[i]!=null) {
				//this.coste=coste + programa[i].calcularPrecioFinal(programa[i].getPopularidad(), programa[i].getCoste());;
			//}
		//}
		this.coste=coste;
	}
	
	public float getCoste() {
		return coste;
	}
	public int getDuracion() {
		return duracion;
	}
	

	// Métodos que recibe un grupo y lo guarda en la primera posición vacia de
	// programa del fastival
	public boolean addGrupo(Grupo grupo) {
		for (int i = 0; i < programa.length; i++) { //bucle que recorre la matriz programa
			if (programa[i] == null) { //si encuentra una posicion vacia
				programa[i] = grupo; //le asiga un grupo a esa posicion
				duracion = duracion + programa[i].getTiempoActuacion(); //y actualiza duracion y coste
				coste = coste + programa[i].calcularPrecioFinal(grupo.getPopularidad(), grupo.getCoste());	
				return true;
		}
			}
		
		return false;
	}

	// Método que devuelve el grupo que ocupa la posición que recibe

	public Grupo dameGrupo(int posicion) { 
		if (posicion < programa.length) { //si la poscion es menor que el tamaño de la matriz programa
			return programa[posicion]; //devuelve el grupo que ocupa esa posicion

		} 
		else {
			return null;
		}
	}

	@Override
	public String toString() {
		String s="";
		String s1="";
		for(int i=0;i<programa.length;i++) {
			if(programa[i]!=null) {
				s= "**************\n"+nombre+" Grupo: "+(i+1)+"\n**************\n"+programa[i].toString()+"\n**************\n";
				System.out.println(s);
			}
		}
		return s1 ;
		
	}
	
	
}
	



