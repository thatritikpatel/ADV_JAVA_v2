package models;

public class Status{
//##########VARIABLES#############
	private Integer statusId;
	private String status;

//############SETTER-GETTER#########
	public void setStatusId(Integer statusId){
		this.statusId=statusId;
	}

	public Integer getStatusId(){
		return statusId;
	}

	public void setStatus(String status){
		this.status=status;
	}

	public String getStatus(){
		return status;
	}
}