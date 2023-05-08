package BloqueEjercicios2;

import java.util.Arrays;

public class MTDCadenas {
	
	//Método para el ejercicio 1
	
	public static char letraDNI(String numeroDNI) {
		char letra2=' '; //Si no se cumple la condición devuelve un espacio
		if(numeroDNI.length()==8 && numeroDNI.matches("[1-9]")) { //necesita tener 8 numeros y solo acepta números y no letras
			int dni =Integer.parseInt(numeroDNI); //pasamos el string a números int
				int resto = dni % 23; //nos quedamos con el resto de dividir el numero entre 23
				
					char letra[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
					
						letra2 = letra[resto]; // nos devuelve la letra que ocupa la posición del resto en el arrays de chars  
		}
			return(letra2); //devuelve letra2
		
		}
		
	//Método para el ejercicio 2	
	
	public static String palabra(char letra) {
		String palabra="viernes"; //introducimos por código un string
		char[] copiaMiPalabra=new char[palabra.length()]; //creamos una matriz de chars de dimension la longitud del string
		
		for(int i=0; i<palabra.length();i++) { //bucle para rellenar la matriz con las letras del string
			copiaMiPalabra[i]=palabra.charAt(i);
		}
		
		for(int i=0;i<copiaMiPalabra.length;i++) { // bucle que pasa por la matriz de chars y
			if(copiaMiPalabra[i]==letra) { //si encuentra la letra en esa posición
				copiaMiPalabra[i]=letra; // deja la letra en la matriz
			}
			else {
				copiaMiPalabra[i]='-'; //si no encuentra la letra imprimirá un guión
			}
		}
		return(Arrays.toString(copiaMiPalabra)); //deuelve el string resultante
	}
		
	//Sobrecarga del 2 para el ejercicio 3
	public static String palabra(String miPalabra, char...letra ) { 
		char[] palabraDeseada=new char[miPalabra.length()]; //creamos una matriz de chars de dimension la longitud del string
		char [] palabraFinal=new char[miPalabra.length()];//creamos una segunda matriz de chars de dimension la longitud del string
		for(int i=0; i<miPalabra.length();i++) { //utilizamos el bucle en una de las matrices para rellenar con las letras del string
			palabraDeseada[i]=miPalabra.charAt(i);
		}
		for(int i=0; i<miPalabra.length();i++) { //utilizamos el bucle en la segunda matriz para rellenar con guiones
			palabraFinal[i]='-';
		}
		
		for(int i=0;i<palabraDeseada.length;i++) { //bucle que recorre la matriz con la letras del string
			for(int j=0; j<letra.length;j++) { //bucle que recorre la matriz formada por los parámetros opcionales
			if(palabraDeseada[i]==letra[j]) {	//si encuentra chars coincidentes
				palabraFinal[i]=letra[j]; //actualiza la matriz de guiones con la letra correspondiente
			}
				
			}
		}
		
		return(Arrays.toString(palabraFinal)); //devuelve la palabra con guiones y letras
	}
		
		//Método para el ejercicio 4
		
		public static boolean cumpleCondiciones(String s) {
			boolean esTrue=false; //inicializamos el boolean a false
			if(s.length()==8 && s.matches("[A-Za-z0-9]+")) { //condicion que nos dice que el string tiene que tener 8 caracteres, y expresion regular
				//que nos indica que ha de tener por lo menos una mayus, una minuscula, y un dígito.
				esTrue=true; //si cumple la condición el boolean se actualiza
			}
			return(esTrue);
			
			
			
		}
		
		//Método para el ejercicio 5
		
		
		public static void codificacion(String oracion) {
			char[] matrizCodigo=new char[oracion.length()];
			
			for(int i=0; i<oracion.length();i++) { //utilizamos el bucle en una de las matrices para rellenar con las letras del string
				matrizCodigo[i]=oracion.charAt(i);
			}
			
			for(int i=0; i<matrizCodigo.length;i++) { //bucle que recorre la matriz creada y
				if(matrizCodigo[i]=='i') { //donde encuetre en caracter i lo cambia por el 1
					matrizCodigo[i]='1';
				}
				else if(matrizCodigo[i]=='o') { //donde encuentre el caracter o lo cambie por un 0
					matrizCodigo[i]='0';
				}
				else if(matrizCodigo[i]=='a') { //donde encuentre el caracter a lo cambie por un *
					matrizCodigo[i]='*';
				}
				else {
					matrizCodigo[i]=matrizCodigo[i]; //y el resto de caracteres los deja como estaban
				}	
			}
			String oracionCodificada=""; //creamos un string vacio
			  for(int i=0;i<matrizCodigo.length;i++) {//bucle que recorre la matriz y
				  oracionCodificada=oracionCodificada+ matrizCodigo[i]; //va sumando al string vacio cada una de las posiciones. Esto lo hacemospara crear un string codificado y poder trabajar con los métodos de los strings
			  }
			
			  int binario=oracionCodificada.length(); //numero en binario de la cantidad de caracteres que tiene la oración
			  String valorBinario= Integer.toBinaryString(binario); //transformamos este número en un string
			
			  int codigoHash=oracionCodificada.hashCode(); //variable con el código hash
			  
			  System.out.println(valorBinario+oracionCodificada+codigoHash); 
					
				}
				
			
			
			
			
			
			
			
		}
		
		
		
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


