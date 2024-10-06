package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

import models.User;
import utils.EmailSender;

public class SignupServlet extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		String userName = request.getParameter("uname");
		String email = request.getParameter("email");
		String password = request.getParameter("passw");
		String rePassword = request.getParameter("repass");

		boolean flag = false;
		if(password.equals(rePassword)){
			flag = true;
		}

		User user = new User();
		if(flag){
			user.setUserName(userName);
			user.setEmail(email);
			user.setPassword(password);

			if(user.signupUser()){
				EmailSender.sendEmail(email,"Please click over the link to activate your account....");
			}
		}

		request.getRequestDispatcher("login.jsp").forward(request,response);
	}
}