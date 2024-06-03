<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="ClientServlet" method="post">

<table>
<tr>
<td>Nom:</td>
<td><input type="text" name="nom"></input></br></td>
</tr>

<tr>
<td>Prenom:</td>
<td><input type="text" name="prenom"></input></br></td>
</tr>

<tr>
<td>Email:</td>
<td><input type="text" name="email"></input></br></td>
</tr>


<tr>
<td>
<input type="submit" value="envoyer"></input></td>
</tr>

</table>
 


</form>
<b style="color:red">
<%
String message=(String)request.getAttribute("message");
if(message!=null){
out.println(message);}

%>
</b>


</body>
</html>