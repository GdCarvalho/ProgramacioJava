package tema5;

import java.util.Arrays;
import java.util.Random;

public class metodos5 {
	
	//Método que printee un string y lo mmuestre por consola
	
	public static void printar(String s) {
		System.out.println(s);
	}
	
	//Metodo que devuelva el más alto de varios numeros
	public static int masAlto(int ...x) {
		Arrays.sort(x);
			return x[x.length-1];
	}
	
	//Método que recibe una matriz y que la rellene de números aleatorios
	
	public static void aleatorio(int matriz[]) {
		
		for(int i=0; i<matriz.length;i++) {
			Random rnd =new Random();
			matriz[i]=rnd.nextInt(100);
		}
	}
	
	//Sobrecarcarlo para que reciba una matriz 2d
	
	public static void aleatorio(int mm[][]) {
		
		int filas=mm.length;
		int columnas=mm[0].length;
		
		for(int i=0;i<filas;i++) {
			for(int j=0;j<columnas;j++) {
				Random rnd=new Random();
				mm[i][j]=rnd.nextInt(100);
				
			}
		}
	}
		
		//Método para imprimir matrices 2d
		
		public static void imprimir(int m2d[][]) {
			
			int filas2=m2d.length;
			int columnas2=m2d[0].length;
			for(int i=0;i<filas2;i++) {
				for(int j=0;j<m2d[i].length;j++) {
					System.out.print(m2d[i][j]+" ");
					
				}
				System.out.println();
			}
			
		}
		
	//Método que recibe una matriz2d e indica qué números son primos	
		
	public static void sonPrimos(int primos2d[][]) {
		
		int filas=primos2d.length;
		int columnas=primos2d[0].length;
		
		for (int i=0;i<filas;i++) {
			for(int j=0;j<columnas;j++) {
				int n=primos2d[i][j];
				boolean primo=true;
				for(int k=2;k<n;k++) {
					if(n%k==0) {
						primo=false;
						break;
						
					}
				
				}
				if(primo) {
					System.out.println("El número: "+n+" es primo");
					
				}
				
			}
			
		}
		
	}
		
	//Método que recibe un string  y devuelve el número de palabras que tiene
	
	public static int numeroPalabras(String ss) {
		
		int numero=ss.length();
	    return numero;	
	}
	
	//Método que recibe una matriz y devuelve otra con el doble de capacidad y los mismos valores
	
	public static int[] doblear(int doble[]) {
		int mdoble[]=new int[doble.length*2];
		 for(int i=0;i<mdoble.length;i++) {
			 for( int j=i; j<doble.length;j++) {
				 if(mdoble[i]==0) {
					 mdoble[i]=doble[j];
				 }
			 }
			
		 }
		
		
	return mdoble;	
	}
	
	
		
	
}
	
	


