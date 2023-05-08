package tema6;

public class Jugador {
	
	private String codigo;
	private String nombre;
	private int puntos;
	
	
	public Jugador(String codigo, String nombre) {
		super();
		setCodigo(codigo);
		this.nombre = nombre;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		if(codigo.matches("[a-zAz]{1}[0-9]{1}")) {
			this.codigo = codigo;
		}		
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getPuntos() {
		return puntos;
	}

	public void actualizarPuntos(int punto) {
		this.puntos=this.puntos+punto;
		
	}


	@Override
	public String toString() {
		return "Jugador [codigo=" + codigo + ", nombre=" + nombre + ", puntos=" + puntos + "]";
	}
	
	
	
	
	

}
