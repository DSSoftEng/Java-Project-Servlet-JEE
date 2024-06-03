package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.beans.Client;

/**
 * Servlet implementation class ClientServlet
 */
public class ClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientServlet() {
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
		
		
		String nom=request.getParameter("nom");

		String prenom=request.getParameter("prenom");

		String email=request.getParameter("email");
		String msg="";
		if(nom.trim().isEmpty()||prenom.trim().isEmpty()||email.trim().isEmpty()) {
			 msg="vous devez remplir tou les champs";
			 request.setAttribute("message", msg);

				this.getServletContext().getRequestDispatcher("/FormClient.jsp").forward(request, response);
		}else {
			 msg=" excellent t a reussi inscription";
			 request.setAttribute("message", msg);
			 
			 Client c=new Client();
			 c.setNom(nom);
			 c.setPrenom(prenom);
			 c.setEmail(email);
			 request.setAttribute("client", c);

			this.getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
		}
	}

}
