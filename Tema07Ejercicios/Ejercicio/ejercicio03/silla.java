package ejercicio03;

public class silla extends mueble {

	private String color;
	
	public silla(String color, float precio) {
		super("Silla", precio);
		this.color=color;
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return super.toString() + "Además soy de color: "+color;
	}
	

	
}
