package models.dao;

import java.sql.SQLException;
import java.sql.Statement;

import models.conexion.ConnectionDB;
import models.dto.ProyectoDto;

public class ProyectoDao {
	
	//CREATE
	public void createProyecto(ProyectoDto proyecto){
		ConnectionDB conexion = new ConnectionDB();
		
			try {
				Statement statement = conexion.crearConexion().createStatement();
				String sql = "INSERT INTO proyecto(Id,Nombre,Horas) VALUES"
						+ "('"+ proyecto.getId()+"','"+ proyecto.getNombre() + "',"+ proyecto.getHoras() +");";
				statement.executeUpdate(sql);
				statement.close();
				conexion.closeConnection();
				//TODO: informamos de que se ha insertado correctamente
			} catch (SQLException e) {
				// TODO: informamos de que NO se ha insertado correctamente
				//pasamos el error por consola
				System.out.println(e.getMessage());
			}
	}
	
	//READ
	
	//UPDATE
	public void updateProyecto(ProyectoDto proyecto){
		ConnectionDB conexion = new ConnectionDB();
		try {
			Statement statement = conexion.crearConexion().createStatement();
			String sql = "UPDATE proyecto SET"
					+ "Id='"+proyecto.getId()+"',"
					+ "Nombre='"+proyecto.getNombre()+"',"
					+ "Horas="+proyecto.getHoras()+""
					+ "WHERE Id='"+proyecto.getId()+"';";
			statement.executeUpdate(sql);
			statement.close();
			conexion.closeConnection();
			//TODO: informamos de que se ha insertado correctamente
		} catch (SQLException e) {
			// TODO: informamos de que NO se ha insertado correctamente
			//pasamos el error por consola
			System.out.println(e.getMessage());
		}
	}
	
	//DELETE
	public void deleteProyecto(String dni){
		ConnectionDB conexion = new ConnectionDB();
		try {
			Statement statement = conexion.crearConexion().createStatement();
			String sql = "DELETE FROM proyecto"
					+ "WHERE Id='"+ dni +"';";
			statement.executeUpdate(sql);
			statement.close();
			conexion.closeConnection();
			//TODO: informamos de que se ha insertado correctamente
		} catch (SQLException e) {
			// TODO: informamos de que NO se ha insertado correctamente
			//pasamos el error por consola
			System.out.println(e.getMessage());
		}
	}

}
