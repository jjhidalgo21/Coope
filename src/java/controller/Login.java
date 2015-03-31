/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

/**
 *
 * @author Jonathan
 */
public class Login {
  
    
 private Connection connect = null;
 private Statement statement = null;
 private PreparedStatement preparedStatement = null;
 private ResultSet resultSet = null;
 boolean retorno;
   public boolean getUser(User usuario) throws Exception {
    try {
      Class.forName("com.mysql.jdbc.Driver");
      connect = DriverManager
          .getConnection("jdbc:mysql://localhost/mydb?"
              + "user=sqluser&password=sqluserpw");

        preparedStatement = connect.prepareStatement("SELECT *  FROM mydb.USER where USERNAME = ?");
     
        preparedStatement.setString(1, usuario.getUser());
        resultSet = preparedStatement.executeQuery();
      
        while (resultSet.next()) {
            String user = resultSet.getString("username");
            if(user!=null){
                System.out.println("User: " + user);
                retorno = true;
            }else{
                retorno = false;
            }
        }
      
      
    } catch (Exception e) {
      throw e;
    } finally {
      close();
      return retorno;
    }

  }



  private void writeResultSet(ResultSet resultSet) throws SQLException {
    // ResultSet is initially before the first data set
    while (resultSet.next()) {
      // It is possible to get the columns via name
      // also possible to get the columns via the column number
      // which starts at 1
      // e.g. resultSet.getSTring(2);
      String user = resultSet.getString("username");
      //String website = resultSet.getString("webpage");
      //String summary = resultSet.getString("summary");
      Date date = resultSet.getDate("birthday");
      String comment = resultSet.getString("comments");
      System.out.println("User: " + user);
      //System.out.println("Website: " + website);
      //System.out.println("Summary: " + summary);
      System.out.println("Date: " + date);
      System.out.println("Comment: " + comment);
    }
  }

  // You need to close the resultSet
  private void close() {
    try {
      if (resultSet != null) {
        resultSet.close();
      }

      if (statement != null) {
        statement.close();
      }

      if (connect != null) {
        connect.close();
      }
    } catch (Exception e) {

    }
  }
}
