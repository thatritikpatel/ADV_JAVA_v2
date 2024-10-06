package servlets;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class ActionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();

		pw.write("<h1>Character Encoding: "+request.getCharacterEncoding()+"</h1>");
		pw.write("<h1>Content Length: "+request.getContentLength()+"</h1>");
		pw.write("<h1>Local Addr: "+request.getLocalAddr()+"</h1>");
		pw.write("<h1>Server Name: "+request.getServerName()+"</h1>");
		pw.write("<h1>Remote Addr: "+request.getRemoteAddr()+"</h1>");
		pw.write("<h1>Remote Host: "+request.getRemoteHost()+"</h1>");
		pw.write("<h1>Local Port: "+request.getLocalPort()+"</h1>");
		pw.write("<h1>Remote Port: "+request.getRemotePort()+"</h1>");
		pw.write("<h1>Server Port: "+request.getServerPort()+"</h1>");
		
		pw.write("<h1>Protocol: "+request.getProtocol()+"</h1>");
		pw.write("<h1>Scheme: "+request.getScheme()+"</h1>");
		pw.write("<h1>Is Secure: "+request.isSecure()+"</h1>");

		pw.flush();
		pw.close();
	}
}