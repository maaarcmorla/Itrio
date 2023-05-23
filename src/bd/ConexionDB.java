package bd;
import java.sql.*;

import javax.swing.JOptionPane;
public class ConexionDB {

    private static Connection conex = null;

    public ConexionDB(){
        this.connect();
    }
    
    private void connect() {
        try {
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
            } catch (ClassNotFoundException exc) {
                System.out.println("No se a detectado ningun driver" + exc);
            }

            ConexionDB.conex = DriverManager.getConnection("jdbc:mysql://192.168.56.2:3306", "marc", "MarcNazi18.");
            } catch (java.sql.SQLException sqle) {
                System.out.println("Error: " + sqle); 
                JOptionPane.showMessageDialog(null, "No se a podido establecer conexión con la base de datos.","Connection error", JOptionPane.ERROR_MESSAGE);
            }
        }

    public static void closeConnection() {
          if (ConexionDB.conex != null) {
              try {
                  ConexionDB.conex.close();
              } catch (SQLException sqle) {
                  System.out.println("Close conex: " + sqle);
              }
          }
    }

    // public static void main(String[] args) {
        // ConexionDB con = new ConexionDB();
        
        // if (conex != null) {
        //     System.out.println("Conectado correctamente");
        // } else {
        //     System.out.println("No se a podido conectar");
        // }
    // }
       
}
