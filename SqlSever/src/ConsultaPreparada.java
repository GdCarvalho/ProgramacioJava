import java.sql.*;


public class ConsultaPreparada {

	public static void main(String[] args) {
	
		try {
			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				System.out.println("Conectado");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
			
		    Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BDTarea3;user=sa;password=123;TrustServerCertificate=True;");
			// 2. crear objeto statement
			Statement miSTD=con.createStatement();
			
		    //3. Preparar la consulta
			
			PreparedStatement miSentencia= con.prepareStatement("SELECT * FROM clientes WHERE nombre=? AND direccion=?");
			
			//4.Estableces los parametros
			
			miSentencia.setString(1, "Pedro");
			miSentencia.setString(2, "Madrid");
			
			//EJECUTAR Y RECORRER LA CONSULTA
			
			ResultSet miResul=miSentencia.executeQuery();
			
			while(miResul.next()) {
				System.out.println(miResul.getString("nombre")+" "+miResul.getString("direccion"));
				
				
			}
			
			
			
			//Reutilizacion de consulta SQL
			
			System.out.println("Ejecución segunda consulta");
			System.out.println();
			
			miSentencia.setString(1, "Carlos");
			miSentencia.setString(2, "Valencia");
			
			//EJECUTAR Y RECORRER LA CONSULTA
			
			ResultSet miResul2=miSentencia.executeQuery();
			
			while(miResul2.next()) {
				System.out.println(miResul2.getString("nombre")+" "+miResul2.getString("direccion"));
				
				
			}
			
			miResul2.close();
			
			
			
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			
		} 
		
			
		
	}



		
		
		

	}


