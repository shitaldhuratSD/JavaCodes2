package com.tyss.mywebapp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/redirect")
public class RedirectServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String url ="https://www.facebook.com";		// Redirecting
		
		
	//	String url ="https://localhost:8080/mywebapp/myFirstServlet";	
		resp.sendRedirect(url);
	}
	
}
