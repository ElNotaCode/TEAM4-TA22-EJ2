package models.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import models.conexion.ConnectionDB;
import models.dto.ProyectoDto;

public class ProyectoDao {

	// CREATE
	public void createProyecto(ProyectoDto proyecto) {
		ConnectionDB conexion = new ConnectionDB();
		try {
			Statement statement = conexion.crearConexion().createStatement();
			String sql = "INSERT INTO proyecto(Id,Nombre,Horas) VALUES" + "('" + proyecto.getId() + "','"
					+ proyecto.getNombre() + "'," + proyecto.getHoras() + ");";
			statement.executeUpdate(sql);
			statement.close();
			conexion.closeConnection();
			// TODO: informamos de que se ha insertado correctamente
		} catch (SQLException e) {
			// TODO: informamos de que NO se ha insertado correctamente
			// pasamos el error por consola
			System.out.println(e.getMessage());
		}
	}

	// Mostrar solo 1

	public ProyectoDto selectOne(String id) {
		ConnectionDB conexion = new ConnectionDB();

		ProyectoDto proyecto = new ProyectoDto();

		try {
			Statement statement= conexion.crearConexion().createStatement();
			String Querydb = "USE clientevideo;";
			statement.executeUpdate(Querydb);
			String Query = "SELECT *  FROM proyecto WHERE id ='" + id + "';";
			;
			System.out.println(Query);
			Statement st = conexion.crearConexion().createStatement();
			java.sql.ResultSet resultSet;
			resultSet = st.executeQuery(Query);

			while (resultSet.next()) {
				

				// Necesto recibir el resultado de la consulta.

				String idSelect = resultSet.getString("id");
				String nombreSelect = resultSet.getString("nombre");
				String horasSelect = resultSet.getString("horas");

				proyecto = new ProyectoDto(idSelect, nombreSelect, horasSelect);
			}

			System.out.println(proyecto);
			statement.close();
			conexion.closeConnection();
			System.out.println("Select Correcto!");
			return proyecto;

		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println("Select Incorrecto!");
			System.out.println(e);
			return null;

		}
	}

	// UPDATE
	public void updateProyecto(ProyectoDto proyecto) {
		ConnectionDB conexion = new ConnectionDB();
		try {
			Statement statement = conexion.crearConexion().createStatement();
			String sql = "UPDATE proyecto SET " + "Id='" + proyecto.getId() + "'," + "Nombre='" + proyecto.getNombre()
					+ "'," + "Horas='" + proyecto.getHoras() + "'" + " WHERE Id='" + proyecto.getId() + "';";
			System.out.println(sql);
			statement.executeUpdate(sql);
			statement.close();
			conexion.closeConnection();
			// TODO: informamos de que se ha insertado correctamente
		} catch (SQLException e) {
			// TODO: informamos de que NO se ha insertado correctamente
			// pasamos el error por consola
			System.out.println(e.getMessage());
		}
	}

	// DELETE
	public void deleteProyecto(String id) {
		ConnectionDB conexion = new ConnectionDB();
		try {
			Statement statement = conexion.crearConexion().createStatement();
			String sql = "DELETE FROM proyecto" + " WHERE Id='" + id + "';";
			System.out.println(sql);
			statement.executeUpdate(sql);
			statement.close();
			conexion.closeConnection();
			// TODO: informamos de que se ha insertado correctamente
		} catch (SQLException e) {
			// TODO: informamos de que NO se ha insertado correctamente
			// pasamos el error por consola
			System.out.println(e.getMessage());
		}
	}

}
