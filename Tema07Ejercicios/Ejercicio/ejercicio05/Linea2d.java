package ejercicio05;

public class Linea2d implements Relationable {
	
	private Punto2d p1;
	private Punto2d p2;
	private float distancia;
	
	
	public Linea2d(int x1, int y1, int x2,int y2) {
		p1=new Punto2d(x1,y1);
		p2=new Punto2d(x2,y2);
		calcularDistancia();
		
	}
	
	public Linea2d(Punto2d p1, Punto2d p2) {
		super();
		this.p1=p1;
		this.p2=p2;
		calcularDistancia();
		
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

	public void calcularDistancia() {
		this.distancia = (float)(Math.sqrt(Math.pow(p2.getX()-p1.getX(),2) + Math.pow(p2.getY()-p1.getY(),2)));
	}

	
	
	
	@Override
	public boolean isMayorQue(Object a, Object b) {
		if(this.distancia>((Linea2d)a).distancia && this.distancia>((Linea2d)a).distancia) {
		return true;
	}
		else {
			return false;
		}
	}

	@Override
	public boolean isMenorQue(Object a, Object b) {
		if(this.distancia<((Linea2d)a).distancia && this.distancia<((Linea2d)a).distancia) {
			return true;
		}
			else {
				return false;
			}
		}
	

	@Override
	public boolean isIgual(Object a, Object b) {
		if(this.distancia==((Linea2d)a).distancia && this.distancia==((Linea2d)a).distancia) {
			return true;
		}
			else {
				return false;
			}
		}
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	


