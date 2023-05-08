import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		//Programa que calcula una ecuación de 2do grado
		
		int a;
		int b;
		int c;
		double x1;
		double x2;
		
		
		Scanner lector=new Scanner(System.in);
		System.out.print("Introduzca valor a: ");
		a=lector.nextInt();
		
		System.out.print("Introduzca valor b: ");
		b=lector.nextInt();
		
		System.out.print("Introduzca valor de c: ");
		c=lector.nextInt();
		
		
		if(a==0 && b!=0 && c!=0 ) {
			x1=-c/b;
			x2=x1;
			
			System.out.println("El resultado de x1 es "+x1+" y el resultado de x2 es "+x2);
				}
		else if (a!=0 && b==0 && c!=0) {
			int cEntrea =c/a;
				if(cEntrea<0) {
				x1=Math.sqrt(-cEntrea);
				x2=-(Math.sqrt(-cEntrea));
			System.out.println("El resultado de x1 es "+x1+" y el resultado de x2 es "+x2);
			
		}
			else {
				System.out.println("El problema no tiene solución");
			}
		}
		
		else if (a!=0 && b!=0 && c==0) {
			x1=0;
			x2=-b/a;
			
			System.out.println("El resultado de x1 es "+x1+" y el resultado de x2 es "+x2);
		}
		
		else {
			double y=Math.pow(b, 2)-4*a*c;
			if(y>0) {
				x1=-(b/(2*a))+(Math.sqrt(y)/2*a);
				x2=((-b-Math.sqrt(y))/2*a);
			
			System.out.println("El resultado de x1 es "+x1+" y el resultado de x2 es "+x2+" "+y);	
			}
			else {
				System.out.println("El problema no tiene solución");
				
			}
		}

	}

}
