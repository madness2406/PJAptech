/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Process;

import Database.DBConnection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class BookingManager {

    public static boolean Add(String renderId, String lenderId, String day,
            String status, String note) {
        DBConnection dbconn = new DBConnection();
        String sql;
        if (!note.equals("")) {
            sql = "Insert into booking (RenderId,LenderId,ExpiredDay,Status,Deposit,Note)"
                    + " values (N'" + renderId + "',N'" + lenderId + "',N'"
                    + day + "',N'" + status + "','0" + "',N'" + note + "')";
        } else {
            sql = "Insert into booking (RenderId,LenderId,ExpiredDay,Status,Deposit)"
                    + " values (N'" + renderId + "',N'" + lenderId + "',N'"
                    + day + "',N'" + status + "','0')";
        }
        return dbconn.UpdateData(sql);

    }

    public static boolean Edit(String renderId, String day, String note) {
        DBConnection dbConn = new DBConnection();
        String sql = "Update booking Set RenderId = N'" + renderId + "', ExpiredDay = N'"
                + day + "', Note = N'" + note + "'";
        return dbConn.UpdateData(sql);
    }
    
    public static boolean Edit(String status, String returnDate) {
        DBConnection dbConn = new DBConnection();
        String sql = "Update booking Set Status = N'" + status + "', ReturnDate = N'"
                + returnDate + "'";
        return dbConn.UpdateData(sql);
    }

    public static boolean Delete(String bookingId) {
        String sql = "Delete From booking Where BookingId ='" + bookingId + "'";
        DBConnection dbConn = new DBConnection();
        return dbConn.UpdateData(sql);
    }

    public static boolean BookingToTable(JTable jTable) {
        try {
            DefaultTableModel dfTableModel = (DefaultTableModel) jTable.getModel();
            dfTableModel.setRowCount(0);
            DBConnection db = new DBConnection();
            ResultSet rs = db.GetData("Select * From booking");
            String[] row = new String[8];
            while (rs.next()) {
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);
                row[7] = rs.getString(8);
                dfTableModel.addRow(row);
            }
            return true;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DBConnection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public static boolean SearchBookingToTable(JTable jTable, String constraint) {
        try {
            DefaultTableModel dfTableModel = (DefaultTableModel) jTable.getModel();
            dfTableModel.setRowCount(0);
            DBConnection db = new DBConnection();
            ResultSet rs;
            if (constraint.length() > 0) {
                rs = db.GetData("Select BookingId,RenderId,LenderId,DateOfRent,ExpiredDay,ReturnDate,Status,Deposit "
                        + "From booking Where ("
                        + "BookingId Like '%" + constraint + "%' Or "
                        + "RenderId Like '%" + constraint + "%' Or "
                        + "LenderId Like '%" + constraint + "%' Or "
                        + "DateOfRent Like '%" + constraint + "%' Or "
                        + "ExpiredDay Like '%" + constraint + "%' Or "
                        + "ReturnDate Like '%" + constraint + "%' Or "
                        + "Status Like '%" + constraint + "%' Or "
                        + "Deposit Like '%" + constraint + "%')");
            } else {
                rs = db.GetData("Select BookingId,RenderId,LenderId,DateOfRent,ExpiredDay,ReturnDate,Status,Deposit From booking");
            }
            String[] row = new String[8];
            while (rs.next()) {
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);
                row[7] = rs.getString(8);

                dfTableModel.addRow(row);
            }
            return dfTableModel.getRowCount() > 0;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DBConnection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public static boolean FilterBookingToTable(JTable jTable, String constraint1, String constraint2, String column) {
        try {
            DefaultTableModel dfTableModel = (DefaultTableModel) jTable.getModel();
            dfTableModel.setRowCount(0);
            DBConnection db = new DBConnection();
            ResultSet rs = null;
            if (constraint1.length() > 0 && constraint2.length() > 0 && !column.equals("")) {
                rs = db.GetData("Select BookingId,RenderId,LenderId,DateOfRent,ExpiredDay,ReturnDate,Status,Deposit "
                        + "From booking Where ("
                        + column + " Between '" + constraint1 + "' And '" + constraint2 + "')");
            } else if(column.equals("") || constraint1.length() == 0 || constraint2.length() == 0) {
                rs = db.GetData("Select BookingId,RenderId,LenderId,DateOfRent,ExpiredDay,ReturnDate,Status,Deposit From booking");
            }
            String[] row = new String[8];
            while (rs.next()) {
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                row[4] = rs.getString(5);
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);
                row[7] = rs.getString(8);

                dfTableModel.addRow(row);
            }
            return dfTableModel.getRowCount() > 0;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DBConnection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public static boolean BookBookingToList(String bookingId, ArrayList arrayList) {
        try {
            DBConnection db = new DBConnection();
            ResultSet rs = db.GetData("Select bkd.BookId,bkd.Quantity,b.Quantity From bookingdetail bkd "
                                    + "Inner Join book b On bkd.BookId = b.BookId "
                                    + "Where bkd.BookBookingId = N'" + bookingId + "'");
            while (rs.next()) {
                String[] row = new String[3];
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                arrayList.add(row);
            }
            return true;
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DBConnection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            return false;
        }
    }
    public static int Count(String tableName, String columnName1, String value1, String coloumnName2, String value2) {
        String sql;
        if (value1.length() == 0 && columnName1.length() == 0
                && value2.length() == 0 && coloumnName2.length() == 0) {
            sql = "Select COUNT(*) from " + tableName;
        } else {
            sql = "Select COUNT(*) from " + tableName + " Where " + columnName1 + " = N'" + value1 + "' And "
                    + coloumnName2 + " = N'" + value2 + "'";
        }

        DBConnection dbConn = new DBConnection();
        ResultSet rs = dbConn.GetData(sql);
        try {
            if (rs.next()) {
                int count = Integer.parseInt(rs.getString(1));
                return count;
            }
        } catch (NumberFormatException | SQLException ex) {
            java.util.logging.Logger.getLogger(DBConnection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            return 0;
        }
        return 0;
    }

    public static int Count(String tableName, String columnName, String value) {
        String sql;
        if (value.length() == 0 && columnName.length() == 0) {
            sql = "Select COUNT(*) from " + tableName;
        } else {
            sql = "Select COUNT(*) from " + tableName + " Where " + columnName + " = N'" + value + "'";
        }

        DBConnection dbConn = new DBConnection();
        ResultSet rs = dbConn.GetData(sql);
        try {
            if (rs.next()) {
                int count = Integer.parseInt(rs.getString(1));
                return count;
            }
        } catch (NumberFormatException | SQLException ex) {
            java.util.logging.Logger.getLogger(DBConnection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            return 0;
        }
        return 0;
    }

    public static String TotalMoney(String bookingId) {
        String qr = "Select SUM(Money) From bookingdetail"
                + " Where BookBookingId = '" + bookingId + "'";
        DBConnection dbConn = new DBConnection();
        ResultSet rs = dbConn.GetData(qr);
        try {
            if (rs.next()) {
                return rs.getString(1);
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(DBConnection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            return "0.0";
        }
        return "0.0";
    }

    public static String TotalDeposits(Float money, int interest) {
        return String.valueOf(money * interest / 100);
    }
    
    public static String GetData(String table, String columnDisplay, String columnConstraint, String value) {
        try {
            String dm = null;
            DBConnection dbConn = new DBConnection();
            String qr = "Select " + columnDisplay + " From " + table + " Where " + columnConstraint + " = N'" + value + "'";
            ResultSet rs = dbConn.GetData(qr);
            if (rs.next()) {
                dm = rs.getString(columnDisplay);
            }
            return dm;
        } catch (SQLException ex) {
            Logger.getLogger(BookingDetailManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
