<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.List,java.util.ArrayList"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Bienvenie user </h1>
<%!
/*public int somme(int a,int b){
	return a+b;*/

%>
<%
/*

String nom="dounya";
String prenom="sebki ";
out.println("\n le nom est\n"+nom+"\nle prenom est\n"+prenom);

int res=somme(8,8);
out.println(" somme de ses deux chiffres est"+somme(1,2));

List <String> str=new ArrayList<>();

str.add("dounya");
str.add("dounya");
str.add("dounya");
str.add("dounya");

for( String s : str){
	out.print(s);
}

*/
%>
</br>
<%/*=nom*/%>
</br>

<%/*=str.get(0)*/%>

<%/*@ include file="/menu.jsp"*/ %>

<%
String nom=request.getParameter("nom");

if(nom !=null && nom !=""){
	session.setAttribute("session_nom",nom);
	application.setAttribute("application_nom", nom);
	pageContext.setAttribute("pageContexte_nom",nom,pageContext.APPLICATION_SCOPE);
}

%>
<b>le valeur  de request est :<%=nom %></b>

<b>le valeur  de session est :<%=(String)session.getAttribute("session_nom") %></b>

<b>le valeur  de application est :<%=(String)application.getAttribute("application_nom") %></b>


<b>le valeur  de page Contexte est :<%=(String)pageContext.getAttribute("pageContexte_nom") %></b>



</body>
</html>