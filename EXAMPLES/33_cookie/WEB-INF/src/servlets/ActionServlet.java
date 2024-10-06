package servlets;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class ActionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();

		pw.write("<h1>Hello</h1>");
		pw.write("<a href='act2.do'>The Link 2</a>");

		Cookie c1 = new Cookie("aaa","111");
		Cookie c2 = new Cookie("bbb","222");
		Cookie c3 = new Cookie("ccc","333");
		
		System.out.println(c1.getMaxAge());
		System.out.println(c2.getMaxAge());
		System.out.println(c3.getMaxAge());

		c2.setMaxAge(30);
		c3.setMaxAge(0);

		response.addCookie(c1);
		response.addCookie(c2);
		response.addCookie(c3);

		pw.flush();
		pw.close();
	}
}