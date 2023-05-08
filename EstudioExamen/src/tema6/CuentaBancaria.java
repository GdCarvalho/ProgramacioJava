package tema6;

public class CuentaBancaria {

	private String iban;
	private String dni;
	private float saldo;
	private TipoDeCuenta cuenta;

	public CuentaBancaria(String iban, String dni, float saldo, TipoDeCuenta cuenta) {
		super();
		setIban(iban);
		setDni(dni);
		this.saldo = saldo;
		this.cuenta = cuenta;
	}
	public CuentaBancaria(String iban, String dni, TipoDeCuenta cuenta) {
		super();
		setIban(iban);
		setDni(dni);
		this.cuenta = cuenta;
		this.saldo=10000;
	}
	public String getIban() {
		return iban;
	}
	public void setIban(String iban) {
		if(iban.matches("[A-Z]{1}[0-9]{2}")) {
			this.iban = iban;
		}
	
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		if(dni.matches("[0-9]{8}[A-Z]{1}")) {
			this.dni = dni;
		}
		
	}
	public float getSaldo() {
		return saldo;
	}
	
	public TipoDeCuenta getCuenta() {
		return cuenta;
	}
	public void setCuenta(TipoDeCuenta cuenta) {
		this.cuenta = cuenta;
	}
	
	public void ingresarDinero(float dinero) {
		saldo=saldo+dinero;
	}
	
	public void retirarDinero(float dinero) {
		if(this.cuenta==TipoDeCuenta.Corriente) {
			if(saldo>=-2000 && dinero<5000) {
				saldo=saldo-dinero;
			}
			
		}
		
	}
	
	public static void realizarTranspaso(CuentaBancaria c1,CuentaBancaria c2, float dinero ) {
		if(c1.getDni().equals(c2.getDni())) {
			c1.retirarDinero(dinero);
			c2.ingresarDinero(dinero);
		}
		
	}
	@Override
	public String toString() {
		return "CuentaBancaria [iban=" + iban + ", dni=" + dni + ", saldo=" + saldo + ", cuenta=" + cuenta + "]";
	}
	
	
	
	
	
}
