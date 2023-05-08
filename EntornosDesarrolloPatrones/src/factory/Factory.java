package factory;

public abstract class Factory {
	
	public VehiculoMotor create() {
		
		VehiculoMotor vehiculoMotor=createVehiculoMotor();
		return vehiculoMotor;
	}
	
	protected abstract VehiculoMotor createVehiculoMotor() ;

}
