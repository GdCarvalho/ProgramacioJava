
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class Ventana1 extends JFrame {
	//Controles:
	
	JLabel lblResultado;
	JButton btnUno,btnDos,btnTres,btnBorrar,btnRaiz,btnCuadrado;
	JTextField txtResultado;
	JRadioButton rdbAmarillo, rdbAzul, rdbVerde;
	JCheckBox chkBinario, chkDecimal;
	
	public Ventana1() {
		setTitle("Mi calculadora");
		setSize(450,700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		 inicializarComponentes();
		//Quitar el layout por defecto y ponemos los controles manualmente
		setLayout(null); //Me permite colocar los controles indicanto las coordenadas
		//Colocamos los controles
		lblResultado.setBounds(20, 20,450,20);
		txtResultado.setBounds(20,45,50,20);
		btnUno.setBounds(20, 75, 50, 20);
		btnDos.setBounds(75, 75, 50, 20);
		btnTres.setBounds(130, 75, 50, 20);
		btnBorrar.setBounds(20, 135, 150, 20);
		btnRaiz.setBounds(185, 75, 90, 30);
		btnCuadrado.setBounds(280, 75, 90, 30);
		rdbAmarillo.setBounds(20, 195, 200, 25);
		rdbVerde.setBounds(20, 230, 200, 25);
		rdbAzul.setBounds(20, 265, 200, 25);
		chkBinario.setBounds(220, 195, 100, 25);
		chkDecimal.setBounds(340, 200, 100, 25);
	   
	    
	    //Añadir componentes al JFrame
	    getContentPane().add(lblResultado);
	    getContentPane().add(btnUno);
	    add(btnDos);
	    add(btnTres);
	    add(btnBorrar);
	    add(txtResultado);
	    add(btnRaiz);
	    add(btnCuadrado);
	    add(rdbAmarillo);
	    add(rdbAzul);
	    add(rdbVerde);
	    
	    
	   //Manejador de eventos
	    btnUno.addActionListener(new EscuchadorbtnNum());
	    btnDos.addActionListener(new EscuchadorbtnNum());
	    btnTres.addActionListener(new EscuchadorbtnNum());
	    txtResultado.addActionListener(new EscuchadorEnter());
	    btnRaiz.addActionListener(new EscuchadorbtnOpe());
	    btnCuadrado.addActionListener(new EscuchadorbtnOpe());
	    rdbAmarillo.addActionListener(new EscuchadorColores());
	    rdbAzul.addActionListener(new EscuchadorColores());
	    rdbVerde.addActionListener(new EscuchadorColores());
	    
	    //Manejador de evento para boton borrar para clases anónimas
	    btnBorrar.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				txtResultado.setText("");	
			}
	    	
	    });
	    
	    
	    //Eventos del check box
	    chkBinario.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(chkBinario.isSelected()) {
					lblResultado.setText(lblResultado.getText()+" en binario");
				}
				
			}
		});
	    
     chkBinario.addMouseListener(new MouseAdapter() {
    	 @Override
    	 public void mouseEntered(MouseEvent e) {
    		 chkBinario.setForeground(Color.CYAN);
    	 }
    	 
    	 
    	 
     });
	    
	    
	    
	    
	    
	    
	    
	    
	    
		setVisible(true);
		
	}


	private void inicializarComponentes() {
		lblResultado=new JLabel("Introduce nº1:");
		txtResultado=new JTextField();
		btnUno=new JButton("1");
		btnDos=new JButton("2");
		btnTres=new JButton("3");
		btnBorrar=new JButton("Borrar");
		btnRaiz=new JButton("Raiz");
		btnCuadrado=new JButton("Cuadrado");
		rdbAmarillo=new JRadioButton("Amarillo");
		rdbVerde=new JRadioButton("Verde");
		rdbAzul=new JRadioButton("Azul");
		ButtonGroup btnGrupo=new ButtonGroup();
		btnGrupo.add(rdbAmarillo);
		btnGrupo.add(rdbAzul);
		btnGrupo.add(rdbVerde);
		
		chkBinario=new JCheckBox("Binario");
		chkDecimal=new JCheckBox("Decimal");
		
		
		
	}
	
	//Clases gestoras de eventos
	class EscuchadorbtnNum implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			//Obtenr el botón que ha sido pulsado
			JButton btnPulsado = (JButton)e.getSource();
			//Queremos volcar el txtResultado el texto del boton que fue pulsado
			txtResultado.setText(txtResultado.getText()+btnPulsado.getText());
			
		}	
		
	}
	
	class EscuchadorEnter implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			txtResultado.setText("");
			lblResultado.setText("Introduce nº 2");
			
		}
		
	}
	
	class EscuchadorbtnOpe implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton btnPulsar = (JButton)e.getSource();
			if(btnPulsar.getText().equals("Raiz")) {
				double numero=Double.parseDouble(txtResultado.getText());
				double raiz=Math.sqrt(numero);
				txtResultado.setText(Double.toString(raiz));
			}
			else if(btnPulsar.getText().equals("Cuadrado")) {
				double numero=Double.parseDouble(txtResultado.getText());
				double cuadrado=Math.pow(numero,2);
				txtResultado.setText(Double.toString(cuadrado));
				
			}
			
		}
		
		
	}
	
	class EscuchadorColores implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(rdbAmarillo.isSelected()) {
				txtResultado.setBackground(Color.YELLOW);
			}
			else if(rdbAzul.isSelected()) {
				txtResultado.setBackground(Color.BLUE);
			}
			else {
				txtResultado.setBackground(Color.GREEN);
			}
		}
		
		
		
	}
	
	
	
	

}
