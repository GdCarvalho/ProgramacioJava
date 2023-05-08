import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Utiles {
	
	//Método que recibe un string y devuelve un local date
	
	public static LocalDate stringToLocalDate(String s) {
		DateTimeFormatter formatter01=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate fechaFactura01=LocalDate.parse(s,formatter01);
		return fechaFactura01;
		
	}

}
