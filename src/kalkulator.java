/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author User
 */
public class kalkulator extends javax.swing.JFrame {

    /**
     * Creates new form kalkulator
     */
    public kalkulator() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        angka1 = new javax.swing.JTextField();
        angka2 = new javax.swing.JTextField();
        txtTambah = new javax.swing.JButton();
        txtKurang = new javax.swing.JButton();
        txtKali = new javax.swing.JButton();
        txtBagi = new javax.swing.JButton();
        txtModulus = new javax.swing.JButton();
        txtHasil = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        angka1.setBackground(new java.awt.Color(0, 0, 0));
        angka1.setForeground(new java.awt.Color(255, 255, 255));

        angka2.setBackground(new java.awt.Color(0, 0, 0));
        angka2.setForeground(new java.awt.Color(255, 255, 255));

        txtTambah.setBackground(new java.awt.Color(51, 51, 255));
        txtTambah.setForeground(new java.awt.Color(255, 255, 255));
        txtTambah.setText("+");
        txtTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTambahActionPerformed(evt);
            }
        });

        txtKurang.setBackground(new java.awt.Color(51, 51, 255));
        txtKurang.setForeground(new java.awt.Color(255, 255, 255));
        txtKurang.setText("-");
        txtKurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKurangActionPerformed(evt);
            }
        });

        txtKali.setBackground(new java.awt.Color(51, 51, 255));
        txtKali.setForeground(new java.awt.Color(255, 255, 255));
        txtKali.setText("*");
        txtKali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKaliActionPerformed(evt);
            }
        });

        txtBagi.setBackground(new java.awt.Color(51, 51, 255));
        txtBagi.setForeground(new java.awt.Color(255, 255, 255));
        txtBagi.setText("/");
        txtBagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBagiActionPerformed(evt);
            }
        });

        txtModulus.setBackground(new java.awt.Color(51, 51, 255));
        txtModulus.setForeground(new java.awt.Color(255, 255, 255));
        txtModulus.setText("mod");
        txtModulus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModulusActionPerformed(evt);
            }
        });

        txtHasil.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(0, 0, 204));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel1.setText("KALKULATOR GUI");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtKurang, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtKali, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBagi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtModulus, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(125, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(angka1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(angka2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
            .addGroup(layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(angka1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(angka2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTambah)
                    .addComponent(txtKurang)
                    .addComponent(txtKali)
                    .addComponent(txtBagi)
                    .addComponent(txtModulus))
                .addContainerGap(179, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTambahActionPerformed
        // TODO add your handling code here:
        double hasil = Double.parseDouble(angka1.getText()) + Double.parseDouble(angka2.getText());
        txtHasil.setText(Double.toString(hasil));
    }//GEN-LAST:event_txtTambahActionPerformed

    private void txtKurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKurangActionPerformed
        // TODO add your handling code here:
        double hasil = Double.parseDouble(angka1.getText()) - Double.parseDouble(angka2.getText());
        txtHasil.setText(Double.toString(hasil));
    }//GEN-LAST:event_txtKurangActionPerformed

    private void txtKaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKaliActionPerformed
        // TODO add your handling code here:
        double hasil = Double.parseDouble(angka1.getText()) * Double.parseDouble(angka2.getText());
        txtHasil.setText(Double.toString(hasil));
    }//GEN-LAST:event_txtKaliActionPerformed

    private void txtBagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBagiActionPerformed
        // TODO add your handling code here:
        double hasil = Double.parseDouble(angka1.getText()) / Double.parseDouble(angka2.getText());
        txtHasil.setText(Double.toString(hasil));
    }//GEN-LAST:event_txtBagiActionPerformed

    private void txtModulusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModulusActionPerformed
        // TODO add your handling code here:
        double hasil = Double.parseDouble(angka1.getText()) % Double.parseDouble(angka2.getText());
        txtHasil.setText(Double.toString(hasil));
    }//GEN-LAST:event_txtModulusActionPerformed

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
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField angka1;
    private javax.swing.JTextField angka2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton txtBagi;
    private javax.swing.JLabel txtHasil;
    private javax.swing.JButton txtKali;
    private javax.swing.JButton txtKurang;
    private javax.swing.JButton txtModulus;
    private javax.swing.JButton txtTambah;
    // End of variables declaration//GEN-END:variables
}