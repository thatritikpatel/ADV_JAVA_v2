package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

import java.util.*;

import models.User;

public class ActivateAccountServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		String email = request.getParameter("email");
		String activationCode = request.getParameter("activation_code");

		String nextPage = "activation_failed.jsp";
	
		if(User.checkActivation(email,activationCode)){
			nextPage = "login.jsp";
		}

		request.getRequestDispatcher(nextPage).forward(request,response);
	}
}