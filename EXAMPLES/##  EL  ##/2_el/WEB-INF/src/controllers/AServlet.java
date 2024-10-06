package controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class AServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		request.setAttribute("abc",456);

		request.getRequestDispatcher("next.jsp").forward(request,response);
	}
}