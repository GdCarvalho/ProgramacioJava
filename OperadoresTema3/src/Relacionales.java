
public class Relacionales {

	public static void main(String[] args) {
		//<, >, <=, >=, ==, !=
		//Devuelven un boolean
		
		int x=9, y=5;
		boolean condicion1 = x>y; //si se cumple entonces true, si no será false
		boolean condicion2 = x==y;
		boolean condicion3 = x!=y;
		
		//Operadores lógicos ----> Y lógico &&
		// O lógico-------> || devuelve true si una de las condiciones es cierta
		// NOT ---> ! niega lo que va a continuación
		
		boolean condicion4 =condicion1 && condicion2; // será true si las dos son true
		boolean condicion5 =condicion1 || condicion2; //será true si una de ellas es true
		boolean condicion6 = !condicion5; // si lo que va a la derecha es true nos devuelve false
				
				
		
		
		
		

	}

}
