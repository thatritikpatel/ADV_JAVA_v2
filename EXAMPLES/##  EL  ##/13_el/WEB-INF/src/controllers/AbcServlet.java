package controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;

public class AbcServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		map.put("abc#123",45);
		map.put("abc_124",78);

		request.setAttribute("aaa",map);

		request.getRequestDispatcher("next.jsp").forward(request,response);
	}
}