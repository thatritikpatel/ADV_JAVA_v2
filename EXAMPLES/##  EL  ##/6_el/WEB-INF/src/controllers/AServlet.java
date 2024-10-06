package controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

import models.User;

public class AServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		User user = new User();

		user.setName("sumit");
		user.setAge(13);

		request.setAttribute("user",user);

		request.getRequestDispatcher("next2.jsp").forward(request,response);
	}
}