
public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		figura f1=new cuadrado (2);
		figura f2=new circulo (2);
		figura f3=new triangulo(3);
		
		System.out.println("Soy un "+f1.getNombre()+"y mi perímetro es: "+f1.getPerimetro()+"m");;
		System.out.println("Soy un "+f2.getNombre()+"y mi perímetro es: "+f2.getPerimetro()+"m");;
		System.out.println("Soy un "+f3.getNombre()+"y mi perímetro es: "+f3.getPerimetro()+"m");;

		circulo c2=new circulo (3);
		System.out.println("Soy un "+c2.getNombre()+" mi radio es "+c2.getRadio()+ " y mi perimetro es "+c2.getPerimetro());
		
	}

}
