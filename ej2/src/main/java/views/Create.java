package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Create extends JFrame {

	private JPanel contentPane;

	/**
	 * Create the frame.
	 */
	public Create() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAnuncioCreate = new JLabel("La Base de Datos " + "nombreBD" + " ha sido creada.");
		lblAnuncioCreate.setBounds(10, 10, 245, 13);
		contentPane.add(lblAnuncioCreate);
		
		JLabel lblNewLabel = new JLabel("La Tabla " + "nombreTabla" + " ha sido creada.");
		lblNewLabel.setBounds(10, 33, 245, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("La Tabla " + "nombreTabla" + " ha sido creada.");
		lblNewLabel_1.setBounds(10, 56, 245, 13);
		contentPane.add(lblNewLabel_1);
		
		JButton btnReturn = new JButton("Return to Menu CRUD");
		btnReturn.setBounds(10, 93, 176, 21);
		contentPane.add(btnReturn);
	
	}
}
