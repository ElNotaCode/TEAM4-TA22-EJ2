package models.dao;

import java.sql.PreparedStatement;
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
                String Querydb = "USE proyectos;";
                statement.executeUpdate(Querydb);

                String sql = "INSERT INTO cientificos(DNI,NomApels) VALUES"
                        + "('"+cientifico.getDni()+"','"+cientifico.getNomApels()+"');";
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
	
	//READ
	public CientificosDto readCientifico(String dni) {
		//Abrimos conexión.
		ConnectionDB conexion = new ConnectionDB();
		//Objeto "en blanco" que vamos a usar para, en caso que exista, rellenar los datos del cientifico en especifico.
		CientificosDto cientifico = new CientificosDto();
		//Bool para ver si existe.
		boolean existe = false;
		
		try {
			//creamos statement
            Statement statement = conexion.crearConexion().createStatement();
            //creamos la query y las variables las rellenamos con los getters del objeto
            String Querydb = "USE proyectos;";
            statement.executeUpdate(Querydb);
			//Vamos a usar el prepared statement.
			//Es lo mismo que un statement, pero se hace al revés.
			//Primero sql.
			String sql = "SELECT * FROM cientificos WHERE dni = '?'";
			PreparedStatement preparedStatement = conexion.crearConexion().prepareStatement(sql);
			preparedStatement.setString(1, dni);
			preparedStatement.execute();
			//Necesto recibir el resultado de la consulta.
			String dniSelect = preparedStatement.getResultSet().getString("DNI");
			//cientifico.setDni(dniSelect);
			String NomApels = preparedStatement.getResultSet().getString("NomApels");
			//cientifico.setDni(dniSelect);
			cientifico = new CientificosDto(dniSelect,NomApels);
			
		} catch (SQLException e) {
			// TODO: handle exception
		}
		
<<<<<<< HEAD
		return cientifico;
=======
		
<<<<<<< HEAD
=======
			try {
				//creamos statement
				Statement statement = conexion.crearConexion().createStatement();
				//creamos la query y las variables las rellenamos con los getters del objeto
				String Querydb = "USE proyectos;";
				statement.executeUpdate(Querydb);
				
				String sql = "INSERT INTO cientificos(DNI,NomApels) VALUES"
						+ "('"+cientifico.getDni()+"','"+cientifico.getNomApels()+"');";
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
>>>>>>> controller
>>>>>>> branch 'modelo' of https://github.com/ElNotaCode/TEAM4-TA22-EJ2.git
		
	}
	
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
	
	//DELETE
	public void deleteCientifico(String dni) {
		
		ConnectionDB conexion = new ConnectionDB();
		
		try {
			Statement statement = conexion.crearConexion().createStatement();
			String sql = "DELETE FROM cientificos "
					+ "WHERE DNI='"+ dni +"';";
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
