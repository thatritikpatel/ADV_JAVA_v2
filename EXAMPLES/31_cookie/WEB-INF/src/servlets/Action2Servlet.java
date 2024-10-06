package servlets;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class Action2Servlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		HttpSession session = request.getSession();

		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();

		pw.write("<h1>Hello 2</h1>");
		Cookie[] cks = request.getCookies();

		for(Cookie tmp : cks){
			pw.write("<h1>"+tmp.getName()+"~"+tmp.getValue()+"</h1>");
		}
		
		pw.flush();
		pw.close();
	}
}