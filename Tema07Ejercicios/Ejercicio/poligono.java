
public class poligono extends figura {
	private int lados;
	private float longitud;
	
	public poligono(String nombre, int lados, float longitud) {
		super(nombre, lados*longitud);
		this.lados=lados;
		this.longitud=longitud;
	}

	public int getLados() {
		return lados;
	}

	public void setLados(int lados) {
		this.lados = lados;
	}

	public float getLongitud() {
		return longitud;
	}

	public void setLongitud(float longitud) {
		this.longitud = longitud;
	}

	@Override
	public String toString() {
		return "poligono [lados=" + lados + ", longitud=" + longitud +	"toString()=" + super.toString() + "]";
	}

	
	
	
	
}
