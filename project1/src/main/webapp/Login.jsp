<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="navg" method="post">
Nom:<input type="text" name="nom"></br>

<input type="submit" name="envoyer"></br>
</form>

<%

String msg= (String)request.getAttribute("message");
if(msg!=null){
	out.println(msg);
}
%>


</body>
</html>