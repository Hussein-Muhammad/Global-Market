
package db1;

import java.sql.*;

class MysqlCon {

    //DB server information is private
    private static String server_link = "" ;
    private static String Username = "" ;                       
    private static String Password = "" ;                      
    private static boolean connected = false ;
    private static Connection con ;

    
    MysqlCon(){
        System.out.println("Connection Object Created");
    }
    
    static Connection Connect(){
     try {
         if(!connected){
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(server_link, Username, Password);
            connected = true ;
         }
         else {
             System.out.println("the database is connected already !!");
         }
        } catch (Exception e) {
            System.out.println(e+ "  Connection Error");
        }
     return con ;
    }
    
    static ResultSet ExcuteQuery(String query) throws SQLException{
        Statement stmt = con.createStatement();
        return stmt.executeQuery(query);
    }
    static void ExcuteUpdate(String update) throws SQLException {
        Statement stmt = con.createStatement();
        stmt.executeUpdate(update);
    }
    static void Disconnect() {
    try {
        if(connected){ 
          con.close();
          connected = false;
        }
        else {
            System.out.println("no connection established !!");
        }
        } catch (Exception e) {
            System.out.println(e + "  Disconnection Error");
        }
    }
    static Connection getConnection(){ return isConnected() ? con : Connect(); } ;
    static boolean isConnected(){ return connected; } ;
}



/*
//testConnection
ResultSet rs = stmt.executeQuery("select * from user");
            while (rs.next()) {
                System.out.println(rs.getString("UserName") + "  " + rs.getString("Password") + "  " + rs.getString("Email") + "  " + rs.getString("Type"));
            }
ResultSet data = MysqlCon.ExcuteQuery("SELECT * FROM USER WHERE (UserName='wqeqwe' or Email='anymail@yahoo.com') and Password='123456789'");

used quirires ://username , password , Email , Type , activebit, requestNum , investorCompanylist

*/