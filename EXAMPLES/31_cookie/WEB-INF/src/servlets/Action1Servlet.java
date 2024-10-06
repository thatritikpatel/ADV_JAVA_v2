package servlets;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class Action1Servlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		HttpSession session = request.getSession();

		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();

		pw.write("<h1>Hello</h1>");
		pw.write("<a href='act2.do'>The Link 2</a>");

		Cookie c1 = new Cookie("aaa","111");
		Cookie c2 = new Cookie("bbb","222");
		Cookie c3 = new Cookie("ccc","333");

		response.addCookie(c1);
		response.addCookie(c2);
		response.addCookie(c3);

		pw.flush();
		pw.close();
	}
}