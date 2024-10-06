package models;

import java.util.ArrayList;
import java.sql.*;

public class City {
	private Integer cityId;
	private String cityName;
	private State state;

	public City(){
	
	}

	public City(Integer cityId,String cityName){
		this.cityId = cityId;
		this.cityName = cityName;
	}

	public static ArrayList<City> collectCities(int stateId){
		ArrayList<City> cities = new ArrayList<City>();
		Connection con = null;

		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/4ajaxdb?user=root&password=1234");
		
			String query = "select city_id,city_name from cities where state_id=?";
			PreparedStatement ps = con.prepareStatement(query);

			ps.setInt(1,stateId);

			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				cities.add(new City(rs.getInt(1),rs.getString(2)));
			}
		}catch(SQLException|ClassNotFoundException e){
			e.printStackTrace();
		}finally{
			try{ con.close(); }catch(SQLException e){e.printStackTrace();}
		}

		return cities;
	}
	
	public Integer getCityId() {
		return cityId;
	}
	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
	
	
}
