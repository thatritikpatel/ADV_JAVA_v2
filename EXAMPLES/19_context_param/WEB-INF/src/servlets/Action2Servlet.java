package servlets;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class Action2Servlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		ServletConfig conf = getServletConfig();

		ServletContext context = conf.getServletContext();	
		
		

		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();

		pw.write("<h1>config: "+conf+"</h1>");
		pw.write("<h1>context: "+context+"</h1>");

		pw.write("<h1>context-param count: "+context.getInitParameter("count")+"</h1>");

		pw.flush();
		pw.close();
	}	
}