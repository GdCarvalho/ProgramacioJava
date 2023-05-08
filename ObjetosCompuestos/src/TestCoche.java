
public class TestCoche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Motor m1=new Motor(320, 30, false);
		Coche c1=new Coche("KIA",m1);
		
		//Cambiar el nivel de aceite de mi coche
		
		c1.getMotor().setNivelAceite(2);
		System.out.println(c1);
		
		//Instanciacion anonima 
		//creamos objetos sin 
		Coche c2=new Coche("SANDERO",new Motor(345, 3,true));
		
		//Cambiar el nivel de aceite de mi coche
		
		c2.getMotor().setNivelAceite(34);		
		System.out.println(c2);
		
		
		
		
		
		
		
	}

}
