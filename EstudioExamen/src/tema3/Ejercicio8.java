package tema3;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		//Pedir al user 2 veces la contraseña y mostrar true si lo caracteres son iguales
		
		String senha, senha2;
		System.out.println("Introduzca contraseña 1: ");
		Scanner lector=new Scanner(System.in);
		senha=lector.next();
		System.out.println("Introduzca contraseña 2:");
		senha2=lector.next();
		boolean verdad;
		
		if(senha.equals(senha2)) {
			verdad=true;
			System.out.println(verdad);
		}else
		System.out.println("La contraseña introducida no es correcta.");
		

	}

}
