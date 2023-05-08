import java.util.ArrayList;

public class RepasoListas {

	public static void main(String[] args) {
		//Hay 3 principales Listas, conjuntos y mapas
		
		ArrayList<String>lista= new ArrayList<String>();
		//Añadir objetos
		lista.add("Pedro");
		lista.add("Luis");
		lista.add("Marcos");
		lista.add(1,"Juan");
		
		
		//Nombres guardados
		System.out.println("Nombres:");
		for(int i=0; i<lista.size();i++) {
			System.out.println(lista.get(i));
		}
		
		//Eliminar un objeto
		
		lista.remove(0);
		lista.remove("Pedro");
		
		
		

	}

}
