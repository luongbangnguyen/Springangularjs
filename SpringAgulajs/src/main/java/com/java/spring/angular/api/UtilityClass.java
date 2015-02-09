package com.java.spring.angular.api;

public class UtilityClass {
	private UtilityClass(){
		throw new AssertionError();
	}
	public static void print(){
		System.out.println("print ---------------");
	}
	
	public static void main(String[] args) {
		UtilityClass.print();
	}
}
