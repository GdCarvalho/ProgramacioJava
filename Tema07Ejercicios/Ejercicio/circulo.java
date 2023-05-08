
public class circulo extends figura {
	
	private double radio;
	
	public circulo(double radio) {
		super("Circulo",(float) (2*Math.PI*radio));
		this.radio=radio;
		
	}
	
	
	
	

	public double getRadio() {
		return radio;
	}





	public void setRadio(double radio) {
		this.radio = radio;
	}





	@Override
	public String toString() {
		return "circulo [radio=" + radio + ", toString()=" + super.toString() + "]";
	}
	
	
	

}
