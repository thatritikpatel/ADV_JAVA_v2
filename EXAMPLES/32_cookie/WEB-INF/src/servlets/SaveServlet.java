package servlets;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class SaveServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		HttpSession session = request.getSession();		

		String userName = request.getParameter("unm");
		String email = request.getParameter("eml");
		String password = request.getParameter("pwd");
		String city = request.getParameter("city");

		System.out.println(userName);
		System.out.println(email);
		System.out.println(password);
		System.out.println(city);

		Cookie c1 = new Cookie("uname",userName);
		Cookie c2 = new Cookie("passw",password);
		
		response.addCookie(c1);
		response.addCookie(c2);

		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();
		
		pw.write("<h1>You are registered...</h1>");
		pw.write("<a href='showlogin.do'>Login</a>");
		

		pw.flush();
		pw.close();
	}
}