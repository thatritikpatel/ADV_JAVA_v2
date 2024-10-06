package servlets;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class BServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		HttpSession session = request.getSession();

		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();
		
		
		pw.write("<h1>"+session.getId()+"</h1>");

		pw.flush();
		pw.close();
	}
}