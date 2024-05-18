/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author priya
 */
public class UpdateLessons {
    
    private DBSearch dbSearch;

    public UpdateLessons() {
        dbSearch = new DBSearch();
    }

    public void updateLesson(String lessonName, String topicName, String selectedDate, 
                                    String selectedGrade, String selectedSubject, String learningOutcome) throws SQLException {
        Connection conn = null;
        PreparedStatement pstmt = null;
        
        try {
            conn = DBConnection.getConnection();
            String query = "UPDATE lesson SET lesson = ?, topic = ?, learningOutcome = ?, grade = ?, subject = ? WHERE date = ?";
            
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, lessonName);
            pstmt.setString(2, topicName);
            pstmt.setString(3, learningOutcome);
            pstmt.setString(4, selectedGrade);
            pstmt.setString(5, selectedSubject);
            pstmt.setString(6, selectedDate);
            
            int rowsAffected = pstmt.executeUpdate();
            
            if (rowsAffected > 0) {
                System.out.println("Lesson updated successfully.");
            } else {
                System.out.println("No rows updated.");
            }
        } catch (SQLException e) {
            throw new SQLException("Error occurred while updating the lesson.", e);
        } finally {
            if (pstmt != null) {
                pstmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        }
    }
}
