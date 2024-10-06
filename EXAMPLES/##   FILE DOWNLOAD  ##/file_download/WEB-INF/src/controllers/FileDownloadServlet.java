package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

public class FileDownloadServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		response.setContentType("application/pdf");

		OutputStream os = response.getOutputStream();

		ServletContext context = getServletContext();

		InputStream is = context.getResourceAsStream("/WEB-INF/docs/django.pdf");

		byte[] arr = new byte[1024];
		int i = 0;
		int x;
		while((x=is.read(arr))!=-1){
			os.write(arr);
		}

		os.flush();
		os.close();
	}
}