
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mamam
 */
public class insertText {
    public static void main(String[] args) {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/store_project","root","");
            Statement st = conn.createStatement();      
             //String createTableActivities = "INSERT INTO `moaz` (`id`, `name`, `Activitie`) VALUES ('1', 'moaz', 'hello word')";
             int id = 1 ;String f = "A"; String l="B";String a = "15";
             int i = st.executeUpdate("insert into admin (id ,name,email,password) values (null,'"+f+"','"+l+"',"+a+")");
            // int i =  st.executeUpdate(createTableActivities);
             System.out.println(i);
             //int i = st.executeUpdate("INSERT INTO admin (id, name, email, password) VALUES (NULL, 'ahmed', '123', '123123'");
             System.out.println("" + i);           
        } catch (SQLException ex) {
                ex.getErrorCode();
                ex.getSQLState();
                System.out.println("10");
        } catch (ClassNotFoundException ex) {
                ex.getMessage();
                 System.out.println("2");

        }

    }
    
}
