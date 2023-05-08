package tema3;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		String mail;
		
		System.out.println("Introduzca dirección de correo electrónico:");
		Scanner lector=new Scanner(System.in);
		mail=lector.nextLine();
		
		String[] mail2=mail.split("@");
		if(mail2[1].equals("gmail.com")) {
			System.out.println("El mail introducido corresponde al dominio gmail");
		}
		else if(mail2[1].equals("yahoo.com")) {
			System.out.println("El mail introducido corresponde al dominio yahho");
		}
		else if(mail2[1].equals("outlook.com")){
			System.out.println("El mail introducido pertenece al dominos de outlook");
		}
		else {
			System.out.println("El no sé");
		}
				
				
				
				
				

	}

}
