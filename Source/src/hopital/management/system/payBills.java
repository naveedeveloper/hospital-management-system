package hopital.management.system;

import hopital.management.system.models.PatientRecord;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class payBills extends javax.swing.JFrame {

    private String patient;
    private String name;
    private String gender;
    private String age;
    private String pers;

    public payBills() {
        initComponents();
        PatientRecord patientRecord = Session.patientRecord;

        System.out.println(patientRecord.toString());

        this.patient = String.valueOf(patientRecord.getId());
        this.name = patientRecord.getUsername();
        this.gender = patientRecord.getGender();
        this.age = String.valueOf(patientRecord.getAge());

        patientIDTextField.setText(this.patient);
        patientIDTextField.setEnabled(false);
        patientNameTextField.setText(this.name);
        patientNameTextField.setEnabled(false);
        genderTextField.setText(this.gender);
        genderTextField.setEnabled(false);
        ageTextField.setText(this.age);
        ageTextField.setEnabled(false);

        Random rand = new Random();

        int n = rand.nextInt(500000);
        billTextField.setText("Rs" + String.valueOf(n));
        billTextField.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        patientIDTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        patientNameTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ageTextField = new javax.swing.JTextField();
        genderTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        billTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Patinet ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, -1));

        patientIDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientIDTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(patientIDTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 266, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Patinet Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, -1));

        patientNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientNameTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(patientNameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 266, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Gender");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Age");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, -1, -1));
        getContentPane().add(ageTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 265, -1));
        getContentPane().add(genderTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 150, 265, -1));

        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hopital/management/system/icons8-pay-64.png"))); // NOI18N
        jButton1.setText("Pay");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 140, 36));

        jButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hopital/management/system/Close.png"))); // NOI18N
        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 300, 122, 36));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Bill");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, -1));

        billTextField.setText("$");
        getContentPane().add(billTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 265, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hopital/management/system/Payment methods.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 420));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void patientNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientNameTextFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(null, "The bill has been paid");
        this.setVisible(false);
        new patientDashboard().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void patientIDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientIDTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientIDTextFieldActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        new patientDashboard().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(payBills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(payBills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(payBills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(payBills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new payBills().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageTextField;
    private javax.swing.JTextField billTextField;
    private javax.swing.JTextField genderTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField patientIDTextField;
    private javax.swing.JTextField patientNameTextField;
    // End of variables declaration//GEN-END:variables
}
