package controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

import models.Student;
import java.util.ArrayList;

public class AServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		HttpSession session = request.getSession();

		ArrayList<Student> students = Student.collectStudents();

		session.setAttribute("records",students);

		request.getRequestDispatcher("next.jsp").forward(request,response);
	}
}