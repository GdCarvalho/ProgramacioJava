import java.util.Random;

public class Matrices2D {

	public static void main(String[] args) {
		//Sirven para organizar mejor los datos
		
		int [][] matriz=new int [2][5]; //1er corchete para el n1 de filas y 2do corchete para el numero de columnas
		// 0 0 0 0 0 
		// 0 0 0 0 0 
		
		matriz [0][0]=9;
		
		//Llenar matriz con numero aleatorios
		
		//matriz.lenght devuelve el numero de filas de la matriz
		//Empezamos por la primera fila
		
		for(int fila=0;fila<matriz.length;fila++) {
		for(int columna=0;columna<matriz[fila].length;columna++) {
			Random aleatorio= new Random();
			matriz[fila][columna]= aleatorio.nextInt();
		}
			
			
		}
		
	}

}
