package ejercicio02;

public class Estadios {
	
	private String nombre;
	private int capacidad;
	private String ciudad;
	
	//Constructores
	
	public Estadios(String nombre, int capacidad, String ciudad ) {
		this.capacidad=capacidad;
		this.ciudad=ciudad;
		this.nombre=nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public String getCiudad() {
		return ciudad;
	}

	@Override
	public String toString() {
		return "Estadios [nombre=" + nombre + ", capacidad=" + capacidad + ", ciudad=" + ciudad + "]";
	}
	
	
	
	
	

}
