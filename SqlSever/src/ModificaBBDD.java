import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ModificaBBDD {

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
			
		    Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BDTarea3;user=sa;password=123;TrustServerCertificate=True;");
			// 2. crear objeto statement
			Statement miSTD=con.createStatement();
			
			//Insertar la instruccion SQL 
			
			String instruccionSQL="INSERT INTO clientes (id, nombre,direccion) VALUES(11, 'Alex', 'Vigo')";
			
			//Ejecutar la instruccion SQL
			
			
			miSTD.executeUpdate(instruccionSQL);
			
			System.out.println("Datos insertados correctamente");
			
			//Modificar la informacion
			
			String instruccionSQL2="UPDATE clientes set correo_electronico='alex@gmail.com' WHERE id='11'";
			
			miSTD.executeUpdate(instruccionSQL2);
			
			System.out.println("Datos modificados correctamente");
			
			//ELIMINAR informacion
			
          String instruccionSQL3="DELETE FROM clientes WHERE id='11'";
			
			miSTD.executeUpdate(instruccionSQL3);
			
			System.out.println("Datos eliminados correctamente");
			
				
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			
		} 
		
			
		
	}

}
