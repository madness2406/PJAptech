/*
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfaceItem;
import Process.*;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;
import java.util.regex.Pattern;
import Process.StudentManager;

/**
 *
 * @author Admin
 */
public class Student extends javax.swing.JInternalFrame {
    DefaultTableModel dfTableModel;
    int chucNangDaChon = ChucNang.NONE;
    
    public Student() {
        initComponents();
        dfTableModel = (DefaultTableModel) tbStudent.getModel();
        retrieve();
    }
    
    private void retrieve(){
        dfTableModel = (DefaultTableModel) tbStudent.getModel();
        DisplayData();
    }
    
    private void DisplayData() {
//        tbStudent.getSelectionModel().addListSelectionListener((ListSelectionEvent e) -> {
//            TbBooking_SelectionChanged();
//        });

        ReloadTaleHD();
    }
    
    void ReloadTaleHD() {
        if (StudentManager.StudentToTable(tbStudent) == false) {
            JOptionPane.showMessageDialog(null, "Lấy dữ liệu hóa đơn có lỗi", "Có lỗi xảy ra", JOptionPane.ERROR_MESSAGE);
            //ReloadLblIndexTbBooking();
        }
    }
    
    void tbStudent_SelectionChanged(){ 
        int row = tbStudent.getSelectedRow();
        if (row >= 0) {            
            String studentId = (String) dfTableModel.getValueAt(row, 0); 
            String userName = (String) dfTableModel.getValueAt(row, 1);
            String dob = (String) dfTableModel.getValueAt(row, 2);
            String gender = (String) dfTableModel.getValueAt(row, 3);  
            String pob = (String) dfTableModel.getValueAt(row, 4);
            String phoneNo = (String) dfTableModel.getValueAt(row, 5);
            
//            txtUserName.setText(userName.trim());
//            if(email != null)
//                txtEmail.setText(email.trim());
//            else
//                txtEmail.setText("");
//                
//            if(phoneNo != null)
//                txtPhone.setText(phoneNo.trim());  
//            else
//                txtPhone.setText("");  
//                
//            txtId.setText(nhanvienId);
//        } else {
//            txtUserName.setText("");
//            txtPassword.setText("");
//            txtEmail.setText("");
//            txtPhone.setText("");
//            
//        }
    }
    }
    
    void SwitchMode(int chucNang) {
        chucNangDaChon = chucNang;
        switch (chucNang) {
            case ChucNang.ADD: {
                boolean trangThai = true;
               
                break;
            }
            case ChucNang.UPDATE: {
                boolean trangThai = true;
               
                break;
            }
            case ChucNang.NONE: {
                boolean trangThai = false;
                
            }
        }
    }
    
    /**
     * Creates new form KhachHang1
     */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        txtDOB = new javax.swing.JTextField();
        txtPOB = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPhoneNo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbStudent = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Thông tin sinh viên");

        jLabel2.setText("Họ tên");

        jLabel3.setText("Giới tính");

        jLabel5.setText("POB");

        jLabel6.setText("Ngày sinh");

        jLabel7.setText("Số điện thoại");

        txtPhoneNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneNoActionPerformed(evt);
            }
        });

        tbStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Họ tên", "Giới tính", "Ngày sinh", "POB", "Số điện thoại"
            }
        ));
        jScrollPane1.setViewportView(tbStudent);

        jButton1.setText("Thêm ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnSave.setText("Lưu");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addComponent(jLabel5)))
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPOB, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(168, 168, 168)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnSave)
                                            .addComponent(jButton1))))))))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPhoneNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
       String name = txtName.getText().trim();
       String gender = txtGender.getText().trim();
       String dob = txtDOB.getText().trim();
       String pob = txtPOB.getText().trim();
       String phoneNo = txtPhoneNo.getText().trim();
//        if (chucNangDaChon == ChucNang.ADD) {
//            if (CheckInput() == false) {
//                return;
//            }
//            if (BookingManager.Count("student", "Id", renderId) == 0) {
//                txtRenderId.requestFocus();
//                JOptionPane.showMessageDialog(null, "Người mượn không tồn tại", "Lỗi", JOptionPane.WARNING_MESSAGE);
//                return;
//            }
//            if (BookingManager.Count("booking", "RenderId", renderId, "Status", "Mượn") > 0) {
//                txtRenderId.requestFocus();
//                JOptionPane.showMessageDialog(null, "Người mượn chưa hoàn thành lần mượn trước", "Lỗi", JOptionPane.WARNING_MESSAGE);
//                return;
//            }
            if (StudentManager.Add(name, gender, dob, pob, phoneNo)) {
                btnSave.requestFocus();
                SwitchMode(ChucNang.NONE);
                ReloadTaleHD();
                JOptionPane.showMessageDialog(null, "Thêm thành công", "Thành công", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Thêm thất bại", "Có lỗi xảy ra", JOptionPane.ERROR_MESSAGE);
            }
//        }
//        if (chucNangDaChon == ChucNang.UPDATE) {
//            if (CheckInput() == false) {
//                return;
//            }
//            if (BookingManager.Edit(renderId, day, note)) {
//                btnUpdate.requestFocus();
//                SwitchMode(ChucNang.NONE);
//                ReloadTaleHD();
//                JOptionPane.showMessageDialog(null, "Sửa thành công",
//                        "Thành công", JOptionPane.INFORMATION_MESSAGE);
//            } else {
//                JOptionPane.showMessageDialog(null, "Sửa thất bại", "Có lỗi ", JOptionPane.ERROR_MESSAGE);
//            }
//        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbStudent;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPOB;
    private javax.swing.JTextField txtPhoneNo;
    // End of variables declaration//GEN-END:variables

    
}