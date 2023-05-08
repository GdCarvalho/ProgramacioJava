package decorator;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArbolNavidad arbol=new ArbolNavidadImp();
		
		System.out.println(arbol.decorar());
		
		ArbolNavidad arbolLuces=new LucesDecorator(arbol);
		
		System.out.println(arbolLuces.decorar());
		
         ArbolNavidad arbolLucesEstrellas=new EstrellaDecorator(arbolLuces);
		
		System.out.println(arbolLucesEstrellas.decorar());
		
	}

}
