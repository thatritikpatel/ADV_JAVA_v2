package models;
import java.sql.*;
public class User{
//##########VARIABLES#############
	private Integer userId;
	private String username;
	private String email;
	private String password;
	private Timestamp created;
	private Country country;
	private Status status;

//############SETTER-GETTER#########
	public void setUserId(Integer userId){
		this.userId=userId;
	}

	public Integer getUserId(){
		return userId;
	}

	public void setUserName(String username){
		this.username=username;
	}

	public String getUserName(){
		return username;
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

}