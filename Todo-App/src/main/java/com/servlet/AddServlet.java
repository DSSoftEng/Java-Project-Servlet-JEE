package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.Dao.TodoDAO;
import com.entite.entity;

/**
 * Servlet implementation class AddServlet
 */
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServlet() {
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
	/*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String todo=request.getParameter("todo");
		String status=request.getParameter("status");
		entity entite=new entity();
		entite.setName(name);
		entite.setTodo(todo);
		entite.setStatus(status);
		boolean f=TodoDAO.addTodo(entite);
		request.setAttribute("listTodo",TodoDAO.getALLTodo());
		
		HttpSession session=request.getSession();
		
		String Msg;
		String FailedMsg;
		if(f==true) {
			Msg="objet est inserer";
			session.setAttribute("message", Msg);
			//response.sendRedirect("ListServlet");
			//request.setAttribute("listTodo", TodoDAO.getALLTodo());

			this.getServletContext().getRequestDispatcher("/ListServlet").forward(request, response);
			// response.sendRedirect("ListServlet");
		}else {
			FailedMsg=" objet n'est pas inserer";
			session.setAttribute("failedMsg", FailedMsg);

			response.sendRedirect("ListServlet");
		}
		
	}*/
	
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String name = request.getParameter("name");
	    String todo = request.getParameter("todo");
	    String status = request.getParameter("status");

	    entity entite = new entity();
	    entite.setName(name);
	    entite.setTodo(todo);
	    entite.setStatus(status);
	    
	    boolean success = TodoDAO.addTodo(entite);
	    HttpSession session = request.getSession();
	    
	    if (success) {
	        session.setAttribute("message", "Objet ajouté avec succès.");
	        response.sendRedirect("ListServlet");
	    } else {
	        session.setAttribute("failedMsg", "Échec de l'ajout de l'objet.");
	        response.sendRedirect("ListServlet");
	    }
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
