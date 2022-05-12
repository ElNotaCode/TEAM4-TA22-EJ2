package models.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//@author Eloi Martorell

public class ConnectionDB {

		private String ip = "192.168.1.140";
		private String ip2 = "192.168.1.29";
		private String user = "remote";
		private String password = "Reus_2022";
		private Connection conexion = null;
		private Statement statement = null;
		
		//crear conexiones
		public Connection crearConexion() {
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conexion = DriverManager.getConnection("jdbc:mysql://" + ip2 + ":3306?useTimezone=true&serverTimezone=UTC", user, password);
				System.out.println("Conexion establecida.");
				return conexion;
			} catch (SQLException |ClassNotFoundException e) {
				System.out.println("No se ha podido conectar.");
				System.out.println(e);
				return null;
			}
			
		}

		//cerrar conexion
		public void closeConnection() {
			try {
				conexion.close();
				System.out.println("Conexión cerrada.");
			} catch (SQLException e) {
				// TODO: handle exception
				System.out.println("Error al cerrar la conexión.");
			}
		}
		
		//use db
		public void useDB(String name) {
			try {
				String query = "USE " + name;
				statement.executeUpdate(query);
				System.out.println("Apuntando a la base de datos " + name + ".");
			} catch (SQLException e) {
				// ERROR
				System.out.println(e.getMessage());
				System.out.println("No se ha podido apuntar a la base de datos.");
			}
		}
		
}
