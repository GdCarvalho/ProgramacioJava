package singleton;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Singleton instancia1=Singleton.getInstancia("Gio");
		System.out.println(instancia1.getMensaje());
		
		
		Singleton instancia2=Singleton.getInstancia("David");
		System.out.println(instancia2.getMensaje());
		
		

	}

}
