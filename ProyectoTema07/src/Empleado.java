import java.time.LocalDate;
import java.time.Period;

public class Empleado {
	
	private String dni;
	private LocalDate fechaNacimiento;
	private LocalDate fechaContratacion;
	protected float salario;
	protected static float salarioBase=1000; 
	private String nombre;
	
	public Empleado(String dni, LocalDate fechaNacimiento, LocalDate fechaContratacion, String nombre) {
		super();
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaContratacion = fechaContratacion;
		this.nombre=nombre;
		//Calcular salario
		this.calcularSalario();
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public LocalDate getFechaContratacion() {
		return fechaContratacion;
	}
	public void setFechaContratacion(LocalDate fechaContratacion) {
		this.fechaContratacion = fechaContratacion;
	}
	public float getSalario() {
		return salario;
	}
	@Override
	public String toString() {
		return "Empleado [dni=" + dni + "nombre="+nombre+ ", fechaNacimiento=" + fechaNacimiento + ", fechaContratacion="
				+ fechaContratacion + ", salario=" + salario + "]";
	}


	public void calcularSalario() { 
		int antiguedad=calcularAnhosAntiguedad();
		salario= Empleado.salarioBase+(antiguedad/3)* Empleado.salarioBase*0.505f;
		
		
	}
	
	protected int calcularAnhosAntiguedad() {//solo se puede llamar desde la propia clase o desde las clases que lo heredan
		Period periodo=Period.between(fechaContratacion,LocalDate.now());
		return periodo.getYears();
	}
	
	
	
}
