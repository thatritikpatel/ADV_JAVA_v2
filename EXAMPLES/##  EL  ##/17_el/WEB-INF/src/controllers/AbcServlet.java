package controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class AbcServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		
		String[] ar1 = {"mohan","sohan","rohan"};
		String[] ar2 = {"ganesh","suresh","dinesh"};

		ArrayList<String[]> lst = new ArrayList<String[]>();

		lst.add(ar1);
		lst.add(ar2);

		request.setAttribute("list",lst);		

		request.getRequestDispatcher("next.jsp").forward(request,response);
	}
}