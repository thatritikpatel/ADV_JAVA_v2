package models;

public class Country{
//##########VARIABLES#############
	private Integer countryId;
	private String country;

	public Country(){
	
	}

	public Country(Integer countryId){
		this.countryId = countryId;
	}

//############SETTER-GETTER#########
	public void setCountryId(Integer countryId){
		this.countryId=countryId;
	}

	public Integer getCountryId(){
		return countryId;
	}

	public void setCountry(String country){
		this.country=country;
	}

	public String getCountry(){
		return country;
	}
}