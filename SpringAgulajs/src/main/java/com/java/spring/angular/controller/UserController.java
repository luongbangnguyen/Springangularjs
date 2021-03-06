package com.java.spring.angular.controller;


import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.java.spring.angular.model.ModelAndView;
import com.java.spring.angular.model.User;

/**
 * 
 * @author BangNL
 *
 */
@RestController
@Scope(value="session")
@RequestMapping(value="/api/user")
public class UserController implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5682297676874975387L;
	private User user;
	
	/**
	 * execution login for user in front end
	 * @param email
	 * @param password
	 * @return
	 */
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ModelAndView login( @RequestParam(value="email") String email, @RequestParam(value="password") String password){
		boolean check = email != null && password != null && email.trim().equals("test@liferay.com") && password.trim().equals("123456");
		if(check){
			setUser(new User("luongbangvh@gmail.com","luong bang", "nguyen"));
			return new ModelAndView(new Boolean(true));
		}
		return new ModelAndView(new Boolean(false));
	}
	
	/**
	 * remove session of user in front end
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping(value="/logout")
	public ModelAndView logout( HttpServletRequest request, 
	        HttpServletResponse response){
		
		HttpSession session = request.getSession(false);
		if(session!=null)
		session.invalidate();
		
		return new ModelAndView(new Boolean(true));
		
	}
	
	/**
	 * get user object, that used in front end
	 * @return
	 */
	@RequestMapping(value="/getUser")
	public ModelAndView getUserLogin(){
		return new ModelAndView(getUser());
	}
	
	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	
}
