package tema6;

public class Tarea {
	
	private String titulo;
	private String descripcion;
	private boolean realizada;
	private boolean importante;
	
	public Tarea() {
		
	}
	
	public Tarea(String titulo, String descripcion,  boolean importante) {
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.importante = importante;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isRealizada() {
		return realizada;
	}

	public void setRealizada(boolean realizada) {
		this.realizada = realizada;
	}

	public boolean isImportante() {
		return importante;
	}

	public void setImportante(boolean importante) {
		this.importante = importante;
	}

	@Override
	public String toString() {
		return "Tarea [titulo=" + titulo + ", descripcion=" + descripcion + ", realizada=" + realizada + ", importante="
				+ importante + "]";
	}
	
	
	
	
	
	
	
	

}
