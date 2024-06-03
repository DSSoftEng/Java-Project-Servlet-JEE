package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.beans.Client2;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    Map<String, String> ClientMap = new HashMap<>();
	
	
    public LoginServlet() {
        super();
        ClientMap.put("dounya","1234" );

        ClientMap.put("aya","2143" );

        ClientMap.put("nada","8900" );

        ClientMap.put("rim","12034" );
        
        
    }

    
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String username=request.getParameter("username");

		String password=request.getParameter("password");
		String message="";
		
		if(username.trim().isEmpty()||password.trim().isEmpty()) {
			message="vous devez remplir tout les champs";
			request.setAttribute("message", message);

			this.getServletContext().getRequestDispatcher("/LoginJsp.jsp").forward(request, response);
		}else {
			
			
			
			if(ClientMap.containsKey(username)&&ClientMap.containsValue(password)) {
				message="Vous ete dans espace Member";
				request.setAttribute("message", message);
				Client2 c=new Client2();
				c.setUsername(username);
	            c.setPassword(password);
	          //  request.setAttribute("client", c);
	             HttpSession session = request.getSession();
	             session.setAttribute("client", c);
	           // this.getServletContext().getRequestDispatcher("/resultLogin.jsp").forward(request, response);
	          response.sendRedirect("resultLogin.jsp");
			}else {
				message="les donnes que tu as entrer incorrect";
				request.setAttribute("message", message);
				this.getServletContext().getRequestDispatcher("/LoginJsp.jsp").forward(request, response);
				
			}
				
			
			
		}
	}

}



