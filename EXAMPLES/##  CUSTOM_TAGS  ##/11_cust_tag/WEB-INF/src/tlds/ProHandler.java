package tlds;

import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspWriter;
import java.io.IOException;

public class ProHandler extends SimpleTagSupport {
	public void doTag() throws IOException,JspException{
		JspContext jspContext = getJspContext();
		JspWriter out = jspContext.getOut();
		JspFragment frag = getJspBody();

		String[] arr = {"mohan<br />","rohan<br />","sohan<br />","gohan<br />","tohan<br />"};
		
		out.write("<table border='1' width='20%' align='center'>");
		for(String tmp : arr){
			out.write("<tr><td>");
			jspContext.setAttribute("value",tmp);
			frag.invoke(null);
			out.write("</td></tr>");
		}
		out.write("</table>");
	}
}