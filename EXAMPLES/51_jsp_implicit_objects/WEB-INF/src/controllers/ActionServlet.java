package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class ActionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		
		ServletConfig conf = getServletConfig();
		ServletContext context = getServletContext();
		
		System.out.println("###########################");
		System.out.println(conf.getInitParameter("abc"));
		System.out.println(context.getInitParameter("abc"));
		System.out.println("###########################");

		
		request.getRequestDispatcher("abc.jsp").forward(request,response);
	}
}