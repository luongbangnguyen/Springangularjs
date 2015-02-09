package com.java.spring.angular.model;

import java.io.Serializable;

public class User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String email;
	private String fistName;
	private String lastName;
	private String password;
	

	public User(String email){
		this(email,null);
	}
	
	public User(String email,String fistName){
		this(email, fistName,null);
	}
	
	public User(String email, String fistName, String lastName) {
		this.email = email;
		this.fistName = fistName;
		this.lastName = lastName;
	}
	
	public User(){
		
	}

	private User(Builder builder) {
		this.email = builder.email;
		this.fistName = builder.fistName;
		this.lastName = builder.lastName;
		this.password = builder.password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFistName() {
		return fistName;
	}

	public void setFistName(String fistName) {
		this.fistName = fistName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public static class Builder{
		private String email;
		private String fistName;
		private String lastName;
		private String password;
		
		public Builder(String email){
			this.email = email;
		}
		public Builder fistName(String value){
			this.fistName = value;
			return this;
		}
		public Builder lastName(String value){
			this.lastName = value;
			return this;
		}
		public Builder password(String value){
			this.password = value;
			return this;
		}
		
		public User build(){
			 return new User(this);
		}
	}
	

}
