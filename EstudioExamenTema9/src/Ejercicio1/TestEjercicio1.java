package Ejercicio1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class TestEjercicio1 {

	public static void main(String[] args) {
		
		ArrayList<Integer>numero=new ArrayList<Integer>();
		metodos.fillRandom(numero, 10, 20);
		
		HashSet<Integer>num=new HashSet<Integer>();
		num.addAll(numero);
		
		TreeSet<Integer>numnum=new TreeSet<Integer>();
		numnum.addAll(numero);
		
		metodos.showValues(numero);
		metodos.showValues(num);
		metodos.showValues(numnum);
		
	TreeSet<Double>t=new TreeSet<Double>();
	 metodos.fillDouble(t);
		
	HashSet<Double>intr=new HashSet<Double>();
	intr.addAll(intr);
	
	 metodos.showDouble(t);	
	 metodos.showDouble(intr);
		
	 ArrayList<String>lista=new ArrayList<String>(10);
	 lista.add("Marta");
	 lista.add("Carmen");
	 lista.add("Rodri");
	 lista.add("Alex");
	 lista.add("Carmen");
	 		
	 TreeSet<String>listaTree=new TreeSet<String>();
	 listaTree.addAll(lista);
	 
	 HashSet<String>listaHash=new HashSet<String>();
	 listaHash.addAll(lista);
	 
	 Iterator<String> it=lista.iterator();
	 while(it.hasNext()) {
		 System.out.println(it.next());
	 }
	 
	 Iterator<String>itTree=listaTree.iterator();
	 while(itTree.hasNext()) {
		 System.out.println(itTree.next());
	 }
	 
	 Iterator<String>itHas=listaHash.iterator();
	 while(itHas.hasNext()) {
		 System.out.println(itHas.next());
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
		

	}

}
