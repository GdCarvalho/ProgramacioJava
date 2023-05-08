package pruebas;

import java.util.Arrays;
import java.util.Scanner;

import bloqueEjercicios1.MTDNumeros;

public class PrincipalBloque1 {

	public static void main(String[] args) {
		
		int opcion;
		
			System.out.println();
			System.out.println();
		System.out.println("Ejercicios");
		System.out.println("1.Introduce un número y se indicará si dicho número es perfecto o no");
		System.out.println("2.Introduce 3 números y se indicará el mínimo común multiplo");
		System.out.println("3.Introducir valores para resistencia r1 y r2 e introducir valor para las unidades y se indicará la Resistecia equivalente.");
		System.out.println("4.Matriz y a lo valores negativos se les indicará la media de los elementos positivos de dicha matriz");
		System.out.println("5.Matriz y se indicará la media. (Funciona con valores enteros y decimales)");
		System.out.println("6.Matriz de tipo float y un boolean y se indicará una matriz de entreros redondeados al entero más cercano por denajo si el boolean es true y por arriba si el boolean es false.");
		System.out.println("7.Matriz 2D y se modificará el valor de las posiciones siguiendo la expresión: (i*j)^3/2*(i+j). Si i y j son 0 el valor será el original.");
		System.out.println("8.Matriz 2D y se indicará la media de la primera fila, la pedia de la segunda fila y la fila con la media más alta");
		System.out.println("9.Matriz 2D de tipo float y se indicará si hay filas que almacenen los mismos valores");
		
		
		Scanner lector= new Scanner(System.in);
		System.out.print("Introduce número de la opción deseada: ");
		opcion=lector.nextInt();
		
		switch(opcion) {
		
		case 1:
			
			Scanner lector01=new Scanner(System.in); //Le pedimos al usuario que nos introduzca un número
			System.out.print("Introduzca un número: ");
			int numero=lector.nextInt();
			
			
			if(MTDNumeros.esPerfecto(numero)) { //llamamos a la funcion para que evalue si el número es perfecto o no
				System.out.println("El número introducido es perfecto"); //si el boolean que devulve es true el número es perfecto e inprime el mesaje
			}
			else {
				System.out.println("El número introducido no es perfecto"); //si no imprime el siguiente mensaje
			}
			break;
			
		case 2:
			
			Scanner lector02=new Scanner(System.in); //Le pedimos al usuario que nos introduzca un número
			System.out.print("Introduzca número 1: ");
			int numero1=lector.nextInt();
			Scanner lector03=new Scanner(System.in);
			System.out.print("Introduzca número 2: ");
			int numero2=lector.nextInt();
			Scanner lector04=new Scanner(System.in); 
			System.out.print("Introduzca número 3: ");
			int numero3=lector.nextInt();
			
			if(numero1>0 && numero1<100 && numero2>0 && numero2<100 && numero3>0 && numero3<100 ) { // si cson números positivos y menores que 100
			
			int minimo =MTDNumeros.mcm(numero1, numero2, numero3); //llama a la funcion de mcm 
			
			System.out.println("El mínimo común multiplo de " +numero1 +", " +numero2 +" y " +numero3 +" es :" +minimo); // e imprime resultado
			}
			else { // si no imprime el siguiente resultado
				System.out.println("Los números tienen que sera positivos y menores que 100"); 
			}
	
	break;
	
		case 3:
			

			Scanner lector05=new Scanner(System.in); //Le pedimos al usuario que nos introduzca un número
			System.out.print("Introduzca número r1: ");
			int r1=lector.nextInt();
			Scanner lector06=new Scanner(System.in);
			System.out.print("Introduzca r2: ");
			int r2=lector.nextInt();
			System.out.print("Si se desea el resultado en microOhmnios introduzca 1, si desea el resultado en KiloOhmnios introduzca 2, si lo desea en Ohmnios introduzca 3. ");
			int parametro=lector.nextInt();
			
		
		
		if(parametro==1) { // si introdujo el 1
			double resisE1=MTDNumeros.resistencia(r1, r2,1); //llama a la funcion que calcula la resistencia equivalente en microOhmnios
			System.out.println("La resistencía equivamente es de: " +resisE1 +" microOhmnios"); // e imprime el resultado
		}
		
		
		if(parametro==2) { //si el usuario introdujo el 2
			double resisE2=MTDNumeros.resistencia(r1, r2, 2); //llama a la funcion que calcula la resistencia equivalente en kiloOhmnios
			System.out.println("La resistencía equivamente es de: " +resisE2 +" kiloOhmnios"); // e imprime el resultado
		}
		
		
		if(parametro==3) { //si introdujo el 3
			double resisE3=MTDNumeros.resistencia(r1, r2);//llama a la sobrecarga de la anterior funcion que calcula la resistencia equivalente en Ohmnios
			System.out.println("La resistencía equivamente es de: " +resisE3 +" Ohmnios");// e imprime el resultado
		}
		
		
		break;
		
		
		case 4: 
			
			int m[]= {5, 8, 6, -6, 4,-5}; //matriz con numeros negativos
			
		MTDNumeros.mediaNegativo(m); //llamamos a la funcion que modifica los numeros negativos
		
		System.out.println(Arrays.toString(m)); //imprimimos la matriz modificada
			
		break;	
		
		case 5:
			
			float matrizFloat[]= {2, 2.4f, 5.6f, 9} ; //matriz de floats
			int matrizInt[]= {1,4,2,4};//matriz de ints
			
			float mediaMatriz=MTDNumeros.mediaMatriz(matrizFloat); //variable que almacena la funcion resultado de la media de la matriz de floats
			float mediaMatrizInt=MTDNumeros.mediaMatriz(matrizInt); //variable que almacena la sobrecarga de la funcion anterior resultado de la media de la matriz de floats
			
			System.out.printf("La media de la matriz de floats es: %.2f" ,mediaMatriz); //imprime el resultado con 2 decimales
			System.out.println();
			System.out.printf("La media de la matriz de ints es: %.2f" ,mediaMatrizInt); //imprime el resultado con 2 decimales
			
		break;
		
		case 6:
			
			float matrizFloat1[]= {2, 2.4f, 5.6f, 9} ; //matriz de floats
			

			int matrizResultadoArriba[]=MTDNumeros.nuevaMatrizInt(matrizFloat1, false); //matriz resultante de llamar a la funcion que calcula la media y redondea abajo
			int matrizResultadoAbajo[]=MTDNumeros.nuevaMatrizInt(matrizFloat1, true); //matriz resultante de llamar a la funcion que calcula la media y redondea arriba
			
			System.out.println(Arrays.toString(matrizResultadoArriba));
			System.out.println(Arrays.toString(matrizResultadoAbajo));
		
		break;
		
		
		case 7:
			
			double matriz2d[][]= {{2,3,4},{0,6,4},{3,2,4}};
			
			
			MTDNumeros.matriz2D(matriz2d); //llamada a la funcion 
			
			for(int i=0; i<matriz2d.length;i++) { //bucle que reccore filas
				for(int j=0;j<matriz2d[0].length;j++) { //bucle que recorre columnas
					System.out.print(matriz2d[i][j]+" "); //imprime el resultado de la llamada a la funcion
				}
				System.out.println();
			}
			
			break;
			
		case 8:
			
			int segundaMatriz2d[][]= {{2,5,4},{0,6,4},{77,2,4}}; 
			
			System.out.println("Resultado es:");
			MTDNumeros.variosValores(segundaMatriz2d); //llamada a la funcion que nos dice la media de las filas y la fila con la media más alta
			
			break;
			
		case 9:
			
			float miMatriz2d[][]= {{2,5,4},{2,5,4},{77,2,4}};
			
			
			if(MTDNumeros.filasRepe(miMatriz2d)) { //llama a la funcion y si es true, imprime
				System.out.println("Hay filas que están repedidas");
			}
			
			else { //si no es que no hay filas repetidas y no llama a la funciones
				System.out.println("No hay filas repetidas.");
			}
		
		break;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}//Fin del Switch
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
