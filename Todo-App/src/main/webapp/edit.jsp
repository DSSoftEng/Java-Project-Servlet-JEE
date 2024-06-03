<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page import="com.entite.entity" %>>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<%@include file="/component/all-css.jsp" %>
<title>Insert title here</title>
</head>
<body style="background-color:#f0f1f2;">


<%@include file="/component/Navbar.jsp" %>
   <%
   entity t =(entity)request.getAttribute("entite");
   %>
         
  <div class="container mt-5">
  <div class="row">
  <div class="col-md-6 offset-md-3">
   <div class="card">
  <div class="card-body">
  
         <h1 class="text-center text-success ">Edit-To-Do</h1>
   <form action="editServlet" method="post">
   <div class="form-group">
    <input type="hidden" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="id" value="<%= t.getId() %>" placeholder="Entrez votre nom">

  </div>
   
  <div class="form-group">
    <label for="exampleInputEmail1">Name</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="name" value="<%= t.getName() %>" placeholder="Entrez votre nom">

  </div>
  
  
   <div class="form-group">
    <label for="exampleInputEmail1">todo</label>
    <input  class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="todo" value="<%= t.getTodo() %>">
  </div>
  
 
  <div class="form-group col-md-4">
      <label for="inputState">Status</label>
      <select id="inputState" class="form-control" name="status" ">
     <% if("complet".equals(t.getStatus() )){
     %>
        <option>Complet</option>
        
        <option>InComplet</option>
      <%}else{ %>
       
        <option>InComplet</option>
        
        <option>Complet</option>
      <%} %>
      </select>
    </div>
    
    
  <div class=" text-center">
  <button type="submit" class="btn btn-primary">Edit</button>
  </div>
</form>
  </div>
  </div>  
  </div>
</div>
</body>
</html>