package com.bdd.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.bdd.beans.utilisateur;
import com.bdd.method.Noms;

/**
 * Servlet implementation class Test
 */
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Noms tablesNoms=new Noms();
		request.setAttribute("utilisateurs", tablesNoms.getUsers());

		this.getServletContext().getRequestDispatcher("/WEB-INF/form.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String nom=request.getParameter("nom");
	String prenom=request.getParameter("prenom");
	utilisateur user=new utilisateur();
	user.setNom(nom);
	user.setPrenom(prenom);
	Noms Noms=new Noms();
	Noms.addUser(user);
	request.setAttribute("utilisateurs", Noms.getUsers());
   
	this.getServletContext().getRequestDispatcher("/WEB-INF/form.jsp").forward(request, response);
	
	}

}
