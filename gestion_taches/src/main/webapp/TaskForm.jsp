<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="TaskFormServlet" method="post"> 
<table>
<tr> 
<td>Titre:</td>
<td><input type="text" name="title"/> </td>
</tr>

<tr>
<td>Description:</td>
<td><input type="text" name="description"/> </td>
</tr>
<tr>
<td>status:</td>
<td>
<select name="status">
        <option value="complet">complet</option>
        <option value="incomplet">incomplet</option>
    </select>
</td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="ajouter"/> </td>
</tr>
</table>

</form>

</body>
</html>