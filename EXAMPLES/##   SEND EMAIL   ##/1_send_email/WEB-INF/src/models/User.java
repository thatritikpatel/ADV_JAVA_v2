package models;

import java.sql.*;

public class User{
	private Integer userId;
	private String userName;
	private String email;
	private String password;

	public User(){

	}

	public User(String email,String password){
		this.email = email;
		this.password = password;
	}


	public void signinUser(){
		Connection con = null;

		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/4fileuploaddb?user=root&password=1234");

			String query = "select user_id,user_name,pic_path from users where email=? and password=?";
			PreparedStatement ps = con.prepareStatement(query);

			ps.setString(1,email);
			ps.setString(2,password);

			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				userId = rs.getInt(1);
				userName = rs.getString(2);
			}
		}catch(ClassNotFoundException|SQLException e){
			e.printStackTrace();
		}finally{
			try{ con.close(); }catch(SQLException e){e.printStackTrace();}
		}
	}


	public boolean signupUser(){
		boolean flag = false;
		Connection con = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/4fileuploaddb?user=root&password=1234");

			String query = "insert into users (user_name,email,password) value (?,?,?)";
			PreparedStatement pst = con.prepareStatement(query);

			pst.setString(1,userName);
			pst.setString(2,email);
			pst.setString(3,password);

			int res = pst.executeUpdate();
			
			if(res==1){
				flag = true;
			}

		}catch(ClassNotFoundException|SQLException e){
			e.printStackTrace();
		}finally{
			try{con.close();}catch(SQLException e){e.printStackTrace();}
		}

		return flag;
	}



	public void setPassword(String password){
		this.password = password;
	}

	public String getPassword(){
		return password;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setUserName(String userName){
		this.userName = userName;
	}

	public String getUserName(){
		return userName;
	}


	public void setUserId(Integer userId){
		this.userId = userId;
	}

	public Integer getUserId(){
		return userId;
	}
}