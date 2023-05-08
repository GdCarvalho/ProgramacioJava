package Ejercicio01;

import java.time.LocalDate;

public class Jugador {
	
	//Atributos (datos) de esta clase
	private String codigo;
	private String nombre;
	private int puntos;
	private static String competicion; //queremos que este sea un dato compartido por todos los de la clase (por eso ponemos static)
	//se accede desde la propia clase 
	private LocalDate fechaCreacion;
	
	
	//Constructor por defecto
	
		public Jugador() {
			fechaCreacion=LocalDate.now();
			
		}

	public LocalDate getFechaCreacion() {
			return fechaCreacion;
		}


		//Sobrecarga del constructor
		//Este nos permite inicializarlo con una variable en concreto
		public Jugador(String codigo, String nombre) {
			setCodigo(codigo); //LLamo al método set Codigo para validar el formato.
			this.nombre=nombre;//para que el programa sepa qué tiene que asignar a qué, se pone el this delante para diferenciar. También se puede nombrar de otra forma y via
			fechaCreacion=LocalDate.now();
		}
		
		
		
		//Método de acceso
		//:: Atributo codigo
		
		public String getCodigo() {
			return this.codigo;
		}
		
		public void setCodigo(String codigo) {
			if(codigo.length()==2) {
				if(Character.isLetter(codigo.charAt(0)) && Character.isDigit(codigo.charAt(1))) {
					this.codigo=codigo;
					
				}
			}	
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getPuntos() {
			return puntos;
		}
		
		//Métodos compartidos que dan acceso a la variable estática competición
		public static String getCompeticion() { //dentro del metodo estatico no puedo poner el puntero this.
			return competicion; 
		}
		
		public static void setCompeticion(String competicion) {
			Jugador.competicion=competicion;
		}
		
		

		
		public void actualizarPuntos(int puntos) {
			this.puntos+=puntos;
		}
		
		//Método que recibe 2 jugadores y devuelve el que tiene más puntos
		//public static Jugador comparaPuntos(Jugador j1, Jugador j2) {
		//if(j1.getPuntos()>j2.getPuntos()) {
			//return j1;
		//}
		
		//}
		
		
		
		@Override
		//Para modificar el comportamiento de um metodo que estamos heredando
		//sobrrescribiremos el método to string
		public String toString() {
			
			return this.nombre + " " + this.codigo + " "+this.puntos;
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	
}
