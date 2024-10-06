package servlets;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class ActionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		System.out.println("ActionServlet ########");
		System.out.println(Thread.currentThread().getName()+" ########");
		

		//RequestDispatcher view = request.getRequestDispatcher("info.html");
		RequestDispatcher view = request.getRequestDispatcher("act2.do");
		view.forward(request,response);
	}
}