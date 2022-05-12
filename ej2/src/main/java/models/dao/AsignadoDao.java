package models.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import models.conexion.ConnectionDB;
import models.dto.AsignadoDto;
import models.dto.CientificosDto;

public class AsignadoDao {
	
	//CREATE
	
	
	
	
	public void createAsignado(AsignadoDto asignado) {
        //accedemos a la base de datos
        ConnectionDB conexion = new ConnectionDB();

            try {
            	//conexion.useDB("proyectos");
                //creamos statement
                Statement statement = conexion.crearConexion().createStatement();
                //creamos la query y las variables las rellenamos con los getters del objeto
                String sql = "INSERT INTO asignado_a (dni,id) VALUES"
                        + "('"+asignado.getDni()+"','"+asignado.getId()+"');";
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
