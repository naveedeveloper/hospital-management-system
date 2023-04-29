package hopital.management.system;

import hopital.management.system.models.PatientRecord;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class viewPrescription extends javax.swing.JFrame {

    private String patient;
    private String name;
    private String gender;
    private String age;
    private String pers;

    public viewPrescription() {
        initComponents();
        PatientRecord patientRecord = Session.patientRecord;

        System.out.println(patientRecord.toString());

        this.patient = String.valueOf(patientRecord.getId());
        this.name = patientRecord.getUsername();
        this.gender = patientRecord.getGender();
        this.age = String.valueOf(patientRecord.getAge());

        ResultSet s;
        try {
            Connection con;
            con = connectionProvider.getcon();
            PreparedStatement query;

            query = con.prepareStatement("SELECT perscription from patientRecord where id=?");
            query.setString(1, patient);
            s = query.executeQuery();
            if (s.next()) {
                prescriptionTextArea.setText(s.getNString("perscription"));
            }
            prescriptionTextArea.setEnabled(false);
        } catch (SQLException ex) {
            Logger.getLogger(viewPrescription.class.getName()).log(Level.SEVERE, null, ex);
        }

        patientIDTextField.setText(this.patient);
        patientIDTextField.setEnabled(false);

        genderTextField.setText(this.gender);
        genderTextField.setEnabled(false);
        ageTextField.setText(this.age);
        ageTextField.setEnabled(false);
        nameTextField.setText(this.name);
        nameTextField.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        patientIDTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        genderTextField = new javax.swing.JTextField();
        ageTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        prescriptionTextArea = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Patinet ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 17, -1, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Patinet Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 49, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Age");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(481, 48, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Gender");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(452, 17, -1, -1));

        patientIDTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientIDTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(patientIDTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 16, 266, -1));

        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(nameTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 48, 266, -1));

        genderTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(genderTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 16, 265, -1));

        ageTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(ageTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 47, 265, -1));

        prescriptionTextArea.setColumns(20);
        prescriptionTextArea.setRows(5);
        jScrollPane1.setViewportView(prescriptionTextArea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 138, 643, 132));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("Prescription");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 94, -1, -1));

        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hopital/management/system/Close.png"))); // NOI18N
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(387, 282, 122, 36));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hopital/management/system/prescription bg.jpeg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 330));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTextFieldActionPerformed

    }//GEN-LAST:event_nameTextFieldActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        new patientDashboard().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void patientIDTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientIDTextFieldActionPerformed

    }//GEN-LAST:event_patientIDTextFieldActionPerformed

    private void genderTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderTextFieldActionPerformed

    }//GEN-LAST:event_genderTextFieldActionPerformed

    private void ageTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTextFieldActionPerformed

    }//GEN-LAST:event_ageTextFieldActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewPrescription().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageTextField;
    private javax.swing.JTextField genderTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JTextField patientIDTextField;
    private javax.swing.JTextArea prescriptionTextArea;
    // End of variables declaration//GEN-END:variables
}
