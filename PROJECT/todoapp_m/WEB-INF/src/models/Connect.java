package models;

import java.sql.Timestamp;

public class Connect {
	private Integer connectId;
	private User userA;
	private User userB;
	private Timestamp created;
	private Status status;
	
	public Integer getConnectId() {
		return connectId;
	}
	
	public void setConnectId(Integer connectId) {
		this.connectId = connectId;
	}
	
	public User getUserA() {
		return userA;
	}
	
	public void setUserA(User userA) {
		this.userA = userA;
	}
	
	public User getUserB() {
		return userB;
	}
	
	public void setUserB(User userB) {
		this.userB = userB;
	}
	
	public Timestamp getCreated() {
		return created;
	}
	
	public void setCreated(Timestamp created) {
		this.created = created;
	}
	
	public Status getStatus() {
		return status;
	}
	
	public void setStatus(Status status) {
		this.status = status;
	}	
}
