package servlets;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class ActionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		ServletConfig conf = getServletConfig();

		ServletContext context = conf.getServletContext();

		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();

		pw.write("<h1>ServletConfig: "+conf+"</h1>");
		pw.write("<h1>ServletContext: "+context+"</h1>");

		pw.flush();
		pw.close();
	}	
}