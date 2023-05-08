

<%@page import="java.sql.*" %>
<%@page import="dbConnection.DbConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee Regisration Form</title>
    </head>
    <body> 
       <%
     Connection con = DbConnection.getConnection();
        out.println(con);
        %>
        
        <div align="center">
            <h1>Employee Login Form</h1>
            <form action="login.jsp" method="post">
        <table>
            <tr>
                <td>UserName: </td>
                <td><input type="text" name="user"></td>
               
            </tr>
        
            <tr>
                <td>Password</td>
                <td><input type="password" name="pass"></td>
        
            </tr>
            </table>
           
            <input  type="submit" value="Submit"/>
            </form>
        </div>
    </body>
</html>
