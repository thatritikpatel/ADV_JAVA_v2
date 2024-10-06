package controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

import models.*;

public class SaveToDoServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		HttpSession session = request.getSession();
		
		User user = (User)session.getAttribute("user");

		String resp = "expired";

		if(user!=null){
			String title = request.getParameter("title");
			int toDoTypeId = Integer.parseInt(request.getParameter("todotype_id"));
		
			String[] steps = request.getParameterValues("step"); 
			
			ToDoList toDoList = new ToDoList(title,user,new ToDoType(toDoTypeId));
			if(toDoList.saveToDo()){
				ToDoStep.saveToDoSteps(toDoList.getTodoListId(),steps);
			}
		}		
		
		response.getWriter().write(resp);
	}
}
