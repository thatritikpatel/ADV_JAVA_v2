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

		request.setAttribute("abc",123);
		session.setAttribute("abc",234);
		context.setAttribute("abc",345);

		request.getRequestDispatcher("abc.jsp").forward(request,response);
	}
}