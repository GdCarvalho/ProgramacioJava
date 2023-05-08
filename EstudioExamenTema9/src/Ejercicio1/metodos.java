package Ejercicio1;

import java.util.Collection;
import java.util.Random;
import java.util.Set;

public class metodos {
	
	public static void fillRandom(Collection<Integer>colecion, int n, int lim) {
		Random rnd=new Random();
		for(int i=0;i<n;i++) {
			colecion.add(rnd.nextInt(lim));
		}
	}
	public static void showValues(Collection<Integer>coleccion) {
		for(Integer i:coleccion) {
			System.out.print(i+" ");

	}
		System.out.println();
	}
	
	
	public static void fillDouble(Set<Double>doble) {
		Random rnd=new Random();
		for(int i=0;i<=10;i++) {
			doble.add(rnd.nextDouble());
		}	
	}
		
	public static void showDouble(Set<Double>dd) {
		for(Double doble:dd) {
				System.out.printf("%.1f",doble);
				System.out.printf(" ");
		}
		
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	
		
	}
	
	
	
	


