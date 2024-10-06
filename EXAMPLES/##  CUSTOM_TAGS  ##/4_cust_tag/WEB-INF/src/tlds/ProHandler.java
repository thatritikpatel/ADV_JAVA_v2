package tlds;

import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.JspException;
import java.io.IOException;

public class ProHandler extends SimpleTagSupport{
	private String value;

	public void setValue(String value){
		System.out.println("####$$$$$$$$$$$$$$$$$$$#####$$$$$$$$$$$$");
		this.value = value;
	}

	public void doTag() throws JspException,IOException{
		System.out.println(value);			
		System.out.println("####$$$$$$$$$$$$$$$$$$$#####$$$$$$$$$$$$");
	}
}