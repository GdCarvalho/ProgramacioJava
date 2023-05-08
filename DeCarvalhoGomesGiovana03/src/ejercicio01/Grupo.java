package ejercicio01;

public class Grupo {

	private String nombre;
	private int tiempoActuacion;
	int popularidad; //máx 10 y mínimo 0
	float coste; //lo que cuesta contratar el grupo
	


//Constructor por defecto
	public Grupo() {
		}

	public Grupo(String nombre, int tiempoActuacion, int popularidad, float coste) {
		this.nombre=nombre;
		this.coste=coste;
		this.tiempoActuacion=tiempoActuacion;
		setPopularidad(popularidad);
		this.calcularPrecioFinal(popularidad, coste);
		
	}
	
	//Métodos de acceso

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTiempoActuacion() {
		return tiempoActuacion;
	}

	public void setTiempoActuacion(int tiempoActuacion) {
		this.tiempoActuacion = tiempoActuacion;
	}

	public int getPopularidad() {
		return popularidad;
	}

	public void setPopularidad(int popularidad) {
		if(popularidad<=10 && popularidad>=0) {
			this.popularidad = popularidad;
		}
		else {
			popularidad=0;
		}
		
	}

	public float getCoste() {
		return coste;
	}

	public void setCoste(float coste) {
		this.coste = coste;
	}
	
	//Método que calcula el precio final del grupo
	
	public float calcularPrecioFinal(int popularidad, float coste) {
		float coste_total=0;
		coste_total=coste+((coste*popularidad)/100.0f);
		return(coste_total);
	}
	
	

	@Override
	public String toString() {
		

		return " Nombre: " + nombre + "\n\n Tiempo de actuación:" + tiempoActuacion + "\n Popularidad: " + popularidad
				+ "\n Coste: " + coste + "\n Coste Total "+calcularPrecioFinal(popularidad, coste)+".\n";
	}
	
	
	
	
	
	
	
	
}