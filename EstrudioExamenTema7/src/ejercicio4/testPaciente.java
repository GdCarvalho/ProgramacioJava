package ejercicio4;

public class testPaciente {

	public static void main(String[] args) {
		
		Paciente pacientes[]=new Paciente[7];
		pacientes[0]=new Paciente("12345678S","Noelia", 35);
		pacientes[1]=new Paciente("44555678G","Jesús", 90);
		pacientes[2]=new Paciente("67434631H","Martín",15);
		pacientes[3]=new SospechaCOVID("34511122Q","Carlos",56);
		pacientes[4]=new SospechaCOVID("34553451C","Loli",40);
		pacientes[5]=new SospechaCOVID("09758323A","Andrea",32);
		
		
		for(Paciente p:pacientes) {
			if(p!=null) {
				if(p instanceof SospechaCOVID) {
					SospechaCOVID c=(SospechaCOVID)p;
					c.realizarTest();
					
					if(c.isInfectado()) {
						System.out.println(p);
						System.out.println("------------");
					}
				}
			}
		}
		
		
		for(Paciente p:pacientes) {
			if(p!=null) {
				if(p instanceof SospechaCOVID) {
					SospechaCOVID c=(SospechaCOVID)p;
					if(c.isInfectado() && c.getEdad()<50) {
						c.curar();
					}
				}
			}
		}
		
	
		for(Paciente pp:pacientes) {
			if(pp!=null) {
				System.out.println(pp.toString());
			}
		}
		
		
		

	}

}
