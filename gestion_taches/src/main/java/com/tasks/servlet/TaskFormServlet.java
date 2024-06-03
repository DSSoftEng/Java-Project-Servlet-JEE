package com.tasks.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.tasks.beans.Task;
import com.tasks.dao.taskDao;

/**
 * Servlet implementation class TaskFormServlet
 */
public class TaskFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TaskFormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String action = request.getParameter("action");
        int id = request.getParameter("id") != null ? Integer.parseInt(request.getParameter("id")) : 0;

         if ("delete".equals(action)) {
            taskDao.deleteTask(id);
           response.sendRedirect("TaskListServlet");
            //this.getServletContext().getRequestDispatcher("/TaskListServlet").forward(request, response);
        }
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String title=request.getParameter("title");
		String description=request.getParameter("description");
		String status=request.getParameter("status");
		Task task=new Task();
		task.setTitle(title);
		task.setDescription(description);
		task.setStatus(status);
		taskDao taches=new taskDao();
		taches.addTask(task);
		request.setAttribute("taches", taches.getTasks());
		System.out.println(" envoyer a taskList");
		response.sendRedirect("TaskListServlet");
		//this.getServletContext().getRequestDispatcher("/TaskList.jsp").forward(request, response);
	
		
		
	}

}
