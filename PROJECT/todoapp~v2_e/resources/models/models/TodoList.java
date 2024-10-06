package models;
import java.sql.*;
public class TodoList{
//##########VARIABLES#############
	private Integer todolistId;
	private String title;
	private Timestamp created;
	private User user;
	private Status status;

//############SETTER-GETTER#########
	public void setTodolistId(Integer todolistId){
		this.todolistId=todolistId;
	}

	public Integer getTodolistId(){
		return todolistId;
	}

	public void setTitle(String title){
		this.title=title;
	}

	public String getTitle(){
		return title;
	}

	public void setCreated(Timestamp created){
		this.created=created;
	}

	public Timestamp getCreated(){
		return created;
	}

	public void setUser(User user){
		this.user=user;
	}

	public User getUser(){
		return user;
	}

	public void setStatus(Status status){
		this.status=status;
	}

	public Status getStatus(){
		return status;
	}
}