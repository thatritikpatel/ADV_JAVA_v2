package servlets;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class ShowLoginServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();
		
		Cookie[] cks = request.getCookies();

		String userName = null;
		String password = null;

 		for(Cookie c : cks){
			String ckName = c.getName();
			if(ckName.equals("uname")){
				userName = c.getValue();
			}else if(ckName.equals("passw")){
				password = c.getValue();		
			}
		}

		pw.write("<form action='login.do'>");
		pw.write("User Name: <input type='text' name='unm' value='"+userName+"' />");	
		pw.write("Password: <input type='password' name='pwd' value='"+password+"' />");	
		pw.write("<input type='submit' value='Login' />");
		pw.write("</form>");


		pw.flush();
		pw.close();
	}
}