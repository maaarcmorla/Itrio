import java.sql.Connection;
import bd.ConexionDB;

public class App {

    public static void main(String[] args) throws Exception {
        ConexionDB con = new ConexionDB();
        new Itrio();
    }
}
 