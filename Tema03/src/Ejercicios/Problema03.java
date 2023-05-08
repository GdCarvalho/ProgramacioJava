package Ejercicios;

import java.util.Scanner;

public class Problema03 {

	public static void main(String[] args) {
		
		int numero01;
		int numero02;
		int numero03;
		
		Scanner lector = new Scanner(System.in);
		
		System.out.printf("Número 1: ");
		numero01 = lector.nextInt();
		
		System.out.printf("Número 2: ");
		numero02 = lector.nextInt();
		
		System.out.printf("Número 3: ");
		numero03=lector.nextInt();
		
		
		int menor=Math.min(numero01, numero02);
		int menor2=Math.min(menor, numero03);
		
		int mayor=Math.max(numero01, numero02);
		int mayor2=Math.max(mayor, numero03);
		
		System.out.println("El número mayor es "+mayor2+" y el número menor es "+menor);
		
			
		
		

	}

}
