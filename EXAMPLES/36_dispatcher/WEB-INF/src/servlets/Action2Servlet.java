package servlets;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class Action2Servlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		System.out.println("Action2Servlet ######## step 2");
		System.out.println(Thread.currentThread().getName()+" ########");
		
		
			
	}
}