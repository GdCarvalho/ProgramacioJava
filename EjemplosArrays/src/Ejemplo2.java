import java.util.Random;

public class Ejemplo2 {

	public static void main(String[] args) {
		//Da una matriz de temperaturas calcular la media de estas.
		
		float temp[]= new float[50];
		float suma=0, media=0;
		
		for(int i=0;i<temp.length;i++) {;
		Random rnd=new Random();
		temp[i]=rnd.nextInt(40)+rnd.nextFloat();
		

	}
	
	//Temperatura media
	
	for(int i=0;i<temp.length;i++) {;
	    suma=suma+temp[i];

	}
	media=suma/temp.length;
	System.out.println("La temperatura media es de: "+media);
	
	
	//Contar cuantas veces se supero la temperatura media.
	
	int contador =0;
	
	for(float valor:temp) { //para operaciones solo de lectura
		if(valor>media) {
			contador++;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	}
}
