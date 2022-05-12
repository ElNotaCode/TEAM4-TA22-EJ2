package controller;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.PublicKey;

import javax.swing.JOptionPane;

import models.dao.AsignadoDao;
import models.dao.CientificosDao;
import models.dao.ProyectoDao;
import models.dto.AsignadoDto;
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
	private AsignadoDao asignadodao;
	private AsignadoDto asignado;


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
		this.vista.textProyectoEditarEliminar.addActionListener(this);
		this.vista.btnEditarProyecto.addActionListener(this);
		this.vista.btnGuardarP.addActionListener(this);
		this.vista.btnEliminarProyecto.addActionListener(this);
		this.vista.btnSalir.addActionListener(this);
		this.vista.btnAbout.addActionListener(this);
		this.vista.btnListarProyecto.addActionListener(this);
		this.vista.btnGuardarCientifico.addActionListener(this);
		this.vista.btnEliminar.addActionListener(this);
		this.vista.btnListar.addActionListener(this);

		


		vista.setVisible(true);
	
		

	}
	
	
	
	
	
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()== this.vista.btnGuardarCientificos) {
			System.out.println("Guardar Cientificos");

		crearcientifico = new CientificosDto(vista.textDNI.getText(), vista.textNomApels.getText());
		
	    cientificos.createCientifico(crearcientifico);
		//svservice.validarCreate(crearcientifico);
		
		
		}
		
		if(e.getSource() == this.vista.btnGuardarProyecto) {
			String horas =  vista.textHoras.getText();
			crearproyecto = new  ProyectoDto(vista.textFieldID.getText(), vista.textNombre.getText(),horas);
			proyecto.createProyecto(crearproyecto);
			System.out.println("Guardar Proyecto");

			//
		}
		
				
		
		if(e.getSource() == this.vista.btnGuardarAsignado_A) {
			//textAsignadoCientifico
			//textAsignadoProyecto
			
			AsignadoDto asignado = new AsignadoDto(vista.textAsignadoCientifico.getText(),vista.textAsignadoProyecto.getText());
			asignadodao.createAsignado(asignado);
			System.out.println("Insertar Proyecto");

			
		}
		
		
		
		
		
		
		//Editar
		
		if(e.getSource() == this.vista.btnEditar) {
			
			String dnimandado = "";
			String textNomApels = "";
			
			System.out.println("Dentro de editar");

			
			//Mandar  dni
			CientificosDto cientifico =  cientificos.readCientifico(vista.textCientificosEditarEliminar.getText());
			
			
			
			System.out.println(cientifico.toString());
				
			
			
			//mostrar los campos de ese DNI con el  objeto devuelto
		
			//set
			dnimandado = cientifico.getDni();
			vista.textDNI.setText(cientifico.getDni());
			textNomApels = cientifico.getNomApels();
			vista.textNomApels.setText(cientifico.getNomApels());
			
				
		}
		
		
		
		if(e.getSource() == this.vista.btnEditarProyecto) {
			
			
			System.out.println("Dentro de editar");

			
			//Mandar  dni
			ProyectoDto proyectos =  proyecto.selectOne(vista.textProyectoEditarEliminar.getText());
			
			
			
			System.out.println(proyectos.toString());
				
			
			
			//mostrar los campos de ese DNI con el  objeto devuelto
		
			//set
			vista.textFieldID.setText(proyectos.getId());
			vista.textNombre.setText(proyectos.getNombre());
			vista.textHoras.setText(proyectos.getHoras());

		}
		
	
		
		if(e.getSource() == this.vista.btnEditarAsignado_A) {
			//
			//
		}
		
		
		if(e.getSource() == this.vista.btnGuardarP) {
			
			
			ProyectoDto proyectos = new ProyectoDto(vista.textFieldID.getText(),vista.textNombre.getText(),vista.textHoras.getText());

			proyecto.updateProyecto(proyectos);
			
			
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
		
		
	if(e.getSource() == this.vista.btnGuardarCientifico) {
			
			
		CientificosDto cientifico= new CientificosDto(vista.textDNI.getText(),vista.textNomApels.getText());

			cientificos.updateCientifico(cientifico);;
			
			//vaciamos todos los campos
			vista.textDNI.setText("");
			vista.textNomApels.setText("");

			
		}
		
		
		
		
		//About
		
		if(e.getSource() == this.vista.btnAbout) {
			
			
			
			JOptionPane.showMessageDialog(null, " Team 4 "); 
			
		}
		
		
		
		
		//salir
		
		if(e.getSource() == this.vista.btnSalir) {
			
			
			
	         System.exit(0); 
			
		}
		
		
		//btnListarProyecto
		if(e.getSource() == this.vista.btnListarProyecto) {
			
			ProyectoDto proyect = proyecto.selectOne(vista.textProyectoEditarEliminar.getText());
			String cliente = "";
			cliente += proyect.getId();
			cliente += proyect.getNombre();
			cliente += proyect.getHoras();
			vista.textFieldTProyectos.setText(cliente);
			
		}
		
		
		//btnListar
		
		if(e.getSource() == this.vista.btnListar) {
			
			
			CientificosDto clienteDto = cientificos.readCientifico(vista.textCientificosEditarEliminar.getText());
			String cliente = "";
			cliente += clienteDto.getDni();
			cliente += clienteDto.getNomApels();
			
			vista.textFieldTCientificos.setText(cliente);
			
			
		}
		
	}

}
