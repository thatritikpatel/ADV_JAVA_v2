package controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class AbcServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		
		ArrayList<String> alist = new ArrayList<String>();

		alist.add("ganesh");
		alist.add("mohan");

		request.setAttribute("list",alist);

		request.getRequestDispatcher("next.jsp").forward(request,response);
	}
}