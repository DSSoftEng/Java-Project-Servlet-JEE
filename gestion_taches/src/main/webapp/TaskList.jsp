<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
        /* Styles pour le bouton */
        a {
            display: inline-block;
            padding: 10px;
            background-color: #4CAF50;
            color: white;
            text-align: center;
            border-radius: 4px;
            text-decoration: none;
        }
        /* Styles pour cacher l'élément par défaut */
        #taskFormContainer {
            display: none;
        }
    </style>

 <script>
        // Fonction pour montrer/masquer le formulaire
        function toggleForm() {
            var formContainer = document.getElementById('taskFormContainer');
            if (formContainer.style.display === 'none' || formContainer.style.display === '') {
                formContainer.style.display = 'block';
            } else {
                formContainer.style.display = 'none';
            }
        }
    </script>


</head>
<body>
<table border="1">
        <thead>
            <tr>
                <th>Titre</th>
                <th>Description</th>
                <th>Status</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="task" items="${taches}">
                <tr>
                    <td><c:out value="${task.title}" /></td>
                    <td><c:out value="${task.description}" /></td>
                    <td><c:out value="${task.status}" /></td>
                   
                    <td>
                    <a href="TaskFormServlet?action=edit&id=<c:out value="${task.id}"/>">Edit</a>
                    <a href="TaskFormServlet?action=delete&id=<c:out value="${task.id}"/>">Delete</a>

                    </td>
                    
                </tr>
            </c:forEach>
        </tbody>
    </table>
  
 <!-- Bouton pour montrer/masquer le formulaire  javascript:void(0); block refresh-->
    <a href="javascript:void(0);" onclick="toggleForm()">Ajouter</a> 
<div id="taskFormContainer">
<jsp:include page="TaskForm.jsp" />
</div>


</body>
</html>