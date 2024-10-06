package models;

import java.sql.*;
import java.util.ArrayList;

public class Student{
	//############ Properties ###################
	private Integer studentId;
	private String name;
	private String college;
	private String degree;
	private String gender;
	private String course;
	
	//############ Constructors #################
	public Student(Integer studentId){
		this.studentId = studentId;
	}
	
	public Student(String name,String college,String degree,String gender,String course){
		this.name = name;
		this.college = college;
		this.degree = degree;
		this.gender = gender;
		this.course = course;
	}

	public Student(Integer studentId,String name,String college,String degree,String gender,String course){
		this.studentId = studentId;
		this.name = name;
		this.college = college;
		this.degree = degree;
		this.gender = gender;
		this.course = course;
	}
	
	//############ Methods #################
	public void updateStudent(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mvcdb63?user=root&password=1234");
			
			String query = "update students set name=?,college=?,gender=?,degree=?,course=? where student_id=?";
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setString(1,name);
			ps.setString(2,college);
			ps.setString(3,gender);
			ps.setString(4,degree);
			ps.setString(5,course);

			ps.setInt(6,studentId);

			ps.executeUpdate();

			con.close();
		}catch(SQLException|ClassNotFoundException e){
			e.printStackTrace();
		}
	}

	public void getStudentRecord(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mvcdb63?user=root&password=1234");
			
			String query = "select * from students where student_id=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setInt(1,studentId);

			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				name = rs.getString(2);
				college = rs.getString(3);
				degree = rs.getString(4);
				gender = rs.getString(5);
				course = rs.getString(6);
			}

			con.close();
		}catch(SQLException|ClassNotFoundException e){
			e.printStackTrace();
		}
	}

	public static void deleteStudent(Integer studentId){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mvcdb63?user=root&password=1234");
			
			String query = "delete from students where student_id=?";
			PreparedStatement ps = con.prepareStatement(query);
			
			ps.setInt(1,studentId);
			
			ps.executeUpdate();

			con.close();
		}catch(SQLException|ClassNotFoundException e){
			e.printStackTrace();
		}
	}
		

	public static ArrayList<Student> collectAllStudents(){
		ArrayList<Student> students = new ArrayList<Student>();

		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mvcdb63?user=root&password=1234");
			
			String query = "select * from students";
			PreparedStatement ps = con.prepareStatement(query);

			ResultSet rs = ps.executeQuery();

			while(rs.next()){
				Student s = new Student(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
				students.add(s);
				//or
				//students.add(new Student(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)));
			}
			
			con.close();
		}catch(SQLException|ClassNotFoundException e){
			e.printStackTrace();
		}

		return students;
	}

	public boolean saveStudent(){
		boolean flag = false;

		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mvcdb63?user=root&password=1234");
			
			String query = "insert into students (name,college,degree,gender,course) value (?,?,?,?,?)";
			PreparedStatement ps = con.prepareStatement(query);

			ps.setString(1,name);
			ps.setString(2,college);
			ps.setString(3,degree);
			ps.setString(4,gender);
			ps.setString(5,course);

			if(ps.executeUpdate()==1)
				flag = true;

			con.close();
		}catch(SQLException|ClassNotFoundException e){
			e.printStackTrace();
		}

		return flag;
	}
	

	//############ getter-setters #################
	public void setCourse(String course){
		this.course = course;
	}

	public String getCourse(){
		return course; 
	}

	public void setGender(String gender){
		this.gender = gender;	
	}

	public String getGender(){
		return gender;
	}

	public void setDegree(String degree){
		this.degree = degree;
	}
	
	public String getDegree(){
		return degree;
	}

	public void setCollege(String college){
		this.college = college;
	}

	public String getCollege(){
		return college;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setStudentId(Integer studentId){
		this.studentId = studentId;
	}

	public Integer getStudentId(){
		return studentId;
	}
}