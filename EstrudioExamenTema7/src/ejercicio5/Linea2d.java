package ejercicio5;

public class Linea2d implements Relationable{
	
	private Punto2d p1;
	private Punto2d p2;
	private float distancia;
	
	public Linea2d(Punto2d p1, Punto2d p2) {
		super();
		this.p1 = p1;
		this.p2 = p2;
	}

	public Punto2d getP1() {
		return p1;
	}

	public void setP1(Punto2d p1) {
		this.p1 = p1;
	}

	public Punto2d getP2() {
		return p2;
	}

	public void setP2(Punto2d p2) {
		this.p2 = p2;
	}

	public float getDistancia() {
		return distancia;
	}

	public void setDistancia(float distancia) {
		distancia=(float) Math.sqrt((p2.getX()-p1.getX())*(p2.getX()-p1.getX())+(p2.getY()-p1.getY())*(p2.getY()-p1.getY()));
	}

	@Override
	public boolean isMayorQue(Object a) {
		if(this.distancia>((Linea2d)a).distancia) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isMenorQue(Object a) {
		Linea2d lineab=(Linea2d)a;
		if(this.distancia<lineab.distancia) {
			return true;
		}
		else {
			return false;
		}
		
		}

	@Override
	public boolean isIgual(Object a) {
		Linea2d lineab=(Linea2d)a;
		if(this.distancia==lineab.distancia) {
			return true;
		}
		else {
			return false;
		}
		
		}

	
	
	

}
