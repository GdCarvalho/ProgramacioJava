package interfaces;

public class TestInterfaces {

	static void desplazar(movible m) {
		m.mover();
	}
	
	
	
	public static void main(String[] args) {
		
		vehiculo v[]=new vehiculo[5];
		v[0]=new helicoptero();
		v[1]=new coche();
		
		for (vehiculo vv:v) {
			if(vv!=null) {
				vv.mover();
			}
			
		}
		
		
		
		serVivo s[]=new serVivo[5];
		s[0]=new animal();
		s[1]=new plantas();
		
		for(serVivo sv:s) {
			if(sv instanceof animal)
				((animal)sv).mover();
		}
		
		
		
		movible ms[]=new movible[10]; //podemos meter en movible cualquier clase que implementa esa interfaz
		ms[0]=new helicoptero();
		ms[1]=new animal();
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
