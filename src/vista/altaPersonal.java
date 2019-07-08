package vista;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import org.apache.commons.dbutils.DbUtils;

public class altaPersonal extends javax.swing.JInternalFrame {

    Conexion con=new Conexion();
    Connection cn=con.conectar();

    DefaultTableModel modelo;

    public altaPersonal() {
        initComponents();

        // se manda llamar al metodo de llenado de tabla
        tabla();
        // se manda a llamar el metodo nuevo que hace ciertos campos de textos editables
        camposInicio();
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btNuevo = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        jbAgregar = new javax.swing.JButton();
        btModificar = new javax.swing.JButton();
        btBorrar = new javax.swing.JButton();
        txtClave = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jcCategoria = new javax.swing.JComboBox<>();

        setBackground(new java.awt.Color(102, 102, 102));
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial Narrow", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graficos/alta_personal.png"))); // NOI18N

        jLabel2.setText("Nombre");

        jLabel3.setText("Usuario");

        jLabel4.setText("Clave");

        jLabel6.setText("Categoria:");

        btSalir.setMnemonic('s');
        btSalir.setText("Salir");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });
        btSalir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                btSalirKeyReleased(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Usuario", "Clave", "Categoria"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setResizable(false);
            tabla.getColumnModel().getColumn(0).setPreferredWidth(300);
            tabla.getColumnModel().getColumn(1).setResizable(false);
            tabla.getColumnModel().getColumn(1).setPreferredWidth(100);
            tabla.getColumnModel().getColumn(2).setResizable(false);
            tabla.getColumnModel().getColumn(2).setPreferredWidth(100);
            tabla.getColumnModel().getColumn(3).setResizable(false);
            tabla.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Acciones"));

        btNuevo.setBackground(new java.awt.Color(153, 153, 255));
        btNuevo.setMnemonic('n');
        btNuevo.setText("Nuevo");
        btNuevo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevoActionPerformed(evt);
            }
        });

        btEditar.setMnemonic('e');
        btEditar.setText("Editar");
        btEditar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        jbAgregar.setMnemonic('a');
        jbAgregar.setText("Agregar");
        jbAgregar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        btModificar.setMnemonic('m');
        btModificar.setText("Modificar");
        btModificar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModificarActionPerformed(evt);
            }
        });

        btBorrar.setMnemonic('d');
        btBorrar.setText("Activar/Des");
        btBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btNuevo)
                .addGap(18, 18, 18)
                .addComponent(jbAgregar)
                .addGap(18, 18, 18)
                .addComponent(btEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btBorrar)
                .addGap(25, 25, 25))
        );

        jLabel7.setText("Dirección:");

        jLabel8.setText("eMail:");

        jLabel9.setText("Telefono:");

        jcCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ENCARGADO", "DESPACHADOR" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7))
                                .addComponent(jLabel8))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel3))
                                            .addGap(43, 43, 43))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(27, 27, 27)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jcCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jcCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btSalir)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        // Salir del menu de alta
        this.dispose();
    }//GEN-LAST:event_btSalirActionPerformed

    private void btNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoActionPerformed
        //Agregar nuevo campo
        camposNuevo();


    }//GEN-LAST:event_btNuevoActionPerformed

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        //Agregar nuevo usuario
        int contador = 0; //se asigna un contador en caso de un registro repetido

        if (txtNombre.getText().equals("")){
            JOptionPane.showMessageDialog(this, "falta escribir el nombre");
            txtNombre.requestFocus();
        } else if (txtDireccion.getText().equals("")){
            JOptionPane.showMessageDialog(this, "falta escribir la dirección");
            txtDireccion.requestFocus();
        }else if (txtTelefono.getText().equals("")){
            JOptionPane.showMessageDialog(this, "falta escribir el telefono");
            txtTelefono.requestFocus();
        }else if (txtUsuario.getText().equals("")){
            JOptionPane.showMessageDialog(this, "falta escribir el Usuario de acceso");
            txtUsuario.requestFocus();
        }else if (txtClave.getText().equals("")){
            JOptionPane.showMessageDialog(this, "falta escribir la clave de acceso");
            txtClave.requestFocus();
        } else {
            Connection cn = con.conectar();
            ResultSet rs = null;
            Statement st = null;
            try {
                // revisamos si no hay un nombre o un usario ya en la bd con los mismos datos
                String sql = "SELECT * FROM personal WHERE (nombre='" + txtNombre.getText()
                        + "') and (usuario='" + txtUsuario.getText() + "')";
                st = cn.createStatement();
                rs = st.executeQuery(sql);

                while (rs.next()) {
                    JOptionPane.showMessageDialog(this, "El registro esta repetido en la base de datos");
                    contador++;
}
                
            } catch (SQLException ex) {
                Logger.getLogger(altaPersonal.class.getName()).log(Level.SEVERE, null, ex);
            } 
            if (contador == 0) {
           
                try {
                    //se prepara a insertarlo en la tabla de usuarios   
                    st = cn.createStatement();
                    String sql = "INSERT INTO personal (nombre,direccion,telefono,email,activo,usuario,clave,categoria)"
                            + " VALUES ('"
                            + txtNombre.getText() + "','"
                            + txtDireccion.getText() + "','"
                            + txtTelefono.getText() + "','"
                            + txtEmail.getText() + "','SI', '"
                            + txtUsuario.getText() + "','"
                            + txtClave.getText() + "','"
                            + jcCategoria.getSelectedItem().toString() + "')";
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(this, "se agregado el nuevo usuario");
                    tabla();
                    camposInicio();
                    btNuevo.setEnabled(true);
                    btBorrar.setEnabled(true);
                    limpiar();

                } catch (SQLException ex) {
                    Logger.getLogger(altaPersonal.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    DbUtils.closeQuietly(st);
                    DbUtils.closeQuietly(rs);
                    DbUtils.closeQuietly(cn);
                }
            }
        }
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        //Editar
        // Se modifica un dato de la tabla
        //primero limpio los campos
        limpiar();
        // agrego 3 variables tipo cadena que llenaran los campos a cambiar
        String nuevoNombre;
        String nuevoUsuario;
        

        //ahora agrego los datos seleccionados de la tabla
        int fila = tabla.getSelectedRow();

        if (fila >= 0) {
            nuevoNombre = tabla.getValueAt(fila, 1).toString();
            txtNombre.setText(nuevoNombre);
            nuevoUsuario = tabla.getValueAt(fila, 2).toString();
            txtUsuario.setText(nuevoUsuario);
        
            
        }
        //aqui reviso que si se pasaron datos a la clave y activo el boton editar;
        if (txtNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Selecciona un campo de la Tabla");
        } else {
            btEditar.setEnabled(false);
            btModificar.setEnabled(true);
            txtNombre.setEnabled(true);
            txtClave.setEnabled(true); 
            btNuevo.setEnabled(false);
            btBorrar.setEnabled(false);
        }


    }//GEN-LAST:event_btEditarActionPerformed

    private void btModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModificarActionPerformed
            Connection cn = con.conectar();
            ResultSet rs = null;
            Statement st = null;

        //Boton de modificar campos
        if (txtNombre.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "faltan Datos por escribir");
        }
        
        if (txtUsuario.getText().equals("admin")&&!txtClave.getText().equals("")){
            //actualizamos clave de admin
            
            try {//se prepara a insertarlo en la tabla de usuarios   
                
                st = cn.createStatement();
                String sql = "UPDATE personal SET clave='" + txtClave.getText() + "' WHERE usuario='" + txtUsuario.getText() + "'";
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(this, "se ha modificado la clave de administrador ");
                tabla();
                btNuevo.setEnabled(true);
                btBorrar.setEnabled(true);
                btEditar.setEnabled(true);
                btModificar.setEnabled(false);
                txtNombre.setEnabled(false);
                txtClave.setEnabled(false);

                limpiar();
            } catch (SQLException ex) {
                Logger.getLogger(altaPersonal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if (txtClave.getText().equals("")&& !txtUsuario.getText().equals("admin")) {
           
            try {//se prepara a insertarlo en la tabla de usuarios   
                
                st = cn.createStatement();
                String sql = "UPDATE personal SET usuario='" + txtUsuario.getText() + "',nombre='" + txtNombre.getText() + "',"
                        + "categoria='" + jcCategoria.getSelectedItem().toString() + "' WHERE usuario='" + txtUsuario.getText() + "'";
                System.out.println (sql);
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(this, "se ha modificado el Usuario " + txtUsuario.getText());
                tabla();
                btNuevo.setEnabled(true);
                btBorrar.setEnabled(true);
                btEditar.setEnabled(true);
                btModificar.setEnabled(false);
                txtNombre.setEnabled(false);
                txtClave.setEnabled(false);

                limpiar();
            } catch (SQLException ex) {
                Logger.getLogger(altaPersonal.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (!txtUsuario.getText().equals("admin")){
            try {
                String password = txtClave.getText();
                //se prepara a insertarlo en la tabla de usuarios   
                
                st = cn.createStatement();
                String sql = "UPDATE personal SET usuario='" + txtUsuario.getText() + "',nombre='" + txtNombre.getText() + "',"
                        + "clave='" + password + "',categoria='" + jcCategoria.getSelectedItem().toString() + "' WHERE usuario='" + txtUsuario.getText() + "'";
                System.out.println(sql);
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(this, "se ha modificado el Usuario " + txtUsuario.getText());
                tabla();
                btNuevo.setEnabled(true);
                btBorrar.setEnabled(true);
                btEditar.setEnabled(true);
                btModificar.setEnabled(false);
                txtNombre.setEnabled(false);
                txtClave.setEnabled(false);

                limpiar();
            } catch (SQLException ex) {
                Logger.getLogger(altaPersonal.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                DbUtils.closeQuietly(st);
                DbUtils.closeQuietly(rs);
                DbUtils.closeQuietly(cn);
            }
        }else {
           tabla();
                btNuevo.setEnabled(true);
                btBorrar.setEnabled(true);
                btEditar.setEnabled(true);
                btModificar.setEnabled(false);
                txtNombre.setEnabled(false);
                txtClave.setEnabled(false); 
        }

    }//GEN-LAST:event_btModificarActionPerformed

    private void btBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBorrarActionPerformed
        //actualizamos el estado del personal
        int fila = tabla.getSelectedRow();

        if (fila >= 0) {
            String id = tabla.getValueAt(fila, 0).toString();
            if (id.equals("1")) {
                JOptionPane.showMessageDialog(rootPane, "No puedes cambiar el estado del administrador");
            } else {
                Connection cn = con.conectar();
                ResultSet rs = null;
                Statement st = null;
                try {
                    String activo = null;
                    st = cn.createStatement();
                    rs = st.executeQuery("SELECT activo FROM personal WHERE idpersonal='" + id + "'");
                    while (rs.next()) {
                        activo = rs.getString("activo");
                    }
                    if (activo.equals("SI")) {
                        st = cn.createStatement();
                        st.executeUpdate("UPDATE personal SET activo='NO' WHERE idpersonal='" + id + "'");
                    } else {
                        st = cn.createStatement();
                        st.executeUpdate("UPDATE personal SET activo='SI' WHERE idpersonal='" + id + "'");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(altaPersonal.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    DbUtils.closeQuietly(st);
                    DbUtils.closeQuietly(rs);
                    DbUtils.closeQuietly(cn);
                }

            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Selecciona un usuario de la tabla");
        }
        tabla();
    }//GEN-LAST:event_btBorrarActionPerformed

    private void btSalirKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btSalirKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_btSalirKeyReleased

    void camposInicio() {
        txtNombre.setEnabled(false);
        txtUsuario.setEnabled(false);
        txtClave.setEnabled(false);
        txtDireccion.setEnabled(false);
        txtEmail.setEnabled(false);
        txtTelefono.setEnabled(false);
        jcCategoria.setEnabled(false);
        jbAgregar.setEnabled(false);
        btModificar.setEnabled(false);
        btEditar.setEnabled(true);
        btBorrar.setEnabled(true);
    }

    void camposNuevo() {
        txtNombre.setEnabled(true);
        txtNombre.requestFocus();
        txtDireccion.setEnabled(true);
        txtEmail.setEnabled(true);
        txtTelefono.setEnabled(true);
        jcCategoria.setEnabled(true);
        txtUsuario.setEnabled(true);
        txtClave.setEnabled(true);
        jbAgregar.setEnabled(true);
        btNuevo.setEnabled(false);
        btEditar.setEnabled(false);
        btBorrar.setEnabled(false);
    }

    void limpiar() {
        txtNombre.setText("");
        txtDireccion.setText("");
        txtEmail.setText("");
        txtTelefono.setText("");
        txtUsuario.setText("");
        txtClave.setText("");
    }

    void tabla() {
        // desde aqui mandamos a llamar a todos los usuarios y los listamos en la tabla
        // se crea una matriz para almacenar los datos

        String[] cabecera = {"Id", "Nombre", "Usuario", "Clave", "Categoria", "Telefono", "Activo"};
        // se definen los registros que llevara la tabla
        String[] registros = new String[7];
        // se hace el llamado sql de todos los usuarios
        String sql = "SELECT * FROM personal";
        //establecemos los anchos en pixeles de las columnas
        int[] anchos = {0, 180, 150,150,150,100,70};
        modelo = new DefaultTableModel(null, cabecera);
        Connection cn = con.conectar();
        ResultSet rs = null;
        Statement st = null;
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                registros[0] = rs.getString("idpersonal");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("usuario");
                registros[3] = rs.getString("clave");
                registros[4] = rs.getString("categoria");
                registros[5] = rs.getString("telefono");
                registros[6] = rs.getString("activo");

                modelo.addRow(registros);

            }
            tabla.setModel(modelo);
            for (int i = 0; i < cabecera.length; i++) {
                
                tabla.getColumnModel().getColumn(i).setMaxWidth(anchos[i]);
                tabla.getColumnModel().getColumn(i).setMinWidth(anchos[i]);
                tabla.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
                tabla.setFont(new java.awt.Font("Tahoma", 0, 12));
            }
        } catch (SQLException ex) {
            System.out.println("Sin poder ejecutar el query a la tabla" + ex);
        } finally {
            DbUtils.closeQuietly(st);
            DbUtils.closeQuietly(rs);
            DbUtils.closeQuietly(cn);
        }

    }

   
    public static void main(String args[]) {
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(altaPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(altaPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(altaPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(altaPersonal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new altaPersonal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBorrar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btModificar;
    private javax.swing.JButton btNuevo;
    private javax.swing.JButton btSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JComboBox<String> jcCategoria;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

    
}