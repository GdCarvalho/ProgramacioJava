import java.util.Random;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		int opcion;

		do {
		System.out.println("1. NIVEL 1. ");
		System.out.println("2. NIVEL 2. ");
		System.out.println("3. NIVEL 3. ");
		System.out.println("4. SALIR DEL JUEGO ");
		
		
		Scanner lector= new Scanner(System.in);
		System.out.print("ELIJE OPCIÓN: ");
		opcion=lector.nextInt();
		
		switch(opcion) {
		 
		case 1: //nivel 1
			int numero15;
			int intentos=3;
			Random rnd=new Random();
			int aleatorio15=rnd.nextInt(14)+1; //creamos un número aleatorio del 1 al 15
				
					do {
				Scanner lector2= new Scanner(System.in);
				System.out.print("Introduce un número del 1 al 15: ");
				numero15=lector.nextInt(); //el usuario introduce un número
				
				
				if(numero15==aleatorio15) { //si el numero introducido coincide con el aleratorio
					System.out.println("¡Enhorabuena, has ganado!"); //se imprime mensaje y se verifica
					if(intentos==3) { //si fue al primer intento
						System.out.println("Tienes 10 puntos");
					}
					else if(intentos==2) { //si fue al segnudo
						System.out.println("Tienes 7 puntos");
					}
					else  { //o si fue al tercer intento
						System.out.println("Tienes 5 puntos");
					}
					
					break;
					
				}
				
				else if(numero15>15 || numero15<1) { //si el número introducido no entre en el rango que queremos se imprime el mensaje y el programa se ejecuta de nuevo
					System.out.println("Numero introducido no valido");
				}
					
				else if(numero15>aleatorio15) { //si el numero introducido es mayor al aleatorio
					System.out.println("El número introducido es mayor que el número a adivinar"); //se imprime
					intentos --; //se le resta 1 al contador de intentos
					System.out.println("Te quedan " +intentos +" intentos"); //y se imprimen los intentos
					
				}
				else { // si no es ninguno de los anteriores significa que es numero introducido es menor que el que buscamos 
					System.out.println("El número introducido es menor que el número a adivinar"); //se imprime
					intentos --;//se le resta 1 al contador de intentos
					System.out.println("Te quedan " +intentos +" intentos"); //y se imprimen los intentos
					
					
				}
				if(intentos==0) { //si el contador de intentos llega a 0 se imprime:
					System.out.println("Has perdido el juego");
				}
			
					}
					while(intentos>=1 && intentos <=2); //el programa se repite mientras el contador sea mayor igual que 1 y menor igual que 2
					
				
				
			break;
			
			//Se repite la misma estructura que en el caso anterior para los niveles 2 y 3.
		
		case 2: //nivel 2
			
			int numero30;
			int intentos30=4;
			Random rnd30=new Random();
			int aleatorio30=rnd30.nextInt(29)+1;
			
			do {	
			Scanner lector30= new Scanner(System.in);
			System.out.print("Introduce un número del 1 al 30: ");
			numero30=lector.nextInt();
			
			if(numero30==aleatorio30) {
				System.out.println("¡Enhorabuena, has ganado!");
				if(intentos30==4) {
					System.out.println("Tienes 30 puntos");
				}
				else if(intentos30==3) {
					System.out.println("Tienes 20 puntos");
				}
				else if(intentos30==2) {
					System.out.println("Tienes 10 puntos");
				}
				else {
					System.out.println("Tienes 7 puntos");
				}
				
				break;
				
			}
			else if(numero30>30 || numero30<1) {
				System.out.println("Numero introducido no valido");
			}
			
			
			else if(numero30>aleatorio30) {
				System.out.println("El número introducido es mayor que el número a adivinar");
				intentos30 --;
				System.out.println("Te quedan " +intentos30 +" intentos");
				
			}
			else {
				System.out.println("El número introducido es menor que el número a adivinar");
				intentos30 --;
				System.out.println("Te quedan " +intentos30 +" intentos");
				
			}
			if(intentos30==0) {
				System.out.println("Has perdido el juego");
			}
			
			}
			while(intentos30>=1 && intentos30 <=3);
			
		break;
		
		case 3: //nivel 3
			
			int numero50;
			int intentos50=5;
			Random rnd50=new Random();
			int aleatorio50=rnd50.nextInt(49)+1;
			System.out.println(aleatorio50);
			do {	
			Scanner lector50= new Scanner(System.in);
			System.out.print("Introduce un número del 1 al 30: ");
			numero50=lector.nextInt();
			
			if(numero50==aleatorio50) {
				System.out.println("¡Enhorabuena, has ganado!");
				if(intentos50==5) {
					System.out.println("Tienes 50 puntos");
				}
				else if(intentos50==4) {
					System.out.println("Tienes 35 puntos");
				}
				else if(intentos50==3) {
					System.out.println("Tienes 20 puntos");
				}
				
				else if(intentos50==2) {
					System.out.println("Tienes 15 puntos");
				}
				
				else {
					System.out.println("Tienes 7 puntos");
				}
				
				break;
				
			}
			
			else if(numero50>50 || numero50<1) {
				System.out.println("Numero introducido no valido");
			}
			
			else if(numero50>aleatorio50) {
				System.out.println("El número introducido es mayor que el número a adivinar");
				intentos50 --;
				System.out.println("Te quedan " +intentos50 +" intentos");
				
			}
			else {
				System.out.println("El número introducido es menor que el número a adivinar");
				intentos50 --;
				System.out.println("Te quedan " +intentos50 +" intentos");
				
			}
			if(intentos50==0) {
				System.out.println("Has perdido el juego");
			}
			
			}
			while(intentos50>=1 && intentos50 <=4);
			
		break;
		
		case 4: //salir del programa
			System.exit(0);
			break;
			
		default: //si el usuario no elije ninguna de las opciones
			System.out.println("Elija una opción valida");
			break;
		
		
		
		}//Fin del switch
		
		}
		while(opcion!=4); //El programa se repite hasta que el user no elija la opción 4
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
