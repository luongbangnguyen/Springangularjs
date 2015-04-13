package com.java.spring.angular.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Index;
import javax.persistence.Table;

import com.java.model.Model;

@Entity
@Table(name="role",indexes={@Index(columnList = "email,fistName,lastName")})
public class Role extends Model{
	
	public enum roles{ROLE_USER, ROLE_ADMIN}
	
	private roles roleName;
	
	@Enumerated(EnumType.STRING)
	public roles getRoleName() {
		return roleName;
	}
	public void setRoleName(roles roleName) {
		this.roleName = roleName;
	}
	
}
