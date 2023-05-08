
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MiVentana1 extends JFrame implements ActionListener, MouseListener {
//Creamos una clase de tipo jframe
	
//Declaramos componentes(menús, imagenes, listas, botones):
	JButton btnEuros, btnDolares, btnBorrar; //Esto es un botón
	JLabel lblEuros, lblDolares;//Esto es una etiqueta
	JTextField txtEuros, txtDolares; //Esto es un texto
	
	//Fin de declaración de componentes
	
	//Declaración de constructores
	
	public MiVentana1() {
		//Establezco las propiedades de la ventana(tamaño, posicion, colores, títulos)
		//título
		this.setTitle("Mi primera ventana");
		
		//Establecer tamaño de ventana independiente de la pantalla
		Toolkit tl=Toolkit.getDefaultToolkit();
		Dimension tamanho= tl.getScreenSize();
		int ancho =tamanho.width;
		int alto= tamanho.height;
		//cambiar la localización de la ventana
		this.setSize(ancho/2, alto/2);
		this.setLocation(ancho/4, alto/4);
		
		
		
		//Configuramos la X de cerrar para que ciere la ventana y que termine el programa, si no lo hacemos, el programa seguirá ejecutandose.
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	
		
		
		//Inicialización de componentes de la ventana
		inicializarComponentes();
		
		
		
	    //Añadir los controles ->Por defecto es el borderLayout (uno encima de otros)
	//	getContentPane().add(lblEuros, BorderLayout.NORTH);
	//	getContentPane().add(txtEuros,BorderLayout.CENTER);
	//	getContentPane().add(btnEuros,BorderLayout.SOUTH);
		
		//Establecemos el FlowLayout que distribuye los controles de izq a derecha si tiene espacio. Si no tiene espacio los distribuye de arriba abajo.
		setLayout(new FlowLayout());
		
		//Eliminar el layout y añadir las posiciones de los componentes con el método setBOud
		setLayout(null);
		lblEuros.setBounds(50, 20, 50, 30);
		lblDolares.setBounds(140, 20, 50, 30);
		txtEuros.setBounds(50, 55,80, 20);
		txtDolares.setBounds(140, 55, 80, 20);
		btnEuros.setBounds(60, 90,90 ,30);
		btnDolares.setBounds(190, 90,130 ,30);
		btnBorrar.setBounds(330, 90,130 ,30);
		
		getContentPane().add(lblEuros);
		getContentPane().add(txtEuros);
		getContentPane().add(btnEuros);
		getContentPane().add(btnDolares);
		getContentPane().add(txtDolares);
		getContentPane().add(lblDolares);
		getContentPane().add(btnBorrar);
		
		//Asociar escuchadoes
		btnEuros.addActionListener(this);
		btnDolares.addActionListener(new EscuchadorBoton()); //este para clik del ratón
		txtDolares.addMouseListener(this);
		txtDolares.addActionListener(new EscuchadorBoton()); //Si el user le da a enter igual que le da al click del mouse
		txtEuros.addActionListener(this);
		btnBorrar.addActionListener(new EscuchadorBotonBorrar());
		
		this.setVisible(true); //Siempre se hace para que se vea la ventana, si no estará oculta.	
		
		
		
		
		
		
		
	}
	
	private void inicializarComponentes() {
		lblEuros =new JLabel("Euros:");
		lblDolares =new JLabel("Dolares:");
		txtEuros=new JTextField(10); //nº de caracteres visibles
		txtDolares=new JTextField(10); //nº de caracteres visibles
		//txtEuros.setText("Euros");
	    txtEuros.setToolTipText("Euros");
		btnEuros=new JButton("Convertir en dolares");
	    btnDolares = new JButton("Convertir en euros:");
	    btnBorrar =new JButton ("Borrar datos.");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//Aquí programamos que el programa pase a dolares
		//Obtener el valor escrito en txt euros
		float euros=Float.parseFloat(txtEuros.getText());
		float dolares=euros*0.92f;
		txtDolares.setText(Float.toString(dolares));	
	}
	
	//Creamos una clase interna para poder programar el otro boton
	class EscuchadorBoton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			float dolares = Float.parseFloat(txtDolares.getText());
			float euros= dolares/0.92f;
			txtEuros.setText(Float.toString(euros));
			
		}
		
		
	}
	class EscuchadorBotonBorrar implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			txtEuros.setText("");
			txtDolares.setText("");
			
		}	
	}
	
	
	//Fin clases internas//
	

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		this.txtDolares.setForeground(Color.BLUE);
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		this.txtDolares.setForeground(Color.BLACK);
		
	}

	
	
	
	
	
}
