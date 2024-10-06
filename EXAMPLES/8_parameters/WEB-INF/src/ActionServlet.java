import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ActionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		response.setContentType("text/html");

		String userName = request.getParameter("unm");
		String email = request.getParameter("eml");
		String password = request.getParameter("psw");

		System.out.println(userName);
		System.out.println(email);
		System.out.println(password);

		PrintWriter pw = response.getWriter();

		pw.write("<h1>User Name: </h1>"+userName);
		pw.write("<h1>Email: </h1>"+email);
		pw.write("<h1>Password: </h1>"+password);

		pw.flush();
		pw.close();
	}
}