package models;

public class ToDoStep {
	private Integer todostepId;
	private String todostep;
	private ToDoList toDoList;
	private Status status;
	
	public Integer getTodostepId() {
		return todostepId;
	}
	
	public void setTodostepId(Integer todostepId) {
		this.todostepId = todostepId;
	}
	
	public String getTodostep() {
		return todostep;
	}
	
	public void setTodostep(String todostep) {
		this.todostep = todostep;
	}
	
	public ToDoList getToDoList() {
		return toDoList;
	}
	
	public void setToDoList(ToDoList toDoList) {
		this.toDoList = toDoList;
	}
	
	public Status getStatus() {
		return status;
	}
	
	public void setStatus(Status status) {
		this.status = status;
	}	
}
