package ejercicio03;

public class cama extends mueble{

	private int largo;
	private int ancho;
	
	public cama(int largo, int ancho, float precio) {
		super("Cama", precio);
		this.ancho=ancho;
		this.largo=largo;
		
	}

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Además soy de: "+ancho+" por "+largo;
	}
	
	
	
}
