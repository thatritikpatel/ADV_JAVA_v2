package servlets;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

import java.util.Date;

public class Action1Servlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		HttpSession session = request.getSession();

		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();

		pw.write("<a href='act2.do'>Second Link</a>");
		pw.write("<h1>Session Id: "+session.getId()+"</h1>");		
		pw.write("<h1>Max Inactive Interval: "+session.getMaxInactiveInterval()+"</h1>");
		session.setMaxInactiveInterval(30);

		pw.flush();
		pw.close();
	}
}