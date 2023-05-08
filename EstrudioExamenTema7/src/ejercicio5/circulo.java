package ejercicio5;

public class circulo implements Relationable{
	
	private int radio;

	public circulo(int radio) {
		super();
		this.radio = radio;
		calcularArea(radio);
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}
	
	public float calcularArea(int radio) {
		float area=(float) (2*Math.PI*Math.sqrt(radio));
	return area;
	}

	@Override
	public boolean isMayorQue(Object a) {
	 	circulo c2=(circulo)a;
		if(this.calcularArea(getRadio())>c2.calcularArea(getRadio())) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isMenorQue(Object a) {
		circulo c2=(circulo)a;
		if(this.calcularArea(getRadio())<c2.calcularArea(getRadio())) {
			return true;
		}
		else {
			return false;
		}
		
		
		
	}

	@Override
	public boolean isIgual(Object a) {
		circulo c2=(circulo)a;
		if(this.calcularArea(getRadio())==c2.calcularArea(getRadio())) {
			return true;
		}
		else {
			return false;
		}
	}
	

	
	
	
	
}
