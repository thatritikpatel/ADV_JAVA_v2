package servlets;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class Action2Servlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		System.out.println("Action2Servlet ########");
		System.out.println(Thread.currentThread().getName()+" ########");
		
		
		RequestDispatcher view = request.getRequestDispatcher("info.html");
		view.forward(request,response);
	}
}