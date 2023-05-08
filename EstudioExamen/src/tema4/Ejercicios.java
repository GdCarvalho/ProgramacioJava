package tema4;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicios {

	public static void main(String[] args) {
		
		int opcion;
		
		
		
		
		do {
		System.out.println("1.Indicar si un número es primo o no.");
		System.out.println("2. Resolver una acuación de 2do grado.");
		System.out.println("3.Calcular el menor de 4 números.");
		System.out.println("4.Contar los valores por encima de la media de la matriz y la desviación de la media");
		System.out.println("5.Posición de 0's en una matriz");
		System.out.println("6.Posición del primer número negativo en una matriz");
		System.out.println("7.Posición del valor más alto en una matriz");
		System.out.println("8.Solicitar DNI y comprobar si tiene la estructura correcta.");
		System.out.println("9. Vocales en un String");
		System.out.println("10. Cuantas palabras empiezan por Z o por z");
		System.out.println("11. Matriz 2d identidad o no (identidad es cuando tiene 1's en la diagonal principal");
		System.out.println("12. Calcular el porcentaje de números negativis en matriz2d");
		Scanner lector=new Scanner(System.in);
		opcion=lector.nextInt();
		
		
		
		switch(opcion) {
		case 1:
			int primo;
			Scanner lector01=new Scanner(System.in);
			primo=lector01.nextInt();
			
			for(int i=2;i<primo;i++) {
				if(primo%i==0) {
					System.out.println("El número no es primo");
					break;
				}
				else {
					System.out.println("El número es primo");
					break;
				}	
			}
			break;
		case 2:
			int a;
			int b;
			int c;
			double x1;
			double x2;
			System.out.println("Introduzca a");
			Scanner lector02=new Scanner(System.in);
			a=lector02.nextInt();
			System.out.println("Intoduzca b");
			b=lector02.nextInt();
			System.out.println("Introduzca c");
			c=lector02.nextInt();
			
			if(a==0) {
				
				x1=x2=-c/b;
				System.out.println("El resultado es x1: "+x1+" y x2: "+x2);
			}
			else if(b==0) {
				
				x1=Math.sqrt(-c/a);
				x2=-(Math.sqrt(-c/a));
				if(x1>0 && x2>0) {
					System.out.println("El resultado es x1: "+x1+" y x2: "+x2);
				}
				else {
					System.out.println("No tiene solucion");
				}
				
			}
			else if(c==0) {
				x1=0;
				x2=-b/a;
				System.out.println("El resultado es x1: "+x1+" y x2: "+x2);
				
			}
			else  {
				x1=(-b+(Math.sqrt(Math.pow(b, 2)-(4*a*c))))/2*a;
				x2=-b-(Math.sqrt(Math.pow(b, 2)-(4*a*c)))/2*a;
				System.out.println("El resultado es x1: "+x1+" y x2: "+x2);
			}
		
		break;
		
		case 3:
			int x=7;
			int y=5;
			int z=3;
			int d=1;
			
			if(x>y && x>z &&x>d) {
				System.out.println("El mayor de x");
				break;
			}
			
			else if (y>x && y>z && y>d) {
				System.out.println("El mayor es y");
				break;
			}
			else if (z>x && z>y && z>d) {
				System.out.println("El mayor es z");
				break;
			}
			else {
				System.out.println("El mayor es d");
				
			}
		break;
		
		case 4:
			
			int matriz[]={3,4,5,6,7};
			float suma=0;
			float media;
		
			for(int i=0; i<matriz.length;i++) {
				suma=matriz[i]+suma;
			}
		media=suma/matriz.length;
		int contador=0;
		for(int i=0;i<matriz.length;i++) {
			if(matriz[i]>media) {
				contador++;
			}
		}
		System.out.println("La media es: "+media);
		System.out.println("Hay "+contador+" valores por encima de la media");
		
		float desv;
		float suma2=0;
		for(int i=0;i<matriz.length;i++) {
			desv=media-matriz[i];
			if(desv<0) {
				desv=-1*desv;
			}
			suma2=desv+suma2;
		}
		float media2=suma2/matriz.length;
		System.out.println("La media de la desviacion es: "+media2);
		
		break;
		case 5:
			int matriz2[]= {3,4,0,6,1};
			
			for(int i=0; i<matriz2.length;i++) {
				if(matriz2[i]==0) {
					System.out.println("El 0 está en la posicion: "+i);
				}
			}
			break;
		case 6:
			int matriz3[]= {3,-8,0,6,1};
			
			for(int i=0; i<matriz3.length;i++) {
				if(matriz3[i]<0) {
					System.out.println("El negativo está en la posicion: "+i);
				}
			}
			break;
			
		case 7:
			int matriz4[]= {3,-8,0,6,1};
		Arrays.sort(matriz4);
		System.out.println("La número más alto es:"+matriz4[matriz4.length-1]);
		break;
		
		case 8:
			String dni;
			Scanner lector8=new Scanner(System.in);
			dni=lector8.next();
		
		if(dni.matches("[0-9]{8}[A-Z]{1}")){
			System.out.println("El DNI es correcto");
		}
		System.out.println("El dni no es correcto");
		break;
		
		case 9:
			String cadena="hola que tal";
			if(cadena.contains("a")) {
				System.out.println(cadena.indexOf("a")); 
			}
			if(cadena.contains("e")) {
				System.out.println(cadena.indexOf("e")); 
			}
			if(cadena.contains("i")) {
				System.out.println(cadena.indexOf("i")); 
			}
			if(cadena.contains("o")) {
				System.out.println(cadena.indexOf("o")); 
			}
			if(cadena.contains("u")) {
				System.out.println(cadena.indexOf("u")); 
			}
			
			
			break;	
			
		case 10:
			String frase= "Zebra con zorza  en Zamora";
			String mfrase[] =frase.split(" ");
			int minu=0;
			int mayu=0;
			for(int i=0;i<mfrase.length;i++) {
				if(mfrase[i].startsWith("Z")){
					mayu++;
				}
				if(mfrase[i].startsWith("z")) {
					minu++;
				}
			}
			System.out.println("La palabras que empiezan por Z:"+mayu);
			System.out.println("La palabras que empiezan por z:"+minu);
			
			break;
			
		case 11:
			
			int matriz2d[][]= {{1,2,3},{2,1,4},{3,1,1}};
			
			int filas=matriz2d.length;
			int columnas=matriz2d[0].length;
			int identidad=0;
			
			for(int i=0;i<filas;i++) {
				for(int j=0;j<columnas;j++) {
					if(i==j && matriz2d[i][j]==1) {
					identidad++;	
					}
				}
			}
			if(identidad==filas) {
				System.out.println("La matriz es identidad");
			}else
			System.out.println("La matriz no es identidad");
			
			break;
		case 12:
			
			int matriz2D[][]= {{1,-2,3},{2,1,-4},{3,1,1}};
			
			int filas2=matriz2D.length;
			int columnas2=matriz2D[0].length;
			int negativos=0;
			int total=filas2*columnas2;
			for(int i=0; i<filas2;i++) {
				for(int j=0;j<columnas2;j++) {
					if(matriz2D[i][j]<0) {
						negativos++;
					}
				}
			}
			
			float porcentaje=(negativos*100)/total;
			
			System.out.println("Hay un total de " +porcentaje+"% de números nagativos");
		
		break;
		
		
		
		
		
		
		
		
		
		
		
		
		
		}//fin del switch
		}while(opcion!=14);
		

	}

}
