import java.time.LocalDate;

public class Operario extends Empleado {
	
	private String polizaCivil;
	private String polizaAccidentes;
	public Operario(String dni, LocalDate fechaNacimiento, LocalDate fechaContratacion, String nombre,
			String polizaCivil, String polizaAccidentes) {
		super(dni, fechaNacimiento, fechaContratacion, nombre);
		this.polizaCivil = polizaCivil;
		this.polizaAccidentes = polizaAccidentes;
	}
	public String getPolizaCivil() {
		return polizaCivil;
	}
	public void setPolizaCivil(String polizaCivil) {
		this.polizaCivil = polizaCivil;
	}
	public String getPolizaAccidentes() {
		return polizaAccidentes;
	}
	public void setPolizaAccidentes(String polizaAccidentes) {
		this.polizaAccidentes = polizaAccidentes;
		
		
		
		
		
		
		
		
		
	}
	@Override
	public String toString() {
		return "Operario [polizaCivil=" + polizaCivil + ", polizaAccidentes=" + polizaAccidentes + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	

}
