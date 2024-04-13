package com.spring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.bean.EmpData;

@Repository
public class InsertDao 
{
	
@Autowired
private JdbcTemplate template;
	
	public void addindData(EmpData emp) 
	{
		
		int update = template.update("insert into boss values(?,?,?,?)",
				emp.getId(),  emp.getName(),
				emp.getAge(), emp.getAddress()
			);
System.out.println("rows = " + update);
		
	}	
}
