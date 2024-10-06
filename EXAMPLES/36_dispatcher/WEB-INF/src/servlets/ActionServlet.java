package servlets;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class ActionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{		
		System.out.println("ActionServlet ######## step 1");
		System.out.println(Thread.currentThread().getName()+" ########");

		RequestDispatcher view1 = request.getRequestDispatcher("act2.do");
		view1.include(request,response);

		System.out.println("ActionServlet ######## step 3");
		System.out.println(Thread.currentThread().getName()+" ########");

		RequestDispatcher view2 = request.getRequestDispatcher("info.html");
		view2.forward(request,response);
	}
}