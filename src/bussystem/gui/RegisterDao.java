package bussystem.gui;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;
import Pojo.util.Pojo;
import dbregister.util.DbRegister;
public class RegisterDao {
    private static Connection conn;
    public static boolean registerdata(Pojo obj)throws SQLException
    {
        Connection conn=DbRegister.getConnection();
        PreparedStatement ps1=conn.prepareStatement("select * from customerregister where email=?");
        ps1.setString(1,obj.getEmail());
        int coun=ps1.executeUpdate();
        if(coun==1)
         return false;
        else
        {
         PreparedStatement ps=conn.prepareStatement("insert into customerregister values(?,?,?,?,?)");
          ps.setString(1,obj.getName());
          ps.setString(2,obj.getAddress());
         ps.setString(3,obj.getContact());
         ps.setString(4,obj.getEmail());
         ps.setString(5,obj.getPassword());
          int count=ps.executeUpdate();
         return (count==1);
        }
    }
    public static boolean logindata(String email,String pass) throws SQLException
    {
        Connection conn=DbRegister.getConnection();
        PreparedStatement ps=conn.prepareStatement("select * from customerregister where email=?");
        ps.setString(1, email);
        ResultSet rs=ps.executeQuery();
        if(rs.next())
        {
         if(rs.getString(4).equals(email) && rs.getString(5).equals(pass))
         {
            CustomerHomepage obj=new CustomerHomepage(email);
            obj.setVisible(true);
         }
         else
         {
            JOptionPane.showMessageDialog(null,"Please Enter valid data!");
            CustomerLogin obj=new CustomerLogin();
            obj.setVisible(true);
            
         }
        }
        return true;
    }
    public static boolean forgetPass(String email)throws SQLException
    {
        Connection conn=DbRegister.getConnection();
        PreparedStatement ps1=conn.prepareStatement("select * from customerregister where email=?");
        ps1.setString(1,email);
        int con=ps1.executeUpdate();
        if(con==1)
        {
            return true;
        }
        else
            return false;
    }
    public static boolean setPassword(String e,String pass)throws SQLException
    { 
        Connection conn=DbRegister.getConnection();
        PreparedStatement ps=conn.prepareStatement("UPDATE customerregister SET password=? where email=?");
        ps.setString(1,pass);
        ps.setString(2,e);
        int con=ps.executeUpdate();
        if(con==1)
            return true;
        else return false;
    }
}
