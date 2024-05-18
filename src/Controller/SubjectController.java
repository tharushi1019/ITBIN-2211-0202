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
import javax.swing.JOptionPane;

public class SubjectController {
    
    public static void Form(String subjectCode, String subName, String description) {
        new Model.AddSubject().Form(subjectCode, subName, description);
        JOptionPane.showMessageDialog(null, "New Record has been inserted", 
                "Successful", JOptionPane.INFORMATION_MESSAGE);
    }
}
