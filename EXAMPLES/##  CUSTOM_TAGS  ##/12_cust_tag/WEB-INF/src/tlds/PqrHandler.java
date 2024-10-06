package tlds;

import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.tagext.JspTag;
import javax.servlet.jsp.JspException;
import java.io.IOException;


public class PqrHandler extends SimpleTagSupport{
	public void doTag() throws JspException,IOException{
		//Case 2:
		AbcHandler abcHandler = (AbcHandler)findAncestorWithClass(this,AbcHandler.class);
		
		//Case 1:	
		//MnoHandler mnoHandler = (MnoHandler)getParent();
		//AbcHandler abcHandler = (AbcHandler)mnoHandler.getParent();
		//getJspContext().getOut().write(abcHandler.getSize());
		

		getJspContext().getOut().print(abcHandler.getSize());
	}
}