package decorator;

public class EstrellaDecorator extends BaseDecorator {
	


		public EstrellaDecorator(ArbolNavidad arbolNavidad) {
			super(arbolNavidad);
			// TODO Auto-generated constructor stub
		}
		
		@Override
		public String decorar() {
			// TODO Auto-generated method stub
			return super.decorar()+ " con estrella";
		}
			

	}
	
	


