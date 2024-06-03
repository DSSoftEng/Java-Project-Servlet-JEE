<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="/component/all-css.jsp" %>
</head>
<body style="background-color:#f0f1f2;">


<%@include file="/component/Navbar.jsp" %>
       
         
  <div class="container mt-5">
  <div class="row">
  <div class="col-md-6 offset-md-3">
   <div class="card">
  <div class="card-body">
  
         <h1 class="text-center text-success ">Add-To-Do</h1>
   <form action="AddServlet" method="post" >
   <div class="form-group">
    <label for="exampleInputEmail1">Name</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="name" placeholder="Enter Name">
  </div>
  <div class="form-group">
    <label for="exampleInputEmail1">TODO</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="todo"  placeholder="Enter TODO">
  </div>
  <div class="form-group col-md-4">
      <label for="inputState">Status</label>
      <select id="inputState" class="form-control" name="status">
        <option selected>---Select---</option>
        <option  value="incomplet">incomplet</option>
        
        <option value="complet" >complet</option>
      </select>
    </div>
  <div class=" text-center">
  <button type="submit" class="btn btn-primary">Add</button>
  </div>
</form>
  </div>
  </div>  
  </div>
</div>
</body>
</html>