import java.sql.*;
import javax.swing.JOptionPane;
public class JavaConnect {

    /**
     *
     * @return
     */
    public static Connection ConnecrDb(){
        try{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:Lopchan","Messi","messi");
      
        return con;
//        ResultSet rs=st.executeQuery("select *from Employees");
       
      
//     System.out.println("Records in the table:");
//        while (rs.next()){
//            System.out.println(rs.getInt(1)+"->"+rs.getString(2)+"->"+rs.getDouble(3)+"->"+rs.getString(4));
//        }
//      
    
    }catch(Exception e){
    JOptionPane.showMessageDialog(null,e);
    return null;
}
}
    public static void main(String[] args) {
        ConnecrDb();
    }
}

    
   
