package ejercicio04;

public class paciente {
	
	private String dni;
	private String nombre;
	private int edad;
	private String enfermedad;
	
	public paciente(String dni, String nombre, int edad, String enfermedad) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		this.enfermedad = enfermedad;
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

	public String getEnfermedad() {
		return enfermedad;
	}

	public  void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}

	@Override
	public String toString() {
		return "paciente [dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + ", enfermedad=" + enfermedad + "]";
	}
	
	
	

}
