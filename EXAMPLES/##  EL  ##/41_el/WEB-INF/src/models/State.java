package models;

import java.util.ArrayList;
import java.sql.*;

public class State{
	private Integer stateId;
	private String state;

	public static ArrayList<State> collectStates(){
		ArrayList<State> states = new ArrayList<State>();

		Connection con = null;

		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/global?user=root&password=1234");
			
			String query = "select state_id,state from states";
			PreparedStatement p = con.prepareStatement(query);

			ResultSet r = p.executeQuery();

			while(r.next()){
				State s = new State();
				s.stateId = r.getInt(1);
				s.state = r.getString(2);

				states.add(s);
			}

			con.close();
		}catch(ClassNotFoundException|SQLException e){
			e.printStackTrace();
		}

		return states;
	}

	public void setState(String state){
		this.state = state;
	}

	public String getState(){
		return state;
	}

	public void setStateId(Integer stateId){
		this.stateId = stateId;
	}

	public Integer getStateId(){
		return stateId;
	}
}