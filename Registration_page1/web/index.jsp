<%-- 
    Document   : index
    Created on : 06-May-2023, 11:59:03 pm
    Author     : Himanshu Kumar
--%>

<%@page import="com.database.ConnectionProvider"%>
<%@page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>

        <%
            Connection con = ConnectionProvider.getConnection();
            out.println(con);
        %>
        <div align="center">
            <h1>Employee Registration Form</h1>

            <form action="Employyeservlet" method="post">
                <%
                    String sucmsg = (String) session.getAttribute("succmsg");
                    String errormsg = (String) session.getAttribute("errormsg");

                     if (sucmsg != null) {%>
                <h5 style="background: greenyellow; width: 20%"><%= sucmsg%></h5>

                <%
                        session.removeAttribute("succmsg");
                    }
                    if (errormsg != null) {%>

                <h5 class="text-danger text-center"><%= errormsg%></h5>

                <%
                        session.removeAttribute("errormsg");
                    }

                %>
                <table>
                    <tr>
                        <td>First Name</td>
                        <td><input type="text" name="fname"></td>
                    </tr>
                    <tr>
                        <td>Last Name</td>
                        <td><input type="text" name="lname"></td>
                    </tr>

                    <tr>
                        <td>UserName</td>
                        <td><input type="text" name="uname"></td>
                    </tr>

                    <tr>
                        <td>Email</td>
                        <td><input type="email" name="email"></td>
                    </tr>

                    <tr>
                        <td>Contact No</td>
                        <td><input type="text" name="number"></td>
                    </tr>

                    <tr>
                        <td>Address</td>
                        <td><input type="text" name="address"></td>
                    </tr>

                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="password"></td> 
                    </tr>
                </table>

                <input type="submit" value="submit">



            </form>
        </div>
    </body>
</html>
