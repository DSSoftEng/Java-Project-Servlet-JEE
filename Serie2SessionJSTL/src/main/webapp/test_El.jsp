<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insérez le titre ici</title>
</head>
<body>
  com.bdd.beans.Client2 client = new com.bdd.beans.Client2();
   
   <%
   Map<String, String> ClientMap = new HashMap<>();
   ClientMap.put("dounya","1234" );

   ClientMap.put("aya","2143" );

   ClientMap.put("nada","8900" );

   ClientMap.put("rim","12034" );

   request.setAttribute("clientMap",ClientMap);
   
   
   List <String> noms=new ArrayList<>();
   
   noms.add("assiya");

   noms.add("fati");

   noms.add("sara");
   
   

   request.setAttribute("names",noms);
   
   
   
   
   %>
   
   
   <p>Clé "dounya" : ${clientMap['dounya']}</p>
    <p>Clé "aya" : ${clientMap['aya']}</p>
    <p>Clé "nada" : ${clientMap['nada']}</p>
    <p>Rim:${clientMap['rim'] }</p>
   
   
   
   <b> Les valeurs de arrayLis</b></br>
         ${names[0]}</br>
         ${names[1]}</br>
         ${names[2]}</br>
   
   
   
   
   parametres:${param.nom}</br>
   ${empty parm.nom }
</body>
</html>
