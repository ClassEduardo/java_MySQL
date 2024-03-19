package com.CrudApplication.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
   private static final String url = "jdbc:mysql://localhost:3001/ecommerce";
   private static final String user = "root";
   private static final String password = "d#df@i23d";

   public static java.sql.Connection conn;

   public static java.sql.Connection getConnection() {

      try {
         if(conn == null) {
            conn = DriverManager.getConnection(url, user, password);
            return conn;
         } else {
            return conn;
         }
      } catch (SQLException e) {
         e.printStackTrace();
         return null;
      }


   }
}
