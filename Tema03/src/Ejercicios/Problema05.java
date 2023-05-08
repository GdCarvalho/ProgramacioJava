package Ejercicios;

import java.util.Arrays;

import java.util.Scanner;

public class Problema05 {

	public static void main(String[] args) {
		
		int dni;
		
		Scanner lector = new Scanner(System.in);
		System.out.print("Introduzca nº DNI: ");
		dni = lector.nextInt();
		
		int resto = dni % 23;
		System.out.println(resto);
		
		char letra[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		
		char letra2 = letra[resto];
		
		System.out.println("Su letra es: "+letra2);
		
	
		

	}

}
