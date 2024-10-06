package models;

public class Country{
	private Integer countryId;
	private String country;

	public void setCountry(String country){
		this.country = country;
	}

	public String getCountry(){
		return country;
	}

	public void setCountryId(Integer countryId){
		this.countryId = countryId;
	}

	public Integer getCountryId(){
		return countryId;
	}
}