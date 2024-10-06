package models;

public class TodoStep{
//##########VARIABLES#############
	private Integer todostepId;
	private String todostep;
	private TodoList todolist;
	private Status status;

//############SETTER-GETTER#########
	public void setTodostepId(Integer todostepId){
		this.todostepId=todostepId;
	}

	public Integer getTodostepId(){
		return todostepId;
	}

	public void setTodostep(String todostep){
		this.todostep=todostep;
	}

	public String getTodostep(){
		return todostep;
	}

	public void setTodolist(TodoList todolist){
		this.todolist=todolist;
	}

	public TodoList getTodolist(){
		return todolist;
	}

	public void setStatus(Status status){
		this.status=status;
	}

	public Status getStatus(){
		return status;
	}

}