import java.util.ArrayList;
import java.util.HashSet;

public class testPersonas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<persona> people=new ArrayList<persona>();
		
		persona p1=new persona("12345678A","Alicia", 34);
		persona p2=new persona("34567890S","Esteban", 76);
		persona p3=new persona("72145678W","Alicia", 3);
		persona p4=new persona("54321234R","Marcos", 21);
		
		
		people.add(p1);
		people.add(p2);
		people.add(p3);
		people.add(p4);
		
		
		people.sort(new ComparableDNI());
		
		
		
		
		
			for(persona p:people) {
			if(p!=null) {
				System.out.println(p);
			}
		}
		
		
	/*	persona p[]=new persona[5];
		p[0]=new persona("1A","Alba",55);
		p[1]=new persona("1A","Cris",55);
		p[2]=new persona("1A","Victor",55);
		p[3]=new persona("1A","Marco",55);
		p[4]=new persona("1A","Felix",55);
		
		for (persona pp:p) {
			if(pp!=null) {
				System.out.println(pp.toString());
			}
		}*/
		
		
		
		
		

	}

}
