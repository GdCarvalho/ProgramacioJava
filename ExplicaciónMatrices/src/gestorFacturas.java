
public class gestorFacturas {

	private factura f[];
	
	
	
//cosntructores 
	
	public gestorFacturas() {
		f=new factura[50];
	}
	
	public gestorFacturas(int capacidad) {
		f=new factura[capacidad];
	}
//métodos de acceso
	
	public void setFacturas(factura f[]) {
		this.f=f;
	}
	
	public factura[] getFacturas() {
		return this.f;
	}
	
	public boolean guardarFactura(factura factura) {
		for(int i=0;i<f.length;i++) {
			if(f[i]==null) {
				f[i]=factura;
				return true;
			}
		}
		return false;
	}
	
	
		
		
		
	
	
	
	
	public float totalFacturado() {
		float total=0;
		for(factura fac: f) {
			if(fac!=null) {
				total=total+fac.getImporte();
				
			}
		}
		return total;
		
	}
	
	public void mostrarFacturas() {
		for(factura fac: f) {
			if(fac!=null) {
				System.out.println(fac);
				
			}
		}
		
		
	}
	
	
	
	
	
}
