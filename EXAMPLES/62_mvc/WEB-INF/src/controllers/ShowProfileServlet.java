package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class ShowProfileServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		

		request.getRequestDispatcher("profile.jsp").forward(request,response);
	}
}