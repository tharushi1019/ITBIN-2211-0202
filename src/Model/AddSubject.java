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
import java.sql.Statement;

public class AddSubject {
    
    Statement stmt;
    
    public void Form(String subjectCode, String subName, String description) {
        try {
            stmt = DBConnection.getStatementConnection();
            stmt.executeUpdate("INSERT INTO subject(subjectCode,subName,description) VALUES('"+subjectCode+"','"+subName+"','"+description+"')");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
