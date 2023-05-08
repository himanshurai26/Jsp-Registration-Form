
package com.dao;
import com.entities.Employee;
import java.sql.*;

/**
 *
 * @author Himanshu Kumar
 */
public class EmployeeDao {
    private Connection con;

    public EmployeeDao(Connection con) {
        this.con = con;
    }
    
    public boolean EmployeeSave(Employee emp)
    {
        
        boolean f = false;
        
        try{
            
            //user data submittion 
            String q = "insert into employee(FullName, email, dob, number, address, gender, password) values(?, ?, ?, ?, ?, ?, ?)";
           PreparedStatement pstmt = con.prepareStatement(q);
           
           pstmt.setString(1, emp.getName());
           pstmt.setString(2, emp.getEmail());
           pstmt.setString(3, emp.getDob());
           pstmt.setString(4, emp.getNumber());
           pstmt.setString(5, emp.getAddress());
           pstmt.setString(6, emp.getGender());
           pstmt.setString(7, emp.getPassword());
            
         int i = pstmt.executeUpdate();
         if(i == 1)
         {
             f = true;
         }
        }
        
        catch(Exception e){
            e.printStackTrace();
        }
        return f;
        
    }
}
