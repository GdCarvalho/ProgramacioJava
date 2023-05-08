import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Conjuntos {

	public static void main(String[] args) {
		//No admite duplicados Set<T>
		//TreeSet-->Ordena los objetos según su orden natural (que es el que está definido en la clase compareTo)
		//HashSet-->Orden hasheado (se  ordena según un algoritmo interno)
		//LinckedHashSet
		
		
		HashSet<String>matriculas=new HashSet<String>();
		matriculas.add("123RR");
		matriculas.add("456TT");
		matriculas.add("555UU");
		matriculas.add("546FD");
		matriculas.add("123RR");
		
		for(String e:matriculas) {
			System.out.println(e);
		}

	       //Se puede buscar haciendo un contains o buscar con un for
		
		//Eliminar elementos
		
		matriculas.remove("123RR");
		
		TreeSet<String> matriculasOrdenadas=new TreeSet<String>(matriculas);
		System.out.println("Imprimir matrícular ordenadas");
		for(String m:matriculasOrdenadas) {
			System.out.println(m);
		}
		
		//Conjunto que mantiene el orden de insercion
		LinkedHashSet<String> listaLink=new LinkedHashSet<String>();
		listaLink.add("Aspas");
		listaLink.add("Vinicius");
		listaLink.add("Cristiano");
		
		for(String m: listaLink) {
			System.out.println(m);
		}
		
		
		
		
		
		
		
	}
   
	
}
