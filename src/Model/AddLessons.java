/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Statement;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author priya
 */
public class AddLessons {
    
    Statement stmt;

    public void submitForm(String date, int grade, String subject, String lesson,
                           String topic, String learningOutcome) {
        try {
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO lesson(subject,grade,date,lesson,topic,learningOutcome) VALUES('" + subject + "', '" + grade + "', '" + date + "', '" + lesson + "', '" + topic + "', '" + learningOutcome + "')");
        } catch (Exception e) {
            e.printStackTrace();
        }
    } 

    public void submitForm(String lessonDate, int parseInt, String selectedSubject, JTextField lesson, JTextField topic, JTextArea learningTA) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
