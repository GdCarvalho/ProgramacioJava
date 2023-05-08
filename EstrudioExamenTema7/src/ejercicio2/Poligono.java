package ejercicio2;

public class Poligono extends Figura {

	private int lados;
	private float longitudLados;
	
	
	public Poligono(String nombre, int lados,float longitudLados) {
		super(nombre, lados*longitudLados);
		this.lados=lados;
		this.longitudLados=longitudLados;
	
	}


	public int getLados() {
		return lados;
	}


	public void setLados(int lados) {
		this.lados = lados;
	}


	public float getLongitudLados() {
		return longitudLados;
	}


	public void setLongitudLados(float longitudLados) {
		this.longitudLados = longitudLados;
	}


	@Override
	public String toString() {
		return "Poligono [lados=" + lados + ", longitudLados=" + longitudLados + ", getNombre()=" + getNombre() + "]";
	}
	
	
	
	
	
	
	
}
