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
import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
    static Connection conn;
    static Statement stat = null;
    
    public static Connection getConnection() {
        if (conn == null) {
            try {
            //Establish the connection
            String url = "jdbc:mysql://localhost:3306/lessonplandb";
            conn = DriverManager.getConnection(url, "root", "");
               
        } catch (Exception e) {
            e.printStackTrace();
            }
        }   
        
           return conn;
    }
    
    public static Statement getStatementConnection() throws SQLException{
        if (conn == null) {
            getConnection();
        }
        return conn.createStatement();
    }
    
    //Close the connection
    public static void closeCon() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                conn = null;
            }
        }
    }

        
}
    

