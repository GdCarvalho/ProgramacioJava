package ejercicio02;

public class Puntos {
	
	private int x;
	private int y;
	

	//Constructor de la clase punto
	
	public Puntos(int x, int y){
		this.setX(x);
		this.setY(y);
		
	}
//Métodos de acceso

	public int getX() {
		return x;
	}


	public void setX(int x) {
		if(x<=5 && x>=-5) {
			this.x = x;
		}
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		if(y<=5 && y>=-5) {
			this.y = y;
		}
	}


	@Override
	public String toString() {
		return  "("+x + "," + y+")" ;
	}
	
	
	
	
	
}
