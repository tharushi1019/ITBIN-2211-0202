/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author priya
 */
import View.Home;
import Model.DBConnection;
import Model.DBSearch;
import java.awt.Frame;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import View.Login;
import View.TeachersHome;

public class LoginController {
    
 
    public static void login(String usrname, String pWord) {
        ResultSet rs = null;
        try {
            String username = null;
            String password = null;
            
            DBSearch dbSearch = new DBSearch();
            
            if (usrname.equals("admin")) {
                rs = dbSearch.searchAdminLogin(usrname);
            } else {
                rs = dbSearch.searchTeacherLogin(usrname);
            }

            if (rs != null) {
                while (rs.next()) {
                    username = rs.getString("username");
                    password = rs.getString("password");
                }
            }

            if (username != null && password != null) {
                if (password.equals(pWord)) {
                    if (usrname.equals("admin")) {
                        System.out.println("Admin Login Successful");
                        Login.getFrames()[0].dispose();
                        new Home().setVisible(true);
                    } else {
                        System.out.println("Teacher Login Successful");
                        Login.getFrames()[0].dispose();
                        new TeachersHome().setVisible(true);
                    }
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Incorrect password. Please try again.",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null,
                        "Username does not exist. Please check the credentials.",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException ex) {
            Logger.getLogger(LoginController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DBConnection.closeCon();
        }
    }
}
