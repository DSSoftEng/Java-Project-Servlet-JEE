<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Test" method="post">
  Nom: <input type="text" name="nom"/></br>
  
 Prenom: <input type="text" name="prenom"/></br>
  <input type="submit" value="envoyer"/>
</form>
<ul>

<c:forEach var="user" items="${utilisateurs}">
<li><c:out value="${user.prenom}"/>
<c:out value="${user.nom}"/>
</li>
</c:forEach>
</ul>
</body>
</html>