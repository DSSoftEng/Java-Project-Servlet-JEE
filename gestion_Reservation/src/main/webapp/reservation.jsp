<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="rsvClient" method="post">
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
<td>option: </td>
<td>
<select name="option">
<option name="1 chamber"> 1 chamber</option>

<option name="2 chamber">2 chamber</option>

<option name="3 chamber">3 chamber</option>
</select>

</td>
</tr>



<tr>
<td>prix: </td>
<td><input type="text" name="prix"></td>
</tr>

<tr>
<td>type: </td>
<td>
<select name="type">
<option name="Mer"> Mer</option>

<option name="jardin">jardin</option>

<option name="piscine">piscine</option>
</select>

</td>
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