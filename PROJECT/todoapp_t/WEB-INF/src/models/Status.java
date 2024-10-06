package models;


public class Status{
	private Integer statusId;
	private String status;

	public static final int ACTIVE = 1; 

	public void setStatus(String status){
		this.status = status;
	}

	public String getStatus(){
		return status;
	}

	public void setStatusId(Integer statusId){
		this.statusId = statusId;
	}

	public Integer getStatusId(){
		return statusId;
	}
}