package listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class PrincipalLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String>listaenlazada =new LinkedList<String>();
		listaenlazada.add("Prueba");
		listaenlazada.add("ejemplo");
		listaenlazada.add("Idea");
		listaenlazada.add(0,"Rotación");
		listaenlazada.addFirst("Primero"); //Añade a la primera posicion de la list
		listaenlazada.addLast("último"); //Añade a la última posicion de la lista
		
		for(String s:listaenlazada) {
			System.out.println(s);
		}
		
		ArrayList<String> listanoenlazada=new ArrayList<String>(listaenlazada);
		
		//Pasar a un array list un array normal
		String datos[]=new String[2];
		datos[0]="Calor";
		datos[1]="Frío";
		
		ArrayList<String> temperatura =new ArrayList<String>(Arrays.asList(datos));
		
		
		
	}

}
