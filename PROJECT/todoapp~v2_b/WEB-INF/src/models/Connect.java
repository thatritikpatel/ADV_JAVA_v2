package models;

import java.sql.*;
import java.util.*;

public class Connect{
	private Integer connectId;
	private User fromUser;
	private User toUser;	
	private Status status;

	public Connect(){
		
	}

	public Connect(Integer connectId,User fromUser,User toUser,Status status){
		this.connectId = connectId;
		this.fromUser = fromUser;
		this.toUser = toUser;
		this.status = status;
	}

	public static ArrayList<Connect> collectAllConnections(Integer userId){
		ArrayList<Connect> connections = new ArrayList<Connect>();

		Connection con = null;

		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/todoapp?user=root&password=1234");
			
			String query = "select * from connects where from_user_id=? or to_user_id=?";
			PreparedStatement ps = con.prepareStatement(query);

			ps.setInt(1,userId);
			ps.setInt(2,userId);

			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				connections.add(Connect(rs.getInt(1),new User(rs.getInt(2)),new User(rs.getInt(3)),new Status(rs.getInt(3))));
			}

		}catch(SQLException|ClassNotFoundException e){
			e.printStackTrace();
		}finally{
			try{
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}

		
		return connections;
	}


	
	public Integer getConnectId() {
		return connectId;
	}
	
	public void setConnectId(Integer connectId) {
		this.connectId = connectId;
	}	
	
	public Status getStatus() {
		return status;
	}
	
	public void setStatus(Status status) {
		this.status = status;
	}
	
	public void setFromUser(User fromUser){
		this.fromUser = fromUser;
	}

	public User getFromUser(){
		return fromUser;
	}

	public void setToUser(User toUser){
		this.toUser = toUser;
	}

	public User getToUser(){
		return toUser;
	}
}
