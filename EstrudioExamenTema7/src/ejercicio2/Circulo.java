package ejercicio2;

public class Circulo extends Figura {

	private double radio;

	public Circulo(double radio) {
		super("Circulo", 2*Math.PI*radio);
		this.radio=radio;
		// TODO Auto-generated constructor stub
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Circulo [nombre="+getNombre()+" perimetro="+getPerimetro( )+" radio=" + radio + "]";
	}

	
	
	
	
}
