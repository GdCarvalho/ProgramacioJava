import java.util.Arrays;
import java.util.Random;

public class Ejemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Programa que crea una matriz, busca el nº8  se siga ejecutando hasta encontrar el numero e imprimir la posición en la que está
		int posicion =-1;
		do {
		int matriz[]= new int [10];
		//Llenar la mitad de la matriz con valores aleatorios con valores de 1 y 30
		
		for(int i=0;i<matriz.length/2;i++) {
			Random rnd=new Random();
			matriz[i]=rnd.nextInt(31); //Genera nº aleatorios entre 1 y 30
			
			
			
		}
		System.out.println(Arrays.toString(matriz));
		
		//Algoritmo que busca un número en un array
		
		int valorBuscado =8;
		
		
		
		for(int i=0;i<matriz.length;i++) {
			if(matriz[i]==valorBuscado) {
				posicion=i;
				break;
			}
		}
		if(posicion==-1) {
			System.out.println("No está el numero en la matriz");
		}
		else {
			System.out.println("El número está en la posición: "+posicion);
		}
		
		}
		while(posicion==-1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
