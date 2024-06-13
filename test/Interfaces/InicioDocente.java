package Interfaces;
import Controladores.ConexionBD;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;


public class InicioDocente extends javax.swing.JFrame {

    private String codDocente;
    
    public InicioDocente(String codDocente) {
        initComponents();
        setTitle("CETPRO MAGDALENA - Docentes");
        setLocationRelativeTo(null); 
        setResizable(false);
        
        Image img = Toolkit.getDefaultToolkit().getImage(getClass ().getResource("/img/logo.png"));
        setIconImage(img);
        logointer.requestFocus();
        CerrarSesion.setForeground(Color.black); btnSalir.setForeground(Color.black);
        this.codDocente = codDocente;
        mostrarNotas();
        
        // Agregar DocumentListener para actualizar color de txtNota
        txtNota.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                actualizarColorNota();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                actualizarColorNota();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                actualizarColorNota();
            }
        });
          
    }

    private InicioDocente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    private void actualizarColorNota() {
        String notaString = txtNota.getText().trim();

        // Solo cambiar el color si el texto no está vacío
        if (!notaString.isEmpty()) {
            try {
                int valor = Integer.parseInt(notaString);
                if (valor <= 10) {
                    txtNota.setBackground(Color.RED);
                } else {
                    txtNota.setBackground(Color.WHITE);
                }
            } catch (NumberFormatException e) {
                // Handle potential errors (optional)
            }
        }
    }
    
    // Método para mostrar las notas
    public void mostrarNotas() {
        

        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            conn = ConexionBD.conectarBD();
            
            DefaultTableModel modeloTabla = new DefaultTableModel();
            modeloTabla.addColumn("N°");
            modeloTabla.addColumn("Alumno");
            modeloTabla.addColumn("Nombre");
            modeloTabla.addColumn("Apellidos");
            modeloTabla.addColumn("Periodo");
            modeloTabla.addColumn("Inicio");
            modeloTabla.addColumn("Turno");
            modeloTabla.addColumn("Curso");
            modeloTabla.addColumn("Nota");
            tblNotas.setModel(modeloTabla);
            // Ajustar el ancho de las columnas
            tblNotas.getColumnModel().getColumn(0).setPreferredWidth(10); // N° Nota
            tblNotas.getColumnModel().getColumn(1).setPreferredWidth(30); // Alumno
            tblNotas.getColumnModel().getColumn(2).setPreferredWidth(40); // Nombre
            tblNotas.getColumnModel().getColumn(3).setPreferredWidth(70); // Apellidos
            tblNotas.getColumnModel().getColumn(4).setPreferredWidth(30); // Periodo
            tblNotas.getColumnModel().getColumn(5).setPreferredWidth(40); // Mes de Inicio
            tblNotas.getColumnModel().getColumn(6).setPreferredWidth(30); // Turno
            tblNotas.getColumnModel().getColumn(7).setPreferredWidth(220); // Curso
            tblNotas.getColumnModel().getColumn(8).setPreferredWidth(10); // Nota
            tblNotas.setDefaultEditor(Object.class, null);

            // Obtener el código del docente


            String query = "SELECT tn.num_nota, tm.cod_alumno, ta.nombre, ta.apellido, tm.periodo, tm.mes_inicio, tm.turno, tc.curso, tn.nota "
                    + "FROM tb_nota tn "
                    + "INNER JOIN tb_matricula tm ON tn.num_matricula = tm.num_matricula "
                    + "INNER JOIN tb_curso tc ON tm.cod_curso = tc.cod_curso "
                    + "INNER JOIN tb_alumno ta ON tm.cod_alumno = ta.cod_alumno "
                    + "INNER JOIN tb_empleado te ON tm.cod_emp = te.cod_emp " 
                    +"WHERE tm.cod_emp = ?";
                    //+"ORDER BY tn.nota =0"

            pst = conn.prepareStatement(query);
            pst.setString(1, codDocente); // Pasar el código del docente como parámetro
            rs = pst.executeQuery();

            while (rs.next()) {
                Object[] fila = {
                        rs.getInt("num_nota"),
                        rs.getString("cod_alumno"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("periodo"),
                        rs.getString("mes_inicio"),
                        rs.getString("turno"),
                        rs.getString("curso"),
                        rs.getInt("nota")
                };
                modeloTabla.addRow(fila);
            }

            tblNotas.setModel(modeloTabla); // Establecer el modelo en la tabla
        } catch (SQLException e) {
            // Manejo de la excepción
            e.printStackTrace();
            System.out.println("Error SQL: " + e.getMessage());
        } finally {
            // Cerrar recursos
            try {
                if (rs != null) rs.close();
                if (pst != null) pst.close();
                if (conn != null) ConexionBD.cerrarConexion(conn);
            } catch (SQLException e) {
                // Manejo de la excepción
                e.printStackTrace();
            }
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlabel3 = new javax.swing.JLabel();
        logointer = new javax.swing.JLabel();
        CerrarSesion = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        txtNombreDocente = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtCodDocente = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNotas = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPeriodo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtMesInicio = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtApellidoAlumno = new javax.swing.JTextField();
        txtCodigoAlumno = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtNombreAlumno = new javax.swing.JTextField();
        btnCalificarAlumnos = new javax.swing.JButton();
        txtTurno = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtCurso = new javax.swing.JTextField();
        txtNumNota = new javax.swing.JTextField();
        txtNota = new javax.swing.JTextField();
        btnEditarCalificacion = new javax.swing.JButton();
        btnEditarCalificacion1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtBuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(125, 168, 182));

        jPanel2.setBackground(new java.awt.Color(38, 39, 51));

        jLabel1.setBackground(new java.awt.Color(92, 146, 164));
        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(92, 146, 164));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CETPRO");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 30)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(92, 146, 164));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PROMAE");

        jlabel3.setFont(new java.awt.Font("Arial Black", 0, 30)); // NOI18N
        jlabel3.setForeground(new java.awt.Color(92, 146, 164));
        jlabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabel3.setText("MAGDALENA");

        logointer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logointer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logointerfa.png"))); // NOI18N

        CerrarSesion.setBackground(new java.awt.Color(92, 146, 164));
        CerrarSesion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cerrar.png"))); // NOI18N
        CerrarSesion.setText("CERRAR SESIÓN");
        CerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CerrarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CerrarSesionMouseExited(evt);
            }
        });
        CerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarSesionActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(92, 146, 164));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.png"))); // NOI18N
        btnSalir.setText("SALIR");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logointer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jlabel3))
                .addGap(0, 8, Short.MAX_VALUE))
            .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(logointer)
                .addGap(66, 66, 66)
                .addComponent(CerrarSesion)
                .addGap(35, 35, 35)
                .addComponent(btnSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(125, 168, 182));

        jPanel9.setBackground(new java.awt.Color(38, 39, 51));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtNombreDocente.setEditable(false);
        txtNombreDocente.setBackground(new java.awt.Color(38, 39, 51));
        txtNombreDocente.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        txtNombreDocente.setForeground(new java.awt.Color(92, 146, 164));
        txtNombreDocente.setBorder(null);
        txtNombreDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreDocentetxtNombreDocenteActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Sriracha", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("\"Al servicio de la Educación Técnico Productiva\"");

        jLabel12.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(92, 146, 164));
        jLabel12.setText("BIENVENID@ Docente: ");

        txtCodDocente.setBackground(new java.awt.Color(38, 39, 51));
        txtCodDocente.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        txtCodDocente.setForeground(new java.awt.Color(255, 255, 255));
        txtCodDocente.setBorder(null);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(txtCodDocente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtNombreDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCodDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        jPanel4.setBackground(new java.awt.Color(125, 168, 182));

        tblNotas.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        tblNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblNotas.setGridColor(new java.awt.Color(0, 0, 0));
        tblNotas.setRowSelectionAllowed(false);
        tblNotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNotasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblNotas);

        jPanel5.setBackground(new java.awt.Color(38, 39, 51));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("NOTAS");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Alumno Seleccionado:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setText("Periodo:");

        txtPeriodo.setEditable(false);
        txtPeriodo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPeriodoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setText("Mes Inicio:");

        txtMesInicio.setEditable(false);
        txtMesInicio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel13.setText("Alumno:");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel14.setText("Apellidos: ");

        txtApellidoAlumno.setEditable(false);
        txtApellidoAlumno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtApellidoAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoAlumnoActionPerformed(evt);
            }
        });

        txtCodigoAlumno.setEditable(false);
        txtCodigoAlumno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel15.setText("Nombre:");

        txtNombreAlumno.setEditable(false);
        txtNombreAlumno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnCalificarAlumnos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCalificarAlumnos.setForeground(new java.awt.Color(92, 146, 164));
        btnCalificarAlumnos.setText("CALIFICAR");
        btnCalificarAlumnos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(92, 146, 164)));
        btnCalificarAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalificarAlumnosActionPerformed(evt);
            }
        });

        txtTurno.setEditable(false);
        txtTurno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTurnoActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel17.setText("Turno:");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel18.setText("Curso:");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel19.setText("N° Nota:");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel20.setText("NOTA:");

        txtCurso.setEditable(false);
        txtCurso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtNumNota.setEditable(false);
        txtNumNota.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtNota.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNotaActionPerformed(evt);
            }
        });
        txtNota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNotaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNotaKeyTyped(evt);
            }
        });

        btnEditarCalificacion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEditarCalificacion.setForeground(new java.awt.Color(92, 146, 164));
        btnEditarCalificacion.setText("EDITAR");
        btnEditarCalificacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(92, 146, 164)));
        btnEditarCalificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCalificacionActionPerformed(evt);
            }
        });

        btnEditarCalificacion1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEditarCalificacion1.setForeground(new java.awt.Color(92, 146, 164));
        btnEditarCalificacion1.setText("LIMPIAR");
        btnEditarCalificacion1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(92, 146, 164)));
        btnEditarCalificacion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCalificacion1ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(125, 168, 182));

        txtBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Filtrar:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPeriodo)
                            .addComponent(txtMesInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                            .addComponent(txtCodigoAlumno))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel15)
                                .addGap(1, 1, 1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellidoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtNota, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                                    .addComponent(txtNumNota, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(btnCalificarAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEditarCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(77, 77, 77)
                                        .addComponent(btnEditarCalificacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtCurso)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 777, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtNombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(txtCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel8))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMesInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)
                        .addComponent(txtApellidoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel19)
                        .addComponent(txtNumNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnEditarCalificacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCodigoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel17)
                    .addComponent(txtTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(txtNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalificarAlumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarCalificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setBackground(new Color(92,146,164));
        btnSalir.setForeground(Color.black);
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setBackground(new Color(136,176,189));
        btnSalir.setForeground(Color.red);
    }//GEN-LAST:event_btnSalirMouseEntered

    private void CerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarSesionActionPerformed
        Login Login = new Login();
        Login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CerrarSesionActionPerformed

    private void CerrarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarSesionMouseExited
        CerrarSesion.setBackground(new Color(92,146,164));
        CerrarSesion.setForeground(Color.black);
    }//GEN-LAST:event_CerrarSesionMouseExited

    private void CerrarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarSesionMouseEntered
        CerrarSesion.setBackground(new Color(136,176,189));
        CerrarSesion.setForeground(Color.blue);
    }//GEN-LAST:event_CerrarSesionMouseEntered

    private void txtNombreDocentetxtNombreDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreDocentetxtNombreDocenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreDocentetxtNombreDocenteActionPerformed

    private void btnEditarCalificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCalificacionActionPerformed
        CalificarNota();
    }//GEN-LAST:event_btnEditarCalificacionActionPerformed

    private void btnCalificarAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalificarAlumnosActionPerformed
        CalificarNota();
    }//GEN-LAST:event_btnCalificarAlumnosActionPerformed

    private void txtApellidoAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoAlumnoActionPerformed

    private void txtTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTurnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTurnoActionPerformed

    private void txtPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPeriodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPeriodoActionPerformed

    private void tblNotasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNotasMouseClicked
        LlamarNota();
    }//GEN-LAST:event_tblNotasMouseClicked

    private void txtNotaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNotaKeyTyped
        char caracter = evt.getKeyChar();

        // Si se introduce un carácter que no es un número y no es la tecla Delete ni la tecla Backspace
        if (!Character.isDigit(caracter) && evt.getKeyCode()!= KeyEvent.VK_DELETE && evt.getKeyCode()!= KeyEvent.VK_DELETE) {
            // Consumir el evento para que no se procese
            evt.consume();
        }
    }//GEN-LAST:event_txtNotaKeyTyped

    private void btnEditarCalificacion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCalificacion1ActionPerformed
        LimpiarCamposN();
    }//GEN-LAST:event_btnEditarCalificacion1ActionPerformed

    private void txtNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNotaActionPerformed

    private void txtNotaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNotaKeyPressed
         String notaString = txtNota.getText().trim();
        int length = notaString.length();
        char c = evt.getKeyChar();

        // Permitir solo dígitos, backspace, delete, y teclas de navegación (flechas)
        if (Character.isDigit(c) || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE ||
            evt.getKeyCode() == KeyEvent.VK_DELETE ||
            (evt.getKeyCode() >= KeyEvent.VK_LEFT && evt.getKeyCode() <= KeyEvent.VK_RIGHT)) {

            // Permitir la entrada de dígitos hasta que la longitud sea 2
            if (length < 2 || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE ||
                evt.getKeyCode() == KeyEvent.VK_DELETE) {
                txtNota.setEditable(true);
            } else {
                // Si ya hay 2 dígitos, evitar que se ingrese más
                txtNota.setEditable(false);
            }

            // Verificar si el valor ingresado está dentro del rango 0-20
            if (length == 2) {
                try {
                    int valor = Integer.parseInt(notaString);
                    if (valor < 0 || valor > 20) {
                        // Si el valor está fuera del rango, consumir el evento para evitar la entrada
                        evt.consume();
                        JOptionPane.showMessageDialog(null, "Error: La nota debe estar entre 0 y 20", "Valor no válido", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (NumberFormatException e) {
                    // Si el valor no es un número, consumir el evento para evitar la entrada
                    evt.consume();
                    JOptionPane.showMessageDialog(null, "Error: La nota debe ser un número", "Formato no válido", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            // Si no es un dígito, backspace, delete, o tecla de navegación, no permitir la entrada
            evt.consume();
        }

    }//GEN-LAST:event_txtNotaKeyPressed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        //mostrarNotas(txtBuscar.getText());
    }//GEN-LAST:event_txtBuscarKeyReleased
    
    public void CalificarNota(){
        String notaString = txtNota.getText().trim(); // Obtener la nota como cadena
        // Verificar si la nota es un número entero válido entre 0 y 20
        if (!notaString.matches("\\d{1,2}") || Integer.parseInt(notaString) < 0 || Integer.parseInt(notaString) > 20) {
            JOptionPane.showMessageDialog(this, "Ingrese un valor numérico entero entre 0 y 20 para la nota.");
            return;
        }
        // Recuperar el número de nota de la fila seleccionada
        int numNota = Integer.parseInt(txtNumNota.getText().trim());
        // Crear la consulta SQL de actualización de la nota
        String sql = "UPDATE tb_nota SET nota = ? WHERE num_nota = ?";
        try (Connection conn = ConexionBD.conectarBD();
             PreparedStatement pst = conn.prepareStatement(sql)) {
            // Establecer los valores de los parámetros en la consulta SQL
            pst.setString(1, notaString);
            pst.setInt(2, numNota);
            // Ejecutar la consulta de actualización
            int filasActualizadas = pst.executeUpdate();
            // Verificar si se actualizó la fila correctamente
            if (filasActualizadas > 0) {
                JOptionPane.showMessageDialog(this, "Nota actualizada exitosamente.");
                // Actualizar la tabla de notas
                mostrarNotas();
            } else {
                JOptionPane.showMessageDialog(this, "Error al actualizar la nota.");
            }
            LimpiarCamposN();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al actualizar la nota: " + ex.getMessage());
            Logger.getLogger(InicioDocente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void LimpiarCamposN(){
        txtNumNota.setText(null);
        txtCodigoAlumno.setText(null);
        txtNombreAlumno.setText(null);
        txtApellidoAlumno.setText(null);
        txtPeriodo.setText(null);
        txtMesInicio.setText(null);
        txtTurno.setText(null);
        txtCurso.setText(null);
        txtNota.setText(null);
    }
    
    public void LlamarNota(){
        int fila=tblNotas.getSelectedRow();
        if(fila>=0){
            txtNumNota.setText(tblNotas.getValueAt(fila,0).toString());
            txtCodigoAlumno.setText(tblNotas.getValueAt(fila,1).toString());
            txtNombreAlumno.setText(tblNotas.getValueAt(fila,2).toString());
            txtApellidoAlumno.setText(tblNotas.getValueAt(fila,3).toString());
            txtPeriodo.setText(tblNotas.getValueAt(fila,4).toString());
            txtMesInicio.setText(tblNotas.getValueAt(fila,5).toString());
            txtTurno.setText(tblNotas.getValueAt(fila,6).toString());
            txtCurso.setText(tblNotas.getValueAt(fila,7).toString());
            txtNota.setText(tblNotas.getValueAt(fila,8).toString());
        } else{
        }
    }
    
    public void setNombreDocente(String nombreCompleto) {
        txtNombreDocente.setText(nombreCompleto);
    }
    
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InicioDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioDocente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioDocente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CerrarSesion;
    private javax.swing.JButton btnCalificarAlumnos;
    private javax.swing.JButton btnEditarCalificacion;
    private javax.swing.JButton btnEditarCalificacion1;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlabel3;
    private javax.swing.JLabel logointer;
    private javax.swing.JTable tblNotas;
    private javax.swing.JTextField txtApellidoAlumno;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCodDocente;
    private javax.swing.JTextField txtCodigoAlumno;
    private javax.swing.JTextField txtCurso;
    private javax.swing.JTextField txtMesInicio;
    private javax.swing.JTextField txtNombreAlumno;
    private javax.swing.JTextField txtNombreDocente;
    private javax.swing.JTextField txtNota;
    private javax.swing.JTextField txtNumNota;
    private javax.swing.JTextField txtPeriodo;
    private javax.swing.JTextField txtTurno;
    // End of variables declaration//GEN-END:variables
}
