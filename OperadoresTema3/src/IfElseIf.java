
public class IfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Programa que nos clasifique un nº en los siguientes rangos
		//0-20 grupo a
		//21-50 grupo b
		//51-70 grupo c
		//resto grupo d
		
		int numero =90;
		if(numero<0) {
		System.out.println("Error");
		}
		
		else if(numero>=0 && numero<=20) {
			System.out.println("Grupo A");
		}
		else if (numero<=50) {
			System.out.println("Grupo B");
		}
		else if (numero<=70) {
			System.out.println("Grupo C");
		}
		else {
			System.out.println("Grupo D");
		}
		
		
		//Programa que me detecte si un nº es múltiplo de 3 y de 5
		
		int n2 =15;
		
		if (n2%3==0 && n2%5==0) {
			System.out.println("Es multiplo de 3 y 5");
		}
		else if (n2%3==0) {
			System.out.println("multiplo de 3 y no de 5");
			
		}
		else if (n2 %5==0) {
			System.out.println("multiplo de 5 y no de 3");
		}
		else {
			System.out.println("No es multiplo ni de 3 ni de 5");
		}

	}

}
