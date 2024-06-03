package com.rsv.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.rsv.beans.Client;

/**
 * Servlet implementation class creerClient
 */
public class creerClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public creerClient() {
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

		String Telephone=request.getParameter("Telephone");
		String Email=request.getParameter("Email");
		String msg="";
		if(nom.trim().isEmpty()||prenom.trim().isEmpty()||Telephone.trim().isEmpty()||Email.trim().isEmpty()) {
			msg=" vous devez remplire tout les champs";

            request.setAttribute("message", msg);
			this.getServletContext().getRequestDispatcher("/inscription.jsp").forward(request, response);
		}else {
			msg=" Felecitation l inscription a reussi";

            request.setAttribute("message", msg);
			Client client=new Client();
			client.setNom(nom);
			client.setPrenom(prenom);
			client.setEmail(Email);
			client.setTelephone(Telephone);
			request.setAttribute("client", client);

			this.getServletContext().getRequestDispatcher("/WEB-INF/infoClient.jsp").forward(request, response);
			
			
			
	    }

}
	}
