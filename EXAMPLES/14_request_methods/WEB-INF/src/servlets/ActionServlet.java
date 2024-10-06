package servlets;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class ActionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();

		pw.write("<h1>Context Path: "+request.getContextPath()+"</h1>");
		pw.write("<h1>Request Method: "+request.getMethod()+"</h1>");
		pw.write("<h1>Query String: "+request.getQueryString()+"</h1>");
		pw.write("<h1>Request URI: "+request.getRequestURI()+"</h1>");
		pw.write("<h1>Request URL: "+request.getRequestURL()+"</h1>");
		pw.write("<h1>Servlet Path: "+request.getServletPath()+"</h1>");

		pw.flush();
		pw.close();
	}
}