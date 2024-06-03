<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="com.rsv.beans.Client" %>

<%@ page import="com.rsv.beans.Reservation" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String message=(String)request.getAttribute("message");
if(message!=null){
	out.print(message);
} %>


<%
Client c=(Client) request.getAttribute("client");

%>

<table>
<tr>
<td>Nom:</td>
<td><%=c.getNom() %></td>
</tr>


<tr>
<td>Prenom:</td>
<td><%=c.getPrenom() %></td>
</tr>

<tr>
<td>Email:</td>
<td><%=c.getEmail() %></td>
</tr>
<tr>
<td>Telephone:</td>
<td><%=c.getTelephone() %></td>
</tr>
<tr>
<td>option:</td>
<td><%=c.getReservation().getOption() %></td>
</tr>

<td>Type:</td>
<td><%=c.getReservation().getType() %></td>
</tr>
<td>prix:</td>
<td><%=c.getReservation().getPrix() %></td>
</tr>
</table>







</body>
</html>