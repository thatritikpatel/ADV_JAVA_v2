package servlets;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class ActionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		//response.sendRedirect("abc.html");

		//response.sendRedirect("/13_request_methods/act.do");

		//response.sendRedirect("http://localhost:80/golu/index.html");

		response.sendRedirect("https://www.google.com");
	}
}