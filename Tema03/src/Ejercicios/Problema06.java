package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Problema06 {

	public static void main(String[] args) {
	 
		int m[] = {3,4,2,5,6};
		
		System.out.println("El primer valor es: "+m[0]);
		System.out.println("El primer valor es: "+m[4]);
		
		int m2[]=Arrays.copyOf(m, m.length);
		System.out.println("La copia de la matriz original es: "+Arrays.toString(m2));
		
		int m2copia[]=Arrays.copyOf(m, m.length);
		Arrays.sort(m2copia);
		System.out.println("La matriz ordenada es:" +Arrays.toString(m2copia));
		
		
		int valor;
		Scanner lector =new Scanner (System.in);
		System.out.print("Introduzca un valor: ");
		valor = lector.nextInt();
		
		int posicion= Arrays.binarySearch(m2copia, valor);
		System.out.print("La posición del valor es: "+posicion);
		
		

	}

}
