package com.hrms.beancomponents;

import java.sql.Timestamp;

import org.springframework.stereotype.Component;

@Component
public class MaintenanceVacancies
{
   private int id;
   private String domain;
   private String field;
   private int experience;
   private String location;
   private String active;
   private Timestamp dateandtime;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getDomain() {
	return domain;
}
public void setDomain(String domain) {
	this.domain = domain;
}
public String getField() {
	return field;
}
public void setField(String field) {
	this.field = field;
}
public int getExperience() {
	return experience;
}
public void setExperience(int experience) {
	this.experience = experience;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getActive() {
	return active;
}
public void setActive(String active) {
	this.active = active;
}
public Timestamp getDateandtime() {
	return dateandtime;
}
public void setDateandtime(Timestamp dateandtime) {
	this.dateandtime = dateandtime;
}
	
}
