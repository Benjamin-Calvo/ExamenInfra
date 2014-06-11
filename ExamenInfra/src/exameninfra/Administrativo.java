/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exameninfra;

/**
 *
 * @author Vargas
 */
public class Administrativo extends javax.swing.JFrame {

    /**
     * Creates new form Administrativo
     */
    public Administrativo() {
        initComponents();
        address_indirect_type.setVisible(false);
        

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
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sync_send = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        sync_receive = new javax.swing.JComboBox();
        label_address_direct_type = new javax.swing.JLabel();
        address_indirect_type = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        address_type = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        sync_receive1 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        sync_receive2 = new javax.swing.JComboBox();
        jSeparator4 = new javax.swing.JSeparator();
        label_address_direct_type1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        adm_continue_1 = new javax.swing.JButton();
        label_address_direct_type2 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();
        label_address_direct_type3 = new javax.swing.JLabel();
        jSpinner4 = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Configuración del Sistema de Memoria Virtual");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(450, 540));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(490, 400));

        jSeparator1.setForeground(new java.awt.Color(98, 156, 68));

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(98, 156, 68));
        jLabel1.setText("Policies");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel4.setText("Fetch:");

        sync_send.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Demand", "Prepaging" }));
        sync_send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sync_sendActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel5.setText("Placement:");

        sync_receive.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "First Available", "Next Available" }));
        sync_receive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sync_receiveActionPerformed(evt);
            }
        });

        label_address_direct_type.setBackground(new java.awt.Color(255, 255, 255));
        label_address_direct_type.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label_address_direct_type.setText("Replacement Scope:");
        label_address_direct_type.setOpaque(true);

        address_indirect_type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Global", "Local" }));
        address_indirect_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                address_indirect_typeActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel13.setText("Size:");

        address_type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Fixed", "Variable" }));
        address_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                address_typeActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel8.setText("Replacement:");

        sync_receive1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "FIFO", "MRU", "LRU", "Clock" }));
        sync_receive1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sync_receive1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(98, 156, 68));
        jLabel7.setText("System Parameters");

        jLabel9.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel9.setText("Cleaning:");

        sync_receive2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Demand", "Pre-cleaning" }));
        sync_receive2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sync_receive2ActionPerformed(evt);
            }
        });

        jSeparator4.setForeground(new java.awt.Color(98, 156, 68));

        label_address_direct_type1.setBackground(new java.awt.Color(255, 255, 255));
        label_address_direct_type1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label_address_direct_type1.setText("Memory:");
        label_address_direct_type1.setOpaque(true);

        jLabel14.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel14.setText("Size:");

        adm_continue_1.setBackground(new java.awt.Color(98, 156, 68));
        adm_continue_1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        adm_continue_1.setForeground(new java.awt.Color(0, 102, 0));
        adm_continue_1.setText("Continuar");
        adm_continue_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adm_continue_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adm_continue_1ActionPerformed(evt);
            }
        });

        label_address_direct_type2.setBackground(new java.awt.Color(255, 255, 255));
        label_address_direct_type2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label_address_direct_type2.setText("Process:");
        label_address_direct_type2.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(98, 156, 68));
        jLabel2.setText("Resident Set Management");

        jSeparator2.setForeground(new java.awt.Color(98, 156, 68));

        label_address_direct_type3.setBackground(new java.awt.Color(255, 255, 255));
        label_address_direct_type3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label_address_direct_type3.setText("Commands:");
        label_address_direct_type3.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(label_address_direct_type)
                                            .addComponent(jLabel13))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(address_indirect_type, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(address_type, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(44, 44, 44)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel9)
                                                    .addComponent(jLabel8)
                                                    .addComponent(jLabel5))
                                                .addGap(19, 19, 19))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(18, 18, 18)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(sync_receive, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(sync_send, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(sync_receive1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(sync_receive2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(55, 55, 55)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(label_address_direct_type2)
                                            .addComponent(label_address_direct_type1)
                                            .addComponent(jLabel14)
                                            .addComponent(label_address_direct_type3))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jSpinner2, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                            .addComponent(jSpinner1)
                                            .addComponent(jSpinner3)
                                            .addComponent(jSpinner4))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator2)
                                .addGap(1, 1, 1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator4)))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(adm_continue_1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(170, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(sync_send, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(sync_receive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(sync_receive1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sync_receive2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(label_address_direct_type))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(address_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(address_indirect_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(44, 44, 44)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label_address_direct_type1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(label_address_direct_type2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_address_direct_type3))
                .addGap(18, 18, 18)
                .addComponent(adm_continue_1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adm_continue_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adm_continue_1ActionPerformed
        System.out.println("Iniciando configuraciones");
//        int n = Integer.parseInt(number_process.getValue().toString());
        boolean sync_send_b = (sync_send.getSelectedItem().equals("Blocking")) ? true : false;
        boolean sync_receive_b = (sync_receive.getSelectedItem().equals("Blocking")) ? true : false;
        boolean address_type_b = (address_type.getSelectedItem().equals("Directo")) ? true : false;
        //boolean format_type_b = (format_type.getSelectedItem().equals("Fijo")) ? true : false;
        boolean[] address;
        this.setVisible(false);
        if(address_type_b) {
            //boolean address_direct_send_b = (address_direct_send_type.getSelectedItem().equals("Explícito")) ? true : false;
            //boolean address_direct_receive_b = (address_direct_receive_type.getSelectedItem().equals("Explícito")) ? true : false;
            //address = new boolean[]{address_type_b,address_direct_send_b,address_direct_receive_b};
        } else {
            boolean address_indirect_b = (address_indirect_type.getSelectedItem().equals("Dinámico")) ? true : false;
            address = new boolean[]{address_type_b,address_indirect_b};
        }
        //Principal principal = new Principal();
        //principal.setVisible(true);
        //principal.inicializar(n,sync_send_b, sync_receive_b, address, format_type_b);
    }//GEN-LAST:event_adm_continue_1ActionPerformed

    private void sync_receive2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sync_receive2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sync_receive2ActionPerformed

    private void sync_receive1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sync_receive1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sync_receive1ActionPerformed

    private void address_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_address_typeActionPerformed
        if(address_type.getSelectedItem().equals("Indirecto")) {
            //address_direct_receive_type.setVisible(false);
            //address_direct_send_type.setVisible(false);
            label_address_direct_type.setVisible(false);
            address_indirect_type.setVisible(true);
            //label_address_indirect_type.setVisible(true);
        } else {
            //address_direct_receive_type.setVisible(true);
            //address_direct_send_type.setVisible(true);
            label_address_direct_type.setVisible(true);
            address_indirect_type.setVisible(false);
            //label_address_indirect_type.setVisible(false);
        }   
    }//GEN-LAST:event_address_typeActionPerformed

    private void address_indirect_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_address_indirect_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_address_indirect_typeActionPerformed

    private void sync_receiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sync_receiveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sync_receiveActionPerformed

    private void sync_sendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sync_sendActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sync_sendActionPerformed

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
            java.util.logging.Logger.getLogger(Administrativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrativo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrativo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox address_indirect_type;
    private javax.swing.JComboBox address_type;
    private javax.swing.JButton adm_continue_1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JLabel label_address_direct_type;
    private javax.swing.JLabel label_address_direct_type1;
    private javax.swing.JLabel label_address_direct_type2;
    private javax.swing.JLabel label_address_direct_type3;
    private javax.swing.JComboBox sync_receive;
    private javax.swing.JComboBox sync_receive1;
    private javax.swing.JComboBox sync_receive2;
    private javax.swing.JComboBox sync_send;
    // End of variables declaration//GEN-END:variables
}
