package tema6;

import java.time.LocalDate;

public class Solicitud {
	
	
	private String codigo;
	private String titulo;
	private LocalDate fecha;
	private Estado estado;
	
	
	public Solicitud(String codigo, String titulo, LocalDate fecha, Estado estado) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.fecha = fecha.now();
		this.estado= estado.Pendiente;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public LocalDate getFecha() {
		return fecha;
	}


	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}


	public Estado getEstado() {
		return estado;
	}


	public void setEstado(Estado estado) {
		this.estado = estado;
	}


	@Override
	public String toString() {
		return "Solicitud [codigo=" + codigo + ", titulo=" + titulo + ", fecha=" + fecha + ", estado=" + estado + "]";
	}
	
	
	
	
	
	

}
