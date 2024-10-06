package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.ArrayList;

import models.Student;

public class ShowStudentsServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		ArrayList<Student> students = Student.collectAllStudents();
		request.setAttribute("stds",students);

		request.getRequestDispatcher("records.jsp").forward(request,response);
	}
}