package com.java.spring.angular.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.java.model.Model;

@Entity
@Table
public class TypeProduct extends Model{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
