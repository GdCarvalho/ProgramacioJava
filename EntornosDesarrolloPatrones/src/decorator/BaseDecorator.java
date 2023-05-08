package decorator;

public abstract class BaseDecorator implements ArbolNavidad {

	
	private ArbolNavidad arbolNavidad;
		
	public BaseDecorator(ArbolNavidad arbolNavidad) {
		super();
		this.arbolNavidad = arbolNavidad;
	}





	@Override
	public String decorar() {
		// TODO Auto-generated method stub
		return arbolNavidad.decorar();
	}
	
	
	

}
