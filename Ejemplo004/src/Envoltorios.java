
public class Envoltorios {

	public static void main(String[] args) {
		//Wrappers son variables complejas que nos permiten añadir funcionalidad a variables imples.
		// int, float, char, double....
		//int--integer
		//float--float
		//char--character
		
		int n=3678952;
		// numero a string
		String numero = Integer.toString(n);
		int digito = numero.length();
		
		//string a numero
		String temperatura ="45.4";
		float temperaturaFloat = Float.parseFloat(temperatura);
		
		
		//character -----isdigit, isletter
		char caracter ='t';
		boolean digito1= Character.isDigit(caracter); //nos devulve en este caso false, ya que no es dígito.
		
		//Prograna que indica si el úmtimo caracter es una letra de un String.
		
		String dni ="09845673w";
		char ultimocaracter = dni.charAt(dni.length()-1);
		boolean ultimo = Character.isLetter(ultimocaracter);
		
		
		
		
		
		
		

	}

}
