
public class IfsAnidados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Programa que me detecte si un nº es múltiplo de 3 y de 5 anidando if's
		
		int numero =15;
		
		if (numero % 3 ==0 && numero %5==0) {
			System.out.println("Es multiplo");
		}
		else {
			System.out.println("No es un multiplo de 3 y de 5 a la vez");
		}
		
		
		if(numero%3==0) {
			if(numero%5==0) { 
				//Si el programa entra aquí el programa es multiplo de 3 y 5
				System.out.println("El numero es multiplo de 3 y de 5");
			}
			else {
				System.out.println("El nº es multiplo de 3 pero no de 5");
			}
		}
			else {
				if(numero%5==0) {
					System.out.println("El numero no es mutiplo de 3 pero si es de 5");
				}
				else {
					System.out.println("El numero no es multiplo ni de 3 ni de 5");
				}
			}
		}
		
	}


