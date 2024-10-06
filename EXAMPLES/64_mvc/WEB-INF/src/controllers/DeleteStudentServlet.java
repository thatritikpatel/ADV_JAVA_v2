package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.ArrayList;

import models.Student;

public class DeleteStudentServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		int studentId = Integer.parseInt(request.getParameter("st_id"));
		Student.deleteStudent(studentId);

		request.getRequestDispatcher("showall.do").forward(request,response);
	}
}