package controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class AbcServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		HttpSession session = request.getSession();

		Cookie c1 = new Cookie("xyz","456");
		Cookie c2 = new Cookie("pqr","1000");

		response.addCookie(c1);
		response.addCookie(c2);

		
		request.getRequestDispatcher("next.jsp").forward(request,response);
	}
}