package models.dao;

import java.sql.SQLException;
import java.sql.Statement;

import models.conexion.ConnectionDB;
import models.dto.CientificosDto;

public class CientificosDao {
	
	//CREATE
	//insertarCientifico, le pasamos por parametro un objeto cientifico
	public void insertarCientifico(CientificosDto cientifico) {
		//accedemos a la base de datos
		ConnectionDB conexion = new ConnectionDB();
		
			try {
				//creamos statement
				Statement statement = conexion.crearConexion().createStatement();
				//creamos la query y las variables las rellenamos con los getters del objeto
				String sql = "INSERT INTO cientificos(DNI,NomApels) VALUES"
						+ "('"+cientifico.getDni()+"'),('"+cientifico.getNomApels()+"');";
				//la ejecutamos
				statement.executeUpdate(sql);
				//TODO: informamos de que se ha insertado correctamente
						
				//statement close
				statement.close();
				//close conexion
				conexion.closeConnection();
						
			} catch (SQLException e) {
				// TODO: informamos de que NO se ha insertado correctamente
				//pasamos el error por consola
				System.out.println(e.getMessage());
			}
		
	}
	
	//TODO: READ
	
	
	//TODO: UPDATE
	
	
	//TODO: DELETE

}
