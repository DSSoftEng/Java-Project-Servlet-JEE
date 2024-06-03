<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ebook Login</title>

  <%@include file="/all-component/all-css.jsp" %>
 
</head>

<body style="background-color:#f0f1f2">

<%@include file="/all-component/Navbar.jsp" %>

<div class="container mt-5">
    <div class="row">
        <div class="col-md-4 offset-md-4">
            <div class="card">
                <div class="card-body">
                    <h4 class="text-center">Login page</h4>
                    <form>
                      
                        <div class="form-group">
                            <label for="exampleInputEmail1">Email address</label>
                            <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                        </div>
                       
                        <div class="form-group">
                            <label for="exampleInputPassword1">Password</label>
                            <input type="password" class="form-control" id="exampleInputPassword1">
                        </div>
                       <div class="text-center">
                       <button type="submit" class="btn btn-primary">Login</button>
                       <a href="register.jsp" class="" style="text-decoration:none">Create Account</a>
                       </div>
                        
                    </form>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>