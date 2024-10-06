package models;

public class Student{
	private String name;
	private Integer age;
	private String college;

	public Student(String name,Integer age,String college){
		this.name = name;
		this.age = age;
		this.college = college;
	}
	
	public void setCollege(String college){
		this.college = college;
	}

	public String getCollege(){
		return college;
	}

	public void setAge(Integer age){
		this.age = age;
	}

	public Integer getAge(){
		return age;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}
}