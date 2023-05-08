import java.util.Arrays;

public class Enumerados {

	enum Mes{Enero,Febrero,Marzo}; 
	
	public static void main(String[] args) {
		// nos permiten tener una coleccion de constantes
		//generamos una variable y le decimos que valores puede tener esa variable.
		
		TipoTrabajador ti =TipoTrabajador.CONSTUCTOR;
		System.out.println(Arrays.toString(TipoTrabajador.values()));
	}

}
