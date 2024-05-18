/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
/**
 *
 * @author priya
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class AddTeacher {
    
        public static void addTeacher(String name, String nic, String gender, String username, String password,
                                  String educationQualification, String degreeName, String dob, int telephone,
                                  String email) throws SQLException {
        try (Connection connection = DBConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "INSERT INTO teacher (tName, nic, gender, username, password, eduQ, " +
                     "qName, dob, telephone, email) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)")) {
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, nic);
            preparedStatement.setString(3, gender);
            preparedStatement.setString(4, username);
            preparedStatement.setString(5, password);
            preparedStatement.setString(6, educationQualification);
            preparedStatement.setString(7, degreeName);
            preparedStatement.setString(8, dob);
            preparedStatement.setInt(9, telephone);
            preparedStatement.setString(10, email);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}