package com.java.spring.angular.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import com.java.model.Model;

/**
 * 
 * @author BangNL
 *
 */
@Entity
@Table(name="user",indexes={@Index(columnList = "email,fistName,lastName")})
public class User extends Model implements  Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String email;
	private String fistName;
	private String lastName;
	private String password;
	private String department;
	private Date dateOfBirth;
	private String gender;
	private String mobile;
	private String landLine;
	private String image;

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
	
	/**
	 * builder a object User
	 * @author BangNL
	 *
	 */
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
		
		/**
		 * execution builder object
		 * @return
		 */
		public User build(){
			 return new User(this);
		}
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getLandLine() {
		return landLine;
	}

	public void setLandLine(String landLine) {
		this.landLine = landLine;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
	

}
