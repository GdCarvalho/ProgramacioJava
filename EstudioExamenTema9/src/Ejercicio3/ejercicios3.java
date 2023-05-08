package Ejercicio3;

import java.util.ArrayList;

import Ejercicio1.metodos;


public class ejercicios3 {
	public static void main(String[] args) {
	
	ArrayList<Integer>lista=new ArrayList<Integer>();
	metodos.fillRandom(lista, 10, 20);
	
	ArrayList<Integer>lista2=new ArrayList<Integer>();
	metodos.fillRandom(lista2, 10, 20);
	
	//b. Crear una tercera lista con los valores de las 2 listas anteriores.

	ArrayList<Integer>lista3=new ArrayList<Integer>();
	lista3.addAll(lista);
	lista3.addAll(lista2);
	
	//c. Crear una cuarta lista con los valores de la primera lista que no están en la
	//segunda
	
	ArrayList<Integer>lista4=new ArrayList<Integer>();
	
	for(Integer tt:lista) {
		if(!lista2.contains(tt)) {
			lista4.add(tt);
		}
	}
	
	//d. Mostrar  los valores de las 4 listas.
	metodos.showValues(lista);
	metodos.showValues(lista2);
	metodos.showValues(lista3);
	metodos.showValues(lista4);
	
	
	
	
	
	
	
	
	
	
	
	}
}
