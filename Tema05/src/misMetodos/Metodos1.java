package misMetodos;

public class Metodos1 {
	
	//Método que recibe un nº y devuelve tru si es par
	
	public static boolean esPar(int numero) {
		if (numero%2==0) {
			return true;
		}
		else {
			return false;
		}
		// return numero%2==0?; 
	}

	
	//Método que devuelve true si un string empieza por un número
	
	public static boolean validarString(String cadena) {
		if(Character.isDigit(cadena.charAt(0))) {
			return true;
		}
		
		else {
			return false;
		}
	}
	
	//Método que imprime un saludo
	
	public static void saludar() {
		System.out.println("Hola");
	}
	
	
	
	
	// Método que le suma 10 a un numero
	
	public static int sumar10(int x) {
	return	x+10; //crea una zona de memoria nueva
		
		
	}
	
	//Método que recibe un array y le suma 10 al valor que está en su posición 0
	
	public static void sumar10(int matriz[]) {
		matriz[0]+=10; //en esta accedemos a la zona de memoria original por eso, en este caso, es void. Pasaría lo mismo con los strings
	}
	
	//Método que recibe un array de enteros y genera un nuevo array con la posicion 0 incrementada en 10 unidades
	
	
	public static int[] suma10(int x[]) {
		int nuevo[]=new int[x.length];
		for(int i=0;i<x.length;i++) {
			nuevo[i]=x[i];
		}
		nuevo[0]=nuevo[0]+10;
		return nuevo;
	}
	
	
	
	
	
	
}
