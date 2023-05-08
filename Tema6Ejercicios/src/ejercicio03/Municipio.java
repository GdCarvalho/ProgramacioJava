package ejercicio03;

public class Municipio {
	
	private String nombre;
	private String codigoMunicipio;
	private String codigoProvincia;
	private String dc;
	
	//Constructores
	
	public Municipio(String nombre, int codigoMunicipio, int codigoProvincia) {
		this.nombre=nombre;
		setCodigoMunicipio(codigoMunicipio);
		setCodigoProvincia(codigoProvincia);
		setDC();
	}
	
	
	public String getCodigoMunicipio() {
		return codigoMunicipio;
	}



	public void setCodigoMunicipio(int codigoMunicipio) {
		String CMunicipio=String.format("%03d", codigoMunicipio);
		this.codigoMunicipio = CMunicipio;
	}



	public String getCodigoProvincia() {
		return codigoProvincia;
	}



	public void setCodigoProvincia(int codigoProvincia) {
		String CProvincia=String.format("%03d", codigoProvincia);
		this.codigoProvincia = CProvincia;
	}
	
	public String getDc() {
		return dc;
	}

	private void setDC() {
		int[][] magicos = {
	         	{0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
	         	{0, 3, 8, 2, 7, 4, 1, 5, 9, 6},
	         	{0, 2, 4, 6, 8, 1, 3, 5, 7, 9}
	         	};
	       String codigo  =codigoMunicipio + codigoProvincia;
	       byte[] bytes = codigo.getBytes();
	         	 
	         	 int sum = 0, i = 0;
	                	for(Byte v : bytes){
	                       	sum+=magicos[2 - i % 3][v - 48];
	                       	i++;
	                	}
	         	
	         	int res = sum == 0?0:10 - sum % 10;
	         	this.dc = Integer.toString(res);
	
	
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	@Override
	public String toString() {
		return "Municipio [nombre=" + nombre + ", codigoMunicipio=" + codigoMunicipio + ", codigoProvincia="
				+ codigoProvincia + ", dc=" + dc + "]";
	}
	
	
	
	
	
}
