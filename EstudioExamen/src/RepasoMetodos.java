
public class RepasoMetodos {

	//Métodos que devuelve el nº de 0's que hay en las 2 primeras filas
	public static int cuentaCeros(int matriz[][]) {
		int contador=0;
		for(int i=0;i<2;i++) {
			for(int j=0;j<matriz[i].length;j++) {
				if(matriz[i][j]==0) {
					contador++;
				}
			}
		}
		
		return contador;
	}
	
	
	
}
