package ejercicio04;

public class Principal {

	public static void main(String[] args) {
		
		paciente pacientes[]=new paciente[7];
		pacientes[0]=new paciente("12345678R", "Alfonso", 37, "Gripe");
		pacientes[1]=new paciente("13333378Z", "María", 44, "Migraña");
		pacientes[2]=new paciente("22335678A", "Carmen", 22, "Esguince");
		pacientes[3]=new sospechosoCovid("22465678H", "Jorge", 68,false,false);
		pacientes[4]=new sospechosoCovid("22559678B", "Almudena", 50,false,false);
		pacientes[5]=new sospechosoCovid("00365678s", "Alex", 73,false,false);
		pacientes[6]=new sospechosoCovid("22111678Y", "Gimena", 30,false,false);

		
		for(paciente p:pacientes) {
			if(p!=null) {
				if(p instanceof sospechosoCovid) {
					sospechosoCovid s=(sospechosoCovid)p;
					s.realizarTest();
					if(s.isInfectado()!=false) {
						System.out.println(s);
					}
					if(s.isInfectado()!=false && s.getEdad()<50) {
						s.curar();
						System.out.println(s +" esta curado");
					}
					
					
				}
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
