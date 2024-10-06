package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.ArrayList;

import models.Student;

public class UpdateServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		int studentId = Integer.parseInt(request.getParameter("student_id"));
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String college = request.getParameter("college");
		String degree = request.getParameter("degree");
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

		Student student = new Student(studentId,name,college,degree,gender,course);
		student.updateStudent();

		request.setAttribute("student",student);

		request.getRequestDispatcher("index.jsp").forward(request,response);
	}
}