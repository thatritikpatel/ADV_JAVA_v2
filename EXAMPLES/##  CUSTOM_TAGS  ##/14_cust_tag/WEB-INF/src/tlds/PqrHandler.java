package tlds;

import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.tagext.JspTag;
import javax.servlet.jsp.*;
import java.io.IOException;


public class PqrHandler extends SimpleTagSupport{
	private String value;

	public void setValue(String value){
		this.value = value;
	}

	public void doTag() throws JspException,IOException{
		JspContext jspContext = getJspContext();

		JspWriter jspWriter = jspContext.getOut();

		jspWriter.write("~~~~~~~~~PqrHandler start~~~~~~~~~~~~");
		
		if(value.equals("mohan")){
			jspWriter.write(value);
		}else{
			throw new SkipPageException();
		}

		jspWriter.write("~~~~~~~~~PqrHandler end~~~~~~~~~~~~");
	}
}