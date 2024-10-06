package servlets;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class ActionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();

		pw.write("<h1>Host: "+request.getHeader("HOST")+"</h1>");
		pw.write("<h1>User-Agent: "+request.getHeader("USER-AGENT")+"</h1>");
		pw.write("<h1>Accept: "+request.getHeader("ACCEPT")+"</h1>");
		pw.write("<h1>Accept-Language: "+request.getHeader("ACCEPT-LANGUAGE")+"</h1>");
		pw.write("<h1>Accept-Encoding: "+request.getHeader("ACCEPT-ENCODING")+"</h1>");
		pw.write("<h1>Accept-Charset: "+request.getHeader("ACCEPT-CHARSET")+"</h1>");
		pw.write("<h1>Keep-Alive: "+request.getHeader("KEEP-ALIVE")+"</h1>");
		pw.write("<h1>Connection: "+request.getHeader("CONNECTION")+"</h1>");


		pw.flush();
		pw.close();
	}
}