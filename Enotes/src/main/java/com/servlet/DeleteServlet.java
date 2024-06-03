package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.dao.NoteDao;

/**
 * Servlet implementation class DeleteServlet
 */
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//recuperer id du champs hidden dans le modal deletemodal
		int id=Integer.parseInt(request.getParameter("noteId"));
		try {
            NoteDao noteDao = new NoteDao();
            noteDao.deleteNote(id); // Implémentez cette méthode dans NoteDao
            
            // Redirige l'utilisateur après la suppression
            response.sendRedirect("ListNotes");
        } catch (Exception e) {
            // Gérez les exceptions ici (par exemple, journalisation ou affichage d'un message d'erreur)
            e.printStackTrace();
        }
		
		
		
		
		
		
		
	}

}
