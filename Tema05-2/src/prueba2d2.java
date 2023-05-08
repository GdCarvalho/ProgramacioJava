
public class prueba2d2 {
	
public static int[] buscarValor(int matriz[][], int valor) {
		
	int filas=matriz.length;
	int columnas=matriz[0].length;
	int posicion[]=new int[2];
	boolean salidaPrecipitada=false;
	for(int i=0;i <filas;i++) {
		
		for(int j=0; j<columnas;j++) {
		if (matriz[i][j]==valor) {
			posicion[0]=i;
			posicion[1]=j;
			salidaPrecipitada=true;
			break;
		}//fin if
		
	}
		if(salidaPrecipitada) {
			break;
		}
	
	}
	return posicion;
	
	
	
	
	
	

}
}
