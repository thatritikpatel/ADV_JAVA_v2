package controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

import models.Book;

public class AServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		Book book = new Book();
		book.setBookId(1);
		book.setTitle("Java");
		book.setAuthor("Ingole");
		book.setPrice(400);

		request.setAttribute("bk",book);

		request.getRequestDispatcher("next.jsp").forward(request,response);
	}
}