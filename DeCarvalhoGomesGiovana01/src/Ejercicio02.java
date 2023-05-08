import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion;
		
		
		String emails[]= new String[10]; //creamos una matriz con capacidad para 10 strings
		emails[0]= "mail1@gmail.com";
		emails[1]="mail2@hotmail.com";
		emails[2]="mail3@yahoo.com";
		emails[3]="mail4@outlook.com";
		emails[4]="mail5@gmail.com";
		emails[5]="vacio";
		emails[6]="vacio";
		emails[7]="vacio";
		emails[8]="vacio";
		emails[9]="vacio";
		
		do {
		System.out.println("1. Guardar correo.");
		System.out.println("2. Buscar correo.");
		System.out.println("3. Contar correos por dominio");
		System.out.println("4. Porcentaje de correos por dominio");
		System.out.println("5. Salir");
		
		
		Scanner lector= new Scanner(System.in);
		System.out.print("Introduce número de la opción deseada: ");
		 opcion=lector.nextInt();
		 
		switch(opcion) {
		case 1: //guardar correo en la primera posición vacia
			boolean direccion=false; //inicializamos boolean para la dirección
			boolean punto=false; //para punto
			int arroba=0; //y para el arroba
			do {
				
				Scanner correo= new Scanner(System.in);
				System.out.println("Introduce correo a guardar: "); //el usuario introduce la direccion de correo que quiere guardar
				String mail=correo.nextLine();
					punto=false;
					direccion=false;
					arroba=0; //inicializamos otra vez el arroba para que si el usiario quiere volver a meter otra dirección esta no variable no tenga valor 0 y no acumule
				for(int j =0; j<mail.length();j++) { //bucle que recorre la longitud del mail introducido
					
					if(mail.charAt(j)=='@') { //si encuentra un caracter arroba 
								arroba++; //le suma uno al contador y
						String mail2[]=mail.split("@"); // creamos una matriz con el string mail separado por el arroba
						String mailDeseado=mail2[mail2.length-1]; //nos quedamos con el string que se situa después del arroba
						for (int k=0; k<mailDeseado.length();k++) { //bucle que recorre ese string nuevo 
							if(mailDeseado.charAt(k)=='.') { //y si encuentra un punto
						        direccion=true;	//actualiza el booleano a true
						
							}
							
						}
						if(mail.charAt(mail.length()-1)=='.') { //en el string introducido, si en la última posición encuentra un uno
							punto=true; //actualiza el booleano a true
							
						}
					}
					
					
					} //Fin del bucle for
						
				if(direccion==true && arroba==1 && punto!=true) { //si encuentra un punto despues del arroba, si tiene un arroba y si no tiene punto al final
					for (int i=0; i<emails.length;i++) { //pasaremos al bucle que recorre la matriz principal 
						if(emails[i]=="vacio") { //cuando encuentre una posición que tenga "vacio" 
							emails[i]=mail; //Le asignará el mail introducido por el usuario a ese pocición.
							System.out.println(emails[i]); //Y la imprime
							break;
						}
					}
					
				}
				else { //Si no se cumple ninguna de las condiciones mencionadas el correo no será valido 
					System.out.println("Correo no valido.");
				}
				}
			
			while(direccion!=true || punto==true); //Si el correo no es valido se repetirá el programa hasta que eel usuario introduzca un formato de mail valido
		
			break;
			
		case 2: //buscar un correo
		//	System.out.println(Arrays.toString(emails));
			Scanner correo2= new Scanner(System.in);
			System.out.println("Introduce correo a buscar: ");
			String mail2=correo2.nextLine();
			
			for(int i=0;i<emails.length;i++) { //bucle que recorre la matriz
				if(mail2.equals(emails[i])) { //si el correo introducido es igual a alguno que haya en la matriz
					System.out.println("El correo está en la posición: " +i); //imprime la posición en la que se encuentra
				}
			}
			break;
			
		case 3: //contar por dominio
			
			Scanner correo3= new Scanner(System.in);
			System.out.println("Indicar dominio(gmail, hotmail o yahoo): ");
			String dominio=correo3.nextLine();
			
			int contadorDominio =0; 
			
			for(int i=0;i<emails.length;i++) { //bucle que recorre la matriz y
				String mail3[]=emails[i].split("@"); //creamos una matriz que se separe por el arroba y
				String mailDeseado=mail3[mail3.length-1]; //creamos un string solamente con la segunda parte
				
				if(mailDeseado.startsWith(dominio)) { //si ese string empieza por el dominio que introdujo el usuario
					
					contadorDominio++; //sumamos uno al contador
				}
			}
			System.out.println("El total de correos con el dominio indicado es: "+contadorDominio); //al acabar el bucle se imprime el resultado.
			
			break;
			
		case 4: // porcentaje de dominios
			
			int contadorGmail=0;
			int contadorHotmail=0;
			int contadorOutlook=0;
			int contadorYahoo=0;
			
			for(int i=0;i<emails.length;i++) {//bucle que recorre la matriz y
				String mail4[]=emails[i].split("@");//creamos una matriz que se separe por el arroba y
				String mailDominio=mail4[mail4.length-1]; //creamos un string solamente con la segunda parte
				
				if(mailDominio.startsWith("gmail.com")) { //si ese string empieza por gmail
					contadorGmail++; //suma 1 al contador de gmail
				}
				 // y hará lo mismo para los demás dominios
				if(mailDominio.startsWith("hotmail.com")) {
					contadorHotmail++;
				}
				
				if(mailDominio.startsWith("outlook.com")) {
					contadorOutlook++;
				}
				
				if(mailDominio.startsWith("yahoo.com")) {
					contadorYahoo++;
				}
						
			}//Fin del for
			
			//calculamos aquí los porcentajes de cada dominio
			int porcenjateGmail= contadorGmail*100/10; 
			int porcenjateHotmail= contadorHotmail*100/10;
			int porcenjateOutlook= contadorOutlook*100/10;
			int porcenjateYahoo= contadorYahoo*100/10;
			
			//Y se imprimen
			System.out.println("El porcentaje de correos con el dominio Gmail son: " +porcenjateGmail +"%" );
			System.out.println("El porcentaje de correos con el dominio Hotmail son: " +porcenjateHotmail +"%" );
			System.out.println("El porcentaje de correos con el dominio Outlook son: " +porcenjateOutlook +"%" );
			System.out.println("El porcentaje de correos con el dominio Yahoo son: " +porcenjateYahoo +"%" );
			
			
			break;
			
		case 5: //salir
		
			System.exit(0);
			break;
			
		default: //si el usuario no elije ninguna de las opciones
			System.out.println("Elija una opción valida");
			break;
			
		
		}//Fin del switch
		
		
		
		}
		while(opcion !=5); //El programa se repite hasta que el user no elija la opción 5
		
		
		
	}

}
