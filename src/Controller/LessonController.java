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
import Model.AddLessons;
import Model.UpdateLessons;
import View.AddLesson;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class LessonController {
    
    public static void submitForm(String lesson, String topic, String learningOutcome,
                                  String grade, String subject, String date) {

        try {
            AddLessons addLessons = new AddLessons();
            addLessons.submitForm(date, Integer.parseInt(grade), subject, lesson, topic, learningOutcome);
            
            JOptionPane.showMessageDialog(null, "New record has been inserted successfully",
                    "Success", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void submitForm(JTextField lesson, JTextField topic, 
                                  String lessonDate, String selectedGrade, 
                                  String selectedSubject, JTextArea learningTA) {
        try {
            // Check if any required fields are empty
            if (lesson.getText().isEmpty() || topic.getText().isEmpty() || learningTA.getText().isEmpty() || selectedGrade.equals("None") || selectedSubject.equals("None")) {
                JOptionPane.showMessageDialog(null, "Please fill in all fields.",
                        "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            submitForm(lesson.getText(), topic.getText(), learningTA.getText(), selectedGrade, selectedSubject, lessonDate);
            
            // Display success message
            JOptionPane.showMessageDialog(null, "New record has been inserted successfully",
                    "Success", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void updateLesson(String lessonName, String topicName, String selectedDate, 
                                    String selectedGrade, String selectedSubject, String learningOutcome) {

        try {
            UpdateLessons updateLessons = new UpdateLessons();
            updateLessons.updateLesson(lessonName, topicName, selectedDate, selectedGrade, selectedSubject, learningOutcome);
            
            JOptionPane.showMessageDialog(null, "Lesson updated successfully",
                    "Success", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "An error occurred: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
