import java.time.LocalDate;

public class Administrativo extends Empleado {
	
	private String codigoPortatil;

	
	//Constructor
	public Administrativo(String dni, LocalDate fechaNacimiento, LocalDate fechaContratacion, String nombre,
			String codigoPortatil) {
		super(dni, fechaNacimiento, fechaContratacion, nombre);
		this.codigoPortatil = codigoPortatil;
	}


	public String getCodigoPortatil() {
		return codigoPortatil;
	}


	public void setCodigoPortatil(String codigoPortatil) {
		this.codigoPortatil = codigoPortatil;
	}


	@Override
	public String toString() {
		return "Administrativo [codigoPortatil=" + codigoPortatil + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void calcularSalario() { 
		int antiguedad=super.calcularAnhosAntiguedad();
		super.salario= Empleado.salarioBase+(antiguedad/3)* Empleado.salarioBase*0.75f;
		
		
	}
	

	
	
	
	
	

}
