package ejercicio6;

public class PasswordPlus extends password {

	
	public PasswordPlus(String seña) {
		super(seña);
		
	}

	@Override
	public boolean validar(String s) {
		if(s.length()>6 && s.matches(".*[0-9+].*")) {
			return true;
		}
		return false;
	}
	
	@Override
	public String getFortaleza() {
		String fuerte="La contraseña es fuerte";
		String debil="La contraseña es debil";
		if(this.seña.length()>10 && this.seña.matches(".*[A-Z+].*")) {
		return fuerte;
		}
		else {
			return debil;
		}
		
		
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
			super.seña=seña;
		}
		
	}
	
	
	
	
	
	
	
}
