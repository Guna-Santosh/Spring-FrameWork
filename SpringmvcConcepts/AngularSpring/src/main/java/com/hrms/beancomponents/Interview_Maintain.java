package com.hrms.beancomponents;

import org.springframework.stereotype.Component;

@Component
public class Interview_Maintain 
{
	String domain;
	String experince;
	String slot;
	
	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	
	public String getExperince() {
		return experince;
	}

	public void setExperince(String experince) {
		this.experince = experince;
	}

	public String getSlot() {
		return slot;
	}

	public void setSlot(String slot) {
		this.slot = slot;
	}

}

//	int id;
//	String Date_time;

//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}

//	public String getDate_time() {
//		return Date_time;
//	}
//	public void setDate_time(String date_time) {
//		this.Date_time = date_time;
//	}
//	