package models;

public class TodoTeam{
//##########VARIABLES#############
	private Integer todoteamId;
	private TodoList todolist;
	private User user;
	private Status status;

//############SETTER-GETTER#########
	public void setTodolistId(Integer todoteamId){
		this.todoteamId=todoteamId;
	}

	public Integer getTodolistId(){
		return todoteamId;
	}

	public void setTodolist(TodoList todolist){
		this.todolist=todolist;
	}

	public TodoList getTodolist(){
		return todolist;
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