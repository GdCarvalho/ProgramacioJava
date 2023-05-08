import java.util.HashSet;
import java.util.TreeSet;

public class Conjuntos2 {

	public static void main(String[] args) {
		HashSet<factura> f=new HashSet<factura>();
		f.add(new factura("a1",34.2f));
		f.add(new factura("a5",44.3f));
		f.add(new factura("a3",123.3f));
		f.add(new factura("a3",34.2f));

		System.out.println("Info facturas");
		for(factura fac:f) { //Se imprimen todas porque tienen diferente hashcode
			System.out.println(fac); //Para que no impriman facturas con el mismo código hay que sobrrescribir el equals y hashcode
		}
		
		TreeSet<factura> ff=new TreeSet<factura>(f);
		//para esto hay que sobreescribir el comparaTo e implementar la interfaz comparable
		System.out.println("Info facturas por código");
		for(factura fc:ff) { //Se imprimen todas porque tienen diferente hashcode
			System.out.println(fc); //Para que no impriman facturas con el mismo código hay que sobrrescribir el equals y hashcode
		}
		
		
	}

}
