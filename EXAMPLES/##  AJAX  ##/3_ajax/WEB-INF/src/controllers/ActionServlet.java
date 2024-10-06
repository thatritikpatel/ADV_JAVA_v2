package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class ActionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		String name = request.getParameter("name");
		System.out.println(">"+name+"<");

		String resp = null;

		if(name.equals("ganesh")){
			resp = "Namaskaram";
		}else{
			resp = "Hello Dude";
		}

		response.getWriter().write(resp);
	}
}