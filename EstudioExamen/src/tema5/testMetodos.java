package tema5;

import java.util.Arrays;

public class testMetodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Método que recibe un string y lo imprime
		String hola="hola";
		metodos5.printar(hola);
		
		//Método que recibe un array y devueve el número más alto
		int matriz[]= {2,5,6,3,7,3,2};
		int impri= metodos5.masAlto(matriz);
		System.out.println(impri);
		
		//Metodo que recibe una matriz y la rellena de números rendom
		
		int matrizR[]=new int[5];
		metodos5.aleatorio(matrizR);
		System.out.println(Arrays.toString(matrizR));
		
		//Sobrecarga para una matriz 2d
		
		int matriz2d[][]= new int[3][3];
		metodos5.aleatorio(matriz2d);
		metodos5.imprimir(matriz2d);
		
		//Método que dice de una matriz qué numeros son primos
		metodos5.sonPrimos(matriz2d);
		//Método que cuenta las palabras de un string
		String ss="Hola";
		int letras=metodos5.numeroPalabras(ss);
		System.out.println(letras);
		//Metodo que recibe una matriz y devuelve otra matriz con los mismos valores pero el dible de capacidad
			int doble[]= {2,3,4};
			int dobled[]= metodos5.doblear(doble);
		System.out.println(Arrays.toString(dobled));
		
		
	}

}
