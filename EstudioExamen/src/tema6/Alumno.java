package tema6;

import java.time.LocalDate;
import java.util.Arrays;

public class Alumno {
	
	private String dni;
	private String Nombre;
	private LocalDate fechaNacimiento;
	private int edad;
	private float[] notas;
	private float media;
	public Alumno(String dni, String nombre, LocalDate fechaNacimiento, int numeroNotas) {
		super();
		setDni(dni);
		Nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		 notas=new float[numeroNotas]; 
		 for(int i=0;i<notas.length;i++) {
			 notas[i]=-1;
		 }
		 
		 
		
	}
	public Alumno(String dni, String nombre, LocalDate fechaNacimiento) {
		super();
		setDni(dni);
		Nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		 notas=new float[10]; 
		 for(int i=0;i<notas.length;i++) {
			 notas[i]=-1;
		 }
		
		
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		if(dni.matches("[0-9]{8}[A-Z]{1}")) {
			this.dni = dni;
		}
		
	}
	public String getNombre() {
		
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		if(fechaNacimiento.getYear()<2004){
			this.fechaNacimiento = fechaNacimiento;
		}
		
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public float[] getNotas() {
		return notas;
	}
	public void setNotas(float[] notas) {
		this.notas = notas;
	}
	public float getMedia() {
		return media;
	}
	public void setMedia(float media) {
		float suma=0;
		for(int i=0;i<notas.length;i++) {
			if(notas[i]>-1) {
				suma=notas[i]+suma;
			}
		}
		this.media = suma/notas.length;
	}
	
	public void addNota(float Nota) {
		
		for(int i=0;i<notas.length;i++) {
			if(notas[i]==-1) {
				notas[i]=Nota;
				break;
			}
		
		}
	}
	
	public void modificarNota(float Nota, int posicion) {
		for(int i=0;i<notas.length;i++) {
			if (i==posicion){
				notas[i]=Nota;
				
			}
		}
		
		
	}
	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", Nombre=" + Nombre + ", fechaNacimiento=" + fechaNacimiento + ", edad=" + edad
				+ ", notas=" + Arrays.toString(notas) + ", media=" + media + "]";
	}
	
	
	
	
	
}

