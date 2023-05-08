package factory;

public interface VehiculoMotor {
	
	int getNumeroRuedas();
	int getCapacidadDeposito();
	int getPotencia();
	String getTipoCombustible();
	
	void setNumeroRuedas(int numeroRuedas);
	void setCapacidadDeposito(int CapacidadDeposito);
	void setPotencia(int Potencia);
	void setTipoCombustible(String TipoCombustible);
	
	
	
	
	String arrancar();
	String frenar();
	String acelerar();
	
	

}
