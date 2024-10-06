package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

import models.User;

public class SigninServlet extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		HttpSession session = request.getSession();

		String email = request.getParameter("email");
		String password = request.getParameter("passw");
		

		String nextPage = "login.jsp";
		
		User user = new User();
		
		user.setEmail(email);
		user.setPassword(password);

		if(user.signinUser()){
			nextPage = "profile.jsp";
			session.setAttribute("user",user);
		}
		
		request.getRequestDispatcher(nextPage).forward(request,response);
	}
}