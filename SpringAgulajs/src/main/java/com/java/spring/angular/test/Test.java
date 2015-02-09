package com.java.spring.angular.test;

import com.java.spring.angular.model.User;

public class Test {
	public static void main(String[] args) {
		User user = new User.Builder("test@java.com").fistName("luong bang").lastName("nguyen").build();
		System.out.println(user.getEmail());
		System.out.println(user.getFistName());
		System.out.println(user.getLastName());
		System.out.println(user.getPassword());
	}

}
