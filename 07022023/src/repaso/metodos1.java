package repaso;

public class metodos1 {
	//Ejercicio para programar métodos

	//Método que cuenta las que devuelve el numero de dígitos que hay wen un string
	public static int getDigitos(String c) {
		int contador =0;
		for(int i=0;i<c.length();i++) {
			if(Character.isDigit(c.charAt(i))) {
				contador++;
			}
			
			
		}
		return contador;
	}
	
	//Método que obtiene la posicion en un array de una serie de números
	//Le paso un conjunto de n y quiero que me busque el 2 o el 15 y pase la posicion del primero que encuentre
	public static int getPosition(int matriz[],int ...x) {
		
		int pos=-1;
		for(int i=0;i<matriz.length;i++) {
			for(int j=0; j<x.length;j++) {
				if(matriz[i]==matriz[j]) {
					 pos=i;
					 break;
				}
				
			}
		}
		return pos;
		
		
	}
	
	
	
}
