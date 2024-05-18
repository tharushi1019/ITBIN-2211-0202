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

import Model.DBConnection;
import View.AddTeacher;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TeacherController {

    public static void addTeacher(String name, String nic, String gender, 
                                  String username, String password,
                                  String educationQualification, 
                                  String degreeName, String dob, int telephone,
                                  String email) {
        try {
            Model.AddTeacher.addTeacher(name, nic, gender, username, password, 
                    educationQualification, degreeName, dob, telephone, email);
            JOptionPane.showMessageDialog(null, "New Teacher has been inserted.", 
                    "Success", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Recod Added Succesfully");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, 
                    "Error occurred while adding teacher:\n" + e.getMessage(), 
                    "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
}