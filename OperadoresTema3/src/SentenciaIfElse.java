import java.util.Scanner;

public class SentenciaIfElse {

	public static void main(String[] args) {
		// Sentencia if (condicion) {
		            //código
		         // }
		         //else {
		
		
		//Programa que indica si un ºn es par
		
		int n;
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Introduzca número;");
		n = lector.nextInt();
		
		if(n % 2==0) {
			System.out.println("El numero es par.");
		}
		else {
			System.out.println("No es par");
		}
		
		
					
				
		//Programa que determina si un número pertenece al rango 10-20
			
			int numero;
		System.out.println("Introduce valor ");
		numero=lector.nextInt();
		
		if(numero >=10 && numero <=20) {
			System.out.println("El número está en el rango");
		}
		else {
			System.out.println("El numero no está en el rango");
		}
		
		
		
		
		
		
			
	}
	}


