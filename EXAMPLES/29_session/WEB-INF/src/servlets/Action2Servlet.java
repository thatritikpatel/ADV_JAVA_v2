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

		String encURL = response.encodeURL("act3.do");
		pw.write("<a href='"+encURL+"'>Third Link</a>");
		

		pw.flush();
		pw.close();
	}
}