package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * Servlet implementation class JstlServlet
 */
public class JstlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JstlServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 
        String[] titles = {
            "Le premier titre",
            "Le deuxième titre",
            "Le troisième titre"
        };

        request.setAttribute("titles", titles);

		this.getServletContext().getRequestDispatcher("/titles.jsp").forward(request, response);
	}

	
	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	  String nom=request.getParameter("nom");

	  String prenom=request.getParameter("prenom");
	  Cookie prenomCookie = new Cookie("prenom", prenom);
	  response.addCookie(prenomCookie);


		this.getServletContext().getRequestDispatcher("/resultLogin.jsp").forward(request, response);
	}

}
