package test;
import java.util.Arrays;

import misMetodos.Metodos1;
import misMetodos.ParámetrosOpcionales;

public class PruebasMétodos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//Prueba método esPar
		
		int n =9;
		// Llamamos a la funcion esPar
		boolean par = Metodos1.esPar(n);
		
		if (par) {
		System.out.println("Es par");
	}
		else {
			System.out.println("No es par");
		}

		
		// Prueba método validarString
		
		if(Metodos1.validarString("3w")) {
			System.out.println("Empieza por dígito");
		}
		else {
			System.out.println("No empieza por dígito");
		}
		
		//Prueba método saludar
		
		Metodos1.saludar();
		
		
		//Prueba método sumar10
		
		int x=10;
	    x=Metodos1.sumar10(x);
		System.out.println("El resultado es: "+x);
		
		//Prueba método sumar10 en matrices
		
		int matriz[]= {4,3,5,7};
		Metodos1.sumar10(matriz);
		System.out.println(matriz[0]);
		
		//Prueba método suma10 en matriz
		
	 	int nuevo [] =Metodos1.suma10(matriz);
		System.out.println(Arrays.toString(nuevo));
		
		
		//Prueba método calcularMedia
		
		double resultado =ParámetrosOpcionales.calcularMedia(4, 8);
		
		System.out.println(resultado);
		
		
		
		
		
		
		
		
		
}
}
