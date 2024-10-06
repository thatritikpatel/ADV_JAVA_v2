package controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

import models.*;

public class SaveTextNoteServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		HttpSession session = request.getSession();

		User user = (User)session.getAttribute("user");

		String resp = "expire";

		if(user!=null){
			String title = request.getParameter("title");
			String textNote = request.getParameter("textnote");
			int todotypeId = Integer.parseInt(request.getParameter("todotype_id"));

			ToDoList toDoList = new ToDoList();
			toDoList.setTitle(title);
			toDoList.setUser(user);
			toDoList.setTextNote(textNote);
			toDoList.setToDoType(new ToDoType(todotypeId));
			
			if(toDoList.saveTextNote()){
				resp = "success";
			}else{
				resp = "failed";
			}
		}

		response.getWriter().write(resp);
	}
}