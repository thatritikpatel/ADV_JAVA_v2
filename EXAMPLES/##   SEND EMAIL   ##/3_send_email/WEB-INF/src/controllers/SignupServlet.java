package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

import java.util.*;

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

			String r1 = Long.toString(new Random().nextLong());
			String r2 = Long.toString(new Date().getTime());
			String activationCode = r1+"_"+r2;

			if(user.signupUser(activationCode)){
				EmailSender.sendEmail(email,userName,activationCode);
			}
		}

		request.getRequestDispatcher("login.jsp").forward(request,response);
	}
}