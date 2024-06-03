<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,com.beans.Client"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>

    <c:out value="dounya" />
<c:out value="<b>coco</b>" escapeXml="false" />
<c:out value="<h1> title</h1>" escapeXml="false"/>
<c:out value="${5 + 3}"/>
<c:out value="${param.nom}"/>
<c:set var="client" value="clientdounyaton" scope="page" />

<c:if test="${1==1}">
    <h3> a linterieur de if alors la condition est vrai</h3>
   <c:out value="${param.nom}"/>
</c:if>

<%
Map<String, String> collection = new HashMap<>();
collection.put("dounya", "sebki");
collection.put("assiya", "sebki");
collection.put("aya", "sebki");
collection.put("noha", "sebki");
collection.put("sara", "sebki");
request.setAttribute("collection",collection);

Client c=new Client();
c.setNom("nano");

c.setPrenom("koki");
request.setAttribute("client",c);
%>

<c:forEach var="entry" items="${collection}">
   <c:out value="${entry.key}" />: <c:out value="${entry.value}" /><br/>
</c:forEach>


<c:choose>
    <c:when test="${1==0}">
        <!-- Contenu affiché si la condition est vraie -->
        <c:forEach var="entry" items="${collection}">
      <c:out value="${entry.key}" />: <c:out value="${entry.value}" /><br/>
</c:forEach>
    </c:when>
    <c:otherwise>
    <h3>la conditions n'est pas juste</h3>
    </c:otherwise>
</c:choose>



<c:forEach var="i" begin="0" end="5" step="2">
  <c:out value="${i}" />
</c:forEach>

<!--  cela ne marche pas
<c:forEach var="title" items="${title }">
        <!-- Affiche chaque titre -->
        <p><c:out value="${title}"/></p>
    </c:forEach>
 -->
 
 <form action="jstlServlet" method="post">
   Nom   :<input type="text" name="nom"></br>
   Prenom:<input type="text" name="prenom">
   <input type="submit" value="envoyer">
 </form>

  
</body>
</html>
