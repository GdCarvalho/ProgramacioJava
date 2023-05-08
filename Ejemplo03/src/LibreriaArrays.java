import java.util.Arrays;

public class LibreriaArrays {

	public static void main(String[] args) {
		// Sintaxis para declarar arrays
		//Declarar un arrray de 10 enteros
		int matriz[] = new int[10];// Las matrices siempre están iniciadas con valor 0
		
		// Para modificar el valor de una matriz:
		matriz[0]=12;
		//......
		matriz[9]=9;
		
		//Array de char
		char []caracteres= new char [10];
		
		//Declarar array e inicializarlo a valores direfentes del de por defecto
		int i[]= {2,3,5,7,9,7,6,5};
		char letra[]={'T','R','G'};
		
		
		//El tamaño de un array: lenght
		
		int tamanhoMatrizd =i.length;
		
		System.out.println("El tamaño de la matriz es:" +tamanhoMatrizd);
		
		
		//Ordenar de mayor a menor
		Arrays.sort(i);
		
		//Visualizar todos los valoeres guardados en la matriz d
		System.out.println(i[0]+","+i[1]);
		System.out.println(Arrays.toString(i)); //Nos vuelca todos los arrays e un string y muestra por pantalla
		
		//Hacer una copia de un array en otro array
		int original[]={22,3,4,6};
		int copia2[]= Arrays.copyOf(original, original.length);
		
		System.out.println("Copia de original: "+Arrays.toString(copia2));
		
		//Binary Search: Realiza búsqueda en arrays ordenados
		int array1[]={2,3,5,7,9,7,6,5};
		int valorBuscado =5;
		Arrays.sort(array1);
		int posicion= Arrays.binarySearch(array1, valorBuscado);
		System.out.println("Posición:"+posicion); //En qué posición está el nº 4
		
		//Compara si dos arrays son iguales
		
		int a1[]={2,3};
		int a2[]={2,3};
		System.out.println(Arrays.equals(a1, a2));
		
		
		
		
		
		
		

	}

}
