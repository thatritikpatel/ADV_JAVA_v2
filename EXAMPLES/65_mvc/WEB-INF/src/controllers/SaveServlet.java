package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

import models.Student;

public class SaveServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		String nextPage = "index.jsp";
		
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String degree = request.getParameter("degree");
		String college = request.getParameter("college");
		String[] courses = request.getParameterValues("course");

		String course = "";
		int i = 0;
		for(String str : courses){
			if(i==0)
				course = course + str;
			else
				course = course + "," + str;
			
			i++;
		}

		Student student = new Student(name,college,degree,gender,course);
		if(student.saveStudent()){
			nextPage = "success.jsp";
		}

		request.getRequestDispatcher(nextPage).forward(request,response);
	}
}