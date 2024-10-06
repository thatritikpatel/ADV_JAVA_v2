package servlets;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class ActionServlet extends HttpServlet{
	public void init() throws ServletException{
		System.out.println("---------init()-------------");
		System.out.println("---------init()-------------");
		System.out.println("---------init()-------------");
		System.out.println("---------init()-------------");
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		System.out.println("---------doGet()-------------");
		System.out.println("---------doGet()-------------");
		System.out.println("---------doGet()-------------");
		System.out.println("---------doGet()-------------");
	}
	
	public void destroy(){
		System.out.println("---------destroy()-------------");
		System.out.println("---------destroy()-------------");
		System.out.println("---------destroy()-------------");
		System.out.println("---------destroy()-------------");
	}
}