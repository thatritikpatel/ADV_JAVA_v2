package controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class AServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		HttpSession session = request.getSession();

		request.setAttribute("abc",456);

		session.setAttribute("abc","ganesh");

		ServletContext context = getServletContext();
		context.setAttribute("abc",45.67);

		request.getRequestDispatcher("next.jsp").forward(request,response);
	}
}