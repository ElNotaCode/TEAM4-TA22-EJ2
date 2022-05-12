package models.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import models.conexion.ConnectionDB;
import models.dto.AsignadoDto;

public class AsignadoDao {
	
	//CREATE
	public void createAsignado(AsignadoDto asignado) {
		
		ConnectionDB conexion = new ConnectionDB();
		conexion.crearConexion();
		
		try {
			
			String sql = "INSERT INTO asignado_a(dni,id) VALUES (?,?)";
			PreparedStatement st = conexion.crearConexion().prepareStatement(sql);
			
			st.setString(1, asignado.getDni());
			st.setString(2, asignado.getId());
			
			/*
			 * executeUpdate() : This method is used for execution of DML statement
			 * (INSERT, UPDATE and DELETE) which is return int value, count of the affected rows.
			 */
			
			st.executeUpdate();
			
			st.close();
			conexion.closeConnection();
			
		} catch (SQLException e) {
			// TODO: handle exception
		}
		
	}
	
	//READ Podemos buscar por proyecto o por dni
	public AsignadoDto readAsigando(AsignadoDto asignado) {
		
		//aquí si que si hay que printar una tabla, ya que un proyecto puede tener
		//muchos cientificos asignados
		
		return null;
	}
	
	//UPDATE
	public void updateAsignado(AsignadoDto asignado) {
		
		ConnectionDB conexion = new ConnectionDB();
		conexion.crearConexion();
		
		try {
			//TODO: Revisar esto
			String sql = "UPDATE asignado_a SET"
			+ "dni= ?, id= ?"
			+ "WHERE dni= ?;";
			PreparedStatement st = conexion.crearConexion().prepareStatement(sql);
			st.setString(1, asignado.getDni() );
			st.setString(2, asignado.getId());
			st.setString(3, asignado.getDni());
			
			st.executeUpdate();
			st.close();
			conexion.closeConnection();
			
		} catch (SQLException e) {
			// TODO: handle exception
		}
		
	}
	
	//DELETE

	public void deleteAsignado(AsignadoDto asignado) {
		
		ConnectionDB conexion = new ConnectionDB();
		conexion.crearConexion();
		
		try {
			//TODO: Revisar
			String sql ="DELETE * FROM asignado_a WHERE dni = ?";
			PreparedStatement st = conexion.crearConexion().prepareStatement(sql);
			
			st.setString(1, asignado.getDni());
			st.executeUpdate();
			st.close();
			
			conexion.closeConnection();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
}
