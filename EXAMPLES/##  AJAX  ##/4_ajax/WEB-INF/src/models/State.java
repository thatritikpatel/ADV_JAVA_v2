package models;

import java.sql.*;
import java.util.*;

public class State {
	private Integer stateId;
	private String stateName;

	public State(){
	
	}

	public State(Integer stateId,String stateName){
		this.stateId = stateId;
		this.stateName = stateName;
	}

	public static ArrayList<State> collectStates(){
		ArrayList<State> states = new ArrayList<State>();

		Connection con = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/4ajaxdb?user=root&password=1234");

			String query = "select * from states order by state_id";
			PreparedStatement ps = con.prepareStatement(query);

			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				states.add(new State(rs.getInt(1),rs.getString(2)));
			}

		}catch(SQLException|ClassNotFoundException e){
			e.printStackTrace();
		}finally{
			try{con.close(); }catch(SQLException e){e.printStackTrace();}	
		}

		return states;
	} 
	
	public Integer getStateId() {
		return stateId;
	}
	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}	
}
