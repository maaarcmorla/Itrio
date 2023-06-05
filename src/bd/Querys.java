package bd;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;



public class Querys {

	public static boolean login (String usuario, String passwd) {
		String query = "SELECT usuario, passwd FROM user WHERE usuario=? AND passwd=?";

		try {
			PreparedStatement stmt = ConexionDB.conex.prepareStatement(query);
			stmt.setString(1, usuario);
			stmt.setString(2, passwd);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				if (rs.getString(1).equals(usuario) && rs.getString(2).equals(passwd))
					return true;
			}
		} catch (SQLException sqle) {
			// TODO: handle exception
			System.out.println("Login error: " + sqle);
		}

		return false;
	}

	public static boolean insert (String nombre, String apellidos, String usuario, String passwd) {
		String query = "INSERT INTO user (nombre, apellidos, usuario, passwd) VALUES (?, ?, ?, ?)";
	
		try {
		  PreparedStatement stmt = ConexionDB.conex.prepareStatement(query);
		  stmt.setString(1, nombre);
		  stmt.setString(2, apellidos);
		  stmt.setString(3, usuario);
		  stmt.setString(4, passwd);
	
		  stmt.executeUpdate();
	
		  return true;
	
		} catch (SQLException sqle) {
			System.out.println("ERROR: " + sqle);
		}
		return false;
	}
    
	public static ArrayList<Integer> books(){
		ArrayList libros = new ArrayList<Integer>();
		String query = "SELECT id FROM libros";
		try {
			Statement stm = ConexionDB.conex.createStatement();
			ResultSet rs = stm.executeQuery(query);

			while (rs.next()) {
				libros.add(rs.getInt(1));
			}
		} catch (SQLException sqle) {
			System.out.println("Error: " + sqle);
		}
		return libros;
	}

}