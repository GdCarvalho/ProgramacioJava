import java.util.Comparator;

public class CompararEdad implements Comparator<persona> {

	@Override
	public int compare(persona o1, persona o2) {
		Integer edad1=Integer.valueOf(o1.getEdad());
		return edad1.compareTo(o2.getEdad()) ;
	}

}
