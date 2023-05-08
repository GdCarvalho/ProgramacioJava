package ejercicio3;

public class mueble {

	private String nombre;
	private float precio;
	
	
	public mueble(String nombre, float precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public float getPrecio() {
		return precio;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	}


	@Override
	public String toString() {
		return "Soy un "+nombre+" y valgo: "+precio+"€";
	}
	
	
	
	
	
	
}
