package servlets;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class ActionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		ServletConfig conf = getServletConfig();

		
		String val1 = conf.getInitParameter("abc");
		String val2 = conf.getInitParameter("mno");
		

		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();

		pw.write("<h1>abc init-param: "+val1+"</h1>");
		pw.write("<h1>mno init-param: "+val2+"</h1>");

		pw.flush();
		pw.close();
	}	
}