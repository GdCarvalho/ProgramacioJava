package objetos;

public class Cliente {
	//Definimos los datos que necesitamos de cada cliente
	String dni; //se inicializa a null
	String nombre; 
	private float saldoTotal; //se inicializa a 0 //private paara que no se pueda acceder desde fuera de la clase cliente, a no ser por los metodos.
	boolean vip; //se inicializa a false
	//se inicializan a esos valores por defecto
	
	//Constructores: 
	public Cliente() {
		super();
	}
	
	public Cliente(float saldo, boolean vip) {
		saldoTotal=saldo;
		 this.vip=vip; //this.vip es un puntero que apunta al propio objeto, para poder diferenciarlos
	}
	
	
	
	public void quitarDinero(float cantidad) {
		if(saldoTotal -cantidad>=0) {
			saldoTotal-=cantidad;
		}
		
	}
	public void ingresarDinero(float cantidad) {
		saldoTotal +=cantidad;
	}
	
	public float consultaDinero() {
		return saldoTotal;
	}

}
