package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

import models.Student;

public class SaveServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		HttpSession session = request.getSession();

		String nextPage = "index.jsp";

		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String degree = request.getParameter("degree");
		String branch = request.getParameter("branch");
		String semester = request.getParameter("semester");

		Student st = new Student();
		st.setName(name);
		st.setEmail(email);
		st.setDegree(degree);
		st.setBranch(branch);
		st.setSemester(semester);

		if(st.saveStudent()){
			nextPage = "success.jsp";	
		}else{
			request.setAttribute("message","Duplicate Email ....!!");
		}

		request.getRequestDispatcher(nextPage).forward(request,response);
	}
}