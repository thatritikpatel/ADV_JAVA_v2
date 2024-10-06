package tlds;

import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.JspException;
import java.io.*;

public class AbcHandler extends SimpleTagSupport{
	public void doTag() throws IOException,JspException{
		JspFragment frag = getJspBody();

		frag.invoke(null);
	}
}