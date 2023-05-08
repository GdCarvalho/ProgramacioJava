
public class MetodosFacturas {
	//Método que guarda una factura que guarda una factura en una matriz de facturas
	
	public static boolean guardarFactura(factura f, factura fs[]) {
		//guardamos esta factura en la primera posición vacía
		for(int i=0;i<fs.length;i++) {
			if(fs[i]==null) {
				fs[i]=f;
				return true;
		
			}
		}
		
		return false;
		
	}
	
	
	//Metodo que permite visualizar por consola la matriz de facturas
	
	public static void mostrarFacturas (factura factura[]) {
		for(factura f:factura) {
			if(f!=null) {
			System.out.println(f);
		}
		
	}
	}
	//Méptodo que nos busca una factura
	public static factura buscarFactura(String codigo, factura fs[]) {
		for(factura f:fs) {
			if(f!=null) {
			if(f.getCodigo().equals(codigo)) {
				return f;
			}
			
		}
		}
		return null;
	}
	
	//Me´todo que elimina una factura
	
	public static boolean eliminarFactura(String codigo, factura fs[]) {
		for(int i=0; i<fs.length;i++) {
			if(fs[i]!=null) {
				if(fs[i].getCodigo().equals(codigo)) {
					fs[i]=null;
					//ver si con bubble sort consigues ordenar la matriz para los que valores null del medio vayan al final
					return true;
				}
			}
		}
		return false;
		
	}
	
	
	
	
	

}
