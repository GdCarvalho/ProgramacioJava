package singleton;



public final class Singleton {
	
	private String mensaje;
	private static Singleton instancia;
	
	
	private Singleton(String mensaje) {
		
		this.mensaje = mensaje;
	}
	
	public static Singleton getInstancia(String mensaje) {
		if(instancia==null) {
			instancia= new Singleton(mensaje);
		}
		return instancia;
		
	}

	public String getMensaje() {
		return mensaje;
	}


	
	
	
	
	
	

}
