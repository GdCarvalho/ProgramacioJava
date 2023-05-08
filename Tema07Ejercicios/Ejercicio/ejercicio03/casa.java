package ejercicio03;

public class casa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		mueble m1[]=new mueble[8];
		m1[0]=new mesa("Redonda", 4, 250);
		m1[1]= new silla("Crema", 55);
		m1[2]= new silla("Crema", 55);
		m1[3]= new silla("Crema", 55);
		m1[4]= new silla("Crema", 55);
		m1[5]= new cama(150,200,575);
		m1[6]= new mesa("Rectangular", 1, 72);
		m1[7]= new silla("azul", 25);
		
		
		for(mueble mueble:m1) {
			if(mueble!=null) {
				System.out.println(mueble);
				
			}
			
		}

		
		
		
		
		
		
	}

}
