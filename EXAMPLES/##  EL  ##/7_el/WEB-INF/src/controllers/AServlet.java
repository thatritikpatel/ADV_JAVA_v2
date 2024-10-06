package controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

import models.*;

public class AServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		City ct = new City();
		ct.setCityName("Bhopal");

		State st = new State();
		st.setStateName("MP");

		Address addr = new Address();
		addr.setCity(ct);
		addr.setState(st);
		
		User user = new User();

		user.setName("sumit");
		user.setAge(13);
		user.setAddress(addr);

		request.setAttribute("user",user);

		request.getRequestDispatcher("next2.jsp").forward(request,response);
	}
}