import javax.swing.JOptionPane;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Programa que presente un menú con 2 opciones al usuario
		//Ejercicio 1
		//...
		//Ejercicio 2
		
		int opcion=Integer.parseInt(JOptionPane.showInputDialog("Introduce un ejercicio: "));
		
		switch(opcion) {
		case 1:
			//cada caso es un bloque de código independiente, en este caso las variables declaradas aquí son locales
			int x=9, y=5;
			long potencia =(long)Math.pow(x, y);
			System.out.println("Ejercicio 1: ");
			break;
		case 2:
			System.out.println("Ejercicio 2");
			break;
		default://no es necesario que esté al final de todo. En caso de estar por el medio o al principio sí que habría que poner un break
				System.out.println("Error en la opción");
		}
		
		
		

	}

}
