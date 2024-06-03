<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.DB.DbConnect" %>
    
    <%@ page import="java.sql.Connection" %>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="/component/all-css.jsp" %>
</head>
<body>

<%@include file="/component/Navbar.jsp" %>


<div class="container mt-5 ">
         <h1 class="text-center text-success ">TODO-APP</h1>
         
         
  <% String message = (String) session.getAttribute("message");
if (message != null) {
%>      
    <div class="alert alert-success" role="alert">
        <%= message %>
    </div>
<% session.removeAttribute("message");} // Effacer le message de la session après l'affichage %>

         
          
  <% String failed = (String) session.getAttribute("failedMsg");
if (failed != null) {
%>      
    <div class="alert alert-danger" role="alert">
        <%= failed %>
    </div>
<% session.removeAttribute("failedMsg");} // Effacer le message de la session après l'affichage %>

                
         
         
         
         
<table class="table table-striped mt-5" border="1px">
  <thead class="bg-success text-white">
  
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Name</th>
      <th scope="col">ToDo</th>
      <th scope="col">Status</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach var="td" items="${listTodo}">
    <tr>
        <th scope="row"><c:out value="${td.id}" /></th>
        <td><c:out value="${td.name}" /></td>
        <td><c:out value="${td.todo}"/></td>
        <td><c:out value="${td.status}" /></td>
        <td>
            &nbsp;<a href="editServlet?id=${td.id}" class="btn btn-success">Edit</a>&nbsp;
            
            &nbsp;<a href="deleteServlet?id=${td.id}" class="btn btn-danger">Delete</a>&nbsp;
        </td>
    </tr>
</c:forEach>

  </tbody>
</table>



</div>

















</body>
</html>