package factory;

public class coche implements VehiculoMotor{
	
	private int numeroRuedas;
	private int potencia;
	private int capacidadDeposito;
	private String tipoCombustible;
	
	
	
	
	
	
	
	
	
	@Override
	public int getNumeroRuedas() {
		// TODO Auto-generated method stub
		return numeroRuedas;
	}
	@Override
	public int getCapacidadDeposito() {
		// TODO Auto-generated method stub
		return capacidadDeposito;
	}
	@Override
	public int getPotencia() {
		// TODO Auto-generated method stub
		return potencia;
	}
	@Override
	public String getTipoCombustible() {
		// TODO Auto-generated method stub
		return tipoCombustible;
	}
	@Override
	public String arrancar() {
		// TODO Auto-generated method stub
		return "Coche arrancando";
	}
	@Override
	public String frenar() {
		// TODO Auto-generated method stub
		return "Coche frenando";
	}
	@Override
	public String acelerar() {
		// TODO Auto-generated method stub
		return "Coche acelerando";
	}
	@Override
	public void setNumeroRuedas(int numeroRuedas) {
		this.numeroRuedas=numeroRuedas;
		
	}
	@Override
	public void setCapacidadDeposito(int CapacidadDeposito) {
		this.capacidadDeposito=capacidadDeposito;
	}
	@Override
	public void setPotencia(int Potencia) {
		this.potencia=potencia;
		
	}
	@Override
	public void setTipoCombustible(String TipoCombustible) {
		this.tipoCombustible=tipoCombustible;
		
	}


}
