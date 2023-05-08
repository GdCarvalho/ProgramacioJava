import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class lecturaFichero {

	public static void main(String[] args) {
		// En principio el fichero tiene que existir
		//Recuperar toda la info del fichero a una matriz de series
		String rutaApp=System.getProperty("user.dir");
		String rutaFichero=rutaApp+"\\series.txt";
		
		
		serieTV ss[]= new serieTV[10];
		try {
			FileReader lector=new FileReader(rutaFichero);
			BufferedReader bfr=new BufferedReader(lector);
			String registro=bfr.readLine();
			int i=0;
			while(registro!=null) {
				String datos[]=registro.split("#");
				serieTV s1=new serieTV(datos[0],Float.parseFloat(datos[1]));
				ss[i]=s1;
				i++;
				registro=bfr.readLine();
				
			}
			
			for(serieTV sr:ss) {
				if(sr!=null) {
					System.out.println(sr.volcarfichero());
					
				}
			}
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Fichero no existe");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error acceso al fichero");
		}
		
		
		

	}

}
