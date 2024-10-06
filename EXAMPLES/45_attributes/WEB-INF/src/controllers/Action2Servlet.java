package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class Action2Servlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		Integer i = (Integer)request.getAttribute("abc");

		System.out.println("Action2Servlet: attribute value is: "+i);
		
		RequestDispatcher view = request.getRequestDispatcher("info.html");
		view.forward(request,response);
	}
}