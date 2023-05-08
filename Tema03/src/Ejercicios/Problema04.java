package Ejercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Problema04 {

	public static void main(String[] args) {
		
		String dom1;
		
		Scanner lector = new Scanner(System.in);
		
		System.out.printf("Email: ");
		dom1=lector.nextLine();
		
		 String dom2[]= dom1.split("@");
		 
		 System.out.println("El dominio es: " +dom2[1]);
		 
		
		
		

	}

}
