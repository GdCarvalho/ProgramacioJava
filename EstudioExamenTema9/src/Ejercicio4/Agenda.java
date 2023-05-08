package Ejercicio4;

import java.util.ArrayList;
import java.util.Iterator;

public class Agenda {
	
	private ArrayList<Contacto> contactos;

	public Agenda(ArrayList<Contacto> contactos) {
		super();
		this.contactos = contactos;
	}

	public ArrayList<Contacto> getContactos() {
		return contactos;
	}
	
   public void addContacto(Contacto c) {
	   contactos.add(c);
   }
   
   public Contacto getContacto(String telefono) {
	   for(int i=0; i<contactos.size();i++) {
		   if(contactos.get(i).getTelefono().equals(telefono)) {
			   return contactos.get(i);
		   }
	   }
	   return null;
 
   }
   
   public int getPosicionContacto(String telefono) {
	   for(int i=0;i<contactos.size();i++) {
		   if(contactos.get(i).getTelefono().equals(telefono)) {
			   return i;
		   }
	   }
	   return 0;
   }
	
	public void eliminarContactos(String telefono) {
		Iterator<Contacto> it=contactos.iterator();
		while(it.hasNext()) {
			if(it.next().getTelefono().equals(telefono)) {
				it.remove();
			}
		}	
	}
	
	public ArrayList<Contacto> buscarContactos(String nombre){
		ArrayList<Contacto>cc=new ArrayList<Contacto>();
		
		for(int i=0;i<contactos.size();i++) {
			if(contactos.get(i).getNombre().equals(nombre)) {
				cc.add(contactos.get(i));
			}
		}
		return cc;	
	}
	
	public void modificarContacto(String telefono,String nombre) {
		
		for(int i=0;i<contactos.size();i++) {
			if(contactos.get(i).getTelefono().equals(telefono)) {
				contactos.get(i).setNombre(nombre);
			}
		}
		
	}
	
	public void imprimeContactos() {
		
		for( Contacto cc: contactos) {
			if(cc!=null) {
				System.out.println(cc);
			}
		}
		
	}
	
	

}
