package factory;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		
		List<Factory>factorias=new ArrayList();
		factorias.add(new motoFactory());
		factorias.add(new cocheFactory());
		
		List<VehiculoMotor>vehiculos=new ArrayList();
		
		for( Factory f :factorias) {
			vehiculos.add(f.create());
			
		}
		
		for (VehiculoMotor vm:vehiculos) {
			System.out.println(vm.acelerar());
		}
		

	}

}
