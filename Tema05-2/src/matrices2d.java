import java.util.Random;

public class matrices2d {

	public static void main(String[] args) {

	int matriz[][]= new int [5][5];
	prueba2d.llenarMatriz(matriz);
	System.out.println("La matriz es:");
		prueba2d.printar(matriz);
		
		
	int valorBuscado=10;
	int matriz2[][]= {{1,2,3},{9,8,0},{7,10,6}};
	int posicion[]=prueba2d2.buscarValor(matriz2, valorBuscado);
	prueba2d.printar(matriz2);
	System.out.println("Fila;"+posicion[0]);
	System.out.println("Columna;" +posicion[1]);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
