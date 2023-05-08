package ejercicioSalario;

public class empleado {
	
	private String dni;
	private String nacimiento;
	private String nombre;
	private int anhosEmpleado;
	private static int salarioBase=1000;
	private float salario;
	public empleado(String dni, String nacimiento, String nombre, int anhosEmpleado) {
		super();
		this.dni = dni;
		this.nacimiento = nacimiento;
		this.nombre = nombre;
		this.anhosEmpleado = anhosEmpleado;
		calcularSalario();
		
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNacimiento() {
		return nacimiento;
	}
	public void setNacimiento(String nacimiento) {
		this.nacimiento = nacimiento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAnhosEmpleado() {
		return anhosEmpleado;
	}
	public void setAnhosEmpleado(int anhosEmpleado) {
		this.anhosEmpleado = anhosEmpleado;
	}
	public float getSalario() {
		return salario;
	}
	
	public void calcularSalario() {
		salario=empleado.salarioBase+(anhosEmpleado/3)* empleado.salarioBase*0.505f;
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "empleado [dni=" + dni + ", nacimiento=" + nacimiento + ", nombre=" + nombre + ", anhosEmpleado="
				+ anhosEmpleado + ", salario=" + salario + "]";
	}
	

	
}