
public abstract class figura implements Comparable<figura> {
	
	private String nombre;

	public figura(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int compareTo(figura o) { //solo funciona si la matriz está llena
		// TODO Auto-generated method stub
		Float area1=Float.valueOf(o.calcularArea());
		Float area2=Float.valueOf(this.calcularArea());
		
		return area2.compareTo(area1);
	}
	
	public abstract float calcularArea();
	

}
