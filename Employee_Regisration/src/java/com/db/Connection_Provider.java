
package com.db;

import static java.lang.System.out;
import java.sql.DriverManager;
import java.sql.*;
/**
 *
 * @author Himanshu Kumar
 */
public class Connection_Provider {
    
    private static Connection con;
    public static Connection getConnection(){
        
     try{
            if(con==null){
                
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String url = "jdbc:mysql://localhost:3306/employee_data";
            String username = "root";
            String password = "26112002";
            
            con = DriverManager.getConnection(url,username,password);
            
            if(con.isClosed()){
                  out.println("COnnection is not created...");
              }else{
                  out.println("Connection is created....");
              }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        
        
        
        
        return con;
    }
    
   


    
}
