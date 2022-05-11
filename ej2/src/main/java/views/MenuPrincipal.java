package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class MenuPrincipal extends JFrame {
	public JButton btnCreate = new JButton("Create");
	public static JButton btnRead = new JButton("Read");
	public static JButton btnUpdate = new JButton("Update");
	public static JButton btnDelete = new JButton("Delete");
	public static JButton btnAbout = new JButton("About");
	public static JButton btnExit = new JButton("Exit");

	
	public MenuPrincipal() {
		getContentPane().setLayout(null);
		
		btnCreate.setBounds(10, 10, 85, 21);
		getContentPane().add(btnCreate);
		
		btnRead.setBounds(10, 41, 85, 21);
		getContentPane().add(btnRead);
		
		btnUpdate.setBounds(10, 72, 85, 21);
		getContentPane().add(btnUpdate);
		
		btnDelete.setBounds(10, 103, 85, 21);
		getContentPane().add(btnDelete);
		
		btnAbout.setBounds(10, 134, 85, 21);
		getContentPane().add(btnAbout);
		
		btnExit.setBounds(10, 165, 85, 21);
		getContentPane().add(btnExit);
	}

	
	
}
