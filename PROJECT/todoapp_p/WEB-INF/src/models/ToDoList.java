package models;

import java.sql.*;

import java.util.*;

public class ToDoList{
	private Integer todoListId;
	private String title;
	private Timestamp created;
	private User user;
	private Status status;
	private ToDoType toDoType;
	private String textNote;

	public ToDoList(){
	
	}

	public ToDoList(Integer todoListId){
		this.todoListId = todoListId;
	}

	public ToDoList(String title,User user,ToDoType toDoType){
		this.title = title;
		this.user = user;
		this.toDoType = toDoType;
	}


	public void getTodo(){
		Connection con = null;

		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/todoapp?user=root&password=1234");

			String query = "select title,created,todotype_id,textnote from todolist where todolist_id=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1,todoListId);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				title = rs.getString(1);
				created = rs.getTimestamp(2);
				toDoType = new ToDoType(rs.getInt(3));
				textNote = rs.getString(4);	
			}

		}catch(SQLException|ClassNotFoundException e){
			e.printStackTrace();
		}finally{
			try{ con.close();}catch(SQLException e){e.printStackTrace();}
		}
	}

	public boolean saveToDo(){
		boolean flag = false;

		Connection con = null;

		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/todoapp?user=root&password=1234");

			String query = "insert into todolist (title,created,user_id,todotype_id) value (?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);
			ps.setString(1,title);
			ps.setTimestamp(2,new Timestamp(new java.util.Date().getTime()));
			ps.setInt(3,user.getUserId());
			ps.setInt(4,toDoType.getToDoTypeId());

			int res = ps.executeUpdate();
			if(res==1){
				flag = true;
				ResultSet rs = ps.getGeneratedKeys();
				if(rs.next()){
					todoListId = rs.getInt(1);
				}
			}

		}catch(SQLException|ClassNotFoundException e){
			e.printStackTrace();
		}finally{
			try{con.close();}catch(SQLException e){e.printStackTrace();	}
		}

		return flag;
	}

	public static ArrayList<ToDoList> collectAllToDos(int userId){
		ArrayList<ToDoList> todos = new ArrayList();

		Connection con = null;

		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/todoapp?user=root&password=1234");

			String query = "select todolist_id,title,created,todotype_id from todolist where user_id=? and status_id=1;";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1,userId);

			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				ToDoList todo = new ToDoList();
				todo.todoListId = rs.getInt(1);
				todo.title = rs.getString(2);
				todo.created = rs.getTimestamp(3);
				todo.toDoType = new ToDoType(rs.getInt(4));

				//System.out.println(todo.title);

				todos.add(todo);
			}
		
		}catch(SQLException|ClassNotFoundException e){
			e.printStackTrace();
		}finally{
			try{con.close();}catch(SQLException e){e.printStackTrace();}
		}

		return todos;
	}


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