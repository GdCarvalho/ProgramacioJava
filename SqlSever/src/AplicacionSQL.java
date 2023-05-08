import javax.swing.*;

import java.awt.*;
import java.sql.*;
import java.awt.event.*;



public class AplicacionSQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame mimarco=new Marco_app();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
	}
}
		
	
		 class Marco_app extends JFrame {
		    private JComboBox secciones, paises;
		    private JTextArea resultado;
		    private PreparedStatement enviaConsultaCliente;
		    private final String consultaCliente="SELECT correo_electronico from clientes where clientes=? "; 
            private Connection con;
		    public Marco_app() {
		        setTitle("Consulta BBDD");
		        setBounds(500, 300, 400, 400);
		        setLayout(new BorderLayout());
		        JPanel menu = new JPanel();
		        menu.setLayout(new FlowLayout());

		        secciones = new JComboBox();
		        secciones.setEditable(false);
		        secciones.addItem("Todos");

		        paises = new JComboBox();
		        paises.setEditable(false);
		        paises.addItem("Todos");

		        resultado = new JTextArea(4, 50);
		        resultado.setEditable(false);

		        add(resultado);
		        menu.add(secciones);
		        menu.add(paises);
		        add(menu, BorderLayout.NORTH);
		        add(resultado, BorderLayout.CENTER);

		        JButton botonConsulta = new JButton("Consulta");
		        
		        botonConsulta.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						ejecutaConsulta();
						
						
					}
		        	
		        	
		        });
		        
		        
		        add(botonConsulta, BorderLayout.SOUTH);
		        
		        
		        
		        
		        
		setVisible(true);
		
		//CONEXION CON BASE DE DATOS
		
		try {
		
			
		  con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=BDTarea3;user=sa;password=123;TrustServerCertificate=True;");
		 // 2. crear objeto statement
		 			Statement sentencia=con.createStatement();
		 			String consulta="SELECT nombre from clientes";
		 			
		 			
		 //Construccion de resulset
		 			ResultSet rs=sentencia.executeQuery(consulta);
		 			
		 			
		 			while (rs.next()) {
		 				secciones.addItem(rs.getString(1));
		 			}
		 			rs.close();
		 			
		 			//consulta para direcciones
		 			
		 			 consulta="SELECT distinct direccion from clientes";
		 			 rs=sentencia.executeQuery(consulta);
		 			 			
		 			 			
		 				while (rs.next()) {
		 			 				paises.addItem(rs.getString(1));
		 			 			}
		 			 			rs.close();
		 			
		 			
		 			
		 			
		 			
		 			
		 			
		 			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} 
		
	   
		    
		    
		    
		    
		    
		
		
		
		    }
		    
		    private  void ejecutaConsulta() {
		    	ResultSet rs=null;
		    	
		    	try {
		    		String cliente=(String) secciones.getSelectedItem();
		    		
		    		enviaConsultaCliente=con.prepareStatement(consultaCliente);
		    		
		    		enviaConsultaCliente.setString(1, cliente);
		    		
		    		rs=enviaConsultaCliente.executeQuery();
		    		
		    		while(rs.next()) {
			    		
		    			resultado.append(rs.getString(3));
		    			
		    			resultado.append("\n");
			    		
			    		
			    	}
		    		
		    		
		    	}catch(Exception e) {
		    		
		    	}
		    	
		    	
		    	
		    	
		    	
		    }
		    
		    
		    
		}
	
