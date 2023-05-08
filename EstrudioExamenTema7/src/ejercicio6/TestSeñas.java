package ejercicio6;

import java.util.Arrays;
import java.util.Scanner;

public class TestSeñas {

	public static void main(String[] args) {
		
		password contraseña[]=new password[8];
		
		int opcion;
		
		
		do {
		System.out.println("1.Introducir una contraseña tipo PasswordPlus");
		System.out.println("2.Introducir una contraseña tipo PasswordFree");
		System.out.println("3.Mostrar todas la contraseñas fuertes");
		System.out.println("4.Mostrar PasswordPluss");
		System.out.println("5.Mostrar PasswordFree");
		System.out.println("6.Mostrar password ordenados alfabeticamente");
		System.out.println("7.Salir");
		
		Scanner lector=new Scanner(System.in);
		opcion=lector.nextInt();
		
		switch(opcion) {
		
		case 1:
			String seña1;
			System.out.println("Introduzca PasswordPluss");
			Scanner lectorseña1=new Scanner(System.in);
			seña1=lectorseña1.next();
			
			PasswordPlus p1=new PasswordPlus(seña1);
			
			if(p1.validar(seña1)) {
				for(int i=0;i<contraseña.length;i++) {
					if(contraseña[i]==null) {
						contraseña[i]=p1;
						break;
					}
				}
			}
			else {
				System.out.println("La contraseña no cumple con los requisitos y no ha sido guardada");
			}
		break;	
		
		case 2:
			
			String seña2;
			System.out.println("Introduzca PasswordFree");
			Scanner lectorseña2=new Scanner(System.in);
			seña2=lectorseña2.next();
			
			PasswordFree p2=new PasswordFree(seña2);
			
			if(p2.validar(seña2)) {
				for(int i=0;i<contraseña.length;i++) {
					if(contraseña[i]==null) {
						contraseña[i]=p2;
						break;
					}
				}
			}
			else {
				System.out.println("La contraseña no cumple con los requisitos y no ha sido guardada");
			}
		break;	
		
		case 3:
			
			for( password pp:contraseña) {
				if(pp!=null) {
					if(pp.getFortaleza().equals("fuerte")) {
						System.out.println(pp.toString());
						break;
					}
				}
			}
		
		break;
		
		case 4:
			for(password pp:contraseña) {
				if(pp!=null) {
					if(pp instanceof PasswordPlus) {
						PasswordPlus plus=(PasswordPlus)pp;
						System.out.println(plus.toString());
						break;
					}
				}
			}
		
		break;
		
			
		case 5:
			for(password pp:contraseña) {
				if(pp!=null) {
					if(pp instanceof PasswordFree) {
						PasswordFree free=(PasswordFree)pp;
						System.out.println(free.toString());
						break;
					}
				}
			}
		
		break;
		
		case 6:
			
			int contador=0;
			
			for(password pp:contraseña) {
				if(pp!=null) {
					contador++;
				}
			}
		
			password ss[]=Arrays.copyOf(contraseña, contador);
			Arrays.sort(ss);
			for(password cc:ss) {
				if(cc!=null) {
					System.out.println(cc.toString());
				}
			}
			break;
			
		case 7:
			System.exit(0);
		break;
		
		
		}
		}
		while(opcion!=7);
		

	}

}
