package models;

import java.sql.*;

import org.jasypt.util.password.StrongPasswordEncryptor;

public class User{
	static StrongPasswordEncryptor spe = new StrongPasswordEncryptor();

	private Integer userId;
	private String userName;
	private String email;
	private String password;

	public boolean signinUser(){
		boolean flag = false;

		Connection con = null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/passencdb?user=root&password=1234");

			String query = "select password,user_id,user_name from users where email=?";

			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setString(1,email);

			ResultSet rs = ps.executeQuery();
			
			if(rs.next()){
				if(spe.checkPassword(password,rs.getString(1))){
					userId = rs.getInt(2);
					userName = rs.getString(3);
					flag = true;
				}
			}
		
		}catch(SQLException|ClassNotFoundException e){
			e.printStackTrace();	
		}finally{
			try{con.close();}catch(SQLException e){e.printStackTrace();}
		}

		return flag;
	} 

	public boolean signupUser(){
		boolean flag = false;

		Connection con = null;
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/passencdb?user=root&password=1234");

			String query = "insert into users (user_name,email,password) value (?,?,?)";

			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1,userName);
			ps.setString(2,email);
			ps.setString(3,spe.encryptPassword(password));

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