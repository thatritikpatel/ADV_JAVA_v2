import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.Date;

public class TimeServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		response.setContentType("text/html");

		PrintWriter pw = response.getWriter();
		
		Date date = new Date();
		pw.write("<h1>Current Date Time: "+date+"</h1>");

		pw.flush();
		pw.close();
	}
}