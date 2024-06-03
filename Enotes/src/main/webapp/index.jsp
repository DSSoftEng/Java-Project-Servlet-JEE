<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round" />
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons" />
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" />
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">
        <script src="${pageContext.request.contextPath}/js/scripts.js"></script>
        <!-- https://www.admintem.com/2021/12/bootstrap-crud-data-table-for-database.html -->
        
      
        
        
        
        
    </head>

    <body>
        <div class="container">
            <div class="table-wrapper">
                <div class="table-title">
                    <div class="row">
                        <div class="col-sm-6">
                            <h2> <b>ENotes Manager</b></h2>
                        </div>
                        <div class="col-sm-6">
                            <a href="#addEmployeeModal" class="btn btn-success" data-toggle="modal"><i class="material-icons">&#xE147;</i> <span>Add New Note</span></a>
                            <a href="#deleteEmployeeModal" class="btn btn-danger" data-toggle="modal"><i class="material-icons">&#xE15C;</i> <span>Delete</span></a>
                        </div>
                    </div>
                </div>
                <table class="table table-striped table-hover">
                    <thead>
                        <tr>
                            
                            <th>Name</th>
                            <th>Title</th>
                            <th>Content</th>
                            <th>Actions</th>
                        </tr>
                    </thead>
                    <tbody>
                           
                        <c:forEach var="note" items="${listeNotes}">
                  <tr>
                 <!--    <th scope="row"><c:out value="${note.idNote}" /></th> -->
                  <td id="noteNameId"> <c:out value="${note.user.username}" /></td>
                  <td id="noteTitleId"> <c:out value="${note.title}"/></td>
                  <td id="noteContentId"> <c:out value="${note.content}" /></td>
                  <td>
                                <a href="#editEmployeeModal" class="edit" data-note-id="${note.idNote}" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Edit">&#xE254;</i></a>
                                <a href="#deleteEmployeeModal" data-note-id="${note.idNote}" class="delete" data-toggle="modal"><i class="material-icons" data-toggle="tooltip" title="Delete">&#xE872;</i></a>
                            </td>
                    </tr>
                  </c:forEach>   
                    </tbody>
                </table>
                
            </div>
           <jsp:include page="deconnectionJsp.jsp" />
           
        </div>
        
        <!-- Edit Modal HTML -->
        <div id="addEmployeeModal" class="modal fade">
            <div class="modal-dialog">
                <div class="modal-content">
                    <form action="AddServlet" method="post">
                        <div class="modal-header">
                            <h4 class="modal-title">Add Note</h4>
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        </div>
                        <div class="modal-body">
                            <div class="form-group">
                                <input type="hidden" name="iduser" value="${user.idUser}" class="form-control" />
                            </div>
                           <div class="form-group">
                                <label>Title</label>
                                <input type="text" name="title" class="form-control" required />
                            </div>
                            <div class="form-group">
                                <label>Content</label>
                                <input type="text" name="content" class="form-control" required />
                            </div>
                           
                        </div>
                        <div class="modal-footer">
                            <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel" />
                            <input type="submit" class="btn btn-success" value="Add" />
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <!-- Edit Modal HTML -->
        <div id="editEmployeeModal" class="modal fade">
            <div class="modal-dialog">
                <div class="modal-content">
                    <form action="EditServlet" method="post">>
                        <div class="modal-header">
                            <h4 class="modal-title">Edit Note</h4>
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        </div>
                        
                        <div class="modal-body">
                        
                        <input type="text" id="noteIdToEdit" name="noteId" value="" />
                            <div class="form-group">
                                <label>Name</label>
                                <input type="text" id="noteNameToEdit" name="name" class="form-control"  value=""  />
                            </div>
                            <div class="form-group">
                                <label>Title</label>
                                <input type="text" id="noteTitleToEdit" name="title"  class="form-control" value=""  />
                            </div>
                            <div class="form-group">
                                <label>Content</label>
                                <input type="text" id="noteContentToEdit" name="content" class="form-control" value="" />
                            </div>
                        </div>
                        <div class="modal-footer">
                            <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel" />
                            <input type="submit" class="btn btn-info" value="Save" />
                        </div>
                    </form>
                </div>
            </div>
        </div>
        <!-- Delete Modal HTML -->
        <div id="deleteEmployeeModal" class="modal fade">
            <div class="modal-dialog">
                <div class="modal-content">
                    <form action="DeleteServlet" method="post">
                        <div class="modal-header">
                            <h4 class="modal-title">Delete Employee</h4>
                            <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        </div>
                        <div class="modal-body">
                            <p>Are you sure you want to delete these Records?</p>
                            <p class="text-warning"><small>This action cannot be undone.</small></p>
                            <input type="hidden" id="noteIdToDelete" name="noteId" value="" />
                        </div>
                        <div class="modal-footer">
                            <input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel" />
                            <input type="submit" class="btn btn-danger" value="Delete" />
                        </div>
                    </form>
                </div>
            </div>
        </div>
        
        
        
        <script type="text/javascript">
        
        // Écouteur d'événement pour le modal de suppression
 $('#deleteEmployeeModal').on('show.bs.modal', function(event) {
     // Récupère le lien cliqué
     var button = $(event.relatedTarget);
     // Récupère l'ID de la note à supprimer
     var noteId = button.data('note-id');
     // Affiche la valeur de noteId dans la console pour le débogage
     console.log('Note ID à supprimer:', noteId);
     
     // Pré-remplit le champ caché dans le modal
     $('#noteIdToDelete').val(noteId);
 });
   
 $('#editEmployeeModal').on('show.bs.modal', function(event) {
	    // Récupère le lien cliqué
	    var button = $(event.relatedTarget);
	    
	    // Récupère les données de la note à éditer
	    var noteId = button.data('note-id');
	   
	 // Récupère les champs de la table par ID
	    var row = button.closest('tr'); // Cela suppose que `button` est dans la même ligne (`tr`).
	    var noteName = row.find('td#noteNameId').text(); // Assure-toi que l'ID existe dans la balise `<td>`
	    
	    var noteTitle = row.find('td#noteTitleId').text(); // Assure-toi que l'ID existe dans la balise `<td>`
	    
	    var noteContent = row.find('td#noteContentId').text(); // Assure-toi que l'ID existe dans la balise `<td>`
	   

	    
	    // Remplit les champs du formulaire dans le modal avec les données de la note
	    $('#noteIdToEdit').val(noteId);
	    $('#editEmployeeModal input[name="name"]').val(noteName);
	    $('#editEmployeeModal input[name="title"]').val(noteTitle);
	    $('#editEmployeeModal input[name="content"]').val(noteContent);
	});

        
        </script>
        
          
        
        
        
        
    </body>
</html>

