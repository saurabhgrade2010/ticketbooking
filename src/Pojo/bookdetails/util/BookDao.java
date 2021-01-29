package bookdetails.util;
import bussystem.gui.Panel;
import java.sql.Connection;
import bussystem.gui.TicketPojo;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.Statement;
import dbbook.util.DbBook;
import java.util.ArrayList;
import bussystem.gui.Resultbus;
import bussystem.gui.SearchBus;
import javax.swing.JPanel;
public class BookDao extends JPanel{
    public static boolean addBook(BookPojo obj)throws SQLException
    {
       Connection conn=DbBook.getConnection();
       PreparedStatement ps=conn.prepareStatement("insert into businfo(?,?,?,?,?,?,?)");
       ps.setInt(1,obj.getBusid());
       ps.setString(2,obj.getBusname());
       ps.setString(3,obj.getSource());
       ps.setString(4,obj.getDestination());
       ps.setString(5,obj.getArrivaltime());
       ps.setString(6,obj.getDestinationtime());
       ps.setString(7,obj.getPrice());
       int count=ps.executeUpdate();
       return (count==1);
    }
    
    public static void searchBus(String s,String d,String em)throws SQLException
    {
        //String qry="select * from businfo where source=?";
       Connection conn=DbBook.getConnection();
       PreparedStatement ps=conn.prepareStatement("select * from businfo where source=?");
       ps.setString(1,s);
       ResultSet rs=ps.executeQuery();
        ArrayList<BookPojo> x= new ArrayList<>();
        while(rs.next()){
            BookPojo ob=new BookPojo(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getInt(8));
            x.add(ob);
            
        } 
         if(x.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"No Bus");
            new SearchBus(em).setVisible(true);
            return;
        }
         else
         {
         Resultbus o=new Resultbus(x,em);
         o.setLocationRelativeTo(null);
         o.setVisible(true);
         }
    
    
       
        }
    public static boolean addPayment(TicketPojo tic,BookPojo obj)throws SQLException
    {
       double pr=Double.parseDouble(obj.getPrice());
       double amt=(tic.getSeat())*pr;
       Connection conn=DbBook.getConnection();
       String qry="insert into payment2 values(?,?,?,?,?,?)";
       PreparedStatement ps=conn.prepareStatement(qry);
       ps.setString(1,tic.getName());
       ps.setString(2,tic.getEmail());
       ps.setString(3,obj.getBusname());
       ps.setInt(4,obj.getBusid());
       String s=String.valueOf(amt);
       ps.setString(5,s);
       ps.setInt(6,tic.getSeat());
       int count=ps.executeUpdate();
       
       return (count==1);
    }
     public static boolean deleteTicket(String email) throws SQLException{
      Connection conn=DbBook.getConnection();
      PreparedStatement ps=conn.prepareStatement("delete from payment2 where email=?");
      ps.setString(1,email);
      int count=ps.executeUpdate();
      if(count>0)
          return true;
      else{
          JOptionPane.showMessageDialog(null, "Ticket not found!!");
          return false;
      }
      
   }
     public static ArrayList<Tpojo> ticketdeta(String em)throws SQLException
     {
         Connection conn=DbBook.getConnection();
         PreparedStatement ps=conn.prepareStatement("Select * from payment2 where email=?");
         ps.setString(1,em);
         ResultSet rs=ps.executeQuery();
         ArrayList<Tpojo> x=new ArrayList<>();
         while(rs.next())
         {
             Tpojo obj=new Tpojo(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5),rs.getInt(6));
             x.add(obj);
         }
           return x;  
      }
 }

