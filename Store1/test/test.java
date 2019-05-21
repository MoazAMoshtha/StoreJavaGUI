
import Class.ConnectionDB;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mamam
 */
public class test {

    public static void main(String[] args) {
        
           //JOptionPane.showMessageDialog(null, "A basic JOptionPane message dialog");

         try {
         String f = "moaz";String l = "mama.gma13o1";String a ="pass";
         Date d = new Date();
 
            Connection conn = ConnectionDB.StoreDB();      
            Statement st = conn.createStatement();
            st.executeUpdate("CREATE TABLE IF NOT EXISTS `store_project`.`customers`"
                    + " ( `id` INT NOT NULL AUTO_INCREMENT , `name` VARCHAR(20) "
                    + "NOT NULL , `email` VARCHAR(50) NOT NULL , "
                    + "`password` VARCHAR(20) NOT NULL , PRIMARY KEY (`id`)) ENGINE = InnoDB;");
            st.executeUpdate("CREATE TABLE IF NOT EXISTS `store_project`.`activities` "
                    + "( `id` INT NOT NULL AUTO_INCREMENT , `name` VARCHAR(20) NOT NULL"
                    + " , `activitie` VARCHAR(50) NOT NULL , PRIMARY KEY (`id`)) ENGINE = InnoDB;");
            ResultSet resultSet = st.executeQuery("select * from customers");
               
           /*
             while (resultSet.next()) {
                 if(resultSet.getString("email").equals(l)){
                 JOptionPane.showMessageDialog(null, "Email EXISTS");
                 break;
                 }else{
                   st.executeUpdate("INSERT INTO `customers` (`id`, `name`, `email`, `password`) VALUES (null,'"+f+"','"+l+"','"+a+"');");
                    st.executeUpdate("INSERT INTO `activities` (`id`, `name`, `activitie`) VALUES (NULL, '"+f+"', 'SingIn |"+d+"');");
                    conn.close();
                 }
                      }  */

         
        } catch (SQLException ex) {
           Logger.getLogger(test.class.getName()).log(Level.SEVERE, null, ex);
 JOptionPane.showMessageDialog(null,"Error",
        " in Databases",
        JOptionPane.ERROR_MESSAGE);

             System.out.println("1");
        }


    }      
}
