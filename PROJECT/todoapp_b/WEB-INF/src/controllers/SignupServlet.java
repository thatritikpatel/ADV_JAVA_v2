package controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

import models.*;

public class SignupServlet extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		String nextPage = "signup.jsp";
		
		String userName = request.getParameter("uname");
		String email = request.getParameter("email");
		String password = request.getParameter("pass");
		String rePassword = request.getParameter("repass");
		int countryId = Integer.parseInt(request.getParameter("country_id"));

		User user = new User();
		user.setUserName(userName);
		user.setEmail(email);
		user.setPassword(password);
		user.setCountry(new Country(countryId));

		if(user.signupUser()){
			nextPage = "signin.jsp";
		}		
		
		request.getRequestDispatcher(nextPage).forward(request,response);				
	}
}