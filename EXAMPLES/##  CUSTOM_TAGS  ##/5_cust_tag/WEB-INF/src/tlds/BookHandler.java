package tlds;

import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.JspException;
import java.io.IOException;

public class BookHandler extends SimpleTagSupport{
	private Float price;
	private Integer pages;

	public void setPages(Integer pages){
		this.pages = pages;
	}

	public void setPrice(Float price){
		this.price = price;
	}

	public void doTag() throws JspException,IOException{
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(price);
		System.out.println(pages);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
}