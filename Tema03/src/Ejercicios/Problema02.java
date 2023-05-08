package Ejercicios;

import java.util.Scanner;

public class Problema02 {

	public static void main(String[] args) {
		
		int numero01;
		int numero02;
		
		Scanner lector = new Scanner(System.in);
		
		System.out.printf("Número 1: ");
		numero01 = lector.nextInt();
		
		System.out.printf("Número 2: ");
		numero02 = lector.nextInt();
		
		int menor=Math.min(numero01, numero02);
		int mayor=Math.max(numero01, numero02);
		
		System.out.println("El número mayor es "+mayor+" y el número menor es "+menor);
		
			

	}

}
