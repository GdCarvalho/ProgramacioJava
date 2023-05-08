package ejerciciosTema02;

public class Programa2 {

	public static void main(String[] args) {
		//Calcular la superficie, el volumen y la longitud de una circunferencia a partir del radio
		
		float radio= 2;
		double pi= 3.141592;
		double longitud= 2*pi*radio;
		double volumen= ((4*(radio*radio*radio))/3)*pi;
		double superficie= pi*radio*radio;
		
		System.out.println("La longitud es:" +longitud);
		System.out.println("La superficie es:" +superficie);
		System.out.println("El volumen es:" +volumen);

	}

}
