package controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

import models.User;

public class ShowProfilePicServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		HttpSession session = request.getSession();

		User user = (User)session.getAttribute("user");		
		
		if(user!=null){
			InputStream is = getServletContext().getResourceAsStream("/WEB-INF/uploads/"+user.getEmail()+"/"+user.getProfpic());

			ServletOutputStream sos = response.getOutputStream();
			
			int count = 0;
			byte[] arr = new byte[1024];

			while((count=is.read(arr))!=-1){
				sos.write(arr);
			}
			
			sos.flush();
			sos.close();
		}
	}
}