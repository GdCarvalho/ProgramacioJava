import java.util.Arrays;

public class comparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		figura f[]= new figura[5];
		f[0]=new circulo(2);
		f[1]=new circulo(1.5f);
		f[2]=new traingulo(3,5);
		f[3]=new traingulo(1,2);
		f[4]=new rectangulo(2,5);
		Arrays.sort(f);
		
		for(figura ff:f) {
			if(ff!=null){
				System.out.println(ff.getNombre()+" "+ff.calcularArea());
			}
		}
		
		
	}

}
