package controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class AServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		String[] arr = {"Mohan","Sohan","Rohan","Ganesh","Suresh"};

		request.setAttribute("data",arr);

		request.getRequestDispatcher("next.jsp").forward(request,response);
	}
}