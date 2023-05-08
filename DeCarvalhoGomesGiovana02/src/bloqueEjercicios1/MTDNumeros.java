package bloqueEjercicios1;

import java.util.Arrays;

public class MTDNumeros {
	
	//Método para el ejercicio 1
	
	public static boolean esPerfecto (int numero) {
		boolean perfecto =false; //inicializamos el boolean a falso
		int sumaDivisor=0; // creamos una variable
		
		for(int i=1;i<numero; i++) { //bucle para encontrar divisores, que empieza desde el 1 y no incluye el número que queremos evaluar
			if(numero%i==0) { //si la division es 0 
				sumaDivisor=sumaDivisor+i; //acualizamos la variable y le sumamos el valor que tiene i en ese momento
			}
		}
		if(sumaDivisor==numero) { // si en el momento de finalizar el bucle, la suma del divisor es igual al número a evaluar significa que es perfecto y
			perfecto=true; //actualiza el boolean a true
		}
		
		return (perfecto); //y devuelve perfecto.
	}

	
	//Método para el ejercicio 2
	
	public static int mcm(int a, int b, int c) { 
		
		
		int max1=Math.max(a, b);
		int max2=Math.max(max1, c); //variables para determinar el mayor de los 3 numeros
		
		
		
		 while((max2%a!=0) || (max2%b!=0) ||(max2%c!=0)) { // bucle que repita que mientras el resto de dividir el numero mayor por alguno de los otros numeros incluido el mismo no sea 0,
			 max2++;//se incrementa el numero max en una unidad
		 		
		}
		
		 
		return (max2); //devuelve el mcm
		
	}
	
	//Método para el ejercicio 3
	
	public static double resistencia( float r1, float r2, int n) {
		double resistenciaEquivalente=0; //inicializamos la variable
		
		if (n==1) { //si el usuario introdujo el numero 1
			resistenciaEquivalente= (((r1*r2)/(r1+r2))*Math.pow(10,6));	//usaremos esta formula para michoOhnmios
		}
		if (n==2) { //si el usuario introdujo el numero 2 
			resistenciaEquivalente= (((r1*r2)/(r1+r2))*Math.pow(10,-3)); //usaremos esta formula para kiloOhnmios
		}
		
		return(resistenciaEquivalente); //y devuelve la resistencia equivalente
		
	}
	
	public static double resistencia( float r1, float r2) { //si no pasa ningun numero, usaremos el método sobrecargado, donde
		double resistenciaEquivalente=0; //iniciamos la variable a 0
		 resistenciaEquivalente=(r1*r2)/(r1+r2); //usamos esta formula para la resistencia equivalente en Ohnmios
		 return(resistenciaEquivalente); //y devuelve el resultado
	
	}
	
	//Método para el ejercicio 4
	
	public static void mediaNegativo (int matriz[]) {
		
		int media=0; 
		int suma=0;
		int dividendo=0;
		
		for(int i=0;i<matriz.length;i++) { //bucle que recorre la matriz y
			if(matriz[i]>=0) { //si el valor que tiene en la posición es mayor 0 igual a 0
			suma=suma+matriz[i]; //actualiza la variable suma para que vaya sumando esos valores
			dividendo++; // y actualiza el contador dividendo
			}
		}
		media=suma/dividendo; //calculamos la media
			for(int j=0;j<matriz.length;j++) { //bucle que recorre la matriz y
				if(matriz[j]<0) { //donde encuentre un número negativo
				matriz[j]=media;	//lo cambia por el valor de la media
				}	
			
		}
			
	}
	
	
	//Método para el ejercicio 5
	
	public static float mediaMatriz(float matriz[]) {
		
		float suma=0;
		float media=0;
		
		for(int i=0; i<matriz.length;i++) { //bucle que recorre la matriz y
			suma=suma+matriz[i];	 //actualiza la variable suma para que vaya sumando esos valores
		}
		media=suma/matriz.length; //calculamos la media
		return (media);	//devuelve la media
	}
	
	public static float mediaMatriz (int matriz[]) { //sobrecarga del método anterior para poder recibir también una matriz de enteros.
		float suma=0;
		float media=0;
		
		for(int i=0; i<matriz.length;i++) { //bucle que recorre la matriz y
			suma=suma+matriz[i];	//actualiza la variable suma para que vaya sumando esos valores
		}
		media=suma/matriz.length; //calculamos la media
		return (media);	//devuelve la media
	}
		
		
		
		
	//Método para el ejercicio 6
	
	public static int[] nuevaMatrizInt(float m[], boolean aprox){
		
		float suma=0;
		float media =0;
		int matrizNueva[]=new int[m.length]; //creamos una matriz nueva con el tamaño de la anterior
		
		for (int i=0; i<m.length;i++) { //bucle que recorre la matriz y
			suma=suma+m[i]; //actualiza la variable sumando todos los valores
		}
		media=suma/m.length; //calculamos la media
		
		if(aprox) { //si el boolean es true
			for(int j=0;j<m.length;j++) { //bucle que recorre la matriz principal y
				matrizNueva[j]=(int) Math.floor(media); //en la matriz nueva devuelve la valor de la media redondeado al entero más cercano por debajo
				
			}
		}
		else { //si el boolean no es true
			for(int j=0;j<m.length;j++) {//bucle que recorre la matriz principal y
				matrizNueva[j]=(int) Math.ceil(media); //en la matriz nueva devuelve la valor de la media redondeado al entero más cercano por debajo
				
			}
			
		}
		
		return(matrizNueva); //devuelve la matriz nueva
		
		
	}
	
	//Método para el ejercicio 7
	
	public static void matriz2D (double matriz[][] ) {
		
		int filas=matriz.length; //variable con el numero de filas
		int columnas=matriz[0].length; //variable con el numero de columnas
		
			for(int i=0;i <filas;i++) { //bucle que recorre las filas
				for(int j=0; j<columnas;j++) { //bucle que recorre las columnas y
					if(i==0 && j==0) { // y en la posicion 0,0
						matriz[i][j]=matriz[i][j]; // mantiene su valor original
						break;
					}
					matriz[i][j]= ((Math.pow((i*j),3))/(2*(i+j))); //para todas las demás posiciones, utiliza la formula
				}	
					
				}
			}
	
	 //Método para el ejercicio 8
	
	public static void variosValores(int m[][]) {
		
		int filas=m.length; //variable para filas
		int columnas=m[0].length; //variable para columans
		float matrizMedias[]=new float[filas]; //nueva matriz de dimensione el numero de filas
		
		
	        for(int i=0;i<filas;i++) { //bucle que recorre las filas
	        	float sumaf1=0; //inicializamos aquí las variables para que al pasar a la siguiente final reseteen a 0
	    		float mediaf1=0;
	    		
			for(int j=0; j<columnas;j++) { //bucle que psa por las columnas
				sumaf1=sumaf1+m[i][j];	//y actualiza la variable sumando el valor correspondiente	
			}
			mediaf1=sumaf1/columnas; //calcula la media de la fila en la que está el bucle
			System.out.println("La media de la fila "+i+" es "+mediaf1); //y muestre por pantalla la media y la fila a la que corresponde
			matrizMedias[i]=mediaf1; //guardamos el valor de la media en la matriz anteriormente creada
	        }
	        
	        Arrays.sort(matrizMedias); //ordenamos la matriz de la medias
	        float mayorMedia=matrizMedias[matrizMedias.length-1]; //identificamos el numero más alto que será la longitud de la matriz de medias menos 1
	        for(int k=0;k<matrizMedias.length;k++) { //bucle que recorre la matriz de medias
	        	if(matrizMedias[k]==mayorMedia) { //cuando encuentre el valor mayor
	        		System.out.println("La fila con la mayor media es la fila " +k);//lo imprime
	        		break;
	        	}
	        }
	            	
	        }
	
	
	//Método para el ejercicio 9
	
	public static boolean filasRepe (float m[][]) {
		
		int filas=m.length; //veriables para filas
		boolean repetidas=false; //boolean de control
		
		for(int i=0;i <filas-1;i++) { //matriz que recorre la primera fila
			for(int j=i+1; j<=filas-1;j++) { //matriz que recorre la fila siguiente
				if(Arrays.equals(m[i],m[j])) { //si encuentra dos filas iguales
					repetidas=true; //se actualiza el booleano 
					break;
				}
			}
		}
		return(repetidas); //devuelve el booleano
		
		
	}
	        
	         
			
	        
				
			
		}
		
		
		
		
		
		


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
					
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


