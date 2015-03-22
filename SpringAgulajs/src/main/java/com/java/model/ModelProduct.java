package com.java.model;

import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@MappedSuperclass
@Table(uniqueConstraints=@UniqueConstraint(columnNames = {"code"}))
public class ModelProduct extends Model{
	private String code;
	private String name;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
