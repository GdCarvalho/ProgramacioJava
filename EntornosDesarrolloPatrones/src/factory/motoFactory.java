package factory;

public class motoFactory extends Factory {

	@Override
	protected VehiculoMotor createVehiculoMotor() {
		// TODO Auto-generated method stub
		return new moto();
	}

}
