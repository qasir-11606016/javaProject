/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeepayroll;

/**
 *
 * @author Qasir
 */
import java.sql.*;
import javax.swing.*;

public class databaseConnection {
     
    public static Connection databaseConnection(){
       
        try{
            Connection connect=null; 
        Class.forName("org.sqlite.JDBC");
        connect=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Qasir\\Documents\\EmployeePayroll\\mydatabase.sqlite");
        return connect;
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
    }
    
}
