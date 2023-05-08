
public class Jugador {
	
	private String Codigo;
	private String Nombre;
	private int puntos;
	
	
	//Constructores
	
	public Jugador(String Codigo, String Nombre) {
		this.Nombre=Nombre;
		setCodigo(Codigo);
		
	}


	public String getCodigo() {
		return Codigo;
	}


	public void setCodigo(String Codigo) {
		if(Codigo.length()==2) {
			if(Character.isLetter(Codigo.charAt(0)) && Character.isDigit(Codigo.charAt(1))) {
				this.Codigo=Codigo;
				
			}
		}	
		
	}


	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}


	public int getPuntos() {
		return puntos;
	}


	@Override
	public String toString() {
		return "Jugador [Codigo=" + Codigo + ", Nombre=" + Nombre + ", puntos=" + puntos + "]";
	}
	
	
	//Métodos de la clase
	
	public void actualizarPuntos(int Puntos) {
		this.puntos=this.puntos;
		
	}
	
	

}
