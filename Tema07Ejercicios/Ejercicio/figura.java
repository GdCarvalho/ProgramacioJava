
public class figura {
	
	
	private String nombre;
	private float perimetro;
	
	public figura(String nombre, float perimetro) {
		super();
		this.nombre=nombre;
		this.perimetro=perimetro;
	}
	
	//Métodos de acceso

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPerimetro() {
		return perimetro;
	}

	public void setPerimetro(float perimetro) {
		this.perimetro = perimetro;
	}
	
	

	@Override
	public String toString() {
		return "figura [nombre=" + nombre + ", perimetro=" + perimetro + "]";
	}
	
	

	
	
	
	

}
