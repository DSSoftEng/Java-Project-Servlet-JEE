package com.projet1.servlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class navgationServlet extends HttpServlet {
	
	
	
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	response.setContentType("text/html");
	PrintWriter out = response.getWriter();

	
	HttpSession s=request.getSession();
	ServletContext c=request.getServletContext();

	String nom=request.getParameter("nom");
	
	
	if(nom != null) {

		s.setAttribute("username", nom);
		c.setAttribute("context_nom",nom);
	
	}
	out.println("valeur de requete est  :"+nom+"<br/>");

	out.println("valeur de session nom est :"+(String)s.getAttribute("username")+"<br/>");

	out.println("valeur de notre contexte est :"+(String)c.getAttribute("context_nom"));
	}




	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*String parm=request.getParameter("param");
		if(!parm.equals("")) {
			this.getServletContext().getRequestDispatcher("/test.jsp").forward(request, response);
		}else {

			//this.getServletContext().getRequestDispatcher("/index.html").forward(request, response);
			response.sendRedirect("https://developer.mozilla.org/fr/");
		}*/
		

		String nom=request.getParameter("nom");
		String msg="";
		if(nom!=null && nom !="") {
              msg="Bienvenueeeeeeeeeeeee ";
             request.setAttribute("message", msg);
 			this.getServletContext().getRequestDispatcher("/WEB-INF/result.jsp").forward(request, response);
		}else {
			msg="le champs est vide";
            request.setAttribute("message",msg);

 			this.getServletContext().getRequestDispatcher("/Login.jsp").forward(request, response);
		}
	}
	
	
	
	

}
