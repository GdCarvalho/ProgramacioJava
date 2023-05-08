import java.time.LocalDate;
import java.time.LocalTime;

public class plazasParking implements Alquilable{
	
	public String codigo;
	public int numeroPlaza;
	public boolean alquilada;
	public LocalTime horaPrestamo;
    public LocalTime horaDevolucion;
    
    

	public plazasParking(String codigo, int numeroPlaza, boolean alquilada, LocalTime horaPrestamo,
			LocalTime horaDevolucion) {
		super();
		setCodigo(codigo);
		this.numeroPlaza = numeroPlaza;
		this.alquilada = alquilada;
		this.horaPrestamo = horaPrestamo;
		this.horaDevolucion = horaDevolucion;
	}



	public String getCodigo() {
		return codigo;
	}



	public void setCodigo(String codigo) {
		if(codigo.matches("[A-Z]{2}[0-9]{2}")) {
			this.codigo = codigo;
		}
		
	}



	public int getNumeroPlaza() {
		return numeroPlaza;
	}



	public void setNumeroPlaza(int numeroPlaza) {
		this.numeroPlaza = numeroPlaza;
	}



	public boolean isAlquilada() {
		return alquilada;
	}



	public void setAlquilada(boolean alquilada) {
		this.alquilada = alquilada;
	}



	public LocalTime getHoraPrestamo() {
		return horaPrestamo;
	}



	public void setHoraPrestamo(LocalTime horaPrestamo) {
		this.horaPrestamo = horaPrestamo;
	}



	public LocalTime getHoraDevolucion() {
		return horaDevolucion;
	}



	public void setHoraDevolucion(LocalTime horaDevolucion) {
		this.horaDevolucion = horaDevolucion;
	}



	@Override
	public boolean alquilar() { //implementamos la funcion de alquilar plazas
		if(this.isAlquilada()) {
			return false;
		}
		setAlquilada(true);
		setHoraPrestamo(LocalTime.now()); //se alquila en tiempo actual
		setHoraDevolucion(LocalTime.now().plusHours(5)); //se ha de devolver la plaza 5 horas despues del alquiler
		
		return true;	
	
		}



	@Override
	public void devolver() {
		alquilada=false;
		horaDevolucion=LocalTime.now();
		
	}



	@Override
	public String toString() {
		return "plazasParking [codigo=" + codigo + ", numeroPlaza=" + numeroPlaza + ", alquilada=" + alquilada
				+ ", horaPrestamo=" + horaPrestamo + ", horaDevolucion=" + horaDevolucion + "]";
	}
	
    
	public String toStringFichero() {
		return codigo+","+numeroPlaza+","+alquilada+","+horaPrestamo+","+horaDevolucion;
	}
	 
    
    
    
    

}
