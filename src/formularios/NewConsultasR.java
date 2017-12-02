/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author VICTOR
 */
public class NewConsultasR extends javax.swing.JInternalFrame {

    /**
     * Creates new form NewConsultasR
     */
    public NewConsultasR() {
        initComponents();
        limpiar();
        bloquear();
    }
    
    void limpiar(){
        txtcodcon.setText("");
        txtcodcli.setText("");
        txtcodtec.setText("");
        txtfecini.setText("");
        txtpro.setText("");
        //txtsol.setText("");
        //txtfecter.setText("");
        
    }
    void bloquear(){
        txtcodcon.setEnabled(false);
        txtcodcli.setEnabled(false);
        txtcodtec.setEnabled(false);
        txtfecini.setEnabled(false);
        txtpro.setEnabled(false);
        //txtsol.setEnabled(false);
        //txtfecter.setEnabled(false);
        btnNue.setEnabled(true);
        btnGua.setEnabled(false);
    }
    void desbloquear(){
        txtcodcon.setEnabled(false);
        txtcodcli.setEnabled(true);
        txtcodtec.setEnabled(true);
        txtfecini.setEnabled(true);
        txtpro.setEnabled(true);
        //txtsol.setEnabled(true);
        //txtfecter.setEnabled(true);
        btnNue.setEnabled(false);
        btnGua.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtcodcli = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtcodtec = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtfecini = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtcodcon = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtpro = new javax.swing.JTextArea();
        btnNue = new javax.swing.JButton();
        btnGua = new javax.swing.JButton();

        setBackground(new java.awt.Color(222, 222, 222));

        jPanel1.setBackground(new java.awt.Color(222, 222, 222));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consultas", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("EngraversGothic BT", 0, 16), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(222, 222, 222));
        jLabel1.setFont(new java.awt.Font("EngraversGothic BT", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Codigo Cliente");

        txtcodcli.setBackground(new java.awt.Color(222, 222, 222));
        txtcodcli.setFont(new java.awt.Font("EngraversGothic BT", 0, 15)); // NOI18N
        txtcodcli.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setBackground(new java.awt.Color(222, 222, 222));
        jLabel2.setFont(new java.awt.Font("EngraversGothic BT", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Codigo Tecnico");

        txtcodtec.setBackground(new java.awt.Color(222, 222, 222));
        txtcodtec.setFont(new java.awt.Font("EngraversGothic BT", 0, 15)); // NOI18N
        txtcodtec.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setBackground(new java.awt.Color(222, 222, 222));
        jLabel3.setFont(new java.awt.Font("EngraversGothic BT", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Fecha de Inicio");

        txtfecini.setBackground(new java.awt.Color(222, 222, 222));
        txtfecini.setFont(new java.awt.Font("EngraversGothic BT", 0, 15)); // NOI18N
        txtfecini.setForeground(new java.awt.Color(0, 0, 0));

        jLabel4.setBackground(new java.awt.Color(222, 222, 222));
        jLabel4.setFont(new java.awt.Font("EngraversGothic BT", 0, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Tipo de problema");

        jLabel7.setBackground(new java.awt.Color(222, 222, 222));
        jLabel7.setFont(new java.awt.Font("EngraversGothic BT", 0, 15)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Codigo de Consulta");

        txtcodcon.setBackground(new java.awt.Color(222, 222, 222));
        txtcodcon.setFont(new java.awt.Font("EngraversGothic BT", 0, 15)); // NOI18N
        txtcodcon.setForeground(new java.awt.Color(0, 0, 0));

        txtpro.setBackground(new java.awt.Color(222, 222, 222));
        txtpro.setColumns(20);
        txtpro.setFont(new java.awt.Font("EngraversGothic BT", 0, 15)); // NOI18N
        txtpro.setForeground(new java.awt.Color(0, 0, 0));
        txtpro.setRows(5);
        jScrollPane1.setViewportView(txtpro);

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel7))
                                    .addGap(42, 42, 42)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtcodcon, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                        .addComponent(txtcodcli)))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addGap(74, 74, 74)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtfecini)
                                        .addComponent(txtcodtec))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 678, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(btnNue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(210, 210, 210)
                        .addComponent(btnGua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(120, 120, 120)))
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcodcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtcodcli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcodtec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtfecini, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGua)
                    .addComponent(btnNue))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNueActionPerformed
        desbloquear();
        limpiar();
        
    }//GEN-LAST:event_btnNueActionPerformed

    private void btnGuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuaActionPerformed
        conectar cc = new conectar();
        Connection cn = cc.conexion();
        String codcon, codcli, codtec, fecini, procon ;

        String sql = "";
        //codcon = txtcodcon.getText();
        codcli = txtcodcli.getText();
        codtec = txtcodtec.getText();
        fecini = txtfecini.getText();
        procon = txtpro.getText();
        //solcon = txtsol.getText();
        //fecter = txtfecter.getText();
        sql = "INSERT INTO consultas (cliente_cod_cli, tecnico_cod_tec, fec_rev, pro_con) VALUES(?,?,?,?)";
        try {
            PreparedStatement psd = cn.prepareStatement(sql);
            psd.setString(1,codcli );
            psd.setString(2,codtec );
            psd.setString(3,fecini );
            psd.setString(4,procon );
            //psd.setString(5, solcon);
            //psd.setString(6,fecter );
            
            int n = psd.executeUpdate();
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Registro guardado con exito");
                
                limpiar();
                bloquear();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Pprincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnGuaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGua;
    private javax.swing.JButton btnNue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtcodcli;
    private javax.swing.JTextField txtcodcon;
    private javax.swing.JTextField txtcodtec;
    private javax.swing.JTextField txtfecini;
    private javax.swing.JTextArea txtpro;
    // End of variables declaration//GEN-END:variables
}
