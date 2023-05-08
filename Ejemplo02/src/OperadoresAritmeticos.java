
public class OperadoresAritmeticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Operadores matematicos
		
		int resultado = 3 + 4; 
		short x=90, y=50;
		short resultado2=x+y; // El operador +,-, *, /,  cuando trabaja con short's o bytes los convierte en int.
		// Para eso lo podremos convertir en un int. O si me interesa mantener el short hariamos un cast:
		short resultado3=(short)(x+y);
		//Esto funciona siempre y cuando el valor "quepa" 
		
		// Con tipo float pasa lo mismo
		
		float r=4.5f;
		int t=20;
		
		int resultado4= r*i; // No puedo convertir de float a int.
		// Si hago el cast a int me perderé la parte decimal. A no ser que me interese lo que haremos es transformar a float resultado4.
		
		
		
		//Operador cociente nos devuelve un nº entero si trabajamos con int
		
		int n1=10;
		int resultado6= n1/3; //Veriamos un nº entero
		//la solución sería
		float resultado7=(float)(n1)/3; // o más bien : float resultado7 = n1/3f;
		
		System.out.println(resultado7);
		
		//Si dividimos entre 0
		
		int z1=0;
		int z2=10;
		int resultado10= z1/z2; //La app sale un error. No saldría error si utilizamos la variable double, y el resultado sería infinito.
		
		// Operador resto % (para saber si un nº es par, para convertir a binario, para saber si son multiplos.
		
		int v1= 450;
		int resultado8=450%3;
		
		System.out.println(resultado8);
		
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
