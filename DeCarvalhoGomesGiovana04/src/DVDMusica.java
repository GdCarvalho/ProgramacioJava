
public class DVDMusica extends DVD {
	
	public String grupo;

	public DVDMusica(String codigo, String titulo, int duracion, String grupo) {
		super(codigo, titulo, duracion);
		this.grupo=grupo;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	@Override
	public String toString() {
		return "DVDMusica [grupo=" + grupo + ", duracion=" + duracion + ", codigo=" + codigo + ", titulo=" + titulo
				+ ", alquilado=" + alquilado + ", diasPrestamo=" + diasPrestamo + "]";
	}
	
	
	@Override
	public String toStringFichero() {
		
		return codigo+","+titulo+","+duracion+","+grupo+","+alquilado;
	}
	
	

	@Override
	public boolean alquilar() { //Definimos aquí la función de alquilar CD's
		if(this.isAlquilado()) {
			return false;
		}
		setAlquilado(true);
		setDiasPrestamo(3);
		
		return true;	
	
	}
	}
	
	
	
	
	


