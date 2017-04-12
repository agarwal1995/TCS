
package quarto;


import java.sql.*;
import javax.swing.*;
public class db {
    Connection c=null;
    public static Connection java_db()
    {
        String username="root";
        String password="";
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/library",username,password);
            
            
            return c;
        }
        catch(ClassNotFoundException | SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
}

