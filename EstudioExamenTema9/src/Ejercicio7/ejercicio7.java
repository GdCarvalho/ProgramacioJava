package Ejercicio7;

import java.util.ArrayList;
import java.util.HashMap;

public class ejercicio7 {

	public static void main(String[] args) {
		
		HashMap<String, ArrayList<Integer>>mapa=new HashMap<String,ArrayList<Integer>>();
		
		ArrayList<Integer>notas1=new ArrayList<Integer>();
		notas1.add(3);
		notas1.add(5);
		notas1.add(7);
		notas1.add(8);
		notas1.add(10);
		
		ArrayList<Integer>notas2=new ArrayList<Integer>();
		notas2.add(1);
		notas2.add(2);
		notas2.add(7);
		notas2.add(9);
		notas2.add(6);
		
		//c. Meted en el mapa dos entradas asociando las notas anteriores a un dni.

		mapa.put("12345678G", notas1);
		mapa.put("45641234T", notas2);
		
		//d. A continuación mostrad las notas de un determinado dni.

		ArrayList<Integer> lista1=mapa.get("12345678G");
		
		for(Integer ii:lista1) {
			if(ii!=null) {
				System.out.println(ii);
			}
		}
		
		//e. Calcular la nota media de las dos entradas del mapa.
		
		ArrayList<Integer> lista2=mapa.get("45641234T");
		
		int suma1=0;
		float media1;
		
		for(int i=0;i<lista1.size();i++) {
			suma1=suma1+lista1.get(i);
		}
		media1=suma1/lista1.size();
		System.out.println(media1);
		int suma2=0;
		float media2;
		
		for(int i=0;i<lista2.size();i++) {
			suma2=suma2+lista2.get(i);
		}
		media2=suma2/lista2.size();
		System.out.println(media2);
		float media3;
		
		media3=(media1+media2)/2;
		
		System.out.println(media3);
		

	}

}
