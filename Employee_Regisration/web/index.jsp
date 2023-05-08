


<%@page import="com.db.Connection_Provider"%>
<%@page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee Registration form</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Open+Sans:wght@300;400&family=Roboto:ital,wght@1,100&display=swap" rel="stylesheet">
    </head>
    <body style="background: #ede7f6">
        <!-- Navbar -->
        <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">Employee</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="index.jsp">Register</a>
                        </li>


                    </ul>
                    <form class="d-flex">
                        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                        <button class="btn btn-outline-light" type="submit">Search</button>
                    </form>
                </div>
            </div>
        </nav>

        <!-- Navbar end -->


       
        <!-- form -->

        <div class="container-fluid">
            <div class="row">
                <div class="col-md-4 offset-md-4">
                    <div class="card">
                        <div class="card-header bg-primary">
                            <h4 class="text-center text-white"> Employee Registration Form</h4>
                        </div>
                        <div class="card-body">

                            <%                        
                                String sucmsg = (String) session.getAttribute("Successmsg");
                                String errormsg = (String) session.getAttribute("Errormsg");
                                
                                if (sucmsg != null) {%>
                            <h5 class="text-primary text-center"><%= sucmsg%></h5>

                            <%
                                    session.removeAttribute("Successmsg");
                                }
                                if (errormsg != null) {%>

                            <h5 class="text-danger text-center"><%= errormsg%></h5>

                            <%
                                session.removeAttribute("Errormsg");
                                }

                            %>



                            <form action="RegisterServlet" method="POST">
                                <div class="mb-3">
                                    <label  class="form-label">Full Name</label>
                                    <input type="text" name="name" required class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">

                                </div>

                                <div class="mb-3">
                                    <label  class="form-label">Email</label>
                                    <input type="text" name="email" required class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">

                                </div>

                                <div class="mb-3">
                                    <label  class="form-label">DOB</label>
                                    <input type="date" name="dob" required class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">

                                </div>

                                <div class="mb-3">
                                    <label  class="form-label">Phone Number</label>
                                    <input type="tel" name="number" required="" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">

                                </div>


                                <div class="mb-3">
                                    <label  class="form-label">Address</label>
                                    <textarea  class="form-control" required="" name="address"></textarea>
                                </div>
                                <div> 
                                    <label  class="form-label">Gender</label>
                                    <div class="form-check">
                                        <input class="form-check-input" type="radio" value="Male"  name="gender" id="flexRadioDefault1">
                                        <label class="form-check-label" for="flexRadioDefault1">
                                            Male
                                        </label>
                                    </div>

                                    <div class="form-check">
                                        <input class="form-check-input" type="radio" value="Female"  name="gender" id="flexRadioDefault2" checked>
                                        <label class="form-check-label" for="flexRadioDefault2">
                                            Female
                                        </label>
                                    </div>

                                </div>

                                <div class="mb-3">
                                    <label for="exampleInputPassword1" class="form-label">Password</label>
                                    <input type="password" required name="password" class="form-control" id="exampleInputPassword1">
                                </div>

                                <div class="text-center">
                                <button type="submit" class="btn btn-primary">Submit</button>
                                </div>
                        
                            </form>
                        </div>

                    </div>
                </div>

            </div>
        </div>














        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script> 
    </body>
</html>
