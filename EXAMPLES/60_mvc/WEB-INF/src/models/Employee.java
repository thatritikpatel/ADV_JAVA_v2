package models;

import java.sql.*;

public class Employee{
	private Integer employeeId;
	private String name;
	private String email;
	private String password;
	private Integer age;

	public boolean saveEmployee(){
		boolean flag = false;

		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mvcdb60?user=root&password=1234");
			
			String query = "insert into employees (name,email,password,age) value (?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(query);

			pst.setString(1,name);
			pst.setString(2,email);
			pst.setString(3,password);
			pst.setInt(4,age);

			int res = pst.executeUpdate();

			if(res==1){
				flag = true;	
			}

			con.close();
		}catch(SQLException|ClassNotFoundException e){
			e.printStackTrace();
		}

		return flag;
	}
	
	public void setAge(Integer age){
		this.age = age;
	}

	public Integer getAge(){
		return age;
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
	
	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;	
	}

	public void setEmployeeId(Integer employeeId){
		this.employeeId = employeeId;
	}

	public Integer getEmployeeId(){
		return employeeId;
	}
}