import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class testPersonas {

	public static void main(String[] args) {

       persona p1=new persona("María","12345678A",23);
       persona p2=new persona("Alfredo","34567890P",44);
       persona p3=new persona("Rodri","54321678U",98);
       persona p4=new persona("Carlos","76543218S",56);
       persona p5=new persona("Bea","12345678A",30);
       persona p6=new nenos("Juan","23456123E",12,"Rojo");
       
       
       ArrayList<persona>people=new ArrayList<persona>();
		people.add(p1);
		people.add(p2);
		people.add(p3);
		people.add(p4);
		people.add(p5);
		people.add(p6);
		
		people.sort(new CompararEdad());
		
		for(persona p:people) {
			if(p instanceof nenos) {
				nenos n=(nenos)p;
				if(n.getColor().equals("Rojo")) {
					System.out.println(n.toString());
				}
			}
		}
		
		
		
	/*	Iterator<persona>it=people.iterator();
		while(it.hasNext()) {
			if(it.next().getEdad()>45) {
				it.remove();
			}
		}*/
		
		
	/*	for(int i=0;i<people.size();i++) {
			if(people.get(i).getEdad()>45) {
				people.remove(i);
				i--;
				
			}
		}*/
		
		

		for(persona p:people) {
			if(p!=null) {
				System.out.println(p);
			}
		}
	
		
		
		
		
			

	}

}
