package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

import models.User;

public class SignupServlet extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		String userName = request.getParameter("uname");
		String email = request.getParameter("email");
		String password = request.getParameter("passw");
		String rePassword = request.getParameter("repass");

		String nextPage = "index.jsp";
		
		boolean flag = true;

		if(!password.equals(rePassword)){
			flag = false;
			System.out.println("-------fail");
		}

		if(flag){
			User user = new User();
			user.setUserName(userName);
			user.setEmail(email);
			user.setPassword(password);

			if(user.signupUser()){
				nextPage = "login.jsp";
				System.out.println("-------success");
			}
		}
		System.out.println("-------"+flag);
		request.getRequestDispatcher(nextPage).forward(request,response);
	}
}