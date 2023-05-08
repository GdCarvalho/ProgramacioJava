package tiposdedatos;

import java.text.DecimalFormat;

public class Mostrarporconsola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x1=200;
		float f1=4.5587f;
		
		//Mostrar por pantalla texto y variables
		System.out.println("El valor de la variable es:"+x1+"");
		
		DecimalFormat df= new DecimalFormat("#.##");
		String f1bis= df.format(f1);
		System.out.println(f1bis);

	}

}
