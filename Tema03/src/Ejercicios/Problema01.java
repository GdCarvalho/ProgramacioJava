package Ejercicios;

import java.util.Scanner;

public class Problema01 {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		
		Scanner lector = new Scanner(System.in);
		
		System.out.printf("Introduzca a: ");
		a= lector.nextInt();
		
		System.out.printf("Introduzca b: ");
		b= lector.nextInt();
		
		System.out.printf("Introduzca c: ");
		c= lector.nextInt();
		
		double resultado= Math.sqrt((Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2)));
		
		System.out.println("Valor de a:"+a);
		System.out.println("Valor de b:"+b);
		System.out.println("Valor de c:"+c);
		System.out.printf("El modulo es: %.3f", resultado);

	}

}
