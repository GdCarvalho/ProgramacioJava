import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public abstract class producto implements Alquilable {

	public String codigo;
	public String titulo;
	public boolean alquilado;
	public int diasPrestamo;
	
	
	
	
	public producto(String codigo, String titulo) {
		super();
		setCodigo(codigo);
		this.titulo = titulo;
		
	}



	public String getCodigo() {
		return codigo;
	}



	public void setCodigo(String codigo) {
		if(codigo.matches("[A-Z]{2}[0-9]{2}")) {
			this.codigo = codigo;
		}
		
	}



	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public boolean isAlquilado() {
		return alquilado;
	}



	public void setAlquilado(boolean alquilado) {
		this.alquilado=alquilado;
	}

	public int getDiasPrestamo() {
		return diasPrestamo;
	}



	public void setDiasPrestamo(int diasPrestamo) {
		this.diasPrestamo = diasPrestamo;
	}


	@Override
	public void devolver() { //implementamos aquí la función de devolver un producto
		alquilado=false;
		diasPrestamo=0;
		
	}



	@Override
	public String toString() {
		return "producto [codigo=" + codigo + ", titulo=" + titulo + ", alquilado=" +alquilado + ", diasPrestamo="
				+ diasPrestamo + "]";
	}
	
	//como la clase libro y DVD dependen de producto, definimos la función tostringfichero aquí como abstracta para poder especificarla en las otras clases
		
	public abstract String toStringFichero(); 
	
	
	
	
	
	
	
	
}
