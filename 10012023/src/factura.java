import java.util.Objects;

public class factura implements Comparable<factura> {

	private String codigo;
	private float importe;
	public factura(String codigo, float importe) {
		super();
		this.codigo = codigo;
		this.importe = importe;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public float getImporte() {
		return importe;
	}
	public void setImporte(float importe) {
		this.importe = importe;
	}
	@Override
	public String toString() {
		return "factura [codigo=" + codigo + ", importe=" + importe + "]";
	}
	@Override
	public int hashCode() {
		return this.codigo.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		factura other = (factura) obj;
		return Objects.equals(codigo, other.codigo);
				
	}
	@Override
	public int compareTo(factura o) {
		// TODO Auto-generated method stub
		return this.codigo.compareTo(o.getCodigo());
	}
	
	
	
}
