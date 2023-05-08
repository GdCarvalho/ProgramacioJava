
public class persona implements Comparable<persona>{
	
	private String nombre;
	private String dni;
	private int edad;
	public persona(String nombre, String dni, int edad) {
		super();
		this.nombre = nombre;
		setDni(dni);
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		if(dni.matches("[0-9]{8}[A-Z]{1}")) {
			this.dni = dni;
		}
		
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "persona [nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + "]";
	}
	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		persona other = (persona) obj;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		return true;
	}
	@Override
	public int compareTo(persona o) {
		// TODO Auto-generated method stub
		return this.nombre.compareTo(o.getNombre());
	}
	
	
	
	
	
	
	

}
