package tema3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		
		int matriz[]=new int[5];
			
		for(int i=0;i<matriz.length;i++) {
			Random rnd=new Random();
			matriz[i]=rnd.nextInt(5);
			
		}
		System.out.println(Arrays.toString(matriz));
		 int primero=matriz[0];
		 int ultimo=matriz[matriz.length-1];
		 System.out.println(primero);
		 System.out.println(ultimo);

		//Copiamos una matriz a la otra
		 int matriz2[]=Arrays.copyOf(matriz, matriz.length);
		 Arrays.sort(matriz2);
		System.out.println(Arrays.toString(matriz2));
		
		//Solicitar al usuario un valor e indicar su posicion
		int numero;
		System.out.println("Introducza un numero y se dirá la posicion");
		Scanner lector=new Scanner(System.in);
		numero=lector.nextInt();
		
		for(int i=0;i<matriz2.length;i++) {
			if(matriz2[i]==numero) {
				System.out.println("La posición en la que se encuentra es: "+i);
			}
			
		}
		
		
		
		

	}

}
