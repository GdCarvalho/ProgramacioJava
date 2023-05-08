
public class IncrementoYDecremento {

	public static void main(String[] args) {
		// ++, -- son Postincremento o preincremento dependiendo de si está antes o después de la variable
		
		int x=10;
		x++;
		++x;
		//x aquí vale 12
		
		//Diferencia entre x++ y ++x
		
		int y=10;
		int x1= y++; // x1 valdría 10. Primero se asigna el valor de y a x1 y luego se le suma y+1
		int x2=++y; //x2 valdría 12. Primero se suma y luego se asigna.
		
		
		

	}

}
