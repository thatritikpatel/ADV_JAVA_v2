package tlds;

import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.JspException;
import java.io.IOException;

public class ProHandler extends SimpleTagSupport{
	private Integer size;

	public void setSize(Integer size){
		this.size = size;
	}

	public Integer getSize(){
		return size;
	}

	public void doTag() throws JspException,IOException{
		JspFragment jfrag = getJspBody();
		jfrag.invoke(null);
	}
}