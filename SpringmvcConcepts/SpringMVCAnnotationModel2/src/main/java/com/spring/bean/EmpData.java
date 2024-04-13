package com.spring.bean;

import java.io.File;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class EmpData {
	int id;
	String name;
	int age;
	String address;
//	String slot;
//	String domain;
//	String experince;
//	MultipartFile file;
	File file;
	


	
//	public String getDomain() {
//		return domain;
//	}
//
//	public void setDomain(String domain) {
//		this.domain = domain;
//	}
//
//	public String getExperince() {
//		return experince;
//	}
//
//	public void setExperince(String experince) {
//		this.experince = experince;
//	}
//
//	public String getSlot() {
//	return slot;
//}
//
//public void setSlot(String slot) {
//	this.slot = slot;
//}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

//	public MultipartFile getFile() {
//		return file;
//	}

//	public void setFile(MultipartFile file) {
//		this.file = file;
//	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

}
