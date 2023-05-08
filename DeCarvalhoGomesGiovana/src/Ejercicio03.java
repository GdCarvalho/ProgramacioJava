
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio03 {
	
	public static void main(String[] args) {
		
		String frase;
		
        Scanner lector = new Scanner(System.in);
		
		System.out.printf("Introduzca frase: ");
		frase= lector.nextLine();
		
		String palabras[]=frase.split(" "); //Separo el string en una matriz por los espacios
		int palabrasNum = palabras.length; //Utilizo length para saber el tamaño de la matriz
		System.out.println("La frase tiene "+palabrasNum+" palabras");
		
		
		int espacios =palabrasNum-1; //En una frase el numero de espacios es el numero de palabras -1
		int totalCaracteres = frase.length(); //length para saber cuántos caracteres hay
		int numCaracteres= totalCaracteres-espacios; //restamos al número de caracteres totales el número de espeacios para obtener caracteres sin espacios
		System.out.println( "La frase tiene "+numCaracteres+" caracteres");
		
		char primero = frase.charAt(0); //Identifico el primer caracter
		boolean esDigito = Character.isDigit(primero); // Compruebo si es in dígito
		System.out.println("¿El primer caracter es una dígito? " +esDigito);
		
		int posicionEspacio = frase.indexOf(" "); //indexOf para localizar el primer espacio de la frase
		System.out.println("La posición del primer espacio es: "+posicionEspacio);
		
		
		
	
		
	
		

	}

}
