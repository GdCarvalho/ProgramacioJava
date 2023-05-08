import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		int aleatorio= (int) ((Math.random()*9)+1); // Función que nos da un número entero del 0 al 1 multiplicada por 10 para valores del 0 al 10
		String s= JOptionPane.showInputDialog("Introduzca un número entero"); //Solicita al usuario por pantalla un número entero.
		
		float m[]=new float[10]; //Matriz de 10 número naturales
		
		m[0]= aleatorio; // llamada a función de números aleatorios
		m[1]= m[0]+20; // le suma al valor de la posición 0, 20
		m[2]= (float) Math.sqrt((Math.pow(m [0],3)+Math.pow(m[1],2))); // hace la raíz cuadrada de la posición 0 al cubo más la posición 1 al cuadrado
		m[3]= (m[0]+m[1]+m[2])/3; // hace la media de los valores de las 3 primeras posiciones
		m[4]=Integer.parseInt(s); //convierte a int el string pedido por pantalla y lo almacena en la posción 4
		m[5]=4;
		m[6]=8;
		m[7]=3;
		m[8]=2;
		m[9]=5;
		
		float mCopia[]=Arrays.copyOf(m, m.length); //copia de la matriz m
		float mCopiaDos[]=Arrays.copyOf(m, m.length); //segunda copiar de la matriz m. Hice esto para poder ver por pantalla la copia y a la vez la copiar ordenada de menor a mayor
		Arrays.sort(mCopiaDos); // Ordena la copiaDos de menor a mayor
		int posicion = Arrays.binarySearch(mCopia, m[0]); //variable para buscar la posición del valor albergado en m[0]. Con este método, al no estar ordenada no se garantiza que el resultado sea correcto.
		int posicionDos = Arrays.binarySearch(mCopiaDos, m[0]); //variable para buscar la posición del valor albergado en m[0] en la copia ordenada.
		
		
		
		System.out.println("Número aleatorio entre 1 y 10: "+ m[0]); 
		System.out.println("Posición 0+20? "+m[1]);
		System.out.printf( "Raiz cuadrada de posición [0]^3 + posición [1]^2: %.2f\n" ,m[2]);
		System.out.printf( "Media de los apartados anteriores: %.2f\n" ,m[3]);
		
		
		
		System.out.println("Copia de original: "+Arrays.toString(mCopia));
		System.out.println("Copia ordenada de menor a mayor : "+Arrays.toString(mCopiaDos));
		System.out.println("El valor de a) del original está en la posción: " +posicion); //Aquí no se garantiza con este método que nos de el valor deseado.
		System.out.println("El valor de a) de la copia está en la posción: " +posicionDos);
		System.out.println("¿Los arrays son iguales? " +Arrays.equals(m, mCopia));
		System.out.println("Array 1: " +Arrays.toString(m));
		System.out.println("Array 2: " +Arrays.toString(mCopia));
		
	}

}
