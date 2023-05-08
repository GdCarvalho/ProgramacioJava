package ejercicio05;

public class circulo implements Relationable {
	
	private int radio;
	private float area;
	
	public  circulo(int radio) {
		this.radio=radio;
		calcularArea();
		
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	public float getArea() {
		return area;
	}

	public void calcularArea() {
		this.area =(float)( 2*Math.PI*getRadio());
	}

	@Override
	public boolean isMayorQue(Object a, Object b) {
		if(this.area>((circulo)a).area && this.area>((circulo)b).area) {
		return true;
	}
		return false;
	}

	@Override
	public boolean isMenorQue(Object a, Object b) {
		if(this.area<((circulo)a).area && this.area<((circulo)b).area) {
			return true;
		}
			return false;
		}

	@Override
	public boolean isIgual(Object a, Object b) {
		if(this.area==((circulo)a).area && this.area==((circulo)b).area) {
			return true;
		}
			return false;
		}
	
	
	
	
	
	
	

}
