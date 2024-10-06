package models;

import java.util.ArrayList;
import java.sql.*;

public class Book{
	private Integer bookId;
	private String title;
	private String author;
	private Integer price;
	
	public void setPrice(Integer price){
		this.price = price;
	}

	public Integer getPrice(){
		return price;
	}

	public void setAuthor(String author){
		this.author = author;
	}

	public String getAuthor(){
		return author;
	}

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	public void setBookId(Integer bookId){
		this.bookId = bookId;
	}

	public Integer getBookId(){
		return bookId;
	}
}