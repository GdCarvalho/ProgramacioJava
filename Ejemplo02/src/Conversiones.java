
public class Conversiones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Implicitas: No necesitan código adicional y son siempre seguras
		
		byte x=10;
		short y=x;
		
		float d=9f;
		double s=d;
		
		//Explicitas: Necesitan código y no son seguras
		
		int n=200;
		byte b=n; //Nos obliga a hacer un cast 
		byte b=(byte)n; //Pero no sería 200. Porqué no se puede meter 16 bits en 8 bits.

	}

}
