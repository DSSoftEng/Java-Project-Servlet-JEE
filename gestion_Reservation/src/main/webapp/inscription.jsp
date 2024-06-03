<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form action="creerClient" method="post">
<table>
<tr>
<td>Nom:</td>
<td><input type="text" name="nom"></td>
</tr>

<tr>
<td>Prenom: </td>
<td><input type="text" name="prenom"></td>
</tr>

<tr>
<td>Telephone: </td>
<td><input type="text" name="Telephone"></td>
</tr>


<tr>
<td>Email: </td>
<td><input type="text" name="Email"></td>
</tr>

<tr>

<td><input type="submit" name="submit"></td>
</tr>
 
</table>

</form>

<b style="color:red">

<%
String message=(String)request.getAttribute("message");
if(message!=null){
	out.print(message);
} %>
</b>

</body>
</html>