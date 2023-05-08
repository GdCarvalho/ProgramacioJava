import java.time.LocalDate;

public class vehiculo implements Alquilable{

	public String matricula;
	public String marca;
	public String modelo;
	public boolean alquilado;
	public LocalDate fechaprestamo;
	public LocalDate fechadevolucion;
	
	
	public vehiculo(String matricula, String marca, String modelo, boolean alquilado, LocalDate fechaprestamo,
			LocalDate fechadevolucion) {
		super();
		setMatricula(matricula);
		this.marca = marca;
		this.modelo = modelo;
		this.alquilado = alquilado;
		this.fechaprestamo = fechaprestamo;
		this.fechadevolucion = fechadevolucion;
	}
	
	
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		if(matricula.matches("[0-9]{4}[A-Z]{3}")) {
		this.matricula = matricula;
		}
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public boolean isAlquilado() {
		return alquilado;
	}
	public void setAlquilado(boolean alquilado) {
		this.alquilado = alquilado;
	}
	public LocalDate getFechaprestamo() {
		return fechaprestamo;
	}
	public void setFechaprestamo(LocalDate fechaprestamo) {
		this.fechaprestamo = fechaprestamo;
	}
	public LocalDate getFechadevolucion() {
		return fechadevolucion;
	}
	public void setFechadevolucion(LocalDate fechadevolucion) {
		this.fechadevolucion = fechadevolucion;
	}


	@Override
	public boolean alquilar() { //implementamos la funcion de alquilar
		if(this.isAlquilado()) {
			return false;
		}
		setAlquilado(true); //si ya no está alquilado, actualizamos el boolean a true
		setFechaprestamo(LocalDate.now());//se supone que lo estamos alquilando el mismo día
		setFechadevolucion(LocalDate.now().plusDays(20));//y se le suma 20 dias a dia del alquilar para saber cuando será la devolucion
		
		return true;	
	
		}
	


	@Override
	public void devolver() { //función de devolver
		alquilado=false;
		fechadevolucion=LocalDate.now(); //la fecha de devolucion se supone que se realiza en el dái actual
		
	}


	@Override
	public String toString() {
		return "vehiculo [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", alquilado="
				+ alquilado + ", fechaprestamo=" + fechaprestamo + ", fechadevolucion=" + fechadevolucion + "]";
	}
	

	public String toStringFichero() {
			return matricula+","+ marca+","+modelo+","+alquilado+","+fechaprestamo+","+fechadevolucion;
		}
	
	
	
	
	
	
	
	
	
	
}
