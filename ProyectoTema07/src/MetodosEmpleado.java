
public class MetodosEmpleado {
	
	public static void guardarEmpleado(Empleado e, Empleado plantilla[]) {
		for (int i = 0; i < plantilla.length; i++) {
			if (plantilla[i] == null) {
				plantilla[i] = e;
				break;
			}
		}
	}

}
