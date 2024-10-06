package servlets;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class ActionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		ServletConfig conf = getServletConfig();

		ServletContext context = conf.getServletContext();

		String ceo = context.getInitParameter("CEO");
		String manager = context.getInitParameter("Manager");

		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();

		pw.write("<h1>CEO Name: "+ceo+"</h1>");
		pw.write("<h1>Manager Name: "+manager+"</h1>");

		pw.flush();
		pw.close();
	}	
}