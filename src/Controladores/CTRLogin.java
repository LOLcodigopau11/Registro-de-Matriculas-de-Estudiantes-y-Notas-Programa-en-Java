package Controladores;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Interfaces.InicioDocente;
import Interfaces.InicioAsistente;
import Interfaces.InicioSecretaria;
import Interfaces.Login;
/**
 *
 * @author Paul Marthin - SCRUM  
 */
public class CTRLogin {
    // Instancia
    private Login login;

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCod_emp() {
        return cod_emp;
    }

    public void setCod_emp(String cod_emp) {
        this.cod_emp = cod_emp;
    }
    private String cod_emp;
    private String nombre;
    private String apellido;

    public CTRLogin(Login login) {
        this.login = login;
    }
    
    // Variables Globales 
    int intentosFallidos = 0;
    int MAX_INTENTOS_FALLIDOS = 3;
    String rol;
    String usuario;
    String contraseña;
    
    //agregado
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void btnLoginActionPerformed(String usuario, String contraseña, String rol) {
        if(usuario.equals("Ingrese Usuario...") || usuario.isEmpty() || contraseña.equals("***************") 
                || contraseña.isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if (contraseña.contains(" ")) {
            JOptionPane.showMessageDialog(null, "La contraseña no debe tener espacios", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if(rol.equals("Seleccione Rol...")){
            JOptionPane.showMessageDialog(null, "Por favor, seleccione un Rol", "AVISO", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        // Intentos de ingresar
        if (!verificarCredenciales(usuario, contraseña, rol)) {
            intentosFallidos++;
            if (intentosFallidos >= MAX_INTENTOS_FALLIDOS) {
                JOptionPane.showMessageDialog(null, "Ha excedido el número máximo de intentos fallidos. La aplicación se cerrará.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                System.exit(0);
            } else {
                JOptionPane.showMessageDialog(null, "INCORRECTO. Intento fallido: " + intentosFallidos, "Advertencia", JOptionPane.WARNING_MESSAGE);
            }
        } else{
            // Obtener el nombre y el apellido del usuario
            nombre = getNombre(); // Asignar el resultado a la variable nombre
            apellido = getApellido(); // Asignar el resultado a la variable apellido
            cod_emp = getCod_emp(); // Obtener el código del empleado
            // Abrir la ventana según el rol
            abrirVentanaSegunRol(rol, nombre, apellido, cod_emp);
        }
    } 
    
    private boolean verificarCredenciales(String usuario, String contraseña, String rol) {
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        boolean credencialesValidas = false;

        try {
            conn = ConexionBD.conectarBD();
            String query = "SELECT u.*, e.nombre, e.apellido, c.cargo FROM tb_usuario u " +
                    "INNER JOIN tb_empleado e ON u.cod_emp = e.cod_emp " +
                    "INNER JOIN tb_cargo c ON e.cod_cargo = c.cod_cargo " +
                    "WHERE u.usuario = ? AND u.u_contra = ?";
            pst = conn.prepareStatement(query);
            pst.setString(1, usuario);
            pst.setString(2, contraseña);
            rs = pst.executeQuery();

            if (rs.next()) {
                String rolUsuario = rs.getString("cargo");
                if (rolUsuario.equalsIgnoreCase(rol)) {
                    setNombre(rs.getString("nombre"));
                    setApellido(rs.getString("apellido"));
                    setCod_emp(rs.getString("cod_emp"));
                    credencialesValidas = true;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Manejo de la excepción
        } finally {
            // Cerrar recursos
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (conn != null) ConexionBD.cerrarConexion(conn);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return credencialesValidas;
    }
    
    private void abrirVentanaSegunRol(String rol, String nombre, String apellido, String cod_emp) {
        switch (rol) {
            case "Asistente" -> {
                InicioAsistente inicioAS = new InicioAsistente();
                inicioAS.setNombreAsistente(nombre + " " + apellido);
                inicioAS.setVisible(true);
                login.dispose();
            }
            case "Secretaria Administrativa" -> {
                InicioSecretaria inicioSCA = new InicioSecretaria();
                inicioSCA.setNombreSecretaria(nombre + " " + apellido); // Establecer el nombre y apellido en la interfaz
                inicioSCA.setVisible(true);
                login.dispose();
            }
            case "Docente" -> {
                InicioDocente inicioDC = new InicioDocente(cod_emp);
                inicioDC.setNombreDocente(nombre + " " + apellido);
                //inicioDC.setCod_emp(cod_emp);
                inicioDC.setVisible(true);
                login.dispose();
            }
            default -> JOptionPane.showMessageDialog(null, "Rol no reconocido", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}