package ejercicio2;

public class TestEjecicio2 {

	public static void main(String[] args) {
	
		 Figura c1=new Cuadrado(2);
		 Figura ci1=new Circulo(2);
		 Figura t=new Triangulo(3);
		 
		 System.out.println("Soy un cuadrado y mi perimetro es: "+c1.getPerimetro());
		 System.out.println("Soy un cículo y mi perimetro es: "+ci1.getPerimetro());
		 System.out.println("Soy un triangulo y mi perimetro es: "+t.getPerimetro());
	
		 Circulo circulo=new Circulo(2);
		 System.out.println("Soy un cículo y mi radio es " +circulo.getRadio());

	}

}
