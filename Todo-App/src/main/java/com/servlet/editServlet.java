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
 * Servlet implementation class editServlet
 */
public class editServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public editServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		entity t=new entity();
		t=TodoDAO.getTodoById(id);
		request.setAttribute("entite", t);
		System.out.println(t.toString());
		this.getServletContext().getRequestDispatcher("/edit.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String todo=request.getParameter("todo");
		String status=request.getParameter("status");
		entity entite=new entity();
		entite.setId(id);
		entite.setName(name);
		entite.setStatus(status);
		entite.setTodo(todo);
		TodoDAO.UpdateTask(entite);
		
		//response.sendRedirect("ListServlet");
		boolean f=TodoDAO.UpdateTask(entite);
      HttpSession session=request.getSession();
		String Msg;
		String FailedMsg;
		   if(f==true) {
			Msg="todo est mise a jour";
			session.setAttribute("message", Msg);
			response.sendRedirect("ListServlet");
			//request.setAttribute("listTodo", TodoDAO.getALLTodo());

			//this.getServletContext().getRequestDispatcher("/ListServlet").forward(request, response);
			// response.sendRedirect("ListServlet");
		}else {
			FailedMsg=" todo n'est pas mise a jour";
			session.setAttribute("failedMsg", FailedMsg);

			 response.sendRedirect("ListServlet");
		}
		
	}

}
