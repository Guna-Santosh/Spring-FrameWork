package com.spring.jdbc.ORM;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.DAO.StudentDAO;
import com.spring.jdbc.Entity.Student;

@SuppressWarnings({ "resource", "unused" })
public class App 
{
	public static void main( String[] args )
    {
    	 ApplicationContext ob=new ClassPathXmlApplicationContext("config.xml");
    	 StudentDAO bean = ob.getBean("StudentDAO",StudentDAO.class);
    	 Student stu=new Student();
    	 int i = bean.insert(stu);
    	 
    	 System.out.println("create "+i);
    }
}