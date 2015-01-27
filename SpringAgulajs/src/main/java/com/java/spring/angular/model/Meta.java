package com.java.spring.angular.model;

import java.io.Serializable;

public class Meta implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static String error403 = "403";
	public static String error200 = "200";
	
	private String code;
	private String description;
	
	
	public Meta() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Meta(String code, String description) {
		super();
		this.code = code;
		this.description = description;
	}



	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	

}
