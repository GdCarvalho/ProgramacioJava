package tema3;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		String cadena;
		Scanner lector=new Scanner(System.in);
		cadena=lector.nextLine();
		
		
		//Numero de palabras que tiene el string
		String palabras[]= cadena.split(" ");
		int palabrasnum=palabras.length;
		System.out.println("La cadena tiene "+palabrasnum+" palabras." );
		
		//En que posición está la a en cada una de las palabras	
		for(int i=0;i<palabras.length;i++) {
			if(palabras[i].contains("a")) {
				int por=palabras[i].indexOf('a');
				System.out.println(por);
			}
			
		}
		
		//El primer caracter de cada una de las pablabras
		System.out.println("EL PRIMER CARACTER ES: ");
		for(int i=0;i<palabras.length;i++) {
			System.out.println(palabras[i].substring(0,1));
			
		}
		//El último carácter de cada una de las palabras
		System.out.println("El último caracter es:");
		for(int i=0;i<palabras.length;i++) {
			System.out.println(palabras[i].substring(palabras[i].length()-1,palabras[i].length()));
		}
		//Solicitar al user una letra e indicar la posicion que se encuentra
		System.out.println("Introduzca una letra: ");
		String letra;
		letra=lector.nextLine();
		
		for(int i=0;i<palabras.length;i++) {
			if(palabras[i].contains(letra)) {
				System.out.println(cadena.indexOf(letra));
			}
			
		}
		

	}

}
