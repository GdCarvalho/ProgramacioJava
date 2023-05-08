
public class pelicula extends DVD {
	
	public String director;
	public String genero;
	
	public pelicula(String codigo, String titulo, int duracion, String director, String genero) {
		super(codigo, titulo, duracion);
		this.director=director;
		this.genero=genero;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "pelicula [director=" + director + ", genero=" + genero + ", duracion=" + duracion + ", codigo=" + codigo
				+ ", titulo=" + titulo + ", alquilado=" + alquilado + ", diasPrestamo=" + diasPrestamo + "]";
	}
	
	
	@Override
	public String toStringFichero() {
		
		return codigo+","+titulo+","+duracion+","+director+","+genero+","+alquilado;
	}
	

	@Override
	
		public boolean alquilar() { //Definimos aquí la función de alquilar pelis
		if(this.isAlquilado()) {
			return false;
		}
		setAlquilado(true);
		setDiasPrestamo(5);
		
		return true;	
	
		}
	}
	
	
	
	


