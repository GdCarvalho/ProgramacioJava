package ejercicio6;

public class PasswordFree extends password {

	
	public PasswordFree(String seña) {
		super(seña);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean validar(String s) {
		if(s.length()>0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean validar(int x) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean validar(double d) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setSeña(String seña) {
		if(validar(seña)) {
			this.seña=seña;
		}
		
	}

	@Override
	public String getFortaleza() {
	     String fuerte="La contraseña es fuerte";
	     String debil="La contraseña es debil";
	     
	     if(this.seña.length()>4){
	    	 return fuerte;
	     }
	     else {
	    	 return debil;
	     }
		
		
	}

	
	
	
	
	
}
