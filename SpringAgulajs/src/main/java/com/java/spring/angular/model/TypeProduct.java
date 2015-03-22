package com.java.spring.angular.model;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.java.model.ModelProduct;

@Entity
@Table(name="typeProduct", indexes=@Index(columnList = "name"))
public class TypeProduct extends ModelProduct{
	
	@ManyToOne
	private Supplier supplier;

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}
	
	
}
