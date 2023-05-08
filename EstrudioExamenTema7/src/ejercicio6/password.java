package ejercicio6;

public abstract class password implements Validator, Comparable<password> {

	public String seña;

	public password(String seña) {
		super();
		setSeña(seña);
	}

	public String getSeña() {
		return seña;
	}

	
	
	public abstract void setSeña(String seña) ;
	
	 public abstract String getFortaleza()	;
		 
	 @Override
		public int compareTo(password o) {
			// TODO Auto-generated method stub
			return this.seña.compareTo(o.seña);
		}
	
	
	
}
