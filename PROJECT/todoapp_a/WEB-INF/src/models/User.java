package models;

import java.sql.*;

public class User{
	private Integer userId;
	private String userName;
	private String email;
	private String password;
	private Timestamp created;
	//private Integer countryId;
	private Country country;
	//private Integer statusId;
	private Status status;
}