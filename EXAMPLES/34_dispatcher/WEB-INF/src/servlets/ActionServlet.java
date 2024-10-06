package servlets;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class ActionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		//response.setContentType("text/html");

		//PrintWriter pw = response.getWriter();

		//pw.write("<h1>Hello</h1>");
		//pw.write("<a href='act2.do'>The Link 2</a>");
		
		//pw.flush();
		//pw.close();

		System.out.println("In ActionServlet #########################");

		RequestDispatcher view = request.getRequestDispatcher("info.html");
		view.forward(request,response);
	}
}