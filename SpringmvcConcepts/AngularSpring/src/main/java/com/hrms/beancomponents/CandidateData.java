package com.hrms.beancomponents;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

//import net.bytebuddy.description.ByteCodeElement;

@Component
public class CandidateData {
	private String firstname;
	private String lastname;
	private long phoneno;
	private String Qualification;
	private byte[] resume;
	
	public String getFirstname() {
		return firstname;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}

	public String getQualification() {
		return Qualification;
	}

	public void setQualification(String qualification) {
		Qualification = qualification;
	}
	public byte[] getResume() 
	{
		return resume;
	}
	
	public void setResume(byte[] resume)
	{
		this.resume = resume;
	}
}



//	private Blob resume;
//	public Blob getResume() {
//		return resume;
//	}
//	public void setResume(Blob resume) {
//		this.resume = resume;
//	}

//	private String resume;
//		public String getResume() {
//		return resume;
//	}
//	public void setResume(String resume) {
//		this.resume = resume;
//	}


//	private File resume;
//	public void setResume(File resume) {
//		this.resume = resume;
//	}
//	public void setResume(File resume) {
//		this.resume = resume;
//	}

//private MultipartFile resume;
//	public MultipartFile getResume() {
//	return resume;
//}
//
//public void setResume(MultipartFile resume) {
//	this.resume = resume;
//}