import java.time.LocalDate;

public class Directivo extends Empleado {
	
	private String telefono;
	private boolean bonoPremiun;
	private boolean bonoPremium;
	
	
	//Constructor
	
	public Directivo(String dni, LocalDate fechaNacimiento, LocalDate fechaContratacion, String nombre, String telefono) {
		//primera línea llamar a un constructor de la clase base--->super(argumentos)
		super(dni,fechaNacimiento,fechaContratacion,nombre);
		this.telefono=telefono;
		
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public void activarBono() {
		this.bonoPremium=true;
	}
	public void desactivarBono() {
		this.bonoPremium=false;
	}
	
	
	
	public void calcularSalario() { 
		int antiguedad=super.calcularAnhosAntiguedad();
		super.salario= Empleado.salarioBase+(antiguedad/3)* Empleado.salarioBase*0.2f;
		
		
	}
	

	@Override
	public String toString() {
		return super.toString()+"Telefono: " +this.telefono;
	
}	
	
	
	
}
