import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		
	
		int opcion;
		do {
			System.out.println();
			System.out.println();
		System.out.println("Tenemos un array con 100 números del 0 al 100. Elija una de las siguientes opciones");
		System.out.println("1.Introduce un número y se mostrará todos los superiores a ese número");
		System.out.println("2.Calcular la media de los 50 primeros valores del array");
		System.out.println("3.Mostrar los 10 primeros valores superiores a 20 y sus respectivas posiciones");
		System.out.println("4.Introduce un número y se mostrará el primer valor inferior");
		System.out.println("5.Mostrar los valores primos");
		System.out.println("6.Mostrar el valor máximo, mínimo, el segundo más alto, el segundo más bajo y sus correspondientes posiciones");
		System.out.println("7.Mostrar valores multiplos de 3 y 5 en binario");
		System.out.println("8.SALIR");
		
		Scanner lector= new Scanner(System.in);
		System.out.print("Introduce número de la opción deseada: ");
		 opcion=lector.nextInt();
		
		
		int matriz[]= new int[100];
		
		//Creamos una matriz de 100 números random
		for(int i=0;i<matriz.length;i++) {
			Random rnd=new Random();
			matriz[i]=rnd.nextInt(100);
		
			}//Fin del bucle matriz
		System.out.println(Arrays.toString(matriz));
		
		//Al tenees varias opciones en el menú, utilizamos el switch.
		switch(opcion) {
		
			
		case 1: 
			boolean esta =false; //Booleano que nos indica un estado
			do {
			Scanner lector01=new Scanner(System.in); //Le pedimos al usuario que nos introduzca un valor
			System.out.print("Introduzca un número del 0 al 100: ");
			int valor=lector.nextInt();
				
			
			//Bucle que recorre la matriz y verifica si el valor introducido por el usuario está en dicha matriz
				for(int i=0;i<matriz.length;i++) {	
				if (matriz[i]==valor) {
					esta=true; //si el el if se cumple el booleano se actualiza
					break;
				}
			}
				if (esta) { //Si el booleano se actualiza 
					System.out.println("Los valores superiores al número introducido son");
					for(int i=0;i<matriz.length;i++) { //bucle que recorre toda la matriz y printea solamente los valores que son mayores al introducido.
						if(matriz[i]>valor) {
							
							System.out.print(matriz[i]+ " ");
							
						}
					}
					
				}
					
				else { //si el booleano no se actualiza significa que el valor no está el la matriz.
					System.out.println("El número introducido no está en el array");
					
				}
			}
			while(esta !=true); //Repite todo el proceso si el valor introducido no está en ma matriz.
			
			break;
			
		case 2: //calcular la media de los 50 primeros valores del array
			float suma=0; //variable suma inicializada a 0
			float media=0; //variable madia inicializada a 0
			
			for(int i=0; i<50;i++) { //bucle para que mientras i sea menor que 50 vaya sumando los valores del array
				suma=suma+matriz[i];
			}
			media=suma/50; //calcula la media matemática
			System.out.println("La media de los 50 primeros números es: "+media);
			break;
			
		case 3: //Mostar los 10 primeros valores superiores a 20 y sus respectivas posiciones
			
			int contador =0; //creamos una variable contador a 0 (esto se hace basicamente para que podemos printear solamente los 10 primeros valores que encuentre
			
			//bucle que recorre toda la matriz y comprueba si contador es menor que 10
			for(int i=0;i<matriz.length && contador<3;i++) { 		
			   if(matriz[i]>20) { //si el valor de la posición en la que está i es mayor que 20
				   System.out.println(" "+ matriz[i] +" y ocupa la posición: "+i);  //se imprime dicho valor y la posición en la que está
				  contador ++; // y se le suma 1 al contador.
			   }
			}
			break;
			
		case 4: //Introduce un número y se mostrará el primer valor inferior
			
			boolean esta1 =false; //Booleano que nos indica un estado
			do {
			Scanner lector02=new Scanner(System.in); //Le pedimos al usuario que nos introduzca un valor
			System.out.print("Introduzca un número del 0 al 100: ");
			int valor1=lector.nextInt();
				
			int i;
			//Bucle que recorre la matriz y verifica si el valor introducido por el usuario está en dicha matriz
				for( i=0;i<matriz.length;i++) {	
				if (matriz[i]==valor1) {
					esta1=true; //si el el if se cumple el booleano se actualiza
				break;	
				}
			}
				
				if (esta1) { //Si el booleano se actualiza 
					for(i=0; i<matriz.length;i++) {
						if(matriz[i]<valor1) {
							System.out.println("El primer valor inferior es: "+matriz[i] +" y ocupa la posición: "+i);
						break;	
						}
					}
					
			
					}
				
				else {//si el booleano no se actualiza significa que el valor no está el la matriz.
					System.out.println("El número no está en la matriz");
				}
				
			}
			while(esta1!=true); //Repite todo el proceso si el valor introducido no está en ma matriz.
			break;
			
			case 5: //printear los numeros primos
				
				boolean esPrimo; //creamos una booleana de control
				System.out.print("Los números primos son: "); //Printeamos primero este mensaje para que no se repita con el bucle
				for(int i=0; i<matriz.length;i++) { //bucle for que recorre toda la matriz
					esPrimo=true; //iniciamos el boolean dentro del bucle for para que cada vez que recorra el bucle for de abajo lo reinicie a true
					for(int j=2; j<matriz[i];j++) { //bucle for que divide el valor de la matriz que está en la posicion que indica i con la variable j
						if(matriz[i]%j==0) { //si la division es cero el booleano es falso, y eso significa que no es un numero primo y el programa acaba ahí
							esPrimo=false;
							break;
							
						}
					}
					
					if(esPrimo) { //si la division no es 0 significa que el número es primo y el número se enseña por pantalla.
						System.out.print( matriz[i]+" ");
					}
				}
				break;
				
			case 6: //mostrar valor máx, mín, el segundo más alto, el segundo más bajo y las posiciones
				
				int copiaMatriz[]=Arrays.copyOf(matriz, matriz.length); //creamos una copia de la matriz 
				Arrays.sort(copiaMatriz); //ordenamos esa copia de menor a mayor
			
				int mayor=copiaMatriz[copiaMatriz.length-1]; //con la matriz ordenada sabemos que el último número será el mayor
				int mayor2=copiaMatriz[copiaMatriz.length-2]; // y el penultimo número será el 2do mayor
				
				for(int i=0; i<copiaMatriz.length-1;i++) { //bucle que recorre la matriz ordenada y si el valor del mayor coincide con el valor del 2do mayor, le resta i a la posición para tener así el 2do mayor no coincidente
					if(mayor2==mayor) {
						mayor2=copiaMatriz[(copiaMatriz.length-1)-i];
					}
				}			
				
				System.out.print("Numero más alto: " +mayor); //imprime el mayor
				
				for(int i=0; i<=matriz.length-1;i++) { //bucle que recorre la matriz ORIGINAL y cuando encuentre el valor mayor, imprime la posición en la que se encuentra.
					if(matriz[i]==mayor) {
					System.out.println(" y ocupa la posición: " +i);
					break;
				}
				}
					
				System.out.print("2do numero más alto: " +mayor2); //imprime el 2do número mayor
	
				for(int i=0; i<=matriz.length-1;i++) {//bucle que recorre la matriz ORIGINAL y cuando encuentre el 2do valor mayor, imprime la posición en la que se encuentra.
					if(matriz[i]==mayor2) {
					System.out.println(" y ocupa la posición: " +i);
					break;
				}
				}
				
				
				int menor =copiaMatriz[0]; //con la matriz ordenada sabemos que el primer valor que ocupa la posición 0 es el más pequeño
				int menor2=copiaMatriz[1]; // y el que ocupa la posición 1 es el 2do más pequeño
				

				for(int i=0; i<copiaMatriz.length-1;i++) { //bucle que recorre la matriz copia y si el valor del menor coincide con el valor del 2do menor le suma i a la posición para tener el siguiente valor menor
					if(menor2==menor) {
						menor2=copiaMatriz[1+i];
					}
				}			
				
				
				System.out.print("Numero más bajo: " +menor); //imprime menor
				
				for(int i=0; i<=matriz.length-1;i++) { //bucle que recorre la matriz ORGINAL y cuando encuentra el valor menor imprime su posición
					if(matriz[i]==menor) {
					System.out.println(" y ocupa la posición: " +i);
					break;
				}
				}
					
				System.out.print("2do número más bajo: " +menor2); //imprime el 2do menor
	
				for(int i=0; i<=matriz.length-1;i++) {//bucle que recorre la matriz ORGINAL y cuando encuentra el 2do valor menor imprime su posición
					if(matriz[i]==menor2) {
					System.out.println(" y ocupa la posición: " +i);
					break;
				}
				}
				
				break;
				
			case 7: // encontrar multiplos de 3 y 5 y mostrarlos en binario
				
				for(int k=0; k<matriz.length;k++) { //bucle que recorre toda la matriz
					if (matriz[k]%3==0 || matriz[k]%5==0) { // si el resultado de divir el valor entre 3 o entre 5 es 0, significa que es multiplo
						String n=Integer.toBinaryString(matriz[k]); // parasamos el resultado a string y lo convertimos en binario
						System.out.println("El número: "+matriz[k] +" es multiplo de 3 o de 5 y en binario es: "+n); //imprimimos
					}
				}
				break;
				
			case 8: //salir del programa
				System.exit(0);
				break;
				
			default: //si el usuario no elije ninguna de las opciones
				System.out.println("Elija una opción valida");
				break;
				
		}//Fin del switch
		}//Fin del do while
	
		while(opcion !=8); //El programa se repite y sigue ejecutandose mientras el usuario no elija la opción 8 que es salir.
			
			
		
			
			
			
			}
		
		
		
}	
	
			
		
			
			
			

			
			
		
	


