package tema6;

import java.util.Scanner;

public class TestClientes {

	public static void addClientes(Cliente c, Cliente m[]) {
		
		for(int i=0;i<m.length;i++) {
			if(m[i]==null) {
				m[i]=c;
				break;
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		
		int opcion;
		
		Cliente c1=new Cliente("1234568G","Calle Nicaragua", FormasDePago.T,"medaigual@gmail.com" );
		Cliente c2=new Cliente("4444565T","Calle Lorient", FormasDePago.C,"lala@gmail.com" );
		
	   System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		
		Cliente matrizClientes[]=new Cliente [5];
		TestClientes.addClientes(c1, matrizClientes);
		TestClientes.addClientes(c2, matrizClientes);
		
		
		
		
		
		do {
			System.out.println("1.Guardar un cliente");
			System.out.println("2.Buscar un cliente a partir del nif");
			System.out.println("3.Mostrar clientes con una forma de pago especificada");
			System.out.println("4.Mostrar todos los clientes");
			System.out.println("5.Salir");
			
			
			Scanner lector=new Scanner(System.in);
			System.out.print("Selecione opcion: ");
			opcion=lector.nextInt();
			
			switch(opcion) {
			
			case 1:
				
				String nif;
				String calle;
				String formapagar;
				String mail;
				
			System.out.println("Introduzca nif");
			nif=lector.next();
			System.out.println("Introduzca calle");
			calle=lector.next();
			System.out.println("Introduzca pago");
			formapagar=lector.next();
			System.out.println("Introduzca mail");
			mail=lector.next();
			
			for(int i=0;i<matrizClientes.length;i++) {
				if(matrizClientes[i]==null) {
					if(formapagar.equals("contado")) {
						matrizClientes[i]=new Cliente(nif,calle,FormasDePago.C,mail);
						System.out.println(matrizClientes[i].toString());
						break;
					}
					else if(formapagar.equals("tarjeta")) {
						matrizClientes[i]=new Cliente(nif,calle,FormasDePago.T,mail);
						System.out.println(matrizClientes[i].toString());
						break;
					}
					
				}
				
			}
			
			System.out.println("Cliente creado con exito");
			break;
			
			case 2:
				String nif1;
				System.out.println("Introduzca nif");
				nif1=lector.next();
				
				for(Cliente c:matrizClientes) {
					if(c!=null) {
						if(c.getNif().equals(nif1)) {
							System.out.println(c.toString());
						}
						
					}
				}
			break;
			
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Elija una opcion valida");
				break;
			
			
			
			
			
			
			}//Fin del switch
			
			
			
			
			
			
		}
		while(opcion!=5);
		
		
		
		
		
		
		
	}

}
