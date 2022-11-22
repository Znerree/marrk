package com.appdev.marrk.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_admin")
public class AdminEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int adminid;
	
	private String username;
	private String password;
	private String firstname;
	private String middlename;
	private String lastname; 
	

	public AdminEntity(int adminid,String username, String password ,String firstname, String middlename, String lastname) {
		super();
		this.adminid = adminid;
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.middlename = middlename; 
		this.lastname = lastname; 
	}
	
	public AdminEntity(){}

	//ADMIN ID
	public int getAdminid() {
		return adminid;
	}
	
	public void setAdminid(int courseid) {
		this.adminid = courseid;
	}
	
	//USERNAME
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	//PASSWORD
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	//FIRSTNAME
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	//MIDDLENAME
	public String getMiddlename() {
		return middlename;
	}
	
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	
	//LASTNAME
	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String middlename) {
		this.lastname = middlename;
	}
}