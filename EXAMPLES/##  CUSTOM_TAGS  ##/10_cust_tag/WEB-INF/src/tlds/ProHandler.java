package tlds;

import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspContext;
import java.io.IOException;

public class ProHandler extends SimpleTagSupport {
	public void doTag() throws IOException,JspException{
		JspContext jspContext = getJspContext();		
		JspFragment frag = getJspBody();

		String[] arr = {"mohan<br />","rohan<br />","sohan<br />","gohan<br />","tohan<br />"};
		
		for(String tmp : arr){
			jspContext.setAttribute("value",tmp);
			frag.invoke(null);
		}
	}
}