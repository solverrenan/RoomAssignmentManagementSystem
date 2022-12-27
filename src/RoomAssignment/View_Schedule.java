/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RoomAssignment;

import java.awt.Color;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JOptionPane;

/**
 *
 * @author solve
 */
public class View_Schedule extends javax.swing.JFrame {

    /**
     * Creates new form View_Schedule
     */
    public View_Schedule() {
        initComponents();
        
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

        pnlViewSchedule = new javax.swing.JPanel();
        pnlNavigatorBar = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblInfo = new javax.swing.JLabel();
        lblLogout = new javax.swing.JLabel();
        lblWelcome = new javax.swing.JLabel();
        lblNotice = new javax.swing.JLabel();
        pnlYourInformation = new javax.swing.JPanel();
        lblUsername = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        lblMiddleName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblDepartment = new javax.swing.JLabel();
        txtMiddleName = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtDepartment = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblContact = new javax.swing.JLabel();
        txtContact = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblContactAdmin = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        pnlYourSchedule = new javax.swing.JPanel();
        lblSearch = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        spShowSchedule = new javax.swing.JScrollPane();
        tblShowSchedule = new javax.swing.JTable();
        btnSearch = new javax.swing.JButton();
        lblImageBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Schedule");
        setBackground(new java.awt.Color(205, 203, 214));
        setName("frmViewSchedule"); // NOI18N
        setUndecorated(true);

        pnlViewSchedule.setBackground(new java.awt.Color(245, 245, 245));
        pnlViewSchedule.setLayout(null);

        pnlNavigatorBar.setBackground(new java.awt.Color(205, 203, 214));
        pnlNavigatorBar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblTitle.setFont(new java.awt.Font("Copperplate Gothic Bold", 3, 12)); // NOI18N
        lblTitle.setText("Room Assignment & Management | View Schedule");

        lblInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RoomAssignment/image/info.png"))); // NOI18N
        lblInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblInfoMouseClicked(evt);
            }
        });

        lblLogout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RoomAssignment/image/power-button.png"))); // NOI18N
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlNavigatorBarLayout = new javax.swing.GroupLayout(pnlNavigatorBar);
        pnlNavigatorBar.setLayout(pnlNavigatorBarLayout);
        pnlNavigatorBarLayout.setHorizontalGroup(
            pnlNavigatorBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNavigatorBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        pnlNavigatorBarLayout.setVerticalGroup(
            pnlNavigatorBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNavigatorBarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitle)
                .addContainerGap())
            .addComponent(lblLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlViewSchedule.add(pnlNavigatorBar);
        pnlNavigatorBar.setBounds(0, 0, 983, 38);

        lblWelcome.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        lblWelcome.setForeground(java.awt.Color.white);
        lblWelcome.setText("Welcome, User!");
        pnlViewSchedule.add(lblWelcome);
        lblWelcome.setBounds(10, 56, 190, 31);

        lblNotice.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        lblNotice.setForeground(java.awt.Color.white);
        lblNotice.setText("Check your schedule carefully. Contact your program head when you have conflict on schedule.");
        pnlViewSchedule.add(lblNotice);
        lblNotice.setBounds(10, 85, 565, 16);

        pnlYourInformation.setBackground(new java.awt.Color(245, 245, 245));
        pnlYourInformation.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Your Information", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Century Gothic", 3, 14), java.awt.Color.white)); // NOI18N
        pnlYourInformation.setForeground(java.awt.Color.white);
        pnlYourInformation.setOpaque(false);
        pnlYourInformation.setLayout(null);

        lblUsername.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblUsername.setForeground(java.awt.Color.white);
        lblUsername.setText("Username");
        pnlYourInformation.add(lblUsername);
        lblUsername.setBounds(16, 35, 59, 16);

        lblFirstName.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblFirstName.setForeground(java.awt.Color.white);
        lblFirstName.setText("First Name");
        pnlYourInformation.add(lblFirstName);
        lblFirstName.setBounds(16, 63, 62, 16);

        lblMiddleName.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblMiddleName.setForeground(java.awt.Color.white);
        lblMiddleName.setText("Middle Name");
        pnlYourInformation.add(lblMiddleName);
        lblMiddleName.setBounds(16, 91, 80, 16);

        lblLastName.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblLastName.setForeground(java.awt.Color.white);
        lblLastName.setText("Last Name");
        pnlYourInformation.add(lblLastName);
        lblLastName.setBounds(16, 119, 63, 16);

        lblDepartment.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblDepartment.setForeground(java.awt.Color.white);
        lblDepartment.setText("Department");
        pnlYourInformation.add(lblDepartment);
        lblDepartment.setBounds(16, 147, 73, 16);

        txtMiddleName.setEditable(false);
        txtMiddleName.setBackground(new java.awt.Color(51, 51, 51));
        txtMiddleName.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtMiddleName.setForeground(java.awt.Color.white);
        txtMiddleName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txtMiddleName.setFocusable(false);
        txtMiddleName.setOpaque(false);
        pnlYourInformation.add(txtMiddleName);
        txtMiddleName.setBounds(100, 88, 251, 17);

        txtFirstName.setEditable(false);
        txtFirstName.setBackground(new java.awt.Color(51, 51, 51));
        txtFirstName.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtFirstName.setForeground(java.awt.Color.white);
        txtFirstName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txtFirstName.setFocusable(false);
        txtFirstName.setOpaque(false);
        pnlYourInformation.add(txtFirstName);
        txtFirstName.setBounds(100, 60, 251, 17);

        txtUsername.setEditable(false);
        txtUsername.setBackground(new java.awt.Color(51, 51, 51));
        txtUsername.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtUsername.setForeground(java.awt.Color.white);
        txtUsername.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txtUsername.setFocusable(false);
        txtUsername.setOpaque(false);
        pnlYourInformation.add(txtUsername);
        txtUsername.setBounds(100, 32, 251, 17);

        txtLastName.setEditable(false);
        txtLastName.setBackground(new java.awt.Color(51, 51, 51));
        txtLastName.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtLastName.setForeground(java.awt.Color.white);
        txtLastName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txtLastName.setFocusable(false);
        txtLastName.setOpaque(false);
        pnlYourInformation.add(txtLastName);
        txtLastName.setBounds(100, 116, 251, 17);

        txtDepartment.setEditable(false);
        txtDepartment.setBackground(new java.awt.Color(51, 51, 51));
        txtDepartment.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtDepartment.setForeground(java.awt.Color.white);
        txtDepartment.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txtDepartment.setFocusable(false);
        txtDepartment.setOpaque(false);
        pnlYourInformation.add(txtDepartment);
        txtDepartment.setBounds(99, 144, 251, 17);

        lblEmail.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblEmail.setForeground(java.awt.Color.white);
        lblEmail.setText("Email");
        pnlYourInformation.add(lblEmail);
        lblEmail.setBounds(369, 35, 31, 16);

        txtEmail.setEditable(false);
        txtEmail.setBackground(new java.awt.Color(51, 51, 51));
        txtEmail.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtEmail.setForeground(java.awt.Color.white);
        txtEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txtEmail.setFocusable(false);
        txtEmail.setOpaque(false);
        pnlYourInformation.add(txtEmail);
        txtEmail.setBounds(433, 32, 251, 17);

        lblContact.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblContact.setForeground(java.awt.Color.white);
        lblContact.setText("Contact");
        pnlYourInformation.add(lblContact);
        lblContact.setBounds(369, 63, 50, 16);

        txtContact.setEditable(false);
        txtContact.setBackground(new java.awt.Color(51, 51, 51));
        txtContact.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtContact.setForeground(java.awt.Color.white);
        txtContact.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txtContact.setFocusable(false);
        txtContact.setOpaque(false);
        pnlYourInformation.add(txtContact);
        txtContact.setBounds(433, 60, 251, 17);

        lblAddress.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblAddress.setForeground(java.awt.Color.white);
        lblAddress.setText("Address");
        pnlYourInformation.add(lblAddress);
        lblAddress.setBounds(369, 91, 47, 16);

        txtAddress.setEditable(false);
        txtAddress.setBackground(new java.awt.Color(51, 51, 51));
        txtAddress.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtAddress.setForeground(java.awt.Color.white);
        txtAddress.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txtAddress.setFocusable(false);
        txtAddress.setOpaque(false);
        pnlYourInformation.add(txtAddress);
        txtAddress.setBounds(434, 88, 251, 17);

        lblContactAdmin.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        lblContactAdmin.setForeground(java.awt.Color.white);
        lblContactAdmin.setText("Wrong information? Contact our administrator for correction of your information.");
        pnlYourInformation.add(lblContactAdmin);
        lblContactAdmin.setBounds(470, 150, 479, 16);

        jButton1.setBackground(new java.awt.Color(218, 104, 70));
        jButton1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jButton1.setText("Change Password");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pnlYourInformation.add(jButton1);
        jButton1.setBounds(793, 20, 150, 25);

        pnlViewSchedule.add(pnlYourInformation);
        pnlYourInformation.setBounds(10, 128, 960, 200);

        pnlYourSchedule.setBackground(new java.awt.Color(245, 245, 245));
        pnlYourSchedule.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Your Schedule", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Century Gothic", 3, 14), java.awt.Color.white)); // NOI18N
        pnlYourSchedule.setOpaque(false);
        pnlYourSchedule.setLayout(null);

        lblSearch.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        lblSearch.setForeground(java.awt.Color.white);
        lblSearch.setText("Search");
        pnlYourSchedule.add(lblSearch);
        lblSearch.setBounds(16, 35, 42, 16);

        txtSearch.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        pnlYourSchedule.add(txtSearch);
        txtSearch.setBounds(76, 32, 251, 22);

        tblShowSchedule.setBackground(new java.awt.Color(245, 245, 245));
        tblShowSchedule.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tblShowSchedule.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Room", "Subject", "Section", "Day of the Week", "Start Time", "End Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblShowSchedule.setGridColor(new java.awt.Color(51, 51, 51));
        tblShowSchedule.setName(""); // NOI18N
        spShowSchedule.setViewportView(tblShowSchedule);

        pnlYourSchedule.add(spShowSchedule);
        spShowSchedule.setBounds(16, 72, 931, 187);

        btnSearch.setBackground(new java.awt.Color(218, 104, 70));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RoomAssignment/image/search.png"))); // NOI18N
        btnSearch.setBorder(null);
        pnlYourSchedule.add(btnSearch);
        btnSearch.setBounds(333, 32, 28, 22);

        pnlViewSchedule.add(pnlYourSchedule);
        pnlYourSchedule.setBounds(10, 331, 960, 280);

        lblImageBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RoomAssignment/image/3d-cubes-abstract-diagonals.jpg"))); // NOI18N
        pnlViewSchedule.add(lblImageBackground);
        lblImageBackground.setBounds(-6, 0, 990, 620);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 982, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlViewSchedule, javax.swing.GroupLayout.DEFAULT_SIZE, 982, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 619, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlViewSchedule, javax.swing.GroupLayout.DEFAULT_SIZE, 619, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("frmViewSchedule");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        int option = JOptionPane.showConfirmDialog(null, "Are you sure to logout?", "Logout", JOptionPane.YES_NO_OPTION);
        if(option == JOptionPane.YES_OPTION){
            Signin_Signout ss = new Signin_Signout();
            ss.show();
            this.dispose();
        }
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void lblInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblInfoMouseClicked
        JOptionPane.showMessageDialog(null, "Contact our administration for wrong information. For conflict schedule,\ncontact the head program.\nAdmin: admin@laspinas.sti.edu.ph\nHead: head@laspinas.sti.edu.ph");
    }//GEN-LAST:event_lblInfoMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Change_Password cp = new Change_Password();
        cp.show();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(View_Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View_Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View_Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View_Schedule.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View_Schedule().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblContact;
    private javax.swing.JLabel lblContactAdmin;
    private javax.swing.JLabel lblDepartment;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblImageBackground;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblMiddleName;
    private javax.swing.JLabel lblNotice;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JPanel pnlNavigatorBar;
    private javax.swing.JPanel pnlViewSchedule;
    private javax.swing.JPanel pnlYourInformation;
    private javax.swing.JPanel pnlYourSchedule;
    private javax.swing.JScrollPane spShowSchedule;
    private javax.swing.JTable tblShowSchedule;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtContact;
    private javax.swing.JTextField txtDepartment;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtMiddleName;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
