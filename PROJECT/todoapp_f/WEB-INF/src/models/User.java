package models;

import java.sql.*;

public class User{
	//########## VARIABLES #############
	private Integer userId;
	private String userName;
	private String email;
	private String password;
	private Timestamp created;
	private Country country;
	private Status status;
	private String mobile;
	
	//########## OTHER METHODS #############
	public boolean signupUser(){
		boolean flag  = false;
		Connection con = null;

		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/todoapp?user=root&password=1234");

			String query = "insert into users (user_name,email,password,created,country_id,mobile) value (?,?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setString(1,userName);
			ps.setString(2,email);
			ps.setString(3,password);
			ps.setTimestamp(4,new Timestamp(new java.util.Date().getTime()));
			ps.setInt(5,country.getCountryId());
			ps.setString(6,mobile);

			int res = ps.executeUpdate();

			if(res==1){
				flag = true;
			}
			
		}catch(ClassNotFoundException|SQLException e){
			e.printStackTrace();
		}finally{
			try{con.close();}catch(SQLException e){ e.printStackTrace();}
		}

		return flag;
	}

	//############ SETTER-GETTER #########
	public void setUserId(Integer userId){
		this.userId=userId;
	}

	public Integer getUserId(){
		return userId;
	}

	public void setUserName(String userName){
		this.userName=userName;
	}

	public String getUserName(){
		return userName;
	}

	public void setEmail(String email){
		this.email=email;
	}

	public String getEmail(){
		return email;
	}

	public void setPassword(String password){
		this.password=password;
	}

	public String getPassword(){
		return password;
	}
	
	public void setCreated(Timestamp created){
		this.created=created;
	}

	public Timestamp getCreated(){
		return created;
	}

	public void setCountry(Country country){
		this.country=country;
	}

	public Country getCountry(){
		return country;
	}

	public void setStatus(Status status){
		this.status=status;
	}

	public Status getStatus(){
		return status;
	}

	public void setMobile(String mobile){
		this.mobile = mobile;
	}
	public String getMobile(){
		return mobile;
	}
}