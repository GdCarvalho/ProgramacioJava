package objetos;

import java.util.Scanner;

public class PruebaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente c=new Cliente();
		Cliente c2=new Cliente();
		Cliente c3= new Cliente(111,true);
		//Acceder a los atributos del objeto referenciado por c 
		//usaremos el operador .
		System.out.println(("Datos del cliente: "));
		System.out.println("Nombre: "+c.nombre);
		System.out.println("Saldo: "+c.consultaDinero());
		System.out.println("Es VIP?: "+c.vip);
		
		//modificar datos del cliente
		c.nombre="Pedro";
		c.dni="12345678Y";
		
		//aumentar saldo
		
		c.ingresarDinero(1000);
		
		
		
		
		
		//modificar cs
		Scanner lector =new Scanner(System.in);
		System.out.println(("Introduzca el nombre: "));
		c2.nombre=lector.next();
		
		System.out.println(("Introduzca el dni: "));
		c2.dni=lector.next();
		

	}

}
