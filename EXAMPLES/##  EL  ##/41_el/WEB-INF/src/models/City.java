package models;

import java.util.ArrayList;
import java.sql.*;

public class City{
	private Integer cityId;
	private String city;

	public static ArrayList<City> collectCities(){
		ArrayList<City> cities = new ArrayList<City>();
		Connection con = null;

		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/global?user=root&password=1234");
			
			String query = "select city_id,city from cities";
			PreparedStatement p = con.prepareStatement(query);

			ResultSet r = p.executeQuery();

			while(r.next()){
				City c = new City();
				c.cityId = r.getInt(1);
				c.city = r.getString(2);

				cities.add(c);
			}

			con.close();
		}catch(ClassNotFoundException|SQLException e){
			e.printStackTrace();
		}

		return cities;
	}

	public void setCityId(Integer cityId){
		this.cityId = cityId;
	}

	public Integer getCityId(){
		return cityId;
	}

	public void setCity(String city){
		this.city = city;
	}

	public String getCity(){
		return city;
	}
}