import java.util.Scanner;

public class ExtraPalindromo {

	public static void main(String[] args) {
		
		boolean esPalindroma=false; //variable tipo boolean de control
		String frase; //string a introducir
		String comparador=""; // comparador vacio donde guardaremos el string "al contrario"
		
		Scanner lector =new Scanner (System.in);
		System.out.print("Introduzca frase: ");
		frase=lector.nextLine();
		
		int longitud= frase.length(); // variable que contiene la longitud del la frase
		
		for (int i=longitud-1; i>=0;i--) { //bucle que pasa por la frase y la empieza a recorrer de atrás hacia delante
			comparador=comparador+frase.charAt(i); // variable comparador 
		}
		 if(frase.equalsIgnoreCase(comparador)) { // si comparador es igual que la frase ignorando las mayusculas
			 esPalindroma=true; //el booleano se actualiza
		 }
		if(esPalindroma) { //si booleano se actualiza entonces imprime
			System.out.println("La frase es palíndroma");
		}
		else { //si no se actualiza significa que no es palíndroma e imprime
			System.out.println("La frase no es palíndroma");
		}
		

	}

}
