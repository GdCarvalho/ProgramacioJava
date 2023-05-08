
public class Ejemplo3 {

	public static void main(String[] args) {
		//STRINGS
		//Buscar todas las posiciones en las que aparece un caracter en un string
		
		String palabra = "Elefante";
		String caracter="e";
		
		System.out.println("Caracter está en las posiciónes: ");
		for(int i=0;i<palabra.length();i++) {
			
			if(palabra.substring(i,i+1).equalsIgnoreCase(caracter)) {
				System.out.println(i+" ");
			}
		}
		

	}

}
