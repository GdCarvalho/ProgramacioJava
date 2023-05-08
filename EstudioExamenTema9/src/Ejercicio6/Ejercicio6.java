package Ejercicio6;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;


public class Ejercicio6 {

	public static void main(String[] args) {

         HashMap<String,Float>alumno=new HashMap<String,Float>();
         
		alumno.put("Alex",3f);
		alumno.put("María",6f);
		alumno.put("Esteban",8.3f);
		alumno.put("Ricardo",5.6f);
		alumno.put("Gio",9f);
		
		
	   Float nota= alumno.get("Gio");
	   
	   alumno.remove("Alex");
	   
	   Set<Entry<String,Float>>alumnos=alumno.entrySet();
	   
	   for(Entry<String,Float>e:alumnos) {
		   System.out.println(e.getKey()+" "+e.getValue());
	   }
	   
		

	}

}
