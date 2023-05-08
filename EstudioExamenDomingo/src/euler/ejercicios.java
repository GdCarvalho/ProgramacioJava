package euler;

public class ejercicios {

	public static void main(String[] args) {
		// 1.Find the sum of all the multiples of 3 or 5 below 1000.
		
		int matriz[]=new int[1000];
		for(int i=0;i<matriz.length;i++) {
			matriz[i]=i;
		}
		
		int m3=0;
	
		
		for(int i=0;i<matriz.length;i++) {
			if(matriz[i]%3==0 ||matriz[i]%5==0 ) {
				m3=m3+matriz[i];
			}
		}
		
		
		System.out.println(m3);
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
}
