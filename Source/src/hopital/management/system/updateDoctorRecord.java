package hopital.management.system;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class updateDoctorRecord extends javax.swing.JFrame {

    public updateDoctorRecord() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        doctorIDTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        genderComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ageTextField = new javax.swing.JTextField();
        specializationTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        doctorIDTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        doctorIDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorIDTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(doctorIDTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 250, 40));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Doctor ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, -1, 40));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, -1, 40));

        nameTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 100, 250, 40));

        genderComboBox.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Others" }));
        genderComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderComboBoxActionPerformed(evt);
            }
        });
        getContentPane().add(genderComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 250, 40));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Gender");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, -1, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Age");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, -1, 30));

        ageTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(ageTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 250, 40));

        specializationTextField.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        getContentPane().add(specializationTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 250, 40));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("specialization");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, -1, 30));

        updateButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        updateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hopital/management/system/save-icon--1.png"))); // NOI18N
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        getContentPane().add(updateButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 130, 40));

        closeButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hopital/management/system/Close.png"))); // NOI18N
        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 100, 50));

        searchButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hopital/management/system/search.png"))); // NOI18N
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        getContentPane().add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 50, 120, -1));

        clearButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        clearButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hopital/management/system/clear.png"))); // NOI18N
        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        getContentPane().add(clearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 99, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hopital/management/system/doc bg.jpeg"))); // NOI18N
        jLabel7.setText("jLabel7");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 440));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void doctorIDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorIDTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctorIDTextFieldActionPerformed

    private void genderComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderComboBoxActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        String id = doctorIDTextField.getText();
        String name = nameTextField.getText();
        String age = ageTextField.getText();
        String gender = String.valueOf(genderComboBox.getSelectedItem());
        String specialization = specializationTextField.getText();

        try {
            Connection con = connectionProvider.getcon();
            PreparedStatement query = con.prepareStatement("UPDATE doctorRecord SET Name=?, Gender=?, Age=?, Specialization=? WHERE user_id=?");
            query.setString(1, name);
            query.setString(2, gender);
            query.setString(3, age);
            query.setString(4, specialization);
            query.setString(5, id);
            query.execute();
            JOptionPane.showMessageDialog(null, "Record updated Sucessfully!");
            clearInputs();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please enter data in correct format!");
            Logger.getLogger(addNewPatient.class.getName()).log(Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_closeButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        try {
            Connection con = connectionProvider.getcon();
            PreparedStatement query = con.prepareStatement("SELECT dR.* FROM doctorRecord dR WHERE dR.user_id=?");
            query.setString(1, doctorIDTextField.getText());
            ResultSet result = query.executeQuery();

            if (result.next()) {
                ageTextField.setText(result.getString("Age"));
                nameTextField.setText(result.getString("Name"));
                specializationTextField.setText(result.getString("Specialization"));
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
    }//GEN-LAST:event_searchButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
        clearInputs();
    }//GEN-LAST:event_clearButtonActionPerformed

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
            java.util.logging.Logger.getLogger(updateDoctorRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateDoctorRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateDoctorRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateDoctorRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateDoctorRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageTextField;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JTextField doctorIDTextField;
    private javax.swing.JComboBox<String> genderComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField specializationTextField;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables

    private void clearInputs() {
        doctorIDTextField.setText("");
        ageTextField.setText("");
        genderComboBox.setSelectedIndex(0);
        nameTextField.setText("");
        specializationTextField.setText("");

        doctorIDTextField.setEnabled(true);
    }
}
