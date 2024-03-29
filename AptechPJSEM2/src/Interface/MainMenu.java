/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import InterfaceItem.Account;
import InterfaceItem.Book;
import InterfaceItem.Booking;
<<<<<<< HEAD
import InterfaceItem.Category;
=======
>>>>>>> 9a4c6b3dd7116006c97fe58b16fa77d1e89a6302
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class MainMenu extends javax.swing.JFrame {
    private final String employeeId;
    private final String role;
    /**
     * Creates new form Menu
     * @param employeeId
     * @param role
     */
    public MainMenu(String employeeId,String role) {
        this.employeeId = employeeId;
        this.role = role;
        initComponents();
        retrieve();
    }

    private void retrieve(){
        if(role.equals("0"))
            menuEmployee.setVisible(true);
        else
            menuEmployee.setVisible(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        DesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mniExit = new javax.swing.JMenuItem();
        menuManagement = new javax.swing.JMenu();
        Student = new javax.swing.JMenuItem();
        Book = new javax.swing.JMenuItem();
        Booking = new javax.swing.JMenuItem();
        Category = new javax.swing.JMenuItem();
        menuEmployee = new javax.swing.JMenu();
        Customer = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(0, 0));

        DesktopPane1.setMaximumSize(getMaximumSize());

        javax.swing.GroupLayout DesktopPane1Layout = new javax.swing.GroupLayout(DesktopPane1);
        DesktopPane1.setLayout(DesktopPane1Layout);
        DesktopPane1Layout.setHorizontalGroup(
            DesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 799, Short.MAX_VALUE)
        );
        DesktopPane1Layout.setVerticalGroup(
            DesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
        );

        jMenu1.setText("Hệ thống");

        mniExit.setText("Exit");
        mniExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniExitActionPerformed(evt);
            }
        });
        jMenu1.add(mniExit);

        jMenuBar1.add(jMenu1);

        menuManagement.setText("Chức năng");

        Student.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Student.setText("Thông tin sinh viên");
        Student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentActionPerformed(evt);
            }
        });
        menuManagement.add(Student);

        Book.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Book.setText("Nhập sách");
        Book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBookActionPerformed(evt);
            }
        });
        menuManagement.add(Book);

        Booking.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.ALT_DOWN_MASK));
        Booking.setText("Mượn - Trả sách");
        Booking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BookingActionPerformed(evt);
            }
        });
        menuManagement.add(Booking);

        Category.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Category.setText("Thể loại sách");
        Category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoryActionPerformed(evt);
            }
        });
        menuManagement.add(Category);

        jMenuBar1.add(menuManagement);

        menuEmployee.setText("Quản lý nhân viên");

        Customer.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        Customer.setText("Thông tin nhân viên");
        Customer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerActionPerformed(evt);
            }
        });
        menuEmployee.add(Customer);

        jMenuBar1.add(menuEmployee);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerActionPerformed
        Account employee = new Account();
        DesktopPane1.add(employee);
        employee.setVisible(true);
    }//GEN-LAST:event_CustomerActionPerformed

    private void BookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BookingActionPerformed
        Booking bookingForm = new Booking(employeeId,DesktopPane1);
        DesktopPane1.add(bookingForm);
        bookingForm.setVisible(true);
    }//GEN-LAST:event_BookingActionPerformed

    private void mniExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniExitActionPerformed
        System.exit(0);

    }//GEN-LAST:event_mniExitActionPerformed

    private void createBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBookActionPerformed
        Book bookForm = null;
        try {
            bookForm = new Book(employeeId);
        } catch (SQLException ex) {
            Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        DesktopPane1.add(bookForm);
        bookForm.setVisible(true);
    }//GEN-LAST:event_createBookActionPerformed

    private void StudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StudentActionPerformed

    private void CategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoryActionPerformed
        // TODO add your handling code here:
        Category categoryForm = new Category(employeeId);
        DesktopPane1.add(categoryForm);
        categoryForm.setVisible(true);
    }//GEN-LAST:event_CategoryActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Book;
    private javax.swing.JMenuItem Booking;
    private javax.swing.JMenuItem Category;
    private javax.swing.JMenuItem Customer;
    private javax.swing.JDesktopPane DesktopPane1;
    private javax.swing.JMenuItem Student;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenu menuEmployee;
    private javax.swing.JMenu menuManagement;
    private javax.swing.JMenuItem mniExit;
    // End of variables declaration//GEN-END:variables
}
