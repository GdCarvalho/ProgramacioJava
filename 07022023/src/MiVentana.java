import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JComboBox;

public class MiVentana extends JFrame {

	private JPanel contentPane;
	private JTextField textGuardarDNI;
	
	//VARIABLES NO GRÁFICAS
	private ArrayList<String> dnis;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiVentana frame = new MiVentana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	
	public MiVentana() {
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		dnis=new ArrayList<String>(20);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDNI = new JLabel("Intruduzca DNI");
		lblDNI.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDNI.setBounds(42, 29, 115, 22);
		contentPane.add(lblDNI);
		//Etiqueta que muestra error en el dni
		JLabel lblErrorDNI = new JLabel("Error en el formato");
		lblErrorDNI.setForeground(new Color(255, 128, 0));
		lblErrorDNI.setVisible(false);
		lblErrorDNI.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblErrorDNI.setBounds(292, 35, 104, 13);
		contentPane.add(lblErrorDNI);
		
		//Etiqueta combobox
         JComboBox cmbDNISGuardados = new JComboBox();
		cmbDNISGuardados.setBounds(113, 115, 104, 21);
		contentPane.add(cmbDNISGuardados);
		
		
		
		
		
		
		//FIN DE ETIQUETA
		
		JButton btnGuardarDNI = new JButton("Guardar DNI");
		btnGuardarDNI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dni=textGuardarDNI.getText();
				//Validar formado
				if(dni.length()==9) {
					dnis.add(dni);
					textGuardarDNI.setText("");
					cmbDNISGuardados.addItem(dni);
					JOptionPane.showMessageDialog(getContentPane(),"DNI guardado correctamente");
				}
				else {
					lblErrorDNI.setVisible(true);
				}
				
			}
		});
		btnGuardarDNI.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnGuardarDNI.setBounds(113, 61, 126, 21);
		contentPane.add(btnGuardarDNI);
		
		textGuardarDNI = new JTextField();
		textGuardarDNI.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
			}
		});
		textGuardarDNI.setBounds(167, 32, 96, 19);
		contentPane.add(textGuardarDNI);
		textGuardarDNI.setColumns(10);
		
		
		
		
	}
}
