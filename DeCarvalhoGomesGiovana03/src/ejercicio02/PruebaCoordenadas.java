package ejercicio02;

import java.util.Arrays;
import java.util.Random;

public class PruebaCoordenadas {

	public static void main(String[] args) {
		
	
		Puntos matriz2D[][]=new Puntos[5][5]; //creamos una matriz 2d tamaño 5x5 (albergará 25 puntos)
		int filas=matriz2D.length; //variable con el numero de filas
		int columnas=matriz2D[0].length; //variable con el numero de columnas
		
		for(int i=0;i <filas;i++) { //bucle que recorre las filas
			for(int j=0; j<columnas;j++) { //bucle que recorre las columnas y
				Random rnd=new Random(); 
				int aleatorio1=rnd.nextInt(11)-5; //creamos un numero aleatorio del -5 al 5
				int aleatorio2=rnd.nextInt(11)-5;
				if(matriz2D[i][j]==null) {
					matriz2D[i][j]=new Puntos (aleatorio1, aleatorio2); //llenamos la matriz de puntos con esos puntos aleatorios
					
				}
			}
		}
		//Imprimimos la matriz 2d
		for(int i=0; i<matriz2D.length;i++) { //bucle que reccore filas
			for(int j=0;j<matriz2D[0].length;j++) { //bucle que recorre columnas
				System.out.print(matriz2D[i][j]+" "); //imprime el resultado de la llamada a la funcion
			}
			System.out.println();
		}
		
		//Elementos en cada cuadrante
		int cuadrante1=0;
		int cuadrante2=0;
		int cuadrante3=0;
		int cuadrante4=0;
		for(int i=0; i<matriz2D.length;i++) { //bucle que reccore filas
			for(int j=0;j<matriz2D[0].length;j++) { //bucle que recorre columnas
				if(matriz2D[i][j].getX()>0 && matriz2D[i][j].getY()>0) {
					cuadrante1 ++;	
				}
				if(matriz2D[i][j].getX()<0 && matriz2D[i][j].getY()>0) {
					cuadrante2 ++;	
				}
				if(matriz2D[i][j].getX()<0 && matriz2D[i][j].getY()<0) {
					cuadrante3 ++;	
				}
				if(matriz2D[i][j].getX()>0 && matriz2D[i][j].getY()<0) {
					cuadrante4 ++;	
				}
				
				
			}
		}
		System.out.println("Numero de puntos en cuadrantes: (1)"+cuadrante1 +", (2)"+cuadrante2+", (3)"+cuadrante3+", (4)"+cuadrante4+"\n");
		
		//Representación grafica de la matriz
		
		//Creamos una matriz de la dimension del gráfico
		//en nuestro caso una matriz 11x11
		
		Puntos matrizCuadrante[][]=new Puntos[11][11];
		
		
		
		int filas1=matrizCuadrante.length; //variable con el numero de filas
		int columnas1=matrizCuadrante[0].length; //variable con el numero de columnas
		
		int numeroY=5;
		for(int i=0;i <filas1;i++) { //bucle que recorre las filas
		int	numeroX=-5;
			for(int j=0; j<columnas1;j++) { //bucle que recorre las columnas y
				if(matrizCuadrante[i][j]==null) {
					matrizCuadrante[i][j]=new Puntos(numeroX, numeroY); // llena la metriz con la coordenada correspondiente.
					numeroX++;
				}
			}
			numeroY--;
		}
//		Imprimimos la matriz 2d
			for(int i=0; i<matrizCuadrante.length;i++) { //bucle que reccore filas
				for(int j=0;j<matrizCuadrante[0].length;j++) { //bucle que recorre columnas
					System.out.print(matrizCuadrante[i][j]+" "); //imprime el resultado de la llamada a la funcion
					
				}
				System.out.println();
				
			}
		
		
	//	Imprimimos el grafico
		for(int i=0; i<matrizCuadrante.length;i++) { //bucle que reccore filas
			for(int j=0;j<matrizCuadrante[0].length;j++) { //bucle que recorre columnas
				for(int k=0;k<filas;k++) { //bucle que recorre la matriz con los puntos a representar
					 for(int l=0;l<columnas;l++) {
							if(matrizCuadrante[i][j].getX()==matriz2D[k][l].getX() && matrizCuadrante[i][j].getY()==matriz2D[k][l].getY()) {
					System.out.print(" ° ");	//compaara el punto de la matriz con la matriz coordenadas, si son el mismo, pinta la bolita
					break;
				           }
						}			
					}
				
				if(matrizCuadrante[i][j].getX()==0 || matrizCuadrante[i][j].getY()==0 ) {
					System.out.print(" . "); //para pintar los ejes de coordenadas, sabemos que por lo menos uno de los puntos tiene que ser 0
				}
				else {
					System.out.print("   "); //si no es ni uno ni el otro, imprime un espacio en blanco.
				}
				
			}
			
			System.out.println();
			
		}
		

		
		
		
		
	}

}
