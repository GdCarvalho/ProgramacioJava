package repaso;

public class producto {
	
	private String codigo;

	public producto(String codigo) {
		super();
		this.codigo = codigo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
	
	public final boolean validarCodigo() {
		if(codigo.length()==4) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "producto [codigo=" + codigo + "]";
	}
	
	

}
