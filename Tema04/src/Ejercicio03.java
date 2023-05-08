
public class Ejercicio03 {

	public static void main(String[] args) {
		
		int a=23;
		int b=93;
		int c=45;
		int d=-5;
		
		if(a<b && a<c && a<d) {
			System.out.println("El número menor es a");
		}
		else if(b<a && b<c && b<d) {
			System.out.println("El número menor es b");
		}
		else if (c<a && c<b && c<d) {
			System.out.println("El número menor es c");
		}
		else {
			System.out.println("El número menor es d");
		}

	}

}
