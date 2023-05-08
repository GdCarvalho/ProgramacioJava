package tema6;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class TestAlumnos {

	public static void main(String[] args) {
		int opcion;
		
		Alumno A1=new Alumno("12345678A", "María",LocalDate.parse("1996-02-12"),10);
		Alumno A2=new Alumno("12340022D", "Carlos",LocalDate.parse("1996-05-12"),10);
		
		
		do {
		System.out.println("1.Ver datos de los alumnos");
		System.out.println("2.Anadir notas");
		System.out.println("3.Consultar notas del Alumno");
		System.out.println("4. Modifocar una nota");
		System.out.println("5.Modificar datos de un alunno");
		System.out.println("6.Salir");
		
		
         System.out.println("Introduzca la opción deseada");
		Scanner lector=new Scanner(System.in);
		opcion=lector.nextInt();
		
		
		switch(opcion) {
		case 1:
			
			System.out.println(A1.toString());
			System.out.println(A2.toString());
		break;
		
		case 2:
			
			float nota;
			System.out.println("Introduzca la nota:");
			Scanner lector02=new Scanner(System.in);
			nota=lector02.nextFloat();
			A1.addNota(nota);
		break;
		case 3:
			System.out.println(Arrays.toString(A1.getNotas()));
		
		break;
		
		case 4:
			System.out.println("Ingrese nota a modificar y la posicion");
		float nota02;
		int posicion;
		System.out.println("Introduzca la nota:");
		Scanner lector03=new Scanner(System.in);
		nota02=lector03.nextFloat();
		System.out.println("Introoduzca la posicion");
		posicion=lector03.nextInt();
		A1.modificarNota(nota02, posicion);
		
		break;
		
		}//fin del switch
		}
		while(opcion!=6);

	}

}
