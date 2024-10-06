package models;
import java.sql.*;
public class Connect{
//##########VARIABLES#############
	private Integer connectId;
	private Timestamp created;
	private User userA;
	private User userB;
	private Status status;

//############SETTER-GETTER#########
	public void setConnectId(Integer connectId){
		this.connectId=connectId;
	}

	public Integer getConnectId(){
		return connectId;
	}

	public void setCreated(Timestamp created){
		this.created=created;
	}

	public Timestamp getCreated(){
		return created;
	}

	public void setUserA(User userA){
		this.userA=userA;
	}

	public User getUserA(){
		return userA;
	}

	public void setUserB(User userB){
		this.userB=userB;
	}

	public User getUserB(){
		return userB;
	}

	public void setStatus(Status status){
		this.status=status;
	}

	public Status getStatus(){
		return status;
	}
}