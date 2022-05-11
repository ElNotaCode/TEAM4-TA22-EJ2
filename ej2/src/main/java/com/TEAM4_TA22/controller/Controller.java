package com.TEAM4_TA22.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.PublicKey;

import models.dao.CientificosDao;
import models.dao.ProyectoDao;
import models.dto.CientificosDto;
import views.MenuPrincipal;

public class Controller implements ActionListener {
	
		
	private CientificosDao cientificos;
	private ProyectoDao proyecto; 
	private MenuPrincipal menu; 
	
	
	public Controller(MenuPrincipal menu,CientificosDao cientificos,ProyectoDao proyecto) {
		this.menu = menu;
		this.cientificos=cientificos;
		this.proyecto=proyecto;
		this.menu.btnCreate.addActionListener(this);
	
		
	}
	
	
	
	
	
	private void btnGuardarCientifico() {
		
		CientificosDto cientifico = new CientificosDto(null, null);

	
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		CientificosDto cientifico = new CientificosDto(null, null);


		
		
	}

}
