package models;

import java.sql.*;

public class ToDoStep {
	private Integer todostepId;
	private Integer sequence;
	private String todostep;
	private ToDoList toDoList;
	private Status status;
	

	public static void saveToDoSteps(Integer todoListId,String[] steps){
		Connection con = null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/todoapp?user=root&password=1234");

			String query = "insert into todosteps (todolist_id,sequence,todostep) value (?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setInt(1,todoListId);
			int i = 1;
			for(String step : steps){
				ps.setInt(2,i++);
				ps.setString(3,step);
				ps.executeUpdate();
			}			

		}catch(SQLException|ClassNotFoundException e){
			e.printStackTrace();	
		}finally{
			try{con.close();}catch(SQLException e){e.printStackTrace();	}
		}
	}

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
	
	public void setSequence(Integer sequence){
		this.sequence = sequence;
	}

	public Integer getSequence(){
		return sequence;
	}
}
