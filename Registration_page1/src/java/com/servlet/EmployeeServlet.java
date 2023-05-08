/*package com.servlet;

import com.dao.EmployeeDao;
import com.database.ConnectionProvider;
import com.entities.Employee;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Himanshu Kumar
 */

//@WebServlet("/register")
/*public class EmployeeServlet extends HttpServlet {


  

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String firstName = req.getParameter("fname");
        String lastName = req.getParameter("lname");
        String userName = req.getParameter("uname");
        String email = req.getParameter("email");
        String contact = req.getParameter("number");
        String address = req.getParameter("address");
        String password = req.getParameter("password");

        //creating object of employee class
        
        Employee emp = new Employee(firstName);
        emp.setFirstName(firstName);
        emp.setLastName(lastName);
        emp.setEmail(userName);
        emp.setEmail(email);
        emp.setContact(contact);
        emp.setAddress(address);
        emp.setPassword(password);
        
        try{
           EmployeeDao dao = new EmployeeDao(ConnectionProvider.getConnection()); 
           dao.employeeSave(emp);
           
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
      resp.sendRedirect("login.jsp");
               
        
        
    }

}

*/