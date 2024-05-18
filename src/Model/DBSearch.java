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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DBSearch {
    
    Statement stmt;
    ResultSet rs;
    
    public ResultSet searchAdminLogin(String usrname) throws SQLException {
        ResultSet rs = null;
        PreparedStatement stmt = null;
        try {
            Connection conn = DBConnection.getConnection();
            String query = "SELECT * FROM login WHERE userName = ?";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, usrname);
            rs = stmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
        return rs;
    }

    public ResultSet searchTeacherLogin(String usrname) throws SQLException {
        ResultSet rs = null;
        PreparedStatement stmt = null;
        try {
            Connection conn = DBConnection.getConnection();
            String query = "SELECT * FROM teacher WHERE username = ?";
            stmt = conn.prepareStatement(query);
            stmt.setString(1, usrname);
            rs = stmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
        return rs;
    }
    
    public ResultSet searchTeacher(){
        try {
            stmt = DBConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT tName, nic, gender, eduQ, qName, dob, telephone, email FROM teacher");
        }
        catch(Exception e) {

        }
        return rs;
    }

    public ResultSet searchSubjects(){
        try {
            stmt = DBConnection.getStatementConnection();
            rs = stmt.executeQuery("SELECT * FROM subject");
        }
        catch(Exception e) {

        }
        return rs;
    }

    public ResultSet searchLesson(String date) throws SQLException {
        ResultSet resultSet = null;
        Connection connection = null;
        try {
            connection = DBConnection.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM lesson WHERE date = ?");
            statement.setString(1, date);
            resultSet = statement.executeQuery();
        } catch (SQLException e) {
            Logger.getLogger(DBSearch.class.getName()).log(Level.SEVERE, null, e);
            throw new SQLException("Error occurred while searching for lessons.", e);
        }
        return resultSet;
    }
    
}

