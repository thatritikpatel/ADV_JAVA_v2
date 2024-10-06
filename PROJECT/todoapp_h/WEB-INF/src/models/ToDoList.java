package models;

import java.sql.Timestamp;

public class ToDoList{
	private Integer todoListId;
	private String title;
	private Timestamp created;
	private User user;
	private Status status;
	
	public Integer getTodoListId() {
		return todoListId;
	}
	
	public void setTodoListId(Integer todoListId) {
		this.todoListId = todoListId;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Timestamp getCreated() {
		return created;
	}
	
	public void setCreated(Timestamp created) {
		this.created = created;
	}
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user) {
		this.user = user;
	}
	
	public Status getStatus() {
		return status;
	}
	
	public void setStatus(Status status) {
		this.status = status;
	}
}