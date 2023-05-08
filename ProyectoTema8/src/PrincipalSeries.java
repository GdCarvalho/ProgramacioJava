import java.io.*;
public class PrincipalSeries {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Escribir datos de series en un fichero
		
		serieTV s[]=new serieTV[5];
		serieTV s1=new serieTV("breaking bad", 5);
		serieTV s2=new serieTV("the wire", 10);
		serieTV s3=new serieTV("house", 2);
		s[0]=s1;
		s[1]=s2;
		s[2]=s3;
		
		
		//Para trebajar con ficheros tenemos que definir la ruta
		String rutaApp=System.getProperty("user.dir");
		String rutaFichero=rutaApp+"\\series.txt";
		System.out.println("Directorio actual");
		System.out.println(rutaApp);
		System.out.println("Fichero de series");
		System.out.println(rutaFichero);
		
		try {
		FileWriter escritor=new FileWriter(rutaFichero,true);
		BufferedWriter bfw=new BufferedWriter(escritor);
		
		
		for(serieTV ss:s) {
			if(ss!=null) {
			bfw.write(ss.volcarfichero());
			bfw.newLine();
			}
		}
		bfw.close();
		escritor.close();
		
		
		
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
