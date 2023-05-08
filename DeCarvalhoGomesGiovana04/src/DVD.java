
public abstract class DVD extends producto {
	
	public int duracion;

	public DVD(String codigo, String titulo, int duracion) {
		super(codigo, titulo);
		this.duracion=duracion;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "DVD [duracion=" + duracion + ", codigo=" + codigo + ", titulo=" + titulo + ", alquilado=" + alquilado
				+ ", diasPrestamo=" + diasPrestamo + "]";
	}

	
	

	@Override
	public String toStringFichero() { //Sobreescribimos la función para que guarde solo la infomación que queremos en el fichero
		
		return codigo+","+titulo+","+duracion;
	}

	
	
	
	
	
	
	

}
