package servlets;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class Action2Servlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();

		pw.write("<h1>Hello 2</h1>");
		
		Cookie[] arr = request.getCookies();

		for(Cookie tmp : arr){
			pw.write("<h1>"+tmp.getName()+" : "+tmp.getValue()+"</h1>");
		}


		pw.flush();
		pw.close();
	}
}