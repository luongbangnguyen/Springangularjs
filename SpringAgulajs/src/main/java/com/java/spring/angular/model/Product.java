package com.java.spring.angular.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.java.model.Model;

@Entity
@Table
public class Product extends Model{
	private String name;
	private String type;
	private TypeProduct typeProduct;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	@ManyToOne
	public TypeProduct getTypeProduct() {
		return typeProduct;
	}
	public void setTypeProduct(TypeProduct typeProduct) {
		this.typeProduct = typeProduct;
	}
	
	
}
