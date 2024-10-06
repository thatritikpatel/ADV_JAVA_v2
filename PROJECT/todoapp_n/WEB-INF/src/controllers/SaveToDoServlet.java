package controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

import models.*;

public class SaveToDoServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		HttpSession session = request.getSession();
		
		User user = (User)request.getAttribute("user");

		String resp = "expired";

		if(user!=null){
			String title = request.getParameter("title");
			int toDoTypeId = Integer.parseInt(request.getParameter("todotype_id"));
		
			String[] steps = request.getParameterValues("step"); 
			
			ToDoList toDoList = new ToDoList(title,user,new ToDoType(toDoTypeId));
			toDoList.saveToDo();
		}		
		
		response.getWriter().write(resp);
	}
}
