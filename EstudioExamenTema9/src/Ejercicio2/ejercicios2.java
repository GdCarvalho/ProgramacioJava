package Ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

import Ejercicio1.metodos;

public class ejercicios2 {

	public static void main(String[] args) {
		
		
		//a. A continuación introducir 10 números aleatorios entre 0 y 10.
		ArrayList<Integer>numero=new ArrayList<Integer>();
		metodos.fillRandom(numero, 10, 10);

		//b. Calcular la media.
        int suma=0;
        float media;
        for(int i=0;i<numero.size();i++) {
        	suma=suma+numero.get(i);
        }
		media=suma/numero.size();
		System.out.println("La media de los valores es: "+media);
		
		//c. Calcular el valor más alto generado.
		Collections.sort(numero);
		int alto=numero.get(numero.size()-1);
		System.out.println("El número más alto es "+alto);

		//d. Mostrar por pantalla todos los valores almacenados.
        
		for(Integer gg:numero) {
			System.out.print(gg+" ");
			
		}
		System.out.println();
		//e. Eliminar todos aquellos que sean superiores a 7.
		Iterator<Integer>it=numero.iterator();
		while(it.hasNext()) {
			if(it.next()>7) {
				it.remove();
			}
		}

		for(Integer gg:numero) {
			System.out.print(gg+" ");
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
