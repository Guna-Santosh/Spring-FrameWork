package com.hrms.beancomponents;

import java.sql.Timestamp;

import org.springframework.stereotype.Component;

@Component
public class Users 
{
	private String mail_id;
	private String password;
	private String active;
	private String role;
	private Timestamp date_time;
	
	public String getMailid() {
		return mail_id;
	}
	public void setMailid(String mailid) {
		this.mail_id = mailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Timestamp getDate() {
		return date_time;
	}
	public void setDate(Timestamp date) {
		this.date_time = date;
	}
}
