package tema6;

import java.util.Arrays;
import java.util.Scanner;

public class TestTareas {

	public static void main(String[] args) {
		
		Tarea t[]=new Tarea[5];
		t[0]=new Tarea("historia","tarea de historia", true);
		t[1]=new Tarea("mates","tarea de mates", false);
		t[2]=new Tarea("arte","tarea de arte", true);
		t[3]=new Tarea("gym","tarea de gym", false);
		
		int opcion;
		
		
		do {
		System.out.println("1.Añadir tarea");
		System.out.println("2.Modifocar tarea");
		System.out.println("3.Ver tareas importantes");
		System.out.println("4.Completar una tarea");
		System.out.println("5.Eliminar tareas realizadas");
		System.out.println("6.Ver tareas realizadas");
		System.out.println("7.Salir");
		
		Scanner lector=new Scanner(System.in);
		opcion=lector.nextInt();
		
		
		switch(opcion) {
		
		case 1:
			
			String titulo;
			String descripcion;
			String importante;
			System.out.println("Introduzca título:");
			Scanner lector01=new Scanner(System.in);
			titulo=lector01.next();
			System.out.println("Introduzca descripcion:");
			descripcion=lector01.next();
			System.out.println("Introduzca importancia: I u N");
			Scanner lector02=new Scanner(System.in);
			importante=lector02.next();
			
			for(int i=0;i<t.length;i++) {
				if(t[i]==null) {
					if(importante.contains("I")) {
						t[i]=new Tarea(titulo,descripcion,true);
						System.out.println(t[i].toString());
						break;
					}
					else if(importante.contains("N")) {
					t[i]=new Tarea(titulo,descripcion,false);
					System.out.println(t[i].toString());
					break;
					}
				else {
					System.out.println("INTRODUZCA UNA OPCION VALIDA");
				}
					
			}
			
				
				
		}
		break;
		
		case 2:
			
			String tit;
			int pulsar;
			System.out.println("Introduzca título de la tarea a modificar:");
			Scanner lector03=new Scanner (System.in);
			tit=lector03.nextLine();
			System.out.println("Pulsar 1 si la tarea es importante o pulsar 2 si la tarea no es importante");
		    pulsar=lector03.nextInt();
		    
		    for(int i=0;i<t.length;i++) {
		    	if(t[i].getTitulo().equals(tit) && pulsar==1) {
		    		t[i].setImportante(true);
		    		System.out.println(t[i].toString());
		    		break;
		    	}
		    	else if (t[i].getTitulo().equals(tit) && pulsar==2) {
		    		t[i].setImportante(false);
		    		System.out.println(t[i].toString());
		    		break;
		    	}
		    	
		    	
		    }
		break;
		
		case 3:
			
			for(int i=0;i<t.length;i++) {
				if(t[i]!=null) {
					if(t[i].isImportante()) {
						System.out.println(t[i].toString());
					}
				}
				
			}
		break;
		
		case 4:
			
			String tilo;
			String sino;
			System.out.println("Introduzca titulo de la tarea que se ha realizado");
			Scanner lector05=new Scanner(System.in);
			tilo=lector05.next();
			
			for(int i=0;i<t.length;i++) {
				if(t[i].getTitulo().equals(tilo)) {
					t[i].setRealizada(true);
					System.out.println(t[i].toString());
					System.out.println("Tarea realizada con éxito");
					break;
				}
			}
		break;
		
		case 5:
		 Tarea ct[]=Arrays.copyOf(t, t.length);
		 
		 
		 
		 String tt;
		 System.out.println("Iintroduzca titulo de la tarea que se desea eliminar");
		 Scanner lector06=new Scanner(System.in);
		 tt=lector06.next();
		 
		 for(int i=0;i<t.length;i++) {
			 if(t[i].getTitulo().equals(tt)) {
				 t[i]=null;
				 System.out.println("Tarea eliminada exitosamente");
				 break;
			 }
		 }
		 
		 
		 for(Tarea tarea:t) {
			 if(tarea!=null) {
				 System.out.println(tarea.toString());
			 }
		 }
		 break;
		 
		case 6:
			
			for(Tarea tr:t) {
				if(tr!=null) {
					if(tr.isRealizada()) {
						System.out.println(tr.toString());
					}
				}
			}
		 
		break;
		
		case 7:
			System.exit(0);
			break;
			
		
		
		}
		
		}
		while(opcion!=7);
		
	}

}
