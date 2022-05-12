package com.TEAM4_TA22.ej2Main;


import controller.Controller;
import models.conexion.ConnectionDB;
import models.dao.CientificosDao;
import models.dao.ProyectoDao;
import vista.Vista;

/**
 * Hello world!
 *
 */
public class MainApp 
{
    public static void main( String[] args )
    {
    	
    	Vista vista = new Vista();
    	CientificosDao cientificos = new CientificosDao(); ;
    	ProyectoDao proyecto =  new ProyectoDao(); 
    	
    	Controller controller = new Controller(vista,cientificos,proyecto);
    	
    	
        
    }

}
