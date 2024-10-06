package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

import models.User;

public class SigninServlet extends HttpServlet{
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		HttpSession session = request.getSession();

		String email = request.getParameter("email");
		String password = request.getParameter("passw");

		User user = new User(email,password);
		user.signinUser();

		session.setAttribute("user",user);

		request.getRequestDispatcher("profile.jsp").forward(request,response);
	}
}