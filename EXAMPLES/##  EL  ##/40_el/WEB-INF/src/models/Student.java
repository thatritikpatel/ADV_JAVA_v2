package models;

import java.util.ArrayList;
import java.sql.*;

public class Student{
	private Integer studentId;
	private String studentName;
	private String email;
	private String password;

	public static ArrayList<Student> collectStudents(){
		ArrayList<Student> students = new ArrayList<Student>();
		Connection con = null;

		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/global?user=root&password=1234");
			
			String query = "select student_id,student_name,email,password from students";

			PreparedStatement p = con.prepareStatement(query);
			ResultSet r = p.executeQuery();

			while(r.next()){
				Student s = new Student();
				s.studentId = r.getInt(1);
				s.studentName = r.getString(2);
				s.email = r.getString(3);
				s.password = r.getString(4);

				students.add(s);
			}

			con.close();
		}catch(ClassNotFoundException|SQLException e){
			e.printStackTrace();
		}

		return students;
	}

	public void setStudentId(Integer studentId){
		this.studentId = studentId;	
	}

	public Integer getStudentId(){
		return studentId;
	}

	public void setStudentName(String studentName){
		this.studentName = studentName;
	}

	public String getStudentName(){
		return studentName;
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
}