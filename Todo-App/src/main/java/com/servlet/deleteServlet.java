package com.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.Dao.TodoDAO;

/**
 * Servlet implementation class deleteServlet
 */
public class deleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id=Integer.parseInt(request.getParameter("id"));
		TodoDAO.deleteTodo(id);
		
		boolean f=TodoDAO.deleteTodo(id);
	      HttpSession session=request.getSession();
			String Msg;
			String FailedMsg;
			   if(f==false) {
				Msg="todo est supprimer";
				session.setAttribute("message", Msg);
				response.sendRedirect("ListServlet");
				//request.setAttribute("listTodo", TodoDAO.getALLTodo());

				//this.getServletContext().getRequestDispatcher("/ListServlet").forward(request, response);
				// response.sendRedirect("ListServlet");
			}else {
				FailedMsg=" todo n'est pas supprimer";
				session.setAttribute("failedMsg", FailedMsg);

				 response.sendRedirect("ListServlet");
			}
			
		}
		
		
		
		
		
		
		

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
