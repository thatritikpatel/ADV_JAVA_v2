package controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

import models.*;
import java.util.ArrayList;

public class AServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
		HttpSession session = request.getSession();

		ArrayList<Student> students = Student.collectStudents();
		ArrayList<State> states = State.collectStates();
		ArrayList<City> cities = City.collectCities();

		session.setAttribute("records",students);
		session.setAttribute("stateRecords",states);
		session.setAttribute("citiRecords",cities);

		request.getRequestDispatcher("next.jsp").forward(request,response);
	}
}