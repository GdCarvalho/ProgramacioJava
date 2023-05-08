package ejercicio04;

public class sospechosoCovid extends paciente {

	private boolean infectado;
	private boolean realizadoTest;
	
	
	public sospechosoCovid(String dni, String nombre, int edad, boolean infectado, boolean realizadoTest) {
		super(dni, nombre, edad,"");
		this.infectado=infectado;
		this.realizadoTest=realizadoTest;
		this.realizarTest();
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
	
	
	//Método realizar test
	public int realizarTest() {
		realizadoTest=true;
		 if (Math.random() < 0.5) {
			 infectado=false;
			 super.setEnfermedad("no tiene COVID");
			return 0;
			  
			} else {
				infectado=true;
				super.setEnfermedad("Covid");
			  return 1;
			  
			}
	
		
	}
	
	//Método curar
	
	void curar() {
		super.setEnfermedad("ya no está enfermo");
		infectado=false;
		
	}


	@Override
	public String toString() {
		return super.toString()+" Está infectado: " + infectado + ", test realizado: " + realizadoTest;
	}
	
	
	
	
	
}
