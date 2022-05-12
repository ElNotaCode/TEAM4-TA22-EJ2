package models.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
	public ProyectoDto readProyecto(String id) {
		ConnectionDB conexion = new ConnectionDB();
		boolean existe = false;
		
		ProyectoDto proyecto = null;
		
		try {
			String sql = "SELECT * FROM proyectos WHERE Id = '?'";
			PreparedStatement preparedStatemnt = conexion.crearConexion().prepareStatement(sql);
			preparedStatemnt.setString(1, id);
			
			ResultSet resultSet = preparedStatemnt.executeQuery();
			
			while(resultSet.next()) {
				
				existe = true;
				String nombre = resultSet.getString("Nombre");
				int horas = resultSet.getInt("Horas");
				proyecto = new ProyectoDto(id,nombre,horas);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(existe) {
			return proyecto;
		}else {
			return null;
		}
		
	}
	
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
	public void deleteProyecto(String id){
		ConnectionDB conexion = new ConnectionDB();
		try {
			Statement statement = conexion.crearConexion().createStatement();
			String sql = "DELETE FROM proyecto"
					+ "WHERE Id='"+ id +"';";
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
