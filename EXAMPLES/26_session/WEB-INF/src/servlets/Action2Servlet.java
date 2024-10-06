package servlets;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

import java.util.Date;

public class Action2Servlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		HttpSession session = request.getSession();

		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();

		
		pw.write("<h1>Session Id: "+session.getId()+"</h1>");		
		pw.write("<h1>Max Inactive Interval: "+session.getMaxInactiveInterval()+"</h1>");
		
		pw.flush();
		pw.close();
	}
}