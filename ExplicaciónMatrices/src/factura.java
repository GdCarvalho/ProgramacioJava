import java.time.LocalDate;

public class factura {

	private String codigo; //código compuesto por dos letras y 2 dígitos
	private LocalDate fecha;
	private float importe;
	
	//Constructores
	
	public factura(String codigo, LocalDate fecha, float importe) {
		
		
		if(validarCodigo(codigo)) {
		this.codigo = codigo;
		}
		setFecha(fecha);
		this.fecha = fecha;
		this.importe = importe;
	}
	
	//Métodos de acceso

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		//verificar que la fecha es anterior al día de hoy
		if(fecha.isBefore(LocalDate.now())|| fecha.isEqual(LocalDate.now())) {
		this.fecha = fecha;
		}
		
	}

	public float getImporte() {
		return importe;
	}

	public void setImporte(float importe) {
		this.importe = importe;
	}

	public String getCodigo() {
		return codigo;
	}

	@Override
	public String toString() {
		return "factura [codigo=" + codigo + ", fecha=" + fecha + ", importe=" + importe + "]";
		//volcar en un string el estado de un objeto, si no hacemos esto veremos el hashcode
	}
	
	//Método que valida si el codigo tiene 2 letras y 2 dígitos.
	
	private boolean validarCodigo (String codigo) {
		if(codigo.matches("[A-Za-z]{2}[0-9]{2}")) {
			return true;
		}
		return false;
	}
	
	
	
	
	
	
	
	
	
	
}
