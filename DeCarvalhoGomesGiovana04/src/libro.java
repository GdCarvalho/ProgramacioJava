
public class libro extends producto {

	
	public String autor;
	public int numPaginas;
	
	public libro(String codigo, String titulo, String autor, int numPaginas) {
		super(codigo, titulo);
		this.autor=autor;
		this.numPaginas=numPaginas;
		
	}

	
	
	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}



	public int getNumPaginas() {
		return numPaginas;
	}


	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}



	@Override
	public boolean alquilar() { //Definimos aquí la función de alquilar libros
		if(this.isAlquilado()) {
			return false;
		}
		setAlquilado(true);
		setDiasPrestamo(10);
		
		return true;	
	}

	
	
	@Override
	public String toString() {
		return "libro [autor=" + autor + ", numPaginas=" + numPaginas + ", codigo=" + codigo + ", titulo=" + titulo
				+ ", alquilado=" + alquilado + ", diasPrestamo=" + diasPrestamo + "]";
	}



	@Override
	public String toStringFichero() {
		return codigo+","+titulo+","+autor+","+numPaginas+","+alquilado;
	}
	
	
	
	
	
	
}
