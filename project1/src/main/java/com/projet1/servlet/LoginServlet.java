package com.projet1.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import org.apache.catalina.connector.Request;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String nom=req.getParameter("nom");
        String sexe=req.getParameter("sexe");
        String ville=req.getParameter("ville");
        String [] diplomes=req.getParameterValues("diplome");
        String diplomeString = diplomes != null ? String.join(", ", diplomes) : "Aucun";
        out.println("Bienvenu  User:"+nom+" ta ville original est "+ville+" ton sexe est "+sexe+" ton diplome est "+diplomeString);
	}

	

	
	}
