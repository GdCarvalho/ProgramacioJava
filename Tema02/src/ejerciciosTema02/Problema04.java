package ejerciciosTema02;

public class Problema04 {

	public static void main(String[] args) {
		//Intercambiar el valor de una variable por otra
		
		int x=1;
		int y=5;
		int intercambio= x;
		
		x=y;
		y= intercambio;
		
		
		System.out.println("el valor de x es:"+x+" y el valor de y es:"+y);
		

		
		int i=2;
		int j=1;
		
		double  r=((Math.pow((i*j),3))/(2*(i+j)));
		System.out.println(r);
		
	}

}
