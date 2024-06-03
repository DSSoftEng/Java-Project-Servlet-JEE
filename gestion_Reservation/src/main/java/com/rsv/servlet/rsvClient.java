package com.rsv.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.rsv.beans.Client;
import com.rsv.beans.Reservation;

/**
 * Servlet implementation class rsvClient
 */
public class rsvClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public rsvClient() {
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
		String option=request.getParameter("option");
		 double prix ;
		String prixStr = request.getParameter("prix");
		String type=request.getParameter("type");
		String msg="";
		try {
			 prix = Double.parseDouble(prixStr);
		}catch(NumberFormatException e) {
			prix=0.5;
		} 
		if(nom.trim().isEmpty()||prenom.trim().isEmpty()||Telephone.trim().isEmpty()||Email.trim().isEmpty()
				|| option.trim().isEmpty()|| type.trim().isEmpty()  ||prix==0.5){
			msg=" vous devez remplire tout les champs";

            request.setAttribute("message", msg);
			this.getServletContext().getRequestDispatcher("/reservation.jsp").forward(request, response);
		}else {
			msg=" Felecitation la	reservation a reussi";

            request.setAttribute("message", msg);
			Client client=new Client();
			Reservation reservation=new Reservation();
			reservation.setType(type);
			reservation.setOption(option);
			reservation.setPrix(prix);
			client.setNom(nom);
			client.setPrenom(prenom);
			client.setEmail(Email);
			client.setTelephone(Telephone);
			client.setReservation(reservation);
			request.setAttribute("client", client);
			

			this.getServletContext().getRequestDispatcher("/WEB-INF/infoRsv.jsp").forward(request, response);
			
			
			
	    }

		
	}

}
