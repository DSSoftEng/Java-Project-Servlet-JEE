<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!-- <%@ page import="com.beans.Client"%>-->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<b style="color:blue">
<%
String message=(String)request.getAttribute("message");
if(message!=null){
out.println(message);}
%>

</b>
<!--//Client client=(Client)request.getAttribute("client"););
%>
 
 -->


<!---<jsp:setProperty property="nom" name="client" value="aya" />-->

<%
/*
  client.setNom(request.getParameter("nom"));

client.setPrenom(request.getParameter("prenom"));

client.setEmail(request.getParameter("email"));*/
%>

<!---<jsp:setProperty property="email" name="client" param="email" />-->


<table>
<tr>
<td>Nom:</td>
<td><jsp:getProperty property="nom" name="client"/></br></td>

</tr>

<tr>
<td>Prenom:</td>
<!-- <td><%//client.getPrenom() %></br></td> -->
</tr>

<tr>
<td>Email:</td>
<!--<td><% /*client.getEmail()*/ %></br></td>-->
</tr>


<tr>
<td>
</td>
</tr>

</table>
 




</body>
</html>