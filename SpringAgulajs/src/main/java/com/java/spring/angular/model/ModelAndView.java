package com.java.spring.angular.model;

import java.io.Serializable;

public class ModelAndView implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Meta meta;
	private Object data;

	public Meta getMeta() {
		return meta;
	}
	
	public ModelAndView() {
		
	}
	
	public ModelAndView(Object data){
		this.meta = new Meta(Meta.error200,"Success");
		this.data = data;
	}

	public void setMeta(Meta meta) {
		this.meta = meta;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
