package Interfaces;
import Controladores.ConexionBD;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;

public class jfrmMatricula extends javax.swing.JFrame {

    
    public jfrmMatricula() {
        initComponents();
        setTitle("CETPRO MAGDALENA - MÁTRICULA");
        setLocationRelativeTo(null); 
        setResizable(false);
        
        Image img = Toolkit.getDefaultToolkit().getImage(getClass ().getResource("/img/logo.png"));
        setIconImage(img);
        
        Mostrar(""); TotalAlumnos(); 
        mostrarM("");TotalMatriculas();

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
        btnSalir = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtCodigoAlumno = new javax.swing.JTextField();
        txtNombreAlumno = new javax.swing.JTextField();
        txtApellidoAlumno = new javax.swing.JTextField();
        txtDNI = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtCorreoAlumno = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAlumno = new javax.swing.JTable();
        btnRegistrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTotalALumnos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        Matricula = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtPeriodo = new javax.swing.JTextField();
        txtFechaMatricula = new javax.swing.JTextField();
        txtCodAlumno = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblMatricula = new javax.swing.JTable();
        btnRegistrarM = new javax.swing.JButton();
        btnModificarM = new javax.swing.JButton();
        btnLimpiarM = new javax.swing.JButton();
        btnBorrarM = new javax.swing.JButton();
        txtBuscarM = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jcbCurso = new javax.swing.JComboBox<>();
        jcbMesInicio = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        jcbTipoCurso = new javax.swing.JComboBox<>();
        jcbTurno = new javax.swing.JComboBox<>();
        jLabel30 = new javax.swing.JLabel();
        txtNumMatricula = new javax.swing.JTextField();
        txtTotalM = new javax.swing.JTextField();
        jcbDocente = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                cerrar(evt);
            }
        });

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

        btnSalir.setBackground(new java.awt.Color(92, 146, 164));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/enter.png"))); // NOI18N
        btnSalir.setText("REGRESAR");
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
                .addGap(128, 128, 128)
                .addComponent(btnSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(125, 168, 182));

        jPanel9.setBackground(new java.awt.Color(38, 39, 51));
        jPanel9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel11.setFont(new java.awt.Font("Sriracha", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("\"Al servicio de la Educación Técnico Productiva\"");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel4.setBackground(new java.awt.Color(125, 168, 182));

        jPanel3.setBackground(new java.awt.Color(125, 168, 182));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "..::Nuevo Alumno::..", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(204, 204, 204))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Codigo de Alumno:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Nombre:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Apellido: ");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("DNI:");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Dirección:");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Teléfono:");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("Correo:");

        txtCodigoAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoAlumnoActionPerformed(evt);
            }
        });

        txtNombreAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreAlumnoActionPerformed(evt);
            }
        });

        txtDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtDNIKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDNIKeyTyped(evt);
            }
        });

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        tblAlumno.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        tblAlumno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblAlumno.setGridColor(new java.awt.Color(0, 0, 0));
        tblAlumno.setRowSelectionAllowed(false);
        tblAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAlumnoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblAlumno);

        btnRegistrar.setBackground(new java.awt.Color(153, 255, 153));
        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/GUARDAR.png"))); // NOI18N
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(51, 255, 204));
        btnModificar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/actualizar.png"))); // NOI18N
        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(255, 255, 102));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiar.png"))); // NOI18N
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnBorrar.setBackground(new java.awt.Color(255, 102, 102));
        btnBorrar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/borrar.png"))); // NOI18N
        btnBorrar.setText("BORRAR");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        jLabel2.setText("Busqueda Global:");

        txtTotalALumnos.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Alumnos Totales:");

        jPanel7.setBackground(new java.awt.Color(38, 39, 51));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("ALUMNOS");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCodigoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefono)
                            .addComponent(txtDireccion)
                            .addComponent(txtCorreoAlumno)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDNI)
                            .addComponent(txtApellidoAlumno))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtBuscar)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(68, 68, 68))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtTotalALumnos, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 575, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtCodigoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel9))
                            .addComponent(txtNombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtApellidoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRegistrar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnModificar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpiar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBorrar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(txtCorreoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txtTotalALumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Matricula.setBackground(new java.awt.Color(125, 168, 182));
        Matricula.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "..::Nueva Mátricula::..", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14), new java.awt.Color(204, 204, 204))); // NOI18N

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("Periodo:");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setText("Mes de Inicio:");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setText("Fecha:");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setText("Turno:");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setText("Código de Alumno:");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setText("Curso:");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setText("Docente:");

        txtPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPeriodoActionPerformed(evt);
            }
        });

        tblMatricula.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        tblMatricula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblMatricula.setGridColor(new java.awt.Color(0, 0, 0));
        tblMatricula.setRowSelectionAllowed(false);
        tblMatricula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMatriculaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblMatricula);

        btnRegistrarM.setBackground(new java.awt.Color(153, 255, 153));
        btnRegistrarM.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRegistrarM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/GUARDAR.png"))); // NOI18N
        btnRegistrarM.setText("REGISTRAR");
        btnRegistrarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarMActionPerformed(evt);
            }
        });

        btnModificarM.setBackground(new java.awt.Color(51, 255, 204));
        btnModificarM.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnModificarM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/actualizar.png"))); // NOI18N
        btnModificarM.setText("MODIFICAR");
        btnModificarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarMActionPerformed(evt);
            }
        });

        btnLimpiarM.setBackground(new java.awt.Color(255, 255, 102));
        btnLimpiarM.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnLimpiarM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiar.png"))); // NOI18N
        btnLimpiarM.setText("LIMPIAR");
        btnLimpiarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarMActionPerformed(evt);
            }
        });

        btnBorrarM.setBackground(new java.awt.Color(255, 102, 102));
        btnBorrarM.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBorrarM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/borrar.png"))); // NOI18N
        btnBorrarM.setText("BORRAR");
        btnBorrarM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarMActionPerformed(evt);
            }
        });

        txtBuscarM.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarMKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/lupa.png"))); // NOI18N
        jLabel5.setText("Busqueda Global:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Total Matriculas:");

        jPanel10.setBackground(new java.awt.Color(38, 39, 51));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("MÁTRICULAS");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
        );

        jcbCurso.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jcbCurso.setMinimumSize(new java.awt.Dimension(179, 22));
        jcbCurso.setPreferredSize(new java.awt.Dimension(179, 22));
        jcbCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCursoActionPerformed(evt);
            }
        });

        jcbMesInicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Setiembre", "Octubre", "Noviembre", "Diciembre" }));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel29.setText("Tipo de Curso:");

        jcbTipoCurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Libre", "Modular" }));
        jcbTipoCurso.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbTipoCursoItemStateChanged(evt);
            }
        });

        jcbTurno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Mañana", "Tarde", "Noche" }));

        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel30.setText("N° Mátricula:");

        txtNumMatricula.setEditable(false);
        txtNumMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumMatriculaActionPerformed(evt);
            }
        });

        txtTotalM.setEditable(false);

        jcbDocente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "Lucifer Delgado Peso", "Kimberly Merlina Huaman Cristobal", "Gabriela Garcia Marques", "David Cajar Huacho", "Aaron Josue Apolinario", "Juan Pedro Lopez Paez", "María Gabriela Aller Onocc", "Carlos Gomez Gonzales", "Pedro Picapiedra Marmol", "Kim Stefanny Sportacus Posible", "Hugo Frugo yugol", "Grecia Licantropa Flores", "Keiko Fujimori Japo", "Kenji Fujimori Japo" }));

        javax.swing.GroupLayout MatriculaLayout = new javax.swing.GroupLayout(Matricula);
        Matricula.setLayout(MatriculaLayout);
        MatriculaLayout.setHorizontalGroup(
            MatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MatriculaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(MatriculaLayout.createSequentialGroup()
                        .addGroup(MatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MatriculaLayout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCodAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MatriculaLayout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcbDocente, 0, 1, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MatriculaLayout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFechaMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MatriculaLayout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumMatricula))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MatriculaLayout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jcbMesInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MatriculaLayout.createSequentialGroup()
                                .addGroup(MatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel29)
                                    .addComponent(jLabel24))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(MatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbTurno, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jcbTipoCurso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MatriculaLayout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(MatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(MatriculaLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(MatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnModificarM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnRegistrarM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnLimpiarM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnBorrarM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtBuscarM)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, MatriculaLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTotalM)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addGroup(MatriculaLayout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbCurso, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(34, 34, 34)))
                .addGroup(MatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 665, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        MatriculaLayout.setVerticalGroup(
            MatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MatriculaLayout.createSequentialGroup()
                .addGroup(MatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MatriculaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(MatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(MatriculaLayout.createSequentialGroup()
                                .addGroup(MatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel30)
                                    .addComponent(txtNumMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(MatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel21)
                                    .addComponent(txtPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(MatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel22)
                                    .addComponent(jcbMesInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(MatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel23)
                                    .addComponent(txtFechaMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(MatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel25)
                                    .addComponent(txtCodAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(MatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel24)
                                    .addComponent(jcbTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(MatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel29)
                                    .addComponent(jcbTipoCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(MatriculaLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBuscarM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRegistrarM)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnModificarM)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLimpiarM)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBorrarM)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(MatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(jcbCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(MatriculaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(txtTotalM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbDocente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(MatriculaLayout.createSequentialGroup()
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Matricula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        btnSalir.setBackground(new Color(136,176,189));
        btnSalir.setForeground(Color.red);
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        btnSalir.setBackground(new Color(92,146,164));
        btnSalir.setForeground(Color.black);
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
         this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtCodigoAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoAlumnoActionPerformed

    private void txtNombreAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreAlumnoActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        LimpiarCamposAL();
        Mostrar("");

    }//GEN-LAST:event_btnLimpiarActionPerformed

    public void LimpiarCamposAL() {
        txtCodigoAlumno.setText(null);
        txtNombreAlumno.setText(null);
        txtDNI.setText(null);
        txtApellidoAlumno.setText(null);
        txtDireccion.setText(null);
        txtTelefono.setText(null);
        txtCorreoAlumno.setText(null);
        txtBuscar.setText("");
    }
    public void LimpiarCamposM() {
        txtNumMatricula.setText(null);
        txtPeriodo.setText(null);
        jcbMesInicio.setSelectedIndex(0);
        txtFechaMatricula.setText(null);
        txtCodAlumno.setText(null);
        jcbTurno.setSelectedIndex(0);
        jcbTipoCurso.setSelectedIndex(0);
        jcbCurso.setSelectedIndex(-1);
        jcbDocente.setSelectedIndex(0);
        txtBuscarM.setText(null);
    }
    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        Mostrar(txtBuscar.getText());
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void cerrar(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_cerrar
        int result=JOptionPane.showConfirmDialog(this, "¿Desea CERRAR de la Matricula?",
                "Cerrar Matricula", JOptionPane.YES_NO_OPTION );
        if(result == JOptionPane.YES_OPTION){
            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        } else{
            setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_cerrar

    private void tblAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAlumnoMouseClicked
        LlamarDatos();
        
    }//GEN-LAST:event_tblAlumnoMouseClicked

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        Registrar();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtDNIKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNIKeyPressed
        String dni = txtDNI.getText();
        int length = dni.length();
        char c = evt.getKeyChar();
        
        
        // Permitir solo dígitos y teclas de borrado
        if(Character.isDigit(c) || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getKeyCode() == KeyEvent.VK_DELETE) {
            // Permitir la entrada de dígitos hasta que la longitud sea 8
            if(length < 8 || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getKeyCode() == KeyEvent.VK_DELETE) {
                txtDNI.setEditable(true);
            } else {
                // Si ya hay 8 dígitos, evitar que se ingrese más
                txtDNI.setEditable(false);
            }
        } else {
            // Si no es un dígito o una tecla de borrado, no permitir la entrada
            evt.consume();
        }
    }//GEN-LAST:event_txtDNIKeyPressed

    private void txtDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNIKeyTyped
        char caracter = evt.getKeyChar();

        // Si se introduce un carácter que no es un número y no es la tecla Delete ni la tecla Backspace
        if (!Character.isDigit(caracter) && evt.getKeyCode()!= KeyEvent.VK_DELETE && evt.getKeyCode()!= KeyEvent.VK_DELETE) {
            // Consumir el evento para que no se procese
            evt.consume();
        }
    }//GEN-LAST:event_txtDNIKeyTyped

    private void txtTelefonoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyPressed
        String cel = txtTelefono.getText();
        int length = cel.length();
        char c = evt.getKeyChar();
        
        // Si aún no se ha ingresado ningún dígito y el dígito ingresado es 9, permitir la edición
        if (length == 0 && c == '9') {
            txtTelefono.setEditable(true);
        } else {
            // Si la longitud es 0 pero el dígito ingresado no es 9, no permitir la edición
            if (length == 0 && c != '9') {
                txtTelefono.setEditable(false);
            } else {
                // Permitir solo dígitos y teclas de borrado si ya hay un dígito inicial igual a 9
                if(Character.isDigit(c) || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getKeyCode() == KeyEvent.VK_DELETE) {
                    // Permitir la entrada de dígitos hasta que la longitud sea 9
                    if(length < 9 || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE || evt.getKeyCode() == KeyEvent.VK_DELETE) {
                        txtTelefono.setEditable(true);
                    } else {
                        // Si ya hay 9 dígitos, evitar que se ingrese más
                        txtTelefono.setEditable(false);
                    }
                } else {
                    // Si no es un dígito o una tecla de borrado, no permitir la entrada
                    evt.consume();
                }
            }
        }
    }//GEN-LAST:event_txtTelefonoKeyPressed

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        char caracter = evt.getKeyChar();

        // Si se introduce un carácter que no es un número y no es la tecla Delete ni la tecla Backspace
        if (!Character.isDigit(caracter) && evt.getKeyCode()!= KeyEvent.VK_DELETE && evt.getKeyCode()!= KeyEvent.VK_DELETE) {
            // Consumir el evento para que no se procese
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPeriodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPeriodoActionPerformed

    private void tblMatriculaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMatriculaMouseClicked
        LlamarDatosM();
    }//GEN-LAST:event_tblMatriculaMouseClicked

    private void btnRegistrarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarMActionPerformed
        RegistrarM();
    }//GEN-LAST:event_btnRegistrarMActionPerformed

    private void btnLimpiarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarMActionPerformed
        LimpiarCamposM();
        mostrarM(""); 
    }//GEN-LAST:event_btnLimpiarMActionPerformed

    private void txtBuscarMKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarMKeyReleased
        mostrarM(txtBuscarM.getText());
    }//GEN-LAST:event_txtBuscarMKeyReleased

    private void txtNumMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumMatriculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumMatriculaActionPerformed

    public boolean hayCamposVaciosA() {
        String codigo = txtCodigoAlumno.getText();
        String nombre = txtNombreAlumno.getText();
        String apellido = txtApellidoAlumno.getText();
        String dni = txtDNI.getText();
        String direccion = txtDireccion.getText();
        String telefono = txtTelefono.getText();
        String correo = txtCorreoAlumno.getText();

        // Verificar si algún campo está vacío
        if (codigo.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || dni.isEmpty() ||
            direccion.isEmpty() || telefono.isEmpty() || correo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, Seleccione una fila.");
            return true; // Hay campos vacíos
        }
    
        return false; // No hay campos vacíos
    }
    
    
    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // Verificar si todos los campos están vacios
        int fila = tblAlumno.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un Alumno para Modificar.");
            return;
        }
        
        if (hayCamposVaciosA()) {
            return;
        }

        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Desea Modificar el Alumno?", "Modificar Alumno", JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {
            try {
                Connection conn = ConexionBD.conectarBD();
                String sql = "UPDATE tb_alumno SET nombre=?, apellido=?, dni=?, Telefono=?, direccion=?, Correo=? WHERE cod_alumno=?";
                PreparedStatement pst = conn.prepareStatement(sql);
                
                pst.setString(1, txtNombreAlumno.getText());
                pst.setString(2, txtApellidoAlumno.getText());
                pst.setString(3, txtDNI.getText());
                pst.setString(4, txtTelefono.getText());
                pst.setString(5, txtDireccion.getText());
                pst.setString(6, txtCorreoAlumno.getText());
                pst.setString(7, txtCodigoAlumno.getText());

                int filasActualizadas = pst.executeUpdate();

                if (filasActualizadas > 0) {
                    JOptionPane.showMessageDialog(this, "Alumno MODIFICADO exitosamente.");
                    Mostrar("");

                } else {
                    JOptionPane.showMessageDialog(this, "Error al MODIFICAR el Alumno.");
                }
                LimpiarCamposAL();

            } catch (SQLException ex) {
                Logger.getLogger(jfrmMatricula.class.getName()).log(Level.SEVERE, null, ex);
            }}
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // Verificar si hay campos vacíos
        if (hayCamposVaciosA()) {
            return;
        }

        int fila = tblAlumno.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un Alumno para borrar.");
            return;
        }

        String codigoAlumno = tblAlumno.getValueAt(fila, 0).toString();
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el registro?", "Eliminar Registro", JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {
            try {
                Connection conn = ConexionBD.conectarBD();
                String sql = "DELETE FROM tb_alumno WHERE cod_alumno=?";
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(1, codigoAlumno);
                int filasActualizadas = pst.executeUpdate();

                if (filasActualizadas > 0) {
                    JOptionPane.showMessageDialog(this, "Alumno borrado exitosamente.");
                    TotalAlumnos();
                    Mostrar("");
                    LimpiarCamposAL();
                } else {
                    JOptionPane.showMessageDialog(this, "Error al borrar el alumno.");
                }
            } catch (SQLException ex) {
                Logger.getLogger(jfrmMatricula.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    
    private void jcbTipoCursoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbTipoCursoItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED){
            if(this.jcbTipoCurso.getSelectedIndex() > 0){
                this.jcbCurso.setModel(new DefaultComboBoxModel(this.cursos(this.jcbTipoCurso.getSelectedItem().toString())));
            } else {
                // Si se selecciona "Seleccione...", se establece un modelo vacío para el segundo JComboBox
                this.jcbCurso.setModel(new DefaultComboBoxModel(new String[] {}));
            }
        }
    }//GEN-LAST:event_jcbTipoCursoItemStateChanged
 
    private void jcbCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbCursoActionPerformed

    private void btnModificarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarMActionPerformed
        ActualizarM();
    }//GEN-LAST:event_btnModificarMActionPerformed

    private void btnBorrarMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarMActionPerformed
        BorrarM();
    }//GEN-LAST:event_btnBorrarMActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarActionPerformed
    public void TotalAlumnos(){

        String sql = "SELECT COUNT(*) FROM tb_alumno";

        try (Connection conn = ConexionBD.conectarBD();
             PreparedStatement pst = conn.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            if (rs.next()) {
                int totalAlumnos = rs.getInt(1);
                txtTotalALumnos.setText(String.valueOf(totalAlumnos));
            }

        } catch (SQLException e) {
            // Manejar cualquier excepción de SQL aquí
            e.printStackTrace();
        }
    }
    public void Mostrar(String Valor){
        String sql = Valor.isEmpty() 
                ? "SELECT * FROM tb_alumno"
                : "SELECT * FROM tb_alumno WHERE nombre LIKE '%" + Valor + "%' OR "
                + "CONCAT(nombre, ' ', apellido) LIKE '%" + Valor + "%' OR "
                + "cod_alumno LIKE '%" + Valor + "%' OR "
                + "apellido LIKE '%" + Valor + "%' OR "
                + "CAST(dni AS CHAR) LIKE '%" + Valor + "%' OR " // Convertir a cadena
                + "direccion LIKE '%" + Valor + "%' OR "
                + "CAST(telefono AS CHAR) LIKE '%" + Valor + "%' OR " // Convertir a cadena
                + "correo LIKE '%" + Valor + "%'";
        
        try (Connection conn = ConexionBD.conectarBD();
             PreparedStatement pst = conn.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            DefaultTableModel modeloA = new DefaultTableModel();
            modeloA.addColumn("Código");
            modeloA.addColumn("Nombre");
            modeloA.addColumn("Apellidos");
            modeloA.addColumn("DNI");
            modeloA.addColumn("Dirección");
            modeloA.addColumn("Teléfono");
            modeloA.addColumn("Correo");
            tblAlumno.setModel(modeloA);
            
            // Ajustar el ancho de las columnas
            tblAlumno.getColumnModel().getColumn(0).setPreferredWidth(70); // Alumno
            tblAlumno.getColumnModel().getColumn(1).setPreferredWidth(90); // Nombre
            tblAlumno.getColumnModel().getColumn(2).setPreferredWidth(150); // Apellidos
            tblAlumno.getColumnModel().getColumn(3).setPreferredWidth(70); // DNI
            tblAlumno.getColumnModel().getColumn(4).setPreferredWidth(150); // Dirección
            tblAlumno.getColumnModel().getColumn(5).setPreferredWidth(80); // Teléfono
            tblAlumno.getColumnModel().getColumn(6).setPreferredWidth(150); // Correo

            // Hacer la tabla no editable
            tblAlumno.setDefaultEditor(Object.class, null);
            
            while (rs.next()) {
                Object[] fila = new Object[]{
                    rs.getString(1), //codigo
                    rs.getString(2), //nombre
                    rs.getString(3), //apellido
                    rs.getString(4), //dni
                    rs.getString(5), //dirección
                    rs.getString(6), // telefono
                    rs.getString(7) // correo
                };
                modeloA.addRow(fila);
            }

        } catch (SQLException ex) {
            Logger.getLogger(jfrmMatricula.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void LlamarDatos(){
        int fila=tblAlumno.getSelectedRow();
        if(fila>=0){
            txtCodigoAlumno.setText(tblAlumno.getValueAt(fila,0).toString());
            txtNombreAlumno.setText(tblAlumno.getValueAt(fila,1).toString());
            txtApellidoAlumno.setText(tblAlumno.getValueAt(fila,2).toString());
            txtDNI.setText(tblAlumno.getValueAt(fila,3).toString());
            txtDireccion.setText(tblAlumno.getValueAt(fila,4).toString());
            txtTelefono.setText(tblAlumno.getValueAt(fila,5).toString());
            txtCorreoAlumno.setText(tblAlumno.getValueAt(fila,6).toString());
        } else{
        }
    }
    public void Registrar(){
        String codigo = txtCodigoAlumno.getText().toUpperCase(); // Convertir a mayúsculas;
        String nombre = txtNombreAlumno.getText();
        String apellido = txtApellidoAlumno.getText();
        String dni = txtDNI.getText();
        String direccion = txtDireccion.getText();
        String telefono = txtTelefono.getText();
        String correo = txtCorreoAlumno.getText();

        // Verificar si todos los campos están llenos
        if (codigo.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || dni.isEmpty() ||
            direccion.isEmpty() || telefono.isEmpty() || correo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
            return;
        }

        // Crear la consulta SQL de inserción
        String sql = "INSERT INTO tb_alumno (cod_alumno, nombre, apellido, dni, direccion, telefono, correo) "
                   + "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = ConexionBD.conectarBD();
             PreparedStatement pst = conn.prepareStatement(sql)) {

            // Establecer los valores de los parámetros en la consulta SQL
            pst.setString(1, codigo);
            pst.setString(2, nombre);
            pst.setString(3, apellido);
            pst.setInt(4, Integer.parseInt(dni));
            pst.setString(5, direccion);
            pst.setInt(6, Integer.parseInt(telefono));
            pst.setString(7, correo);

            // Ejecutar la consulta de inserción
            int filasInsertadas = pst.executeUpdate();

            // Verificar si se insertaron filas correctamente
            if (filasInsertadas > 0) {
                JOptionPane.showMessageDialog(this, "Alumno registrado exitosamente.");
                // Actualizar el total de alumnos
                TotalAlumnos();
                // Actualizar la tabla de alumnos
                Mostrar("");
            } else {
                JOptionPane.showMessageDialog(this, "Error al registrar el alumno.");
            }
            LimpiarCamposAL();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al registrar el alumno: " + ex.getMessage());
            Logger.getLogger(jfrmMatricula.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese un valor numérico para DNI y teléfono.");
        }
        
    }
 //COmbo bOx
    public String[]cursos(String cursos){
        String[]informacion = new String[0];
        
        if (cursos.equalsIgnoreCase("Seleccione...")) {
            informacion = new String[0]; // Array vacío
            
        } else if (cursos.equalsIgnoreCase("Libre")) {
            informacion = new String[11];
            informacion[0] = "Seleccione Curso...";
            informacion[1] = "Mantenimiento preventivo correctivo de motores de combustión interna";
            informacion[2] = "Mantenimiento y reparación de equipos de audio";
            informacion[3] = "Mantenimiento y reparación de equipos de video";
            informacion[4] = "Mantenimiento básico en carpintería";
            informacion[5] = "Mantenimiento básico en gasfiteria";
            informacion[6] = "Mantenimiento básico en albañilería";
            informacion[7] = "Carpintería metálica";
            informacion[8] = "Digitación";
            informacion[9] = "Pintura automotriz";
            informacion[10] = "Mantenimiento básico en instalaciones eléctricas";
        } else if (cursos.equalsIgnoreCase("Modular")) {
            informacion = new String[5];
            informacion[0] = "Seleccione Curso...";
            informacion[1] = "Acabados en edificaciones y obras civiles";
            informacion[2] = "Albañilería";
            informacion[3] = "Apoyo administrativo";
            informacion[4] = "Artículos de cuero y marroquinería";
        }
        return informacion;
    }    
// MATRICULA
    public void TotalMatriculas(){

        String sql = "SELECT COUNT(*) FROM tb_matricula";

        try (Connection conn = ConexionBD.conectarBD();
             PreparedStatement pst = conn.prepareStatement(sql);
             ResultSet rs = pst.executeQuery()) {

            if (rs.next()) {
                int totalMatriculas = rs.getInt(1);
                txtTotalM.setText(String.valueOf(totalMatriculas));
            }

        } catch (SQLException e) {
            // Manejar cualquier excepción de SQL aquí
            e.printStackTrace();
        }
    }
    public void mostrarM(String valor) {
        String sql = valor.isEmpty() 
                ? "SELECT m.num_matricula, m.periodo, m.mes_inicio, m.fecha, m.turno, m.cod_alumno, " +
                "CONCAT(a.nombre, ' ', a.apellido) AS nombre_alumno, " +
                "c.curso, c.tipo, " +
                "CONCAT(e.nombre, ' ', e.apellido) AS nombre_empleado " +
                "FROM tb_matricula m " +
                "INNER JOIN tb_alumno a ON m.cod_alumno = a.cod_alumno " +
                "INNER JOIN tb_curso c ON m.cod_curso = c.cod_curso " +
                "INNER JOIN tb_empleado e ON m.cod_emp = e.cod_emp " +
                "ORDER BY m.num_matricula ASC"
              : "SELECT m.num_matricula, m.periodo, m.mes_inicio, m.fecha, m.turno, m.cod_alumno, " +
                "CONCAT(a.nombre, ' ', a.apellido) AS nombre_alumno, " +
                "c.curso, c.tipo, " +
                "CONCAT(e.nombre, ' ', e.apellido) AS nombre_empleado " +
                "FROM tb_matricula m " +
                "INNER JOIN tb_alumno a ON m.cod_alumno = a.cod_alumno " +
                "INNER JOIN tb_curso c ON m.cod_curso = c.cod_curso " +
                "INNER JOIN tb_empleado e ON m.cod_emp = e.cod_emp " +
                "WHERE m.num_matricula LIKE '%" + valor + "%' OR " +
                "m.mes_inicio LIKE '%" + valor + "%' OR " +
                "m.periodo LIKE '%" + valor + "%' OR " +
                "m.cod_alumno LIKE '%" + valor + "%' OR " +
                "CONCAT(a.nombre, ' ', a.apellido) LIKE '%" + valor + "%' OR " +
                "CONCAT(e.nombre, ' ', e.apellido) LIKE '%" + valor + "%' OR " +
                "m.fecha LIKE '%" + valor + "%' OR " +
                "m.turno LIKE '%" + valor + "%' OR " +
                "c.curso LIKE '%" + valor + "%' OR " +
                "m.cod_curso LIKE '%" + valor + "%' OR " +
                "m.cod_emp LIKE '%" + valor + "%'";

      try (Connection conn = ConexionBD.conectarBD();
           PreparedStatement pst = conn.prepareStatement(sql);
           ResultSet rs = pst.executeQuery()) {

          DefaultTableModel modeloM = new DefaultTableModel();
          modeloM.addColumn("N°");
          modeloM.addColumn("Periodo");
          modeloM.addColumn("Inicio");
          modeloM.addColumn("Fecha");
          modeloM.addColumn("Turno");
          modeloM.addColumn("C-A");
          modeloM.addColumn("Alumno");
          modeloM.addColumn("Curso");
          modeloM.addColumn("Tipo");
          modeloM.addColumn("Docente");
          tblMatricula.setModel(modeloM);

          // Ajustar el ancho de las columnas
          tblMatricula.getColumnModel().getColumn(0).setPreferredWidth(8); // Numero Matricula
          tblMatricula.getColumnModel().getColumn(1).setPreferredWidth(35); // Periodo
          tblMatricula.getColumnModel().getColumn(2).setPreferredWidth(30); // Mes Inicio
          tblMatricula.getColumnModel().getColumn(3).setPreferredWidth(35); // Fecha
          tblMatricula.getColumnModel().getColumn(4).setPreferredWidth(30); // Turno
          tblMatricula.getColumnModel().getColumn(5).setPreferredWidth(20); // cod_alumno
          tblMatricula.getColumnModel().getColumn(6).setPreferredWidth(100); // Alumno
          tblMatricula.getColumnModel().getColumn(7).setPreferredWidth(100); // Curso
          tblMatricula.getColumnModel().getColumn(8).setPreferredWidth(20); // tipo
          tblMatricula.getColumnModel().getColumn(9).setPreferredWidth(100); // Docente

          // Hacer la tabla no editable
          tblMatricula.setDefaultEditor(Object.class, null);

          while (rs.next()) {
              Object[] fila = new Object[]{
                  rs.getString(1), //num_matricula
                  rs.getString(2), //periodo
                  rs.getString(3), //mes_inicio
                  rs.getString(4), //fecha
                  rs.getString(5), //turno
                  rs.getString(6), //cod_alumno
                  rs.getString(7), // nombre completo del alumno
                  rs.getString(8), //curso
                  rs.getString(9), //tipo
                  rs.getString(10) // nombre completo del docente
              };
              modeloM.addRow(fila);
          }

        } catch (SQLException ex) {
            Logger.getLogger(jfrmMatricula.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void LlamarDatosM(){
        int fila = tblMatricula.getSelectedRow();
        if (fila >= 0) {
            txtNumMatricula.setText(tblMatricula.getValueAt(fila, 0).toString());
            txtPeriodo.setText(tblMatricula.getValueAt(fila, 1).toString());
            jcbMesInicio.setSelectedItem(tblMatricula.getValueAt(fila, 2).toString());
            txtFechaMatricula.setText(tblMatricula.getValueAt(fila, 3).toString());
            jcbTurno.setSelectedItem(tblMatricula.getValueAt(fila, 4).toString());
            txtCodAlumno.setText(tblMatricula.getValueAt(fila, 5).toString());
            jcbTipoCurso.setSelectedItem(tblMatricula.getValueAt(fila, 8).toString());
            jcbCurso.setSelectedItem(tblMatricula.getValueAt(fila, 7).toString());
            jcbDocente.setSelectedItem(tblMatricula.getValueAt(fila, 9).toString());
        }
    }
    
    public String obtenerIdCurso(String cod_curso) {
        return switch (cod_curso) {
            case "Mantenimiento preventivo correctivo de motores de combustión interna" -> "CR01";
            case "Mantenimiento y reparación de equipos de audio" -> "CR02";
            case "Mantenimiento y reparación de equipos de video" -> "CR03";
            case "Mantenimiento básico en carpintería" -> "CR04";
            case "Mantenimiento básico en gasfiteria" -> "CR05";
            case "Mantenimiento básico en albañilería" -> "CR06";
            case "Carpintería metálica" -> "CR07";
            case "Digitación" -> "CR08";
            case "Pintura automotriz" -> "CR09";
            case "Mantenimiento básico en instalaciones eléctricas" -> "CR10";
            case "Acabados en edificaciones y obras civiles" -> "CR11";
            case "Albañilería" -> "CR12" ;
            case "Apoyo administrativo" -> "CR13" ;
            case "Artículos de cuero y marroquinería" -> "CR14";
            default -> "";
        };
    }
    public String obtenerIdDocente(String cod_emp) {
        return switch (cod_emp) {
            case "Lucifer Delgado Peso" -> "EP03";
            case "Kimberly Merlina Huaman Cristobal" -> "EP04";
            case "Gabriela Garcia Marques" -> "EP05";
            case "David Cajar Huacho" -> "EP06";
            case "Aaron Josue Apolinario" -> "EP07";
            case "Juan Pedro Lopez Paez" -> "EP08";
            case "María Gabriela Aller Onocc" -> "EP09";
            case "Carlos Gomez Gonzales" -> "EP10";
            case "Pedro Picapiedra Marmol" -> "EP11";
            case "Kim Stefanny Sportacus Posible" -> "EP12";
            case "Hugo Frugo yugol" -> "EP13";
            case "Grecia Licantropa Flores" -> "EP14";
            case "Keiko Fujimori Japo" -> "EP15";
            case "Kenji Fujimori Japo" -> "EP16";
            default -> "";
        };
    }
    public boolean verificarCamposM() {
        // Verificar campos vacíos
        String periodo = txtPeriodo.getText();
        String mes_inicio = jcbMesInicio.getSelectedItem() != null ? jcbMesInicio.getSelectedItem().toString() : "";
        String fecha = txtFechaMatricula.getText();
        String cod_alumno = txtCodAlumno.getText();
        String turno = jcbTurno.getSelectedItem() != null ? jcbTurno.getSelectedItem().toString() : "";
        String tipo = jcbTipoCurso.getSelectedItem() != null ? jcbTipoCurso.getSelectedItem().toString() : "";
        String cod_curso = jcbCurso.getSelectedItem() != null ? jcbCurso.getSelectedItem().toString() : "";
        String cod_emp = jcbDocente.getSelectedItem() != null ? jcbDocente.getSelectedItem().toString() : "";

        // Verificar si algún campo está vacío
        if (periodo.isEmpty() || mes_inicio.isEmpty() || fecha.isEmpty() || cod_alumno.isEmpty() ||
            turno.equals("Seleccione...") || tipo.equals("Seleccione...") || cod_curso.equals("Seleccione...") || cod_emp.equals("Seleccione...")) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.");
            return true; // Hay campos vacíos
        }

        return false; // No hay campos vacíos
    }
    
    public boolean validarFecha(String fecha) {
    try {
        LocalDate.parse(fecha, DateTimeFormatter.ISO_LOCAL_DATE);
        return true;
    } catch (DateTimeParseException e) {
        return false;
    }
    }
    
    
    public void RegistrarM() {
        // Verificar campos vacíos antes de continuar
        if (verificarCamposM()) {
            return; // Salir del método si hay campos vacíos
        }

        String periodo = txtPeriodo.getText();
        String mes_inicio = jcbMesInicio.getSelectedItem().toString();
        String fecha = txtFechaMatricula.getText();
        String cod_alumno = txtCodAlumno.getText().toUpperCase(); // Convertir a mayúsculas
        String tipo = jcbTipoCurso.getSelectedItem().toString();
        String turno = jcbTurno.getSelectedItem().toString();
        String cod_curso = jcbCurso.getSelectedItem().toString();
        String cod_emp = jcbDocente.getSelectedItem().toString();

        // Verificar si la fecha es válida
        if (!validarFecha(fecha)) {
            JOptionPane.showMessageDialog(this, "Ingrese una fecha válida en el formato 'año-mes-día'.");
            return;
        }

        // Crear las consultas SQL de inserción
        String sqlMatricula = "INSERT INTO tb_matricula (periodo, mes_inicio, fecha, turno, cod_alumno, cod_curso, cod_emp) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?)";
        String sqlNota = "INSERT INTO tb_nota (num_matricula, nota) VALUES (?, 0)";

        try (Connection conn = ConexionBD.conectarBD();
             PreparedStatement pstMatricula = conn.prepareStatement(sqlMatricula, Statement.RETURN_GENERATED_KEYS);
             PreparedStatement pstNota = conn.prepareStatement(sqlNota)) {

            // Establecer valores de parámetros para tb_matricula
            pstMatricula.setString(1, periodo);
            pstMatricula.setString(2, mes_inicio);
            pstMatricula.setString(3, fecha);
            pstMatricula.setString(4, turno);
            pstMatricula.setString(5, cod_alumno);
            pstMatricula.setString(6, obtenerIdCurso(cod_curso));
            pstMatricula.setString(7, obtenerIdDocente(cod_emp));

            // Ejecutar la consulta de inserción en tb_matricula
            int filasInsertadasMatricula = pstMatricula.executeUpdate();

            // Verificar si se insertaron filas correctamente en tb_matricula
            if (filasInsertadasMatricula > 0) {
                JOptionPane.showMessageDialog(this, "Matrícula registrada exitosamente.");

                // Totalizar matrículas y actualizar tabla de matrículas
                TotalMatriculas();
                mostrarM("");

                // Recuperar el ID generado (num_matricula)
                ResultSet generatedKeys = pstMatricula.getGeneratedKeys();
                int num_matricula = -1;
                if (generatedKeys.next()) {
                    num_matricula = generatedKeys.getInt(1);
                }

                // Verificar si se obtuvo el ID generado
                if (num_matricula != -1) {
                    // Establecer el ID generado en la consulta para tb_nota
                    pstNota.setInt(1, num_matricula);

                    // Ejecutar la consulta de inserción en tb_nota
                    int filasInsertadasNota = pstNota.executeUpdate();

                    // Verificar si se insertaron filas correctamente en tb_nota
                    if (filasInsertadasNota > 0) {
                        JOptionPane.showMessageDialog(this, "Nota registrada exitosamente.");
                    } else {
                        JOptionPane.showMessageDialog(this, "Error al registrar la nota.");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Error al obtener el ID generado.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Error al registrar la matrícula.");
            }
            LimpiarCamposM();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al registrar la matrícula: " + ex.getMessage());
            Logger.getLogger(jfrmMatricula.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Ingrese la fecha en un formato válido. Ejemplo: año-mes-día.");
        }
    }


    
    public void ActualizarM(){
        String fecha = txtFechaMatricula.getText();
        int filaSeleccionada = tblMatricula.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una Matrícula para actualizar.");
            return;
        }
        if (verificarCamposM()) {
            return; // Salir del método si hay campos vacíos
        }
        if (!validarFecha(fecha)) {
            JOptionPane.showMessageDialog(this, "Ingrese una fecha válida en el formato 'año-mes-día'.");
            return;
        }
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Desea Modificar la Mátricula?", "Modificar Mátricula", JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {
        try {
            String numMatricula = tblMatricula.getValueAt(filaSeleccionada, 0).toString(); // Obtener el número de matrícula seleccionado

            Connection conn = ConexionBD.conectarBD();
            String sql = "UPDATE tb_matricula SET periodo=?, mes_inicio=?, fecha=?, turno=?, cod_curso=?, cod_emp=? WHERE num_matricula=?";
            PreparedStatement pst = conn.prepareStatement(sql);

            pst.setString(1, txtPeriodo.getText());
            pst.setString(2, jcbMesInicio.getSelectedItem().toString());
            pst.setString(3, txtFechaMatricula.getText());
            pst.setString(4, jcbTurno.getSelectedItem().toString());
            pst.setString(5, obtenerIdCurso(jcbCurso.getSelectedItem().toString()));
            pst.setString(6, obtenerIdDocente(jcbDocente.getSelectedItem().toString()));
            pst.setString(7, numMatricula); // Establecer el número de matrícula en la consulta

            int filasActualizadas = pst.executeUpdate();

            if (filasActualizadas > 0) {
                JOptionPane.showMessageDialog(this, "Matrícula actualizada exitosamente.");
                mostrarM("");
            } else {
                JOptionPane.showMessageDialog(this, "Error al actualizar la matrícula.");
            }
            LimpiarCamposM();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error al actualizar la matrícula: " + ex.getMessage());
            Logger.getLogger(jfrmMatricula.class.getName()).log(Level.SEVERE, null, ex);
        } }
    }
    
    public void BorrarM() {
    int fila = tblMatricula.getSelectedRow();
    if (fila == -1) {
        JOptionPane.showMessageDialog(this, "Seleccione una Mátricula para borrar.");
        return;
    }

    // Verificar si hay campos vacíos
    if (verificarCamposM()) {
        return;
    }

    String numMatricula = tblMatricula.getValueAt(fila, 0).toString();
    int confirmacion = JOptionPane.showConfirmDialog(null, "¿Desea eliminar la Mátricula?", "Eliminar Mátricula", JOptionPane.YES_NO_OPTION);
    if (confirmacion == JOptionPane.YES_OPTION) {
        try {
            Connection conn = ConexionBD.conectarBD();
            // Eliminar las notas asociadas a la matrícula
            String sqlDeleteNotas = "DELETE FROM tb_nota WHERE num_matricula=?";
            PreparedStatement pstDeleteNotas = conn.prepareStatement(sqlDeleteNotas);
            pstDeleteNotas.setString(1, numMatricula);
            pstDeleteNotas.executeUpdate();

            // Luego, eliminar la matrícula
            String sql = "DELETE FROM tb_matricula WHERE num_matricula=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, numMatricula);
            int filasActualizadas = pst.executeUpdate();

            if (filasActualizadas > 0) {
                JOptionPane.showMessageDialog(this, "Mátricula borrado exitosamente.");
                TotalMatriculas();
                mostrarM("");
                LimpiarCamposM();
            } else {
                JOptionPane.showMessageDialog(this, "Error al borrar la Mátricula.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(jfrmMatricula.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

    
    
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
            java.util.logging.Logger.getLogger(jfrmMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfrmMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfrmMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfrmMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfrmMatricula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Matricula;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBorrarM;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLimpiarM;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnModificarM;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnRegistrarM;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> jcbCurso;
    private javax.swing.JComboBox<String> jcbDocente;
    private javax.swing.JComboBox<String> jcbMesInicio;
    private javax.swing.JComboBox<String> jcbTipoCurso;
    private javax.swing.JComboBox<String> jcbTurno;
    private javax.swing.JLabel jlabel3;
    private javax.swing.JLabel logointer;
    private javax.swing.JTable tblAlumno;
    private javax.swing.JTable tblMatricula;
    private javax.swing.JTextField txtApellidoAlumno;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtBuscarM;
    private javax.swing.JTextField txtCodAlumno;
    private javax.swing.JTextField txtCodigoAlumno;
    private javax.swing.JTextField txtCorreoAlumno;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFechaMatricula;
    private javax.swing.JTextField txtNombreAlumno;
    private javax.swing.JTextField txtNumMatricula;
    private javax.swing.JTextField txtPeriodo;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTotalALumnos;
    private javax.swing.JTextField txtTotalM;
    // End of variables declaration//GEN-END:variables
}
