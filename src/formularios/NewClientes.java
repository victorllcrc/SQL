/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author VICTOR
 */
public class NewClientes extends javax.swing.JInternalFrame {

    /**
     * Creates new form NewJInternalFrame
     */
    DefaultTableModel model;

    public NewClientes() {
        initComponents();
        limpiar();
        bloquear();
        cargar("");
    }

    //METODOS IMPLEMENTADOS
    void cargar(String valor) {
        String[] titulos = {"Codigo", "Nombre", "Apellidos", "DNI", "Telefono"};
        String[] registros = new String[5];

        String sql = "SELECT * FROM clientes where CONCAT(nom_cli,' ', ape_cli) LIKE '%" + valor + "%'";

        model = new DefaultTableModel(null, titulos);

        conectar cc = new conectar();
        Connection cn = cc.conexion();

        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                registros[0] = rs.getString("cod_cli");
                registros[1] = rs.getString("nom_cli");
                registros[2] = rs.getString("ape_cli");
                registros[3] = rs.getString("dni_cli");
                registros[4] = rs.getString("tel_cli");
                model.addRow(registros);
            }
            t_datos.setModel(model);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }

    }

    void limpiar() {
        txtnom.setText("");
        txtape.setText("");
        txtDNI.setText("");
        txtTel.setText("");
        txtcod.setText("");
        
    }

    void bloquear() {
        txtnom.setEnabled(false);
        txtape.setEnabled(false);
        txtDNI.setEnabled(false);
        txtTel.setEnabled(false);
        btnNue.setEnabled(true);
        btnGua.setEnabled(false);
        btnEli.setEnabled(true);
        btnedi.setEnabled(true);
        btnact.setEnabled(false);
        
    }
    
    void desbloquear() {
        txtnom.setEnabled(true);
        txtape.setEnabled(true);
        txtDNI.setEnabled(true);
        txtTel.setEnabled(true);
        btnNue.setEnabled(false);
        btnGua.setEnabled(true);
        btnEli.setEnabled(false);
        btnedi.setEnabled(false);
        btnact.setEnabled(false);
    }
    void desbloquear1() {
        txtnom.setEnabled(true);
        txtape.setEnabled(true);
        txtDNI.setEnabled(true);
        txtTel.setEnabled(true);
        btnNue.setEnabled(false);
        btnGua.setEnabled(false);
        btnEli.setEnabled(false);
        btnedi.setEnabled(true);
        btnact.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        txtBus = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtnom = new javax.swing.JTextField();
        txtape = new javax.swing.JTextField();
        txtDNI = new javax.swing.JTextField();
        txtTel = new javax.swing.JTextField();
        btnNue = new javax.swing.JButton();
        btnGua = new javax.swing.JButton();
        btnEli = new javax.swing.JButton();
        btnedi = new javax.swing.JButton();
        btnact = new javax.swing.JButton();
        txtcod = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_datos = new javax.swing.JTable();

        setBackground(new java.awt.Color(222, 222, 222));
        setClosable(true);

        jPanel5.setBackground(new java.awt.Color(222, 222, 222));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("EngraversGothic BT", 0, 16), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel5.setForeground(new java.awt.Color(0, 0, 0));

        txtBus.setBackground(new java.awt.Color(240, 240, 240));
        txtBus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBusActionPerformed(evt);
            }
        });
        txtBus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBusKeyReleased(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(222, 222, 222));
        jButton4.setForeground(new java.awt.Color(0, 0, 0));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/search.png"))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addComponent(txtBus, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(txtBus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(222, 222, 222));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar Cliente", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("EngraversGothic BT", 0, 16), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel6.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(222, 222, 222));
        jLabel1.setFont(new java.awt.Font("EngraversGothic BT", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre :");

        jLabel2.setBackground(new java.awt.Color(222, 222, 222));
        jLabel2.setFont(new java.awt.Font("EngraversGothic BT", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("DNI :");

        jLabel3.setBackground(new java.awt.Color(222, 222, 222));
        jLabel3.setFont(new java.awt.Font("EngraversGothic BT", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Apellido :");

        jLabel4.setBackground(new java.awt.Color(222, 222, 222));
        jLabel4.setFont(new java.awt.Font("EngraversGothic BT", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Telefono ;");

        txtnom.setBackground(new java.awt.Color(240, 240, 240));
        txtnom.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtnom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomActionPerformed(evt);
            }
        });

        txtape.setBackground(new java.awt.Color(240, 240, 240));
        txtape.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapeActionPerformed(evt);
            }
        });

        txtDNI.setBackground(new java.awt.Color(240, 240, 240));
        txtDNI.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNIActionPerformed(evt);
            }
        });

        txtTel.setBackground(new java.awt.Color(240, 240, 240));
        txtTel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtTel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelActionPerformed(evt);
            }
        });

        btnNue.setBackground(new java.awt.Color(222, 222, 222));
        btnNue.setFont(new java.awt.Font("EngraversGothic BT", 0, 16)); // NOI18N
        btnNue.setForeground(new java.awt.Color(0, 0, 0));
        btnNue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/male-user.png"))); // NOI18N
        btnNue.setText("Nuevo");
        btnNue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNueActionPerformed(evt);
            }
        });

        btnGua.setBackground(new java.awt.Color(222, 222, 222));
        btnGua.setFont(new java.awt.Font("EngraversGothic BT", 0, 16)); // NOI18N
        btnGua.setForeground(new java.awt.Color(0, 0, 0));
        btnGua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/save.png"))); // NOI18N
        btnGua.setText("Guardar");
        btnGua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuaActionPerformed(evt);
            }
        });

        btnEli.setBackground(new java.awt.Color(222, 222, 222));
        btnEli.setFont(new java.awt.Font("EngraversGothic BT", 0, 16)); // NOI18N
        btnEli.setForeground(new java.awt.Color(0, 0, 0));
        btnEli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/recycle-full.png"))); // NOI18N
        btnEli.setText("Eliminar");
        btnEli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliActionPerformed(evt);
            }
        });

        btnedi.setBackground(new java.awt.Color(222, 222, 222));
        btnedi.setFont(new java.awt.Font("EngraversGothic BT", 0, 16)); // NOI18N
        btnedi.setForeground(new java.awt.Color(0, 0, 0));
        btnedi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/edit.png"))); // NOI18N
        btnedi.setText("Editar");
        btnedi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnediActionPerformed(evt);
            }
        });

        btnact.setBackground(new java.awt.Color(222, 222, 222));
        btnact.setFont(new java.awt.Font("EngraversGothic BT", 0, 16)); // NOI18N
        btnact.setForeground(new java.awt.Color(0, 0, 0));
        btnact.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/edit.png"))); // NOI18N
        btnact.setText("Actualizar");
        btnact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactActionPerformed(evt);
            }
        });

        txtcod.setBackground(new java.awt.Color(240, 240, 240));
        txtcod.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtcod.setEnabled(false);
        txtcod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(222, 222, 222));
        jLabel5.setFont(new java.awt.Font("EngraversGothic BT", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Codigo:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtape, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtcod, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtTel, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtDNI, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnact, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnedi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNue, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGua))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(btnEli, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNue)
                            .addComponent(btnGua))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEli)
                            .addComponent(btnedi)
                            .addComponent(btnact)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtape, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtcod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(222, 222, 222));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clientes Registrados", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("EngraversGothic BT", 0, 16), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel7.setForeground(new java.awt.Color(0, 0, 0));

        t_datos.setBackground(new java.awt.Color(222, 222, 222));
        t_datos.setFont(new java.awt.Font("EngraversGothic BT", 1, 12)); // NOI18N
        t_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        t_datos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t_datosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(t_datos);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuaActionPerformed
        conectar cc = new conectar();
        Connection cn = cc.conexion();
        String nom, ape, tel;
        int dni;
        String sql = "";
        nom = txtnom.getText();
        ape = txtape.getText();
        dni = Integer.parseInt(txtDNI.getText());  //int b = Integer.parseInt("900");  COVERSIOND DE String a Int 
        tel = txtTel.getText();
        sql = "INSERT INTO clientes (nom_cli, ape_cli, dni_cli, tel_cli) VALUES(?,?,?,?)";
        try {
            PreparedStatement psd = cn.prepareStatement(sql);
            psd.setString(1, nom);
            psd.setString(2, ape);
            psd.setInt(3, dni);
            psd.setString(4, tel);
            int n = psd.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Registro guardado con exito");
                cargar("");
                limpiar();
                bloquear();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ing_cli.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnGuaActionPerformed

    private void btnNueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNueActionPerformed
        desbloquear();
        limpiar();
        txtnom.requestFocus();
    }//GEN-LAST:event_btnNueActionPerformed

    private void txtnomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomActionPerformed

        txtnom.transferFocus();
    }//GEN-LAST:event_txtnomActionPerformed

    private void txtapeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapeActionPerformed
        txtape.transferFocus();
    }//GEN-LAST:event_txtapeActionPerformed

    private void txtDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNIActionPerformed
        txtDNI.transferFocus();
    }//GEN-LAST:event_txtDNIActionPerformed

    private void txtTelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelActionPerformed
        txtTel.transferFocus();
    }//GEN-LAST:event_txtTelActionPerformed

    private void txtBusKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusKeyReleased
        cargar(txtBus.getText());
    }//GEN-LAST:event_txtBusKeyReleased

    private void btnEliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliActionPerformed
        conectar cc = new conectar();
        Connection cn = cc.conexion();
        //String nom, ape, tel;
        //int dni;
        String sql = "";
        String cod = txtcod.getText();
        //ape = txtape.getText();
        //dni = Integer.parseInt(txtDNI.getText());  //int b = Integer.parseInt("900");  COVERSIOND DE String a Int 
        //tel = txtTel.getText();
        sql = "DELETE FROM clientes WHERE cod_cli=?";
        try {
            PreparedStatement psd = cn.prepareStatement(sql);
            psd.setString(1, cod);
            int n = psd.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Registro eliminado con exito");
                cargar("");
                bloquear();
            }
        } catch (SQLException ex) {
            Logger.getLogger(ing_cli.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEliActionPerformed

    private void t_datosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_datosMouseClicked

        int fil = t_datos.getSelectedRow();

      
            txtcod.setText((String) model.getValueAt(fil, 0));
            txtnom.setText((String) model.getValueAt(fil, 1));
            txtape.setText((String) model.getValueAt(fil, 2));
            txtDNI.setText((String) model.getValueAt(fil, 3));
            txtTel.setText((String) model.getValueAt(fil, 4));

        


    }//GEN-LAST:event_t_datosMouseClicked

    private void btnactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactActionPerformed
        conectar cc = new conectar();
        Connection cn = cc.conexion();
        try {
            PreparedStatement pps = cn.prepareStatement("UPDATE clientes SET nom_cli='"+txtnom.getText()+"',ape_cli='"+txtape.getText()+"',"
                    + "dni_cli='"+txtDNI.getText()+"',tel_cli='"+txtTel.getText()+"'WHERE cod_cli='"+txtcod.getText()+"'");
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "datos actualizados");
            limpiar();
            cargar("");
            bloquear();
        } catch (SQLException ex) {
            Logger.getLogger(NewClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnactActionPerformed

    private void txtcodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodActionPerformed

    private void txtBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBusActionPerformed

    private void btnediActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnediActionPerformed
        desbloquear1();
    }//GEN-LAST:event_btnediActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEli;
    private javax.swing.JButton btnGua;
    private javax.swing.JButton btnNue;
    private javax.swing.JButton btnact;
    private javax.swing.JButton btnedi;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable t_datos;
    private javax.swing.JTextField txtBus;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtTel;
    private javax.swing.JTextField txtape;
    private javax.swing.JTextField txtcod;
    private javax.swing.JTextField txtnom;
    // End of variables declaration//GEN-END:variables
}