package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class Action1Servlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		request.setAttribute("abc",123);
		
		RequestDispatcher view = request.getRequestDispatcher("act2.do");
		view.forward(request,response);
	}
}