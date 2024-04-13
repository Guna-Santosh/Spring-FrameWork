package com.spring.dao;

import java.io.File;

import javax.servlet.http.Part;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.spring.bean.EmpData;

@Repository
//@Service
public class InsertDao 
{	
@Autowired
private JdbcTemplate template;
	

	public void addindData(EmpData emp) 
	{
		
//		File file = new File(emp.getFile()) ;emp.getFile();
//		Part fileparth= (Part) emp.getFile();
//		String s1=fileparth.getSubmittedFileName();
		int update = template.update("insert into boss values(?,?,?,?,?)",
				emp.getId(),  emp.getName(),
				emp.getAge(), emp.getAddress(),emp.getFile()
			);
System.out.println("rows = " + update);
		
	}	
}
