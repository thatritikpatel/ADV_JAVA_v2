package tlds;

import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.JspException;
import java.io.IOException;

public class MnoHandler extends SimpleTagSupport{
	public void doTag() throws JspException,IOException{
		getJspBody().invoke(null);
	}
}