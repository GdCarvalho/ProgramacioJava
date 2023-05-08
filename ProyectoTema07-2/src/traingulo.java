
public class traingulo extends poligono {

	private float base;
	private float altura;
	
	
	public traingulo( float base, float altura) {
		super("Triangulo");
		this.base = base;
		this.altura = altura;
	}


	public float getBase() {
		return base;
	}


	public void setBase(float base) {
		this.base = base;
	}


	public float getAltura() {
		return altura;
	}


	public void setAltura(float altura) {
		this.altura = altura;
	}



	public float calcularAngulo() {
		return 90;
	}


	
	public float calcularArea() {
		
		return (base*altura)/2;
	}
	
	
	
	
	
}
