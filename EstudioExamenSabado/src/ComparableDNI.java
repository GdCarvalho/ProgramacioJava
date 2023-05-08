import java.util.Comparator;

public class ComparableDNI implements Comparator<persona> {

	@Override
	public int compare(persona o1, persona o2) {
		// TODO Auto-generated method stub
		return o1.getDni().compareTo(o2.getDni());
	}

}
