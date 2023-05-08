package ejercicioSalario;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TestEmpleado {

	public static void main(String[] args) {
		
		empleado e1=new empleado("12345678H", "12-10-1994", "Carla", 12 );
		empleado e2=new empleado("34567123F", "23-09-1987", "Marcos", 3 );
		empleado e3=new empleado("34216790S", "04-05-1990", "Tania", 7 );
		
		ArrayList<empleado>trabajadores=new ArrayList<empleado>();
		trabajadores.add(e1);
		trabajadores.add(e2);
		trabajadores.add(e3);

		int opcion;
		
		do {
		System.out.println("Elija una opcion");
		
		Scanner lector=new Scanner(System.in);
		opcion=lector.nextInt();
		
		switch(opcion) {
		case 1:
			String dni;
			System.out.println("Introduzca dni");
			Scanner lectorDni=new Scanner(System.in);
			dni=lectorDni.nextLine();
			String fecha;
			System.out.println("Introduzca fecha de nacimiento");
			Scanner lectorfecha=new Scanner(System.in);
			fecha=lectorfecha.nextLine();
			String nombre;
			System.out.println("Introduzca nombre");
			Scanner lectorNombre=new Scanner(System.in);
			nombre=lectorNombre.nextLine();
			int ano;
			System.out.println("Introduzca años trabajados");
			Scanner lectorAnos=new Scanner(System.in);
			ano=lectorAnos.nextInt();
			
			trabajadores.add(new empleado(dni,fecha,nombre,ano));
		break;
		case 2:
			System.out.println("Introduzca dni del empleado");
			String dni2;
			Scanner lectorDni2=new Scanner(System.in);
			dni2=lectorDni2.next();
			
			
			for(empleado e:trabajadores) {
				if(e.getDni().equals(dni2)) {
					System.out.println(e);
					break;
				}
			}
			System.out.println("Introduzca años trabajados");
			int dinero;
			Scanner lectorDinero=new Scanner(System.in);
			dinero=lectorDinero.nextInt();
			
			for(int i=0;i<trabajadores.size();i++) {
				if(trabajadores.get(i).getDni().equals(dni2)) {
					trabajadores.get(i).setAnhosEmpleado(dinero);
					trabajadores.get(i).calcularSalario();
				}
			}
			
			for(empleado e:trabajadores) {
				System.out.println(e);
			}
			
			
			
			break;
			
		
			
			
			
			
			
			
			
			
			
		
			
		}//FIN DEL SWITCH
		}
		while(opcion!=4);
		
	}

}
