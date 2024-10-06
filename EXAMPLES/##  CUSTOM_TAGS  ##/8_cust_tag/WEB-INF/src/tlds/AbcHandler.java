package tlds;

import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.JspException;
import java.io.IOException;

public class AbcHandler extends SimpleTagSupport{
	public void doTag() throws JspException,IOException{
		ProHandler parent = (ProHandler)getParent();

		System.out.println("###############################");
		System.out.println(parent.getSize());
		System.out.println("###############################");
	}
}