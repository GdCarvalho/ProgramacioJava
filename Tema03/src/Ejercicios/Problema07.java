package Ejercicios;

import java.util.Scanner;

public class Problema07 {

	public static void main(String[] args) {
		
		String frase;
		
		Scanner lector = new Scanner(System.in);
		System.out.print("Introduzca frase: ");
        frase=lector.nextLine();
        
        System.out.println("La cadena tiene "+frase.length() +" palabras");
        
        int primeraA=  frase.split(" ")[0].indexOf("a");
        int segundaA=  frase.split(" ")[1].indexOf("a");
        int terceraA=  frase.split(" ")[2].indexOf("a");
        
        System.out.println(primeraA+ " " + segundaA+ " "+ terceraA);
        
        char primeraC=  frase.split(" ")[0].charAt(0);
        char segundaC=  frase.split(" ")[1].charAt(0);
        char terceraC=  frase.split(" ")[2].charAt(0);
        
        System.out.println(primeraC+ " " + segundaC+ "  "+ terceraC);
        
        
        
        
        
        
	}

}
