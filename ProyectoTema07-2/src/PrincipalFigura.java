
public class PrincipalFigura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		figura f[]= new figura[5]; //si la matriz no está completa no se puede ordenar. Habría que crear una matriz de tipo figura del tamaño de la matriz original
		f[0]=new circulo(2);
		f[1]=new circulo(1.5f);
		f[2]=new traingulo(3,5);
		f[3]=new traingulo(1,2);
		f[4]=new rectangulo(2,5);
		
		
		
		
		//Calcular el area de todas
		
		for(figura fs:f) {
			if(fs!=null) {
				System.out.println(fs.calcularArea());
			}
			
		}
		
		
		
		
		
		
	}

}
