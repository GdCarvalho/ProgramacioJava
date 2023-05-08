package Ejercicio01;

import java.util.Arrays;
import java.util.Scanner;


public class TestJugador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Jugador j1= new Jugador();
		j1.actualizarPuntos(10);
		Jugador j2 =new Jugador();
		//Establecer la competicion
		Jugador.getCompeticion();
		Jugador.setCompeticion("Torneo de tenis");
		
		
		
		String codigo;
		Scanner lector=new Scanner(System.in);
		System.out.println("Introduzca el código");
		codigo=lector.next();
		
		Jugador j3= new Jugador(codigo,"Marcos");

		System.out.println("Código de j2 "+j2.getCodigo());
		System.out.println("Puntos de j1 "+j1.getPuntos());
		System.out.println("Fecha de creación: "+j1.getFechaCreacion());
		
		//Mostrar toda la info de un jugador por pantalla (tienes que ir atributo por atributo)
		
		System.out.println(j3.getNombre()+" "+j3.getCodigo()+" "+j3.getPuntos()); //Este es una forma, pero es un rollo
		System.out.println(j3.toString()); //Esta es una forma mucha más sencilla (para ello necesitamos @Override el toString
		System.out.println(j3);//más fácil aún
		
		//Método hashcode
		System.out.println("Hashcode de j1: "+j1.hashCode());
		
		//Prueba método comparar puntos
		//System.out.println("Quien tiene más puntos?"+ Jugador.comparaPuntos(j1, j2));
		
		//Qué día se creó el jugador J1
		
		int dia=j1.getFechaCreacion().getDayOfMonth();
	     System.out.println(dia);
		
		
	}
	

}
