package com.TEAM4_TA22.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.PublicKey;

import models.dao.CientificosDao;
import models.dao.ProyectoDao;
import models.dto.CientificosDto;
import models.dto.ProyectoDto;
import views.MenuPrincipal;
import vista.Vista;

public class Controller implements ActionListener {
	
	//instnciamos la vista y los Dao 	
	private CientificosDao cientificos;
	private ProyectoDao proyecto; 
	private CientificosDto crearcientifico;
	private ProyectoDto crearproyecto;

	private Vista vista; 
	
	
	public Controller(Vista vista,CientificosDao cientificos,ProyectoDao proyecto) {
		this.vista = vista;
		this.cientificos=cientificos;
		this.proyecto=proyecto;
		this.vista.btnGuardarCientificos.addActionListener(this); //para activarle un listenner
		this.vista.btnGuardarProyecto.addActionListener(this);
		this.vista.btnGuardarAsignado_A.addActionListener(this);
		
		vista.setVisible(true);
	
		
	}
	
	
	
	
	
	private void btnGuardarCientifico() {
		
		CientificosDto cientifico = new CientificosDto(null, null);

	
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

			//
		}
		
		
		if(e.getSource() == this.vista.btnGuardarAsignado_A) {
			//
			//
		}
		
		
		
	}

}
