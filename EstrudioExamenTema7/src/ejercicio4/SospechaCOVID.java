package ejercicio4;

public class SospechaCOVID extends Paciente {

	private boolean infectado;
	private boolean realizadoTest;
	
	
	public SospechaCOVID(String dni, String nombre, int edad) {
		super(dni, nombre, edad);
		
	}


	public boolean isInfectado() {
		return infectado;
	}


	public void setInfectado(boolean infectado) {
		this.infectado = infectado;
	}


	public boolean isRealizadoTest() {
		return realizadoTest;
	}


	public void setRealizadoTest(boolean realizadoTest) {
		this.realizadoTest = realizadoTest;
	}
	
	public void curar() {
		infectado=false;
		super.setEnfermedad("Ya está curado");
	}
	
	public int realizarTest() {
		realizadoTest=true;
		if(Math.random()<0.5) {
			infectado=false;
			super.setEnfermedad("No está enfermo");
		return 0;
		}
		else {
			infectado=true;
			super.setEnfermedad("COVID");
		return 1;
		}
	}
	
	
	
	
}
