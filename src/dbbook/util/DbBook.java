
package dbbook.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class DbBook {
     private static Connection conn;
    static {
        try{
            class.forName("oracle.jdbc.OracleDriver");//Load & Registering Driver..
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//love-PC:1521/XE","rajput","rajput");
            
        }
        catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Not Connected!");
        }
        
    }
    public static Connection getConnection(){
            return conn;
    }
    public static void closeConnection(){
        try{
            conn.close();
            JOptionPane.showMessageDialog(null,"Disconnected SuccessFully!");

        }
        catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,"Exception Occured During Closing Connection :"+ex);
        }
    }
}
