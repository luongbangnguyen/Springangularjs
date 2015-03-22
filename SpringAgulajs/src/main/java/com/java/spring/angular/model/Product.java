package com.java.spring.angular.model;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.java.model.Model;
import com.java.model.ModelProduct;

@Entity
@Table(name="product",indexes={@Index(columnList = "name")})
public class Product extends ModelProduct{
	
	private TypeProduct typeProduct;
	@ManyToOne
	public TypeProduct getTypeProduct() {
		return typeProduct;
	}
	public void setTypeProduct(TypeProduct typeProduct) {
		this.typeProduct = typeProduct;
	}
	
	
}
