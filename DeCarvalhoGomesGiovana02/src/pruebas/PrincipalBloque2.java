package pruebas;

import java.util.Arrays;
import java.util.Scanner;

import BloqueEjercicios2.MTDCadenas;

public class PrincipalBloque2 {

	public static void main(String[] args) {
		

		int opcion;
		
			System.out.println();
			System.out.println();
		System.out.println("Ejercicios");
		System.out.println("1.DNI sin letra y se mostrará la letra correspondiente");
		System.out.println("2.Se indica un char y se devualve un string formado por guiones salvo el la posción del char.");
		System.out.println("3.Sobrecarga del método anterior para que también reciba un string");
		System.out.println("4.Recibe un string y devuelve true si cumple que tiene 1 dígito, una letra minúscula, una mayúscula y mínimo 8 caracteres.");
		System.out.println("5.Recibe un string y se codifica");
		
		
		Scanner lector= new Scanner(System.in);
		System.out.print("Introduce número de la opción deseada: ");
		opcion=lector.nextInt();
		
		switch(opcion) {
		case 1:
			
			String dni ="012a4413"; //string con dni
			
				char letraDni=MTDCadenas.letraDNI(dni); //llamamos a la función para que nos devuelva la letra correspondiente
		
					System.out.println("La letra del DNI es: "+letraDni); //imprimimos la letra por pantalla
		
		break;
		
		case 2:
			
			char letra='i'; //introducimos la letra
			
			String palabra=MTDCadenas.palabra(letra); //llamamos la funcion uqe nos devuelve la palabra con guiones salvo en la letra
			System.out.println(palabra); //mostramos por pantalla
			
			break;
		case 3:
			
			char letra1 ='n'; //introducimos letra 1
			char letra2='s'; //introducimos letra 2
			String dia="Lunes"; //introducimos palabra
			
			String diaDeseado=MTDCadenas.palabra(dia, letra1, letra2); //llamamos a la función que nos devuelve la palabra introducida con guiones salvo por las letras introducidas
			System.out.println(diaDeseado);
			
			break;
					
		case 4:
			String expresion= "133fR678"; //introducimos la exprecion
		if(MTDCadenas.cumpleCondiciones(expresion)) { //llamamos a la funcion que verifica si cumple los requisitos
			System.out.println("Expresión válida"); //si es correcto imprime valido
		}
		else {
			System.out.println("Expresión no valida"); //si no correcto imprime no valido
		}
		
		break;
		
		case 5:
			
			String fraseCodigo= "caido"; //introducimos palabra
			
			MTDCadenas.codificacion(fraseCodigo); //llamamos a la funcion que codifica la palabra y nos la imprime por pantalla codificada.
			
		   
		
		break;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}//Fin del Switch
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
