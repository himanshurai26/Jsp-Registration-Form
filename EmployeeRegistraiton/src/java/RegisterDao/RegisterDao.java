
package RegisterDao;
import entities.RegisterEmployee;
import java.sql.*;
/**
 *
 * @author Himanshu Kumar
 */
public class RegisterDao {
    private Connection con;
    
    public RegisterDao(Connection con){
        this.con = con;
    }
    
    public boolean Employeesave(RegisterEmployee employee) 
    {
        boolean status = false;
        
        try{
              //Employee data Submission 
            String queary = "insert into employee1(username, password) values(?,?)";
            
            PreparedStatement ps = con.prepareStatement(queary);
           ps.setString(1,employee.getName());
           ps.setString(2, employee.getPassword());
           
         int i =  ps.executeUpdate();
         if(i == 1){
             status = true;
         }
        }
        catch(Exception e){
            e.printStackTrace();
 
        }
        return status;
    }
}
