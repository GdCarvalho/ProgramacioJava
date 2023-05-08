import java.util.Scanner;

public class BucleDoWhile {

	public static void main(String[] args) {
		//Siempre se ejecuta por lo menos una vez. 
		/*int i=100;
		do {
			System.out.print(i+" ");
			i++;
		}

		while(i<=20);
	}*/

		
		//Programa que presenta un menú al usuario
		int ejercicio;
		int contador=0;
		
		do {
			if (contador == 0) {
		System.out.println("Escoja una opcion: ");
			}
			else if (contador ==1) {
				System.out.println("Te queda 2 intentos");
			}
			else {
				System.out.println("Ultimo intento");
			}
		
			
		System.out.println("1. Calcular si un nº es primo");
		System.out.println("2.Identificar numeros perfectos.");
		contador ++;
		
		Scanner lector=new Scanner(System.in);
		ejercicio =lector.nextInt();
		
		}
		
		while((ejercicio>=4 || ejercicio<1) && contador <3);
		
		if (contador ==3) {
			System.out.println("HAS PERDIDO");
		}
		
		else {
			//Qué opción elegió el usuario
			switch(ejercicio) {
			case 1:
				//calcular si un nº es primo (es primo si solo es divisible por 1 o por si mismo)
				
				int numero;
				System.out.println("inserte nº: ");
				Scanner lector2=new Scanner(System.in);
				numero = lector2.nextInt();
				// para saber si es prime trato de detectar divisores entre el 2 y n-1
				boolean primo = false;
				
			for(int i=2; i<numero;i++) {
				if(numero %i==0) {
					primo = true;
					break; //salimos del budle porque ya no me interesa seguir encontrando divisores
				}//fin del if inferior	
			}//fin del for
			if (primo) {
				System.out.println("El numero es primo");
			}
			else {
				System.out.println("El número no es primo");
			}
				break;
			}
			
		}
		

}
}
