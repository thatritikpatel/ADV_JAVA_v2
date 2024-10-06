import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ActionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		response.setContentType("text/html");

		String food1 = request.getParameter("food");
		String food2 = request.getParameter("food");
		String food3 = request.getParameter("food");

		System.out.println(food1);
		System.out.println(food2);
		System.out.println(food3);

		PrintWriter pw = response.getWriter();

		pw.write("<h1>First Selection: </h1>"+food1);
		pw.write("<h1>Second Selection: </h1>"+food2);
		pw.write("<h1>Third Selection: </h1>"+food3);

		pw.flush();
		pw.close();
	}
}