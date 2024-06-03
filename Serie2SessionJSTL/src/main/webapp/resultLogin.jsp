<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.beans.Client2" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<b style="color:blue">

</b>

<% if (session.getAttribute("client") != null) { 

Client2 c = (Client2) session.getAttribute("client");
%>

   <b>Username:</b> <%out.print(c.getUsername() + "<br>"); %>

   <b>Password:</b><% out.print( c.getPassword() + "<br>");%>

  <a href="deconnection">Deconnection</a>
  
<%

    
}else {
%>


<b>Vous devez vous connecter pour accéder à l'espace membre</b>
<a href="LoginJsp.jsp">Connexion</a>
<% } %>

</body>
</html>