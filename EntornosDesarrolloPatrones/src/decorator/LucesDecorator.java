package decorator;

public class LucesDecorator extends BaseDecorator  {

	public LucesDecorator(ArbolNavidad arbolNavidad) {
		super(arbolNavidad);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String decorar() {
		// TODO Auto-generated method stub
		return super.decorar()+ " con luces";
	}
		

}
