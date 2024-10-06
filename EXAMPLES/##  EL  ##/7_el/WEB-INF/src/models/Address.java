package models;

public class Address{
	private City city;
	private State state;

	public void setState(State state){
		this.state = state;
	}

	public State getState(){
		return state;
	}

	public void setCity(City city){
		this.city = city;
	}

	public City getCity(){
		return city;
	}
}