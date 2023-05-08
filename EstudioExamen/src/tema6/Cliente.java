package tema6;

public class Cliente {
	
	private String nif;
	private String direccion;
	private FormasDePago pago;
	private String mail;
	
	public Cliente(String nif, String direccion, FormasDePago pago, String mail) {
		super();
		this.nif = nif;
		this.direccion = direccion;
		this.pago = pago;
		this.mail = mail;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public FormasDePago getPago() {
		return pago;
	}

	public void setPago(FormasDePago pago) {
		this.pago = pago;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	
	
	
	@Override
	public String toString() {
		return "Cliente [nif=" + nif + ", direccion=" + direccion + ", pago=" + pago + ", mail=" + mail + "]";
	}
	
	
	
	

}
