package tema6;

import java.util.Scanner;

public class TestCuentasBancarias {

	public static void main(String[] args) {
		
		int opcion;
		
		CuentaBancaria B1[]=new CuentaBancaria[10];
		B1[0]=new CuentaBancaria("A22","12345678A",TipoDeCuenta.Corriente);
		B1[1]=new CuentaBancaria("S34","65475214J",TipoDeCuenta.Corriente);
		B1[2]=new CuentaBancaria("G66","12345678A",TipoDeCuenta.Nómina);
		B1[3]=new CuentaBancaria("K86","12345678A",TipoDeCuenta.Ahorros);
		B1[4]=new CuentaBancaria("T67","68456580P",TipoDeCuenta.Corriente);
		
		
		//Ordenar Arraylist
		
		
		
		
		do {
			
			
		System.out.println("1.Mostrar por pantalla toda la info de las cuentas");
		System.out.println("2.Realizar el traspado entre varias cuentas");
		System.out.println("3.Mostrar datos de una cuenta a partir del DNI");
		System.out.println("4.Añadir Saldo");
		System.out.println("5.Retirar Saldo");
		System.out.println("6. Salir");
		
		System.out.println("Introduzca opción deseada");
		Scanner lector=new Scanner(System.in);
		opcion=lector.nextInt();
		
		
		
		switch(opcion) {
		
		case 1:
			
		for(CuentaBancaria c:B1) {
			if(c!=null) {
				System.out.println(c.toString());
			}
		}
		break; 
		case 2://No habría que hacer un bucle, simplemente preguntar al user si tiene el mismo dni y si lo tiene, realizar el transpaso
			for(int i=0;i<B1.length;i++) {
				for(int j=0;j<B1.length;j++) {
					if(B1[i].getDni().equals(B1[j].getDni())) {
						CuentaBancaria.realizarTranspaso(B1[i], B1[j],77);
						}
					System.out.println("Transpaso realizado");
					break;
				}
				break;
			}
		
		break;
		case 3:
			String DNIn;
			System.out.println("Introduzca Dni");
			Scanner lector01=new Scanner(System.in);
			DNIn=lector01.next();
			
			for(CuentaBancaria b:B1) {
				if(b!=null) {
					if(b.getDni().equals(DNIn)) {
						System.out.println(b.toString());
					}
				}
			}
			break;
		case 4:
			String iban;
			System.out.println("Introduzca IBAN");
			Scanner lector02=new Scanner(System.in);
			iban=lector02.next();
			
			for(CuentaBancaria b:B1) {
				if(b!=null) {
					if(b.getIban().equals(iban)) {
						float saldo;
						System.out.println("Introduzca Saldo");
						Scanner lector03=new Scanner(System.in);
						saldo=lector03.nextFloat();
						b.ingresarDinero(saldo);
						System.out.println("Su saldo ahora es de: "+b.getSaldo());
					}
					
				}
			}
		break;
		
		case 5:
			String iban1;
			System.out.println("Introduzca IBAN");
			Scanner lector03=new Scanner(System.in);
			iban1=lector03.next();
			
			for(CuentaBancaria b:B1) {
				if(b!=null) {
					if(b.getIban().equals(iban1)) {
						float saldo;
						System.out.println("Introduzca Saldo a retirar");
						Scanner lector04=new Scanner(System.in);
						saldo=lector04.nextFloat();
						b.retirarDinero(saldo);
						System.out.println("Su saldo ahora es de: "+b.getSaldo());
					}
					
				}
			}
		break;
			
			
		
		
		
		
		}//Fin del Switch
		
		
		
		
		
		
		
		}
		while(opcion!=6);

	}

}
