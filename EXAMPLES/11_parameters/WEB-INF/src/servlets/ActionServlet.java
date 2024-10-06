package servlets;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

import java.util.Enumeration;

public class ActionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		response.setContentType("text/html");

		Enumeration<String> enums = request.getParameterNames(); 

		PrintWriter pw = response.getWriter();
		
		while(enums.hasMoreElements()){
			String str = enums.nextElement();

			if(str.equals("food")){
				String[] arr = request.getParameterValues(str);
				if(arr!=null){
					for(String tmp : arr){
						pw.write("<h1>"+str+":"+tmp+"</h1>");				
					}
				}
			}else{
				String x = request.getParameter(str);
				pw.write("<h1>"+str+":"+x+"</h1>");		
			}			
		}		

		pw.flush();
		pw.close();
	}
}
