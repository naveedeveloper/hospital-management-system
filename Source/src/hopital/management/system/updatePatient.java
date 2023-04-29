package hopital.management.system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class updatePatient extends javax.swing.JFrame {

    public updatePatient() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        ageTextField = new javax.swing.JTextField();
        patientIDTextField = new javax.swing.JTextField();
        genderComboBox = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hopital/management/system/save-icon--1.png"))); // NOI18N
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 130, 120, 40));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Patient ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, 40));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, -1, 40));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Gender");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Age");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, 30));

        nameTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 130, 250, 40));

        ageTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(ageTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 250, 40));

        patientIDTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        patientIDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientIDTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(patientIDTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 250, 40));

        genderComboBox.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        genderComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(genderComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 250, 40));

        jButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hopital/management/system/search.png"))); // NOI18N
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, 120, 40));

        jButton4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hopital/management/system/Close.png"))); // NOI18N
        jButton4.setText("Close");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 99, 50));

        jButton5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hopital/management/system/clear.png"))); // NOI18N
        jButton5.setText("Clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, 99, 50));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/patient.jpeg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButton6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hopital/management/system/Close.png"))); // NOI18N
        jButton6.setText("Close");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 99, 50));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String id = patientIDTextField.getText();
        String name = nameTextField.getText();
        String age = ageTextField.getText();
        String gender = String.valueOf(genderComboBox.getSelectedItem());

        try {
            Connection con = connectionProvider.getcon();
            PreparedStatement query = con.prepareStatement("UPDATE patientRecord SET Name=?, Gender=?, Age=? WHERE user_id=?");
            query.setString(1, name);
            query.setString(2, gender);
            query.setString(3, age);
            query.setString(4, id);
            query.execute();
            JOptionPane.showMessageDialog(null, "Record updated Sucessfully!");
            clearInputs();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter data in correct format!");
            Logger.getLogger(addNewPatient.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void patientIDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientIDTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_patientIDTextFieldActionPerformed

    private void genderComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderComboBoxActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            Connection con = connectionProvider.getcon();
            PreparedStatement query = con.prepareStatement("SELECT dR.* FROM patientRecord dR WHERE dR.user_id=?");
            query.setString(1, patientIDTextField.getText());
            ResultSet result = query.executeQuery();

            if (result.next()) {
                ageTextField.setText(result.getString("Age"));
                nameTextField.setText(result.getString("Name"));
                String gender = result.getString("Gender");

                if (gender.equals("Male")) {
                    genderComboBox.setSelectedIndex(0);
                } else if (gender.equals("Female")) {
                    genderComboBox.setSelectedIndex(1);
                } else {
                    genderComboBox.setSelectedIndex(2);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Record not found!");
            }
        } catch (Exception ex) {
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.setVisible(false);
        new ReceptionistDashboard().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        clearInputs();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(updatePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updatePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updatePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updatePatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updatePatient().setVisible(true);
            }
        });
    }

    private void clearInputs() {
        patientIDTextField.setText("");
        ageTextField.setText("");
        genderComboBox.setSelectedIndex(0);
        nameTextField.setText("");

        patientIDTextField.setEnabled(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageTextField;
    private javax.swing.JComboBox<String> genderComboBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField patientIDTextField;
    // End of variables declaration//GEN-END:variables
}
