package tlds;

import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.JspException;
import java.io.IOException;

public class Pro2Handler extends SimpleTagSupport{
	public void doTag() throws IOException,JspException{
		System.out.println("Pro2Handler ^^^^^^");
	}
}