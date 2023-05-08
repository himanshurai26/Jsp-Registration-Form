package com.servlet;

import com.dao.EmployeeDao;
import com.database.ConnectionProvider;
import com.entities.Employee;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Himanshu Kumar
 */
@WebServlet(name = "Employyeservlet", urlPatterns = {"/Employyeservlet"})
public class Employyeservlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            String firstName = request.getParameter("fname");
            String lastName = request.getParameter("lname");
            String userName = request.getParameter("uname");
            String email = request.getParameter("email");
            String contact = request.getParameter("number");
            String address = request.getParameter("address");
            String password = request.getParameter("password");

            Employee emp = new Employee(firstName, lastName, userName, email, contact, address, password);

            EmployeeDao dao = new EmployeeDao(ConnectionProvider.getConnection());

            boolean f = dao.employeeSave(emp);

            
            HttpSession session = request.getSession();
            if (f) {
                session.setAttribute("succmsg", "Register Successfully....");
                response.sendRedirect("index.jsp");
            } else {
                
                session.setAttribute("errormsg", "Error not register");
                out.println("Error ");
            }

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
