package InterfaceItem;

import Process.*;
import javax.swing.JOptionPane;
import java.util.regex.Pattern;

/**
 *
 * @author Admin
 */
public class Profile extends javax.swing.JInternalFrame {

    private final String employeeId;
    int chucNangDaChon = ChucNang.NONE;

    public Profile(String employeeId) {
        this.employeeId = employeeId;
        initComponents();
        retrieve();
    }

    private void retrieve() {
        String email = ProfileManager.GetData("account", "Email", "AccountId", employeeId);
        String phoneNo = ProfileManager.GetData("account", "PhoneNo", "AccountId", employeeId);
        txtEmail.setText(email);
        txtPhone.setText(phoneNo);
    }

    void SwitchMode(int chucNang) {
        chucNangDaChon = chucNang;
        switch (chucNang) {
            case ChucNang.UPDATE: {
                boolean trangThai = true;
                txtRenewPassword.setEnabled(trangThai);
                txtPresentPassword.setEnabled(trangThai);
                txtNewPassword.setEnabled(trangThai);
                txtEmail.setEnabled(trangThai);
                txtPhone.setEnabled(trangThai);

                txtEmail.requestFocus();
                btnSave.setEnabled(trangThai);
                btnEdit.setText("Hủy");
                break;
            }
            case ChucNang.NONE: {
                boolean trangThai = false;
                txtPresentPassword.setEnabled(trangThai);
                txtNewPassword.setEnabled(trangThai);
                txtRenewPassword.setEnabled(trangThai);
                txtEmail.setEnabled(trangThai);
                txtPhone.setEnabled(trangThai);

                btnSave.setEnabled(trangThai);
                btnEdit.setEnabled(true);
                btnEdit.setText("Cập nhật");
            }
        }
    }

    boolean CheckInput() {
        String presentPassword = txtPresentPassword.getText().trim();
        String newPassword = txtNewPassword.getText().trim();
        String renewPassword = txtRenewPassword.getText().trim();
        String email = txtEmail.getText().trim();
        String phoneNo = txtPhone.getText().trim();

        Pattern p = Pattern.compile("^[0-9]+$");
        Pattern p2 = Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");

        if (presentPassword.length() > 0) {
            if (newPassword.length() == 0) {
                JOptionPane.showMessageDialog(null, "Vui lòng nhập mật khẩu mới", "Chưa nhập mật khẩu mới",
                        JOptionPane.WARNING_MESSAGE);
                txtNewPassword.requestFocus();
                return false;
            }

            if (renewPassword.length() == 0) {
                JOptionPane.showMessageDialog(null, "Nhập lại mật khẩu mới chưa chính xác", "Nhập lại mật khẩu mới chưa chính xác",
                        JOptionPane.WARNING_MESSAGE);
                txtNewPassword.requestFocus();
                return false;
            }

            if (!renewPassword.equals(newPassword)) {
                JOptionPane.showMessageDialog(null, "Vui lòng nhập lại mật khẩu mới", "Chưa nhập lại mật khẩu mới",
                        JOptionPane.WARNING_MESSAGE);
                txtNewPassword.requestFocus();
                return false;
            }

        }
        if (email.length() == 0) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập email", "Chưa nhập email",
                    JOptionPane.WARNING_MESSAGE);
            txtEmail.requestFocus();
            return false;
        } else if (!p2.matcher(email).find()) {
            JOptionPane.showMessageDialog(null, "Email không hợp lệ", "email không hợp lệ",
                    JOptionPane.WARNING_MESSAGE);
            txtEmail.requestFocus();
            return false;
        }

        if (phoneNo.length() == 0) {
            JOptionPane.showMessageDialog(null, "Vui lòng nhập số điện thoại", "Chưa nhập số điện thoại",
                    JOptionPane.WARNING_MESSAGE);
            txtPhone.requestFocus();
            return false;
        } else if (!p.matcher(phoneNo).find()) {
            JOptionPane.showMessageDialog(null, "Vui lòng chỉ nhập số", "Số điện thoại không hợp lệ",
                    JOptionPane.WARNING_MESSAGE);
            txtPhone.requestFocus();
            return false;
        }

        return true;
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

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        txtPhone = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtRenewPassword = new javax.swing.JPasswordField();
        txtPresentPassword = new javax.swing.JPasswordField();
        txtNewPassword = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setText("Mật khẩu mới");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel4.setText("SĐT");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Hồ sơ cá nhân");

        btnEdit.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnEdit.setText("Cập nhật");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        txtPhone.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtPhone.setEnabled(false);

        btnSave.setText("Lưu");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnReturn.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btnReturn.setText("Quay lại");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel5.setText("Email");

        txtEmail.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtEmail.setEnabled(false);

        txtRenewPassword.setEnabled(false);

        txtPresentPassword.setEnabled(false);

        txtNewPassword.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel6.setText("Mật khẩu hiện tại");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel7.setText("Mật khẩu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtRenewPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                            .addComponent(txtNewPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                            .addComponent(txtPhone, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                            .addComponent(txtPresentPassword))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 271, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(183, 183, 183)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnReturn)
                    .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(54, 54, 54))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPresentPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtRenewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(btnEdit)
                        .addGap(18, 18, 18)
                        .addComponent(btnSave)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnReturn)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if (chucNangDaChon == ChucNang.NONE)
            SwitchMode(ChucNang.UPDATE);
        else
            SwitchMode(ChucNang.NONE);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String presentPassword = txtPresentPassword.getText().trim();
        String newPassword = txtNewPassword.getText().trim();
        String email = txtEmail.getText().trim();
        String phoneNo = txtPhone.getText().trim();
        String checkPassword = ProfileManager.GetData("account", "Password", "AccountId", employeeId);

        if (chucNangDaChon == ChucNang.UPDATE) {
            if (CheckInput() == false) {
                return;
            }

            if (presentPassword.length() == 0) {
                if (ProfileManager.Edit(employeeId, email, phoneNo)) {
                    btnEdit.requestFocus();
                    SwitchMode(ChucNang.NONE);
                    JOptionPane.showMessageDialog(null, "Cập nhật thành công", "Thành công", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(null, "Cập nhật thất bại", "Có lỗi ", JOptionPane.ERROR_MESSAGE);

                }
            } else {
                if (!presentPassword.equals(checkPassword)) {
                    JOptionPane.showMessageDialog(null, "Mật khẩu hiện tại không đúng", "Lỗi", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
                if (ProfileManager.Edit(employeeId, newPassword, email, phoneNo)) {
                    btnEdit.requestFocus();
                    SwitchMode(ChucNang.NONE);
                    JOptionPane.showMessageDialog(null, "Cập nhật thành công", "Thành công", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    JOptionPane.showMessageDialog(null, "Cập nhật thất bại", "Có lỗi ", JOptionPane.ERROR_MESSAGE);

                }
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        this.dispose();

    }//GEN-LAST:event_btnReturnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtNewPassword;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JPasswordField txtPresentPassword;
    private javax.swing.JPasswordField txtRenewPassword;
    // End of variables declaration//GEN-END:variables

}