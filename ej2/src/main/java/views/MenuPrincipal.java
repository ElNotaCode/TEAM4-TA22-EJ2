package views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class MenuPrincipal extends JFrame {
	public MenuPrincipal() {
		getContentPane().setLayout(null);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.setBounds(10, 10, 85, 21);
		getContentPane().add(btnCreate);
		
		JButton btnRead = new JButton("Read");
		btnRead.setBounds(10, 41, 85, 21);
		getContentPane().add(btnRead);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(10, 72, 85, 21);
		getContentPane().add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(10, 103, 85, 21);
		getContentPane().add(btnDelete);
		
		JButton btnAbout = new JButton("About");
		btnAbout.setBounds(10, 134, 85, 21);
		getContentPane().add(btnAbout);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(10, 165, 85, 21);
		getContentPane().add(btnExit);
	}

	
	
}
