package hopital.management.system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {

    final String PATIENT = "Patient";
    final String ADMIN = "Admin";
    final String DOCTOR = "Doctor";
    final String RECEPTIONIST = "Receptionist";
    final String NURSE = "Nurse";

    public login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Username");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, -1, -1));

        jPasswordField1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 250, 40));

        jTextField1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 250, 40));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hopital/management/system/login.png"))); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 120, 40));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hopital/management/system/Close.png"))); // NOI18N
        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 106, 40));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, -1, -1));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, -1, -1));

        jComboBox1.setBackground(new java.awt.Color(255, 255, 255));
        jComboBox1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Patient ", "Doctor", "Nurse", "Receptionist", "Admin" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 260, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("UserType");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 90, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hopital/management/system/login background.jpeg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 430));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int ans = JOptionPane.showConfirmDialog(null, "Do you want to close Application", "select", JOptionPane.YES_NO_OPTION);

        if (ans == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    public void openUserDashboard(String userType, String userId, String username) {
        Session.LoggedInUserId = userId;
        Session.LoggedInUserName = username;
        Session.LoggedInUserType = userType;

        this.setVisible(false);

        if (userType.equals(PATIENT)) {
            new patientDashboard().setVisible(true);
        } else if (userType.equals(ADMIN)) {
            new home().setVisible(true);
        } else if (userType.equals(DOCTOR)) {
            new DoctorDashboard().setVisible(true);
        } else if (userType.equals(NURSE)) {
            new nurseDashboard().setVisible(true);
        } else if (userType.equals(RECEPTIONIST)) {
            new ReceptionistDashboard().setVisible(true);
        } else {
            System.out.print("No userType matched");
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String username = jTextField1.getText();
        String password = jPasswordField1.getText();
        String usertype = (String) jComboBox1.getSelectedItem();
        ResultSet result;
        try {
            Connection con;
            con = connectionProvider.getcon();
            PreparedStatement query;
            query = con.prepareStatement("SELECT * FROM Login WHERE username=? AND password=? AND user_type=?");
            query.setString(1, username);
            query.setString(2, password);
            query.setString(3, usertype);
            result = query.executeQuery();
            if (result.next()) {
                //System.out.printf("id=%s, username=%s, password=%s", result.getString("id"), result.getString("username"), result.getString("password"));
                openUserDashboard(usertype.trim(), result.getString("id"), username);
            } else {
                JOptionPane.showMessageDialog(null, "Username or Password is incorrect!!");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter data in correct format!");
            Logger.getLogger(addNewPatient.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
