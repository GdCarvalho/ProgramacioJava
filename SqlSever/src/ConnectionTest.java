import java.sql.*;


public class ConnectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				System.out.println("Conectado");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
			
			//String ip="DESKTOP-L6FO2OI";
			//String puerto="1433";
			//String bd="BDTarea3";
			
		   // String connectionUrl = "jdbc:sqlserver://localhost:1433/BDTarea3";  
		
			
		    String usuario="giosql";
		    String sena="root";
			// 1. crear conexión
			//Connection con = DriverManager.getConnection(connectionUrl+usuario+sena);
		    
		   // jdbc:sqlserver://localhost\\BD_MONTECASTELO:1433;databaseName=JDBC;user=sa;password=montecastelo
		    
		    Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BDTarea3;user=sa;password=123;TrustServerCertificate=True;");
			// 2. crear objeto statement
			Statement miSTD=con.createStatement();
			//3.ejecutar sql
			
			ResultSet miResul=miSTD.executeQuery("SELECT * FROM clientes" );
			
			//4.Recorrer el resulSet, para leerlo
			
			while(miResul.next()) {
				System.out.println(miResul.getString("nombre"));
				
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			
		} 

	}

}
