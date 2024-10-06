package controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

import models.Employee;

public class SaveServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		String name = request.getParameter("emp_nm");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		int age = Integer.parseInt(request.getParameter("age"));

		String nextPage = "index.jsp";

		Employee emp = new Employee();
		emp.setName(name);
		emp.setEmail(email);
		emp.setPassword(password);
		emp.setAge(age);

		if(emp.saveEmployee()){
			nextPage = "success.jsp";		
		}else{
			request.setAttribute("error","Duplicate Email... Please Register Again");
		}

		request.getRequestDispatcher(nextPage).forward(request,response);
	}
}