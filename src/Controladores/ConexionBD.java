package Controladores;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Paul Marthin - SCRUM  
 */
public class ConexionBD {

    private static final String BD = "magdalenacetpro";
    private static final String URL = "jdbc:mysql://localhost:3306/" + BD;
    private static final String USER = "root";
    private static final String PASS = "";
    private static final Logger LOGGER = Logger.getLogger(ConexionBD.class.getName()); // permite mejor control de registros
    
    public static Connection conectarBD() throws SQLException {
        try {
            LOGGER.info("Conectando a la base de datos...");
            Connection conn = DriverManager.getConnection(URL, USER, PASS);
            LOGGER.info("Conexión exitosa!");
            return conn;
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error en la conexión: ", e);
            throw e;
        }
    }

    public static void cerrarConexion(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
                LOGGER.info("Conexión cerrada con éxito.");
            } catch (SQLException e) {
                LOGGER.log(Level.SEVERE, "Error al cerrar la conexión: ", e);
            }
        }
    }

    public static void main(String[] args) {
        try (Connection conn = conectarBD()) {
            // Realizar operaciones con la base de datos
        } catch (SQLException ex) {
            LOGGER.log(Level.SEVERE, "Error durante la conexión: ", ex);
        }
        /*
        Connection conn = null;
        try {
            conn = conectarBD();
        } catch (SQLException ex) {
            LOGGER.log(Level.SEVERE, "Error durante la conexión: ", ex);
        } finally {
            cerrarConexion(conn);
        }*/
    }
    
}
