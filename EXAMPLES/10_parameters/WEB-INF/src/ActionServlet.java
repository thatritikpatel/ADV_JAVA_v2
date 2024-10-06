import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ActionServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		response.setContentType("text/html");

		String[] count = {"First","Second","Third","Fourth","Fifth"};

		String[] arr = request.getParameterValues("food");
		System.out.println(arr+"~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		String[] cities = request.getParameterValues("city");
		
		

		PrintWriter pw = response.getWriter();
		
		

		if(arr!=null){		
			for(int i=0;i<arr.length;i++){
				pw.write("<h1>"+count[i]+" Selection: </h1>"+arr[i]);
			}
		}

		if(cities!=null){
			for(int i=0;i<cities.length;i++){
				pw.write("<h1>City Selection: "+(i+1)+"</h1>"+cities[i]);
			}
		}

		pw.flush();
		pw.close();
	}
}