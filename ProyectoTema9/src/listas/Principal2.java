package listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Principal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Tmabién se puede crear un arrayliste de libros
		
		ArrayList<Libro> biblioteca=new ArrayList<Libro>();
		biblioteca.add(new Libro("Los pilares de la tierra", "Ken Follet", 30,9));
		biblioteca.add(new Libro("La conjura de los necios", "Insertar autor", 25,4));
		biblioteca.add(new Libro("El temor de un hombre sabio", "Patrick Rothfuss", 55,2));
		
		
		Libro biblio2[]=new Libro[3];
		biblio2[0]=biblioteca.get(0);
		biblio2[1]=biblioteca.get(1);
		biblio2[2]=biblioteca.get(2);
		
		Arrays.sort(biblio2,new ComparadorLibros());
		
		//Ordenar la lista -->Biblioteca por titulo
		biblioteca.sort(new ComparadorLibros());
		for(Libro l:biblioteca) {
			System.out.println(l.getAutor());
		}
		
		//Ordenar la lista por valoración
		//Se usa una clase anónima, ya que no volvemos a usar esta clase 
		biblioteca.sort(new Comparator<Libro>() {

			@Override
			public int compare(Libro o1, Libro o2) {
				// TODO Auto-generated method stub
				Float v1=o1.getValoracion();
				Float v2=o1.getValoracion();
				
				return v1.compareTo(v2);
			}
		

			
			});
			
		//Fin de clase anónima
		
		for(Libro l:biblioteca) {
			if(l.getValoracion()>=6) {
				System.out.println(l);
			}
		}
		
		

	}

}
