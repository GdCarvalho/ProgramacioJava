
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		String cuenta;
		
		Scanner lector = new Scanner(System.in);
		
		System.out.printf("Introduzca cuenta bancaria: ");
		cuenta= lector.next();
		
		char primeraLetra= cuenta.charAt(0); //Para el primer catacter del string
		char segundaLetra= cuenta.charAt(1);//Para el segundo caracter del string
		System.out.println("El código de país es: " +primeraLetra+segundaLetra);
		
		String digitoControl =cuenta.substring(2,4); //para una subcadena en medio del string 
		//la posición 2 está incluida, mientras que la 4 no se incluye
		System.out.println("El dígito de control es: " +digitoControl);
		
		//Igual que el primer substring
		String codigoCaja =cuenta.substring(4,8);
		System.out.println("El código de la caja es: " +codigoCaja);
		
		System.out.println("¿Los dígitos de control son iguales? " +digitoControl.equals(cuenta.substring(12,14))); //se compara el dígido de control del primer sustring con el dígito de control del substring incluido en el método equals
		
		String numeroCuenta =cuenta.substring(14,24);
		System.out.println("El número de cuenta es: " +numeroCuenta);
		
		System.out.println("El iban consta de " +cuenta.length() +" caracteres."); //método length para saber cuántos caracteres
		
		System.out.println("¿Empieza por ES? "+cuenta.startsWith("ES")); //método startsWith para comprobar que empieza por los caracteres deseados
		
		int control = Integer.parseInt(digitoControl); //Convertimos los caracteres de dígito de control a un número (int)
		
		System.out.println("El valor en binario es: " +Integer.toBinaryString(control)); //Pasamos el int a binario con el método toBinaryString y printeamos.

	}

}
