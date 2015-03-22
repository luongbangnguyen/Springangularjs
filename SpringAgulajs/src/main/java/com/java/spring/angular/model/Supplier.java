package com.java.spring.angular.model;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.Table;

import com.java.model.ModelProduct;

@Entity
@Table(name="supplier", indexes=@Index(columnList = "code, name"))
public class Supplier extends ModelProduct{

}
