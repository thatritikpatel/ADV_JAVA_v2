package servlets;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

import java.util.Date;

public class Action4Servlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		HttpSession session = request.getSession();

		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();

		pw.write("<a href='act2.do'>Second Link</a>");
		pw.write("<h1>Session Id: "+session.getId()+"</h1>");
		pw.write("<h1>Is New: "+session.isNew()+"</h1>");
		
		pw.flush();
		pw.close();
	}
}