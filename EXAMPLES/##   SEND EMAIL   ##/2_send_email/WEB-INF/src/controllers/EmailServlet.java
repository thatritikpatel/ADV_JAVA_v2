package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

import utils.EmailSender;

public class EmailServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		String name = request.getParameter("name");
		String to = request.getParameter("to");
		String subject = request.getParameter("subject");
		String message = request.getParameter("message");

		EmailSender.sendEmail(name,to,subject,message);

		request.getRequestDispatcher("success.jsp").forward(request,response);
	}
}
