package ejercicio5;

import java.util.Scanner;

public class TestRelationable {

	public static void main(String[] args) {
		
		Relationable r[]=new Relationable[10];
		int opcion;
		
		do {
			Scanner lector=new Scanner(System.in);
			opcion=lector.nextInt();
			System.out.println("1.Guardar una linea.");
			System.out.println("2.Guardar un círculo.");
			System.out.println("3.Mostrar todos los objetos almacenados");
			System.out.println("4.Mostrar todos los círculos");
			System.out.println("5.Mostrar todas las líneas");
			System.out.println("6.Mostrar el círculo con mayor área.");
			System.out.println("7.Mostrar la linea más grande");
			System.out.println("8. Salir");
			
			
			switch(opcion) {
			
			case 1:
				
				int x1,x2,y1,y2;
				System.out.println("Introduce x1:");
				Scanner lectorx1=new Scanner(System.in);
				x1=lectorx1.nextInt();
				System.out.println("Introduce x2:");
				Scanner lectorx2=new Scanner(System.in);
				x2=lectorx2.nextInt();
				System.out.println("Introduce y1:");
				Scanner lectory1=new Scanner(System.in);
				y1=lectory1.nextInt();
				System.out.println("Introduce y2:");
				Scanner lectory2=new Scanner(System.in);
				y2=lectory2.nextInt();
				
				Punto2d p1=new Punto2d(x1,y1);
				Punto2d p2=new Punto2d(x2,y2);
				
				for(int i=0;i<r.length;i++) {
					if(r[i]==null) {
						r[i]=new Linea2d(p1,p2);
						break;
					}
				}
				break;
				
			case 2:
				int radio;
				System.out.println("Introduzca un radio");
				Scanner lectorRadio=new Scanner(System.in);
				radio=lectorRadio.nextInt();
				
				for(int i=0;i<r.length;i++) {
					if(r[i]==null) {
						r[i]=new circulo(radio);
						break;
					}
				}
				break;
			case 3:
				
				for(Relationable rr:r){
					if(rr!=null) {
						System.out.println(rr.toString());
						
					}
				}
				
				break;
			case 4:
				for(Relationable rr:r) {
					if(rr!=null) {
						if(rr instanceof circulo) {
							circulo c=(circulo)rr;
							System.out.println(c.toString());
						}
					}
				}
				break;
				
				
			case 5:
				for(Relationable rr:r) {
					if(rr!=null) {
						if(rr instanceof Linea2d) {
							Linea2d dd=(Linea2d)rr;
							System.out.println(dd.toString());
						}
				}
				}
				break;
				
				
				
				
				
				
				
				
			
			
			
			}
			
			
			
			
			
			
			
			
		}
		while(opcion!=8);
		
		
		
		

	}

}
