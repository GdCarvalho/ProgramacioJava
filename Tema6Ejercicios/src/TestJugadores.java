import java.util.Scanner;

public class TestJugadores {

	public static void main(String[] args) {
		
		
		Jugador j2 =new Jugador("G5", "Fonso");
		Jugador j3 =new Jugador("T8","Loki");
		
		
		j2.actualizarPuntos(23);
		j3.actualizarPuntos(4);
		
		Scanner lector=new Scanner(System.in);
		System.out.println("Introduzca el código:");
		String codigo= lector.next();
		
		Jugador j1=new Jugador(codigo,"Lola");
		
		System.out.println(j1);
		System.out.println(j2);
		
		
	}

}
