package models;

import java.sql.*;

public class Student{
	private Integer studentId;
	private String name;
	private String email;
	private String degree;
	private String branch;
	private String semester;

	public boolean saveStudent(){
		boolean flag = false;

		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mvcdb61?user=root&password=1234");
			
			String query = "insert into students (name,degree,branch,semester,email) value (?,?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(query,Statement.RETURN_GENERATED_KEYS);

			pst.setString(1,name);
			pst.setString(2,degree);
			pst.setString(3,branch);
			pst.setString(4,semester);
			pst.setString(5,email);

			int rowsAffected = pst.executeUpdate();			
			
			if(rowsAffected==1){
				ResultSet rst = pst.getGeneratedKeys();
				if(rst.next()){
					studentId = rst.getInt(1);
				}
				flag = true;
			}			

			con.close();
		}catch(SQLException|ClassNotFoundException e){
			e.printStackTrace();
		}

		return flag;
	}
	
	public void setSemester(String semester){
		this.semester = semester;
	}

	public String getSemester(){
		return semester;
	}

	public void setBranch(String branch){
		this.branch = branch;
	}

	public String getBranch(){
		return branch;
	}


	public void setDegree(String degree){
		this.degree = degree;
	}

	public String getDegree(){
		return degree;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setStudentId(Integer studentId){
		this.studentId = studentId;
	}

	public Integer getStudentId(){
		return studentId;
	}
}