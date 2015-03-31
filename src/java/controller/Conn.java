/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Jonathan
 */
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
/**
 *
 * @author Jonathan
 */
public class Conn {
    public Conn() throws SQLException{
        getConnection2();
    } 


    
    public Connection getConnection() throws SQLException {

    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "admin");
    
    System.out.println("Connected to database");
    return conn;
}  
    
     public Connection getConnection2() throws SQLException {
Connection conn = null;

    try {
        
    conn =
       DriverManager.getConnection("jdbc:mysql://localhost/mydb?" +
                                   "user=root&password=admin");
System.out.println("Connected to database");
    // Do something with the Connection

   
    } catch (SQLException ex) {
    // handle any errors
    System.err.println("SQLException: " + ex.getMessage());
    System.err.println("SQLState: " + ex.getSQLState());
    System.err.println("VendorError: " + ex.getErrorCode());
    }
    return conn;
     }
     public static void main(String args[]) {
         try {
             Conn c = new Conn();
             System.out.println("Connectionblished");
         }
         catch (SQLException e) {
             e.printStackTrace();
             System.err.println("Connectionure");
         }  

    }
}