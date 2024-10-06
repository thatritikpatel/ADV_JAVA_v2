package controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class AbcServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		
		request.setAttribute("abc~mno","umesh");

		request.getRequestDispatcher("next.jsp").forward(request,response);
	}
}