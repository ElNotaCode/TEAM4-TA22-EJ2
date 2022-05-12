package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.PublicKey;

import javax.swing.JOptionPane;

import models.dao.CientificosDao;
import models.dao.ProyectoDao;
import models.dto.CientificosDto;
import models.dto.ProyectoDto;
import models.services.CientificoService;
import vista.Vista;

public class Controller implements ActionListener {
	
	//instnciamos la vista y los Dao 	
	private CientificosDao cientificos;
	private ProyectoDao proyecto; 
	private CientificosDto crearcientifico;
	private ProyectoDto crearproyecto;
	CientificoService svservice = new CientificoService();

	private Vista vista; 
	
	
	public Controller(Vista vista,CientificosDao cientificos,ProyectoDao proyecto) {
		this.vista = vista;
		this.cientificos=cientificos;
		this.proyecto=proyecto;
		this.vista.btnGuardarCientificos.addActionListener(this); //para activarle un listenner
		this.vista.btnGuardarProyecto.addActionListener(this);
		this.vista.btnGuardarAsignado_A.addActionListener(this);
		this.vista.btnEditar.addActionListener(this);
		this.vista.btnEliminar.addActionListener(this);
		this.vista.btnGuardarCientifico.addActionListener(this);
		this.vista.btnListar.addActionListener(this);
		this.vista.btnAbout.addActionListener(this);
		this.vista.btnSalir.addActionListener(this);

		
		

		
		
		vista.setVisible(true);
	
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()== this.vista.btnGuardarCientificos) {
			System.out.println("Guardar Cientificos");
			crearcientifico = new CientificosDto(vista.textDNI.getText(), vista.textNomApels.getText());
		    cientificos.createCientifico(crearcientifico);
		
		
		}
		
		if(e.getSource() == this.vista.btnGuardarProyecto) {
			int horas =  Integer.parseInt(vista.textHoras.getText());
			crearproyecto = new  ProyectoDto(vista.textFieldID.getText(), vista.textNombre.getText(),horas);
			proyecto.createProyecto(crearproyecto);
			System.out.println("Guardar Proyecto");

		}
		
		
		if(e.getSource() == this.vista.btnGuardarAsignado_A) {
			//
			//
		}
		
		//Mostrar los datos al editar
		
		if(e.getSource() == this.vista.btnEditar) {
			
			String dnimandado = "";
			String textNomApels = "";
			
			System.out.println("Dentro de editar");

			//Mandar  dni
			CientificosDto cientifico =  cientificos.readCientifico(vista.textCientificosEditarEliminar.getText());
										
			//mostrar los campos de ese DNI con el  objeto devuelto
		
			//set
			dnimandado = cientifico.getDni();
			vista.textDNI.setText(cientifico.getDni());
			textNomApels = cientifico.getNomApels();
			vista.textNomApels.setText(cientifico.getNomApels());
			

		}
		
		
		//update
		if(e.getSource() == this.vista.btnGuardarCientifico) {
			
			CientificosDto cientifico = new CientificosDto(vista.textDNI.getText(), vista.textNomApels.getText());
			cientificos.updateCientifico(cientifico);
		}
		
		
		
		if(e.getSource() == this.vista.btnEditarProyecto) {
			
			//proyecto.updateProyecto(crearproyecto);

		}
		
	
		
		if(e.getSource() == this.vista.btnEditarAsignado_A) {
			//
			//
		}
		
		
		//listar cientifio
		if(e.getSource() == this.vista.btnListar) {
			
			String dnimandado = "DNI ";
			String textNomApels = " NOMBREAPELLIDO";
			
			String stringCientifico = "";
			
			CientificosDto cientifico  = cientificos.readCientifico(vista.textCientificosEditarEliminar.getText());
			
			
			//set
			stringCientifico += cientifico.getDni()+" ";
			stringCientifico += cientifico.getNomApels();
			
			vista.textFieldTCientificos.setText(stringCientifico);

			
			//
			//
		}
		
		
		
		
		//Eliminar id
		
		if(e.getSource() == this.vista.btnEliminar) {
			
			//enviamos el dni 
			cientificos.deleteCientifico(vista.textCientificosEditarEliminar.getText());
			
			//vaciamos todos los campos
			vista.textDNI.setText("");
			vista.textNomApels.setText("");
			vista.textCientificosEditarEliminar.setText("");

			
		}
		
		if(e.getSource() == this.vista.btnEliminarProyecto) {
			
			
			//enviamos el id 
			proyecto.deleteProyecto(vista.textProyectoEditarEliminar.getText());
			
			//vaciamos todos los campos
			vista.textFieldID.setText("");
			vista.textNombre.setText("");
			vista.textHoras.setText("");
			vista.textProyectoEditarEliminar.setText("");

			
		}
		
		
		//About
		
		if(e.getSource() == this.vista.btnAbout) {
			
			
			
			JOptionPane.showMessageDialog(null, " Team 4 "); 
			
		}
		
		
		
		
		
		//salir
		
		if(e.getSource() == this.vista.btnSalir) {
			
			
			
	         System.exit(0); 
			
		}
		
	}

}
