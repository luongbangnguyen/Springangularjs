package test;

import com.java.spring.angular.model.User;

public class Test {
	public static void main(String[] args) {
		User u = new User("luongbangvh@gmail.com");
		System.out.println(u.getEmail());
		System.out.println(u.getFistName());
		System.out.println(u.getLastName());
	}
}
