package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class ActionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		HttpSession session = request.getSession();
		ServletConfig conf = getServletConfig();
		ServletContext context = getServletContext();
		PrintWriter out = response.getWriter();

		System.out.println(request);
		System.out.println(response);
		System.out.println(session);
		System.out.println(context);
		System.out.println(conf);
		System.out.println(out);

		request.getRequestDispatcher("abc.jsp").forward(request,response);
	}
}