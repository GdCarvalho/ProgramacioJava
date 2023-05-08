import java.util.Random;

public class prueba2d {
	
	
	
	
	//metodo que recibe matriz 2d y la llena de valores aleatorios entre el 1 y 20
	
	
	public static void llenarMatriz(int m[][]) {
		Random aleatorio=new Random();
		int fila=m.length;
		int columnas=m[0].length;
		for(int i=0;i <fila;i++) {
			for(int j=0; j<columnas;j++) {
				m[i][j]=aleatorio.nextInt(20)+1;
				
			}
		}
		
	}
	
	public static void printar(int m[][]) {
		
		int fila=m.length;
		int columnas=m[0].length;
		for(int i=0;i <fila;i++) {
			for(int j=0; j<columnas;j++) {
				System.out.print(m[i][j]+ " ");
				
	}
			System.out.println();
		
}
	}
	
	//Método que reciba una matriz 2d y escriba un 0 en todos los elementos 
	//de la diagonal principal, si es una matriz cuadrada, 
	//si no guardará un 0 en la primera posición de cada fila
	
	public static void modificarMatriz(int m[][]) {
	
		//Verificar si es cuadrada
		int filas=m.length;
		int columnas=m[0].length;
		if(filas==columnas) {
			for(int i=0;i <filas;i++) {
				for(int j=0; j<columnas;j++) {
			if(i==j) {
				m[i][j]=0;
			}
			
				}
				}	
		}
		else {
			for(int k=0;k<filas;k++) {
			m[k][0]=0;
		
			}
			}
		}
	//Metodo que si una matriz tiene un número primo lo convierta en 0
			
		public static boolean isPrimo(int n) {
			boolean primo = true;
			for(int j = 2;j<=n/2;j++) {
				if(n%j == 0) {
					primo = false;
					break;
				}
			}
			return primo;
		}
		public static void eliminarPrimos(int m[][]) {
			int filas = m.length;
			int columnas = m[0].length;
			
			for(int i = 0;i<filas;i++) {
				for(int j = 0;j<columnas;j++) {			
					if(isPrimo(m[i][j])) {
						m[i][j] = 0;
					}
					
					
			}
			}
		}
		
		//Método que busca un valor en una matriz 2d y devuelve la posición
		
		public static int[] buscarValor(int matriz[][],int valor) {
			int filas = matriz.length;
			int columnas = matriz[0].length;
			int posicion[] = new int[2];
			boolean salidaPrecipitada = false;
			pepe:
			for(int i = 0;i<filas;i++) {
				
				for(int j = 0;j<columnas;j++) {	
					
					if(matriz[i][j]==valor) {
						posicion[0] = i;
						posicion[1] = j;
						salidaPrecipitada = true;
						 break pepe ;
						}
					}
					
			}
			
			return posicion;
		}
	}