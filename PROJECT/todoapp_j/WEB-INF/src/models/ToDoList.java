package models;

import java.sql.*;

public class ToDoList{
	private Integer todoListId;
	private String title;
	private Timestamp created;
	private User user;
	private Status status;
	private ToDoType toDoType;
	private String textNote;


	public boolean saveTextNote(){
		boolean flag = false;
		Connection con = null;

		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/todoapp?user=root&password=1234");

			String query = "insert into todolist (title,user_id,todotype_id,textnote,created) value (?,?,?,?,?)";

			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1,title);
			ps.setInt(2,user.getUserId());
			ps.setInt(3,toDoType.getToDoTypeId());
			ps.setString(4,textNote);
			ps.setTimestamp(5,new Timestamp(new java.util.Date().getTime()));

			int res = ps.executeUpdate();
		
			if(res==1){
				flag = true;
			}

		}catch(SQLException|ClassNotFoundException e){
			e.printStackTrace();
		}finally{
			try{con.close();}catch(SQLException e){e.printStackTrace();}
		}

		return flag;
	}
	
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

	public void setToDoType(ToDoType toDoType){
		this.toDoType = toDoType;
	}

	public ToDoType getToDoType(){
		return toDoType;
	}


	public String getTextNote() {
		return textNote;
	}
	
	public void setTextNote(String textNote) {
		this.textNote = textNote;
	}
}