
public class persona implements Comparable<persona>  {

	private String dni;
	private String nombre;
	private int edad;
	
	public persona() {
		
	}
	
	public persona(String dni, String nombre, int edad) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "persona [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + "]";
	}

	
	
	
	

	

	@Override
	public int compareTo(persona o) {
		// TODO Auto-generated method stub
		return this.nombre.compareTo(o.getNombre());
	}

	
	
	

	

	
	
	
	
	
	
	
}
