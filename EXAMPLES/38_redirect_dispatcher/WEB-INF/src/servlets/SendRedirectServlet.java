package servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

import java.util.*;

public class SendRedirectServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{

		//Case 1:
		//RequestDispatcher view = request.getRequestDispatcher("xyz/resp.html");
		//RequestDispatcher view = request.getRequestDispatcher("resp.html");
		//RequestDispatcher view = request.getRequestDispatcher("/resp.html");
		//RequestDispatcher view = request.getRequestDispatcher("/xyz/resp.html");
		//RequestDispatcher view = request.getRequestDispatcher("../resp.html");
		//RequestDispatcher view = request.getRequestDispatcher("../../xyz/resp.html");
		//view.forward(request, response);		

		//Case 2:
		//response.sendRedirect("abc/xyz/resp.html");

		//Case 2a:
		//response.sendRedirect("xyz/resp.html");
		
		//Case 3:
		response.sendRedirect("/xyz/resp.html");
		//response.sendRedirect("http://www.google.com");
		//response.sendRedirect("http://localhost/golu");
		//response.sendRedirect("http://localhost:8000/app/act1/");
	}
}