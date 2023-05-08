package misMetodos;

public class ParámetrosOpcionales {
	
	public static double calcularMedia(int ob, int... x) { //  int ob es un integer obligatorio...... De esta forma podemos tratar x como si fuera un array
		double media=ob,suma=ob ;
		for(int i=0; i<x.length;i++) {
		suma=suma+x[i];
		media = suma/(x.length+1);
		}
		return media;
	}

}
