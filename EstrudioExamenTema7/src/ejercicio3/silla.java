package ejercicio3;

public class silla extends mueble {
     private String color;

	public silla(float precio, String color) {
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
		return super.toString()+"\nAdemás soy de color "+color;
	}
     

	
	
	
	
}
