package tlds;

import javax.servlet.jsp.tagext.SimpleTagSupport;
import javax.servlet.jsp.JspException;
import java.io.IOException;

public class BookHandler extends SimpleTagSupport{
	private Float price;
	private Integer pages;
	private String author;
	private String publisher;

	public void setAuthor(String author){
		this.author = author;
	}

	public void setPublisher(String publisher){
		this.publisher = publisher;
	}

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
		System.out.println(author);
		System.out.println(publisher);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
}