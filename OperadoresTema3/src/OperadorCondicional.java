
public class OperadorCondicional {

	public static void main(String[] args) {
		// Programa que si una variable es >100 la resetea a 0 y si es menor le sume 10
		
		int variable =200;
		
		/*if(variable>100) {
			variable =0;
		}
		else {
			variable +=10;
		}*/
		
		variable= variable>100 ? 0 : variable+10;
		System.out.println("Variable= "+variable);
		
		//Programa que clasifica una nota como suspenso, aprobado, sobresaliente 
		String calificacion;
		float nota = 9f;
		
		calificacion = nota<5&& nota>0? "suspenso": nota<7? "aprobado": "sobrasaliente";
		System.out.println("La calificacion es de: "+calificacion);
		
		
		
		

	}

}
