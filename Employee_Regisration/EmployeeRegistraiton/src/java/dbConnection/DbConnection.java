
package dbConnection;
import static java.lang.System.out;
import java.sql.*;
public class DbConnection {
    private static Connection con;
    public static Connection getConnection(){
        try{
         if(con==null){
             
         
           Class.forName("com.mysql.cj.jdbc.Driver");
           
           String url = "jdbc:mysql://localhost:3306/employee_data";
          String usrname = "root";
          String password = "26112002";
          
        con =  DriverManager.getConnection(url,usrname,password);
        
       //  if(con.isClosed()){
       //      out.println("connection is not created..");
             
     //    }else{
       //      out.println("Connection is created");
     //    }
        }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }
}
