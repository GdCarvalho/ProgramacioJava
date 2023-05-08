import java.util.Arrays;

public class Strings {

	public static void main(String[] args) {
		String mensaje = "Hola cara"; // Es un array de carácteres.
		
		//Métodos: 
		//lenght (cuantos caracteres tiene un string)
		int numeroCaracteres = mensaje.length();// En los strings lengthes una función y en los arrays es un atributo.
		System.out.println("Nº de caracteres: "+ numeroCaracteres); // Los espacios son carácteres.
		
		//charAt(indice) nos devuelve el caracter que ocupa esa posición.
		
		char primeraLetra = mensaje.charAt(0);
		System.out.println( "La primera letra:"+primeraLetra );
		
		//Programa que obtiene el último caracter de un string
		char ultimo= mensaje.charAt(mensaje.length()-1);
		System.out.println("Ultimo caracter: "+ultimo);
		
		//IndexOf, y lastIndexOf 
		//Buscar la primera aparición de la letra a
		
		int posicionLetraa=mensaje.indexOf("a");
		System.out.println("Posición letra a: "+ posicionLetraa);
		
		int posicionSubstring = mensaje.indexOf("ol");
		System.out.println("Posición ol:" +posicionSubstring);
		
		//Sobre carga del indexOf (String c, int fromIndex)
		
		//Buscar la segunda aparición de la letra a en el string.
		
		//int posicion2Letraa =mensaje.indexOf("a",4) esta es una forma;
		
		int posicion2Letraa =mensaje.indexOf("a",mensaje.indexOf("a")+1);
		System.out.println("La segunda posición es:"+posicion2Letraa);
		
		//lastIndexOf para el ultimo caracter
		
		int ultimaPosiciona =mensaje.lastIndexOf("a");
		System.out.println("La última posición es:"+ultimaPosiciona);
		
		
		//substring()Obtener subcadena apartir de las posiciones indicadas
		String subCadena = mensaje.substring(2);
		System.out.println("LO QUE BUSCAS:" +subCadena);
		
		String subCadena2= mensaje.substring(2,5); //coge la posición de los caracteres 2 3 y 4
		System.out.println(subCadena2);
		
		//Obtener la última palabra de un string
		
		mensaje = "Obtener la ultima palabra";
		String ultimaPalabra = mensaje.substring(mensaje.lastIndexOf(" ")+1);
		System.out.println(ultimaPalabra);
		
		//Split le pasamos un separador y nos "trocea el string original" en diferentes subcadenas
		String trocitos[] = mensaje.split(" ");
		String segundaPalabra =trocitos[1];
		System.out.println("Palabras: "+Arrays.toString(trocitos)); //Para printearlo todo
		System.out.println("Palabras: "+trocitos[1]); //para printear solamente la segunda palabra
		
		//Obtener la primera letra de la segunda palabra
		String ejemplo= "Me gusta java";
		
		char primeraLetraSegundaPalabra = ejemplo.split(" ")[1].charAt(0);		
		
		
		//Replace (char a, char n) Genera un nuevo string en memoria totalmente diferente al original
		mensaje= "todo bien"; 
		mensaje = mensaje.replace('i','o');
		System.out.println("Replace "+mensaje);
		
		//Concatenar palabras
		String a1="Hola";
		String a2 ="Adios";
		
		String union = a1+" "+a2;
		String union2= a1.concat(a2);
		System.out.println(union);
		
		//startsWith nos devuelve 
		
		boolean condicion =mensaje.startsWith("A");
		System.out.println(condicion);
		
		//equals, equalsIgnoreCase
		
		String c1 ="Pedro";
		String c2 ="Manu";
		
		System.out.println("Iguales? "+c1.equals(c2)); // Diferencia entre mayus y minus
		System.out.println("Iguales? "+c1.equalsIgnoreCase(c2)); // NO Diferencia entre mayus y minus
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
