package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

import models.User;

public class PicServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		HttpSession session = request.getSession();

		User user = (User)session.getAttribute("user");

		InputStream is = getServletContext().getResourceAsStream("/WEB-INF/uploads/"+user.getEmail()+"/"+user.getPicPath());
		
		System.out.println("#######################");
		System.out.println("/WEB-INF/uploads/"+user.getEmail()+"/"+user.getPicPath());
		System.out.println("#######################");


		OutputStream os = response.getOutputStream();

		
		byte[] arr = new byte[1024];
		int x = 0;
		while((x=is.read(arr))!=-1){
			os.write(arr);
		}

		os.flush();
		os.close();
	}
}