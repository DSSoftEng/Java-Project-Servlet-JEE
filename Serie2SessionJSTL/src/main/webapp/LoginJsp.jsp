<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% if(session.getAttribute("client")!=null){
	response.sendRedirect("resultLogin.jsp");
	}else{
	%>

<form action="LoginServlet" method="post">
<table>
<tr>
<td>Username:</td>
<td><input type="text" name="username"></input></td>
</tr>

<tr>
<td>Password:</td>
<td><input type="text" name="password"></input></td>
</tr>

<tr>

<td><input type="submit" value="envoyer"></input></td>
</tr>
</table>
</form>
<%} %>
<b style="color:red">
<%
String message=(String)request.getAttribute("message");
if(message!=null){
out.println(message);}

%>
</b>

</body>
</html>