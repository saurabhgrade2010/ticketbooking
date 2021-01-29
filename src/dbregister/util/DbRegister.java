package dbregister.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class DbRegister {
    private static Connection conn;
    static {
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            conn=DriverManager.getConnection("jdbc:oracle:thin:@//love-PC:1521/XE","rajput","rajput");
            //JOptionPane.showMessageDialog(null,"Connected to DB Successfully..!");
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

