/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package dinal.appleistore3.employee;

import dinal.appleistore3.CSVHandler;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dnlx
 */
public class AddEmployeeUI extends javax.swing.JFrame {

    private boolean isClicked = false;
    private String empId = "";
    /**
     * Creates new form AddUsersUI
     */
    public AddEmployeeUI() {
        initComponents();
        try {
            addDataToEmpTable();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

        private void addDataToEmpTable() throws FileNotFoundException  {
        ArrayList<String> employees = CSVHandler.read("./employee.csv");
        DefaultTableModel tblModel = (DefaultTableModel)empTB.getModel();
        tblModel.setRowCount(0);
        for (String employee: employees) {
            String[] employeeData = employee.split(",");
            tblModel.addRow(employeeData);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        addEmpNameTF = new javax.swing.JTextField();
        empPwTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        empTB = new javax.swing.JTable();
        permissionCB = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        addEmpBT = new javax.swing.JButton();
        deleteEmpBT = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        closeBT = new javax.swing.JButton();
        empClearBT = new javax.swing.JButton();

        jLabel7.setText("@dinalHasantha");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(100, 100));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Add Employee");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Password");

        addEmpNameTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        empPwTF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        empTB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Emp_ID", "Emp_Name", "Emp_PW", "Permission"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        empTB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                empTBMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(empTB);

        permissionCB.setBackground(new java.awt.Color(255, 255, 204));
        permissionCB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        permissionCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Cashier", "Stocker", "Manager" }));
        permissionCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                permissionCBActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Permission");

        jLabel9.setText("@dinalHasantha");

        addEmpBT.setBackground(new java.awt.Color(153, 255, 153));
        addEmpBT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addEmpBT.setText("Add");
        addEmpBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmpBTActionPerformed(evt);
            }
        });

        deleteEmpBT.setBackground(new java.awt.Color(255, 102, 102));
        deleteEmpBT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        deleteEmpBT.setText("Delete");
        deleteEmpBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteEmpBTActionPerformed(evt);
            }
        });

        jTextPane1.setEditable(false);
        jTextPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(jTextPane1);

        closeBT.setBackground(new java.awt.Color(255, 204, 204));
        closeBT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        closeBT.setText("Close");
        closeBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBTActionPerformed(evt);
            }
        });

        empClearBT.setBackground(new java.awt.Color(255, 204, 204));
        empClearBT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        empClearBT.setText("Clear");
        empClearBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empClearBTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(jLabel1)
                        .addGap(195, 195, 195)
                        .addComponent(closeBT))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2)
                        .addGap(54, 54, 54)
                        .addComponent(addEmpNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel4)
                        .addGap(14, 14, 14)
                        .addComponent(permissionCB, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel3)
                                .addGap(32, 32, 32)
                                .addComponent(empPwTF, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(addEmpBT)
                        .addGap(48, 48, 48)
                        .addComponent(empClearBT)
                        .addGap(38, 38, 38)
                        .addComponent(deleteEmpBT))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(600, 600, 600)
                        .addComponent(jLabel9)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1))
                    .addComponent(closeBT))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(addEmpNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(permissionCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(empPwTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addEmpBT)
                            .addComponent(empClearBT)
                            .addComponent(deleteEmpBT))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel9)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void permissionCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_permissionCBActionPerformed
        // TODO add your handling code here:
       // String permission = permissionCB.getSelectedItem().toString();
    }//GEN-LAST:event_permissionCBActionPerformed

    private void addEmpBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmpBTActionPerformed
        // TODO add your handling code here:
        String empName = addEmpNameTF.getText();
        String empPw = empPwTF.getText();
        String permission = permissionCB.getSelectedItem().toString();
        try {
            Employee employee;
            if (this.isClicked) {
                employee = new Employee(this.empId,empName, empPw,permission);
                employee.update();
            } else {
                employee = new Employee(empName, empPw,permission);
                employee.save();
            }
            addDataToEmpTable();
            this.deleteEmpBTActionPerformed(evt);
            jTextPane1.setText("Employee has saved");
        } catch (Exception e) {
            jTextPane1.setText("Please enter a valid data");
        }
    }//GEN-LAST:event_addEmpBTActionPerformed

    private void deleteEmpBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteEmpBTActionPerformed
        // TODO add your handling code here:
        String empName = addEmpNameTF.getText();
        String empPw = empPwTF.getText();
        String permission = permissionCB.getSelectedItem().toString();
        try {
            Employee employee = new Employee(this.empId,empName, empPw,permission);
            employee.delete();
            addDataToEmpTable();
            this.deleteEmpBTActionPerformed(evt);
            jTextPane1.setText("Employee has deleted");
        } catch (Exception e) {
            jTextPane1.setText("Somthing went wrong");
        }
    }//GEN-LAST:event_deleteEmpBTActionPerformed

    private void closeBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBTActionPerformed
        try {
            // TODO add your handling code here:
            ManagerUI managerUI = new ManagerUI();
            managerUI.setVisible(true);
            this.dispose();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AddEmployeeUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_closeBTActionPerformed

    private void empTBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_empTBMouseClicked
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel)empTB.getModel();
        String empId = tblModel.getValueAt(empTB.getSelectedRow(), 0).toString();
        String empName = tblModel.getValueAt(empTB.getSelectedRow(), 1).toString();          
        String empPw = tblModel.getValueAt(empTB.getSelectedRow(), 2).toString();        
        String permission = tblModel.getValueAt(empTB.getSelectedRow(), 3).toString();        
    
        this.empId = empId;
        addEmpNameTF.setText(empName);
        empPwTF.setText(empPw);
        permissionCB.setSelectedItem(permission);
        this.isClicked = true; 
    }//GEN-LAST:event_empTBMouseClicked

    private void empClearBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empClearBTActionPerformed
        // TODO add your handling code here:
        addEmpNameTF.setText("");
        empPwTF.setText("");       
        jTextPane1.setText("");
        this.isClicked = false;
    }//GEN-LAST:event_empClearBTActionPerformed

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
            java.util.logging.Logger.getLogger(AddEmployeeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployeeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployeeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployeeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployeeUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEmpBT;
    private javax.swing.JTextField addEmpNameTF;
    private javax.swing.JButton closeBT;
    private javax.swing.JButton deleteEmpBT;
    private javax.swing.JButton empClearBT;
    private javax.swing.JTextField empPwTF;
    private javax.swing.JTable empTB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JComboBox<String> permissionCB;
    // End of variables declaration//GEN-END:variables
}