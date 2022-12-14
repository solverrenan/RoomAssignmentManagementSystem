/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RoomAssignment;

import java.awt.Image;
import java.awt.geom.RoundRectangle2D;
import javax.swing.ImageIcon;

/**
 *
 * @author solve
 */
public class Change_Password extends javax.swing.JFrame {

    /**
     * Creates new form Change_Password
     */
        
    public Change_Password() {
        initComponents();
        SetLogo();
        this.setTitle("RAMS - Change Password");
        this.setAlwaysOnTop(true);
        
        //Rounded Corners
        setShape(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), 20, 20));
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
        lblCurrentPassword = new javax.swing.JLabel();
        txtCurrentPassword = new javax.swing.JTextField();
        lblNewPassword = new javax.swing.JLabel();
        txtNewPassword = new javax.swing.JTextField();
        lblConfirmPassword = new javax.swing.JLabel();
        txtConfirmPassword = new javax.swing.JTextField();
        btnChangePassword = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Change Password", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Century Gothic", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N

        lblCurrentPassword.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblCurrentPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblCurrentPassword.setText("Current Password");

        txtCurrentPassword.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtCurrentPassword.setFocusable(false);

        lblNewPassword.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblNewPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblNewPassword.setText("New Password");

        txtNewPassword.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtNewPassword.setFocusable(false);

        lblConfirmPassword.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        lblConfirmPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblConfirmPassword.setText("Confirm Password");

        txtConfirmPassword.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtConfirmPassword.setFocusable(false);

        btnChangePassword.setBackground(new java.awt.Color(218, 104, 70));
        btnChangePassword.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnChangePassword.setForeground(new java.awt.Color(51, 51, 51));
        btnChangePassword.setText("Change Password");
        btnChangePassword.setBorder(null);
        btnChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePasswordActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(218, 104, 70));
        btnCancel.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(51, 51, 51));
        btnCancel.setText("Cancel");
        btnCancel.setBorder(null);
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCurrentPassword)
                        .addGap(21, 21, 21)
                        .addComponent(txtCurrentPassword))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNewPassword)
                        .addGap(36, 36, 36)
                        .addComponent(txtNewPassword))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblConfirmPassword)
                        .addGap(18, 18, 18)
                        .addComponent(txtConfirmPassword))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnChangePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCurrentPassword)
                    .addComponent(txtCurrentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNewPassword)
                    .addComponent(txtNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConfirmPassword)
                    .addComponent(txtConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnChangePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnChangePasswordActionPerformed

    private void SetLogo() {
        Image logo = (new ImageIcon(Dashboard.class.getResource("\\logo.jpg")).getImage());
        this.setIconImage(logo);
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
            java.util.logging.Logger.getLogger(Change_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Change_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Change_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Change_Password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Change_Password().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnChangePassword;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblConfirmPassword;
    private javax.swing.JLabel lblCurrentPassword;
    private javax.swing.JLabel lblNewPassword;
    private javax.swing.JTextField txtConfirmPassword;
    private javax.swing.JTextField txtCurrentPassword;
    private javax.swing.JTextField txtNewPassword;
    // End of variables declaration//GEN-END:variables
}
