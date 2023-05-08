package Ejercicios;

import java.util.Scanner;

public class Problema08 {

	public static void main(String[] args) {
		
		String seña;
		String seña2;
		
		Scanner lector = new Scanner(System.in);
		System.out.print("Introduzca la contraseña 1 ");
		seña =lector.nextLine();
		
		System.out.print("Introduzca la contraseña 2: ");
		seña2 =lector.nextLine();
		
		boolean iguales = seña.equals(seña2);
		System.out.println("Las contraseñas son iguales: "+iguales);
		
		
		

	}

}
