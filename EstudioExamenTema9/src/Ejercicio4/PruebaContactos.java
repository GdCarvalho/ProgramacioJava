package Ejercicio4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class PruebaContactos {

	public static void main(String[] args) {
		
		ArrayList<Contacto>listac=new ArrayList<Contacto>();
		
		listac.add(new Contacto("Juan","678876555"));
		listac.add(new Contacto("Carmen","654333123"));
		listac.add(new Contacto("Manuel","611234009"));
		listac.add(new Contacto("Ana","609231487"));
		listac.add(new Contacto("Pedro","673421220"));
		
		Agenda agenda=new Agenda(listac);
		
		Contacto c1=new Contacto("Julia","608443216");
		
		agenda.addContacto(c1);
		
		agenda.modificarContacto("673421220", "Paco");
		
		//agenda.imprimeContactos();
		
		
		Set<Contacto>listaHash=new HashSet<Contacto>();
		listaHash.add(new Contacto("Juan","678876555"));
		listaHash.add(new Contacto("Carmen","654333123"));
		listaHash.add(new Contacto("Manuel","611234009"));
		listaHash.add(new Contacto("Ana","609231487"));
		listaHash.add(new Contacto("Pedro","673421220"));
		
		for(Contacto cc:listaHash) {
		 System.out.println(cc);
			
		}
		
		System.out.println("---------");
		Set<Contacto>listaTree=new TreeSet<Contacto>();
		listaTree.addAll(listaHash);
		
		for(Contacto cc: listaTree) {
			System.out.println(cc);
		}
		
		
		
		
		
		
		

	}

}
