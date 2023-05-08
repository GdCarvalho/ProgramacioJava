import java.util.Scanner;

public class BuclesAnidados {

	public static void main(String[] args) {
		// 3 tipos de bucles for, while, dowhile
		//variable de control 
		//inicializar la variable, condicion de continuidad y modificacion de variable
		
		//Numeros divisibles por 7
		int i=7;
		
		while(i<100) {
			if(i%7==0) {;
			System.out.println(i+" ");
			
		}
			i++;
		}

		//Algoritmo para un número es perfecto (numero perfecto: Es igual a la suma de sus divisores, sin contar él mismo)
		// P.ejemplo 6= 3+2+1 o 28=14+7+2+1

		int n, suma=0;
		boolean error=false;
		int contador =0;
		
		do {
		try {
			error=false;
			Scanner lector=new Scanner(System.in);
		System.out.println("Introduce un número: ");
		n= lector.nextInt();
		
		for(int j=1;j<=n/2;j++) {
			if(n%j==0) {
				suma=suma+j;
				
				}
		}
		if (suma==n) {
			System.out.println("El número es perfecto");
		}
		else {
			System.out.println("No es perfecto");
		}
		}
		catch(Exception e) {
			System.out.println("Error");
			error =true;
			contador++;
		}
		}
		while(error && contador<3);
		if(contador==3) {
			System.out.println("Se acabó");
		}
	}


	}
	
	




