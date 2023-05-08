package factory;

public class cocheFactory extends Factory{

	@Override
	protected VehiculoMotor createVehiculoMotor() {
		
		return new coche();
	}

}
