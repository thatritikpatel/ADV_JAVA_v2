package servlets;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class Action1Servlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		ServletConfig conf = getServletConfig();

		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();

		pw.write("<h1>config init param: "+conf.getInitParameter("abc")+"</h1>");		


		pw.flush();
		pw.close();
	}	
}