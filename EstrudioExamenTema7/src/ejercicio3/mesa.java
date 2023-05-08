package ejercicio3;

public class mesa extends mueble{
	
	private String forma;
	private int plazas;
	
	public mesa( float precio, String forma, int plazas) {
		super("Mesa", precio);
		this.forma = forma;
		this.plazas = plazas;
	}

	public String getForma() {
		return forma;
	}

	public void setForma(String forma) {
		this.forma = forma;
	}

	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}

	@Override
	public String toString() {
		return super.toString()+"\nAdemas tengo "+plazas+" plazas";
	}
	
	
	
	
	

}
