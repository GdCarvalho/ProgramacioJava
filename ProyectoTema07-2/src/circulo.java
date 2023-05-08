
public class circulo extends figura {

	float radio;
	
	public circulo(float radio) {
		super("Circulo");
		this.radio=radio;
	}
	
	public float calcularArea() {
		return(float)Math.PI*radio*radio;
		
	}

	
	
	
	
	
}
