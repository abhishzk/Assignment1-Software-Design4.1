
package creditcardmanagementsystem;

import java.sql.*;
import javax.swing.*;
/**
 * @author ${Abhishek Kumar}
 *
 *
 */
public class MySqlConnect {
    
    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
    public static Connection ConnectDB()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/data_table","root","");
            JOptionPane.showMessageDialog(null, "Connected to Server");
            return conn;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
            
        }
        
    }
    
    public void purchased(Double cost,String cn,String n,String p)
    {
        Double DBamt=0.0;
        conn=this.ConnectDB();
        try
        {
            pst = conn.prepareStatement("Select * from CARDDETAILS where CUSTCARDNO=? and CUSTNAME=? and CUSTPIN=?");
            pst.setString(1, cn);
            pst.setString(2, n);
            pst.setString(3, p);
            rs=pst.executeQuery();
            while(rs.next())
            {
                DBamt=rs.getDouble("CUSTTOTALSPENDINGS");
                
            }
            DBamt+=cost;
            pst = conn.prepareStatement("UPDATE CARDDETAILS SET CUSTTOTALSPENDINGS =? where CUSTCARDNO=? and CUSTNAME=? and CUSTPIN=?");
            pst.setString(1, DBamt.toString());
            pst.setString(2, cn);
            pst.setString(3, n);
            pst.setString(4, p);
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Payment Sucessful, Amount:"+cost);
            
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            
        }
        
        
    }
    
    public ResultSet getDBresult()
    {
        conn=this.ConnectDB();
        try
        {
            pst = conn.prepareStatement("Select * from CARDDETAILS");
            rs=pst.executeQuery();
            return rs;
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
    }
    public ResultSet getDBresult(String cn,String n,String p)
    {
        conn=this.ConnectDB();
        try
        {
            pst = conn.prepareStatement("Select * from CARDDETAILS where CUSTCARDNO=? and CUSTNAME=? and CUSTPIN=?");
            pst.setString(1, cn);
            pst.setString(2, n);
            pst.setString(3, p);
            rs=pst.executeQuery();
            return rs;
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
    }

    
    
}
