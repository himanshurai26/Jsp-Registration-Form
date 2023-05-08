
package com.dao;
import com.entities.Employee;
import java.sql.*;
/**
 *
 * @author Himanshu Kumar
 */
public class EmployeeDao {
    private final Connection con;

    public EmployeeDao(Connection con) {
        this.con = con;
    }

    
    public boolean employeeSave(Employee emp){
        boolean f = false;
        
        try{
            String qr = "insert into employeedata(first_name, last_name, username, email, contact, address, password) values(?, ?, ?, ?, ?, ?, ?)";
       PreparedStatement pst = con.prepareStatement(qr);
           
               pst.setString(1, emp.getFirstName());
               pst.setString(2, emp.getLastName());
               pst.setString(3,emp.getUserName());
               pst.setString(4, emp.getEmail());
               pst.setString(5, emp.getContact());
               pst.setString(6, emp.getAddress());
               pst.setString(7,emp.getPassword());
               
               
               
               
               int  n = pst.executeUpdate();
               if(n ==1){
                   f = true;
               }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
  
        return f;
    }
}
