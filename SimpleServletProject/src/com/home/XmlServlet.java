package com.home;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class XmlServlet extends HttpServlet {
	
	public void init() throws ServletException {
	      System.out.println("Init ");
	   }

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello from XmlServlet GET Method");
	}
	
	public void destroy() {
		System.out.println("destroy ");
	   }

}
