package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class Action1Servlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		HttpSession session = request.getSession();

		session.setAttribute("abc",567);
		
		//request.setAttribute("abc",456);
		
		RequestDispatcher view = request.getRequestDispatcher("info.html");
		view.forward(request,response);
	}
}