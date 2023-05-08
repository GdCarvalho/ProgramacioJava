package tema3;


import java.util.Scanner;



public class Ejercicio1 {

	public static void main(String[] args) {
		
		int a;
		int b;
		int c;
		
		System.out.println("Introduzca valor para a:");
		Scanner lector=new Scanner(System.in);
		a=lector.nextInt();
		System.out.println("Introduzca valor para b:");
		b=lector.nextInt();
		System.out.println("Introduzca valor para c:");
		c=lector.nextInt();
		
		double modulo;
		
		modulo=(int)Math.sqrt(Math.pow(a,2)+Math.pow(b,2)+Math.pow(c,2));
		
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("c: "+c);
		System.out.println("El módulo de los número intorucidos es: "+modulo);
		
	}

	}


