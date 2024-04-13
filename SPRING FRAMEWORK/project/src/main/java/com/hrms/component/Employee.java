package com.hrms.component;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	  	private String name;
	    private byte[] file;

	    public Employee() {
	        // Default constructor
	    }

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public byte[] getFile() {
			return file;
		}

		public void setFile(byte[] file) {
			this.file = file;
		}

}
