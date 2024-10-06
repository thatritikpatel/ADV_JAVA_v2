package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.ArrayList;

import models.Student;

public class ProfileServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		int studentId = Integer.parseInt(request.getParameter("st_id"));
		
		Student student = new Student(studentId);
		student.getStudentRecord();

		request.setAttribute("student",student);

		request.getRequestDispatcher("index.jsp").forward(request,response);
	}
}