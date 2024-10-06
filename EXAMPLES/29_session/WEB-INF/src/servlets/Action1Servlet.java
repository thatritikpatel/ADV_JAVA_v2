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

		
		String encURL = response.encodeURL("act2.do");
		pw.write("<a href='"+encURL+"'>Second Link</a>");
		
		pw.flush();
		pw.close();
	}
}