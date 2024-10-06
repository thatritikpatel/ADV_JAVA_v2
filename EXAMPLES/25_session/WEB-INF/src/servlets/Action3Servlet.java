package servlets;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

import java.util.Date;

public class Action3Servlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		HttpSession session = request.getSession();

		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();

		pw.write("<h1>Fourth Page</h1>");
		pw.write("<h1>Session Id: "+session.getId()+"</h1>");
		pw.write("<h1>Is New: "+session.isNew()+"</h1>");
		pw.write("<h1>Max Inactive Interval: "+session.getMaxInactiveInterval()+"</h1>");
		pw.write("<h1>Creation Time: "+new Date(session.getCreationTime())+"</h1>");
		pw.write("<h1>Last Accessed Time: "+new Date(session.getLastAccessedTime())+"</h1>");


		pw.flush();
		pw.close();
	}
}