package ejercicio3;

public class Casa {

	public static void main(String[] args) {
		
		mueble matriz[]=new mueble[8];
		matriz[0]=new mesa(250,"redonda",4);
		matriz[1]=new silla(55,"crema");
		matriz[2]=new silla(55,"crema");
		matriz[3]=new silla(55,"crema");
		matriz[4]=new silla(55,"crema");
		matriz[5]=new mesa(72,"rectangular",1);
		matriz[6]=new silla(25,"azul");
		
		for(mueble m:matriz) {
			if(m!=null) {
				System.out.println(m);
			}
		}
		
		

	}

}
