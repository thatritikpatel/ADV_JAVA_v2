package controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class AbcServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		
		int[] x = {56000,34000,23000};

		request.setAttribute("arr",x);

		request.getRequestDispatcher("next.jsp").forward(request,response);
	}
}