
public class rectangulo extends figura {
	
	
	private float lMayor;
	private float lMenor;
	

	public rectangulo( float lMayor, float lMenor ) {
		super("rectangulo");
		this.lMayor=lMayor;
		this.lMenor=lMenor;
		
		// TODO Auto-generated constructor stub
	}


	@Override
	public float calcularArea() {
		// TODO Auto-generated method stub
		return lMayor*lMenor;
	}
	
	
	

}
