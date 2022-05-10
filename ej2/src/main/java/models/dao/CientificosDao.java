package models.dao;

import java.sql.SQLException;
import java.sql.Statement;

import models.conexion.ConnectionDB;
import models.dto.CientificosDto;

public class CientificosDao {
	
	//CREATE
	//createCientifico, le pasamos por parametro un objeto cientifico
	public void createCientifico(CientificosDto cientifico) {
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
				//statement close
				statement.close();
				//close conexion
				conexion.closeConnection();
				//TODO: informamos de que se ha insertado correctamente
			} catch (SQLException e) {
				// TODO: informamos de que NO se ha insertado correctamente
				//pasamos el error por consola
				System.out.println(e.getMessage());
			}
		
	}
	
	//TODO: READ
	
	
	//UPDATE
	//también se podría hacer con REPLACE?
	public void updateCientifico(CientificosDto cientifico) {
		
		ConnectionDB conexion = new ConnectionDB();
		
		try {
			Statement statement = conexion.crearConexion().createStatement();
			String sql = "UPDATE cientificos SET"
					+ "DNI='" + cientifico.getDni() + "',"
					+ "NomApels='" + cientifico.getNomApels()+"'"
					+ "WHERE DNI='"+cientifico.getDni()+"';";
			statement.execute(sql);
			statement.close();
			conexion.closeConnection();
			//TODO: informamos de que se ha actualizado correctamente
		} catch (Exception e) {
			// TODO: handle exception
			//pasamos el error por consola
			System.out.println(e.getMessage());
		}
		
	}
	
	//TODO: DELETE
	public void deleteCientifico(CientificosDto cientifico) {
		
		ConnectionDB conexion = new ConnectionDB();
		
		try {
			Statement statement = conexion.crearConexion().createStatement();
			String sql = "DELETE FROM cientificos "
					+ "WHERE DNI='"+cientifico.getDni()+"';";
			statement.execute(sql);
			statement.close();
			conexion.closeConnection();
			//TODO: informamos de que se ha deleteado correctamente
		} catch (Exception e) {
			// TODO: handle exception
			//pasamos el error por consola
			System.out.println(e.getMessage());
		}
		
	}
	
}
