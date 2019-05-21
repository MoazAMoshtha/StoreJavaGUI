/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author JISOO
 */
public class ConnectionDB {
    Connection koneksi=null;
public static Connection StoreDB(){
    try
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/store_project","root","");
        System.out.println("Connection Success");
        return conn;
    }
    catch (Exception e){
        System.out.println("Connection error");
        return null;
    }
}
    public static void main(String[] args) {
        ConnectionDB c = new ConnectionDB();
        c.StoreDB();
        
        
    }
}
