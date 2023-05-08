
public class LibreríaMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Calcular la raíz2 de un nº: Math.sqrt(numero);
		
	int numero=10;
	double raiz =Math.sqrt(numero);
	
	//Calcular potencias: Math.pow(base, exponente);
	int potencia=(int) Math.pow(numero, 2);
	
	//Redondeo de valores: 
	float f1=4.56f;
	int f1Menor=(int) Math.floor(f1);//Redondeo a mayor
	int f1Mayor=(int) Math.ceil(f1);//Redondeo a menor
	int f1Cercano= Math.round(f1);//Redondeo al número entero más cercano
	System.out.println(f1Cercano);
	
	//Mínimo de dos valores;
	int x1=9, x2=10;
	int menor=Math.min(x1, x2);
	
	//Genrar nº aleatorio:
	
	int aleatorio=(int) (Math.random()*10); //Nº aleatorio entre 0 y 10 por ejemplo.
	
	
	
			

	}

}
