package tema3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		int maximo;
		int minimo;
		int parcial;
		
		
		System.out.println(("Introduzca a: "));
		Scanner lector=new Scanner(System.in);
		a=lector.nextInt();
		System.out.println(("Introduzca b: "));
		b=lector.nextInt();
		System.out.println(("Introduzca c: "));
		c=lector.nextInt();
		
		
		
		parcial=Math.max(a, b);
		maximo=Math.max(parcial, c);
		System.out.println("El máximo de los dos números es:"+maximo);
		
		
		

	}

}
