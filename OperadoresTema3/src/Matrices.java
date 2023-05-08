import java.util.Arrays;
import java.util.Random;

public class Matrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz[] = new int[10];
		
		//Guardar valores aleatorios en las posiciones de la 2 a la 100
		
		for(int i=2; i<matriz.length;i++) {
			Random aleatorio =new Random();
			matriz[i]= aleatorio.nextInt(50); //numero aleatorio entre el 0 y el numero que yo quiera -1
			
		}
		System.out.println(Arrays.toString(matriz));
		
		for(int i=0; i<matriz.length;i++) {
			System.out.print(matriz[i] + " " );
		}
		
		System.out.println();
		//for mejorado solo para lectura
		for(int valor: matriz) { //valor no modifica la variable original
			System.out.print(valor +" ");
		}

	}

}
