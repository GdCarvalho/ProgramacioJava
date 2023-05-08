import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		int TpH; //Tasa por horas
		double SB; //salario bruto
		int HT; //horas trabajadas
		
		
		Scanner lector = new Scanner (System.in);
		System.out.print("Introduzca la tasa por horas: ");
		TpH=lector.nextInt();
		
		System.out.print("Introduzca Horas Trabajadas: ");
		HT=lector.nextInt();
		
		if(HT<=38) {
			SB=TpH*HT;
			if(SB<=300) {
				double SBfinal= SB;
				
				System.out.println( "El salario bruto es: " +SBfinal);
				System.out.println( "El salario neto es: " +SBfinal);
			}
			else {
				double SBfinal=0.1*SB+SB;
				
				System.out.println( "El salario bruto es: " +SBfinal);
			}
			
			}
	   else if (HT-38 > 0) {
			int Hextra = HT-38;
			double extra= (0.5*TpH + TpH)*Hextra;
			SB=(TpH*HT)+extra;
			if(SB<=300) {
				double SBfinal= SB;
				System.out.println( "El salario bruto es: " +SBfinal);
			}
			else {
			 double	SBfinal=0.1*SB+SB;
			 System.out.println( "El salario bruto es: " +SBfinal);
			}
			
				}
	   
		   
	   }
		 

		
		

	}


