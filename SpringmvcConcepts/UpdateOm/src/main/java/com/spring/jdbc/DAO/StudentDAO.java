package com.spring.jdbc.DAO;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.jdbc.Entity.Student;

public class StudentDAO 
{
	
	private HibernateTemplate template;
	
	
	public HibernateTemplate getTemplate() {
		return template;
	}


	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}


	public int insert(Student stu) {
		
		this.template.save(stu);
		return 1;
		
	}
}
