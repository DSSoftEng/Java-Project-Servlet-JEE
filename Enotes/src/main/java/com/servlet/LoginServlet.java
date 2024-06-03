package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.beans.user;
import com.dao.UserDao;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		
		
		String username=request.getParameter("username");

		String password=request.getParameter("password");
          boolean found=false;
	    List<user> listUsers = new ArrayList<>();
	    listUsers=UserDao.getAllUsers();

        HttpSession session = request.getSession();
	    System.out.print(listUsers);
		if(username.trim().isEmpty()||password.trim().isEmpty()) {
		
			this.getServletContext().getRequestDispatcher("/Login.jsp").forward(request, response);
		}else {
			for (user user : listUsers ) {
			    if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
			    	session.setAttribute("user",user);
		             response.sendRedirect("ListNotes");
			        found = true;
			        break; // Quittez la boucle si une correspondance est trouvée
			    }
			}
 
       if (found) {
        System.out.println("L'utilisateur avec le nom d'utilisateur et le mot de passe spécifiés a été trouvé.");
        
      } else {
       System.out.println("Aucun utilisateur avec le nom d'utilisateur et le mot de passe spécifiés n'a été trouvé.");
       this.getServletContext().getRequestDispatcher("/Login.jsp").forward(request, response);
      }
       
		}
		
		
		
		
		
		
		
		
	}

}
