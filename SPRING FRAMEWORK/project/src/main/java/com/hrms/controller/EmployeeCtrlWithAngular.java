package com.hrms.controller;
import java.io.IOException;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.hrms.component.Employee;
@RestController
@EnableWebMvc
@CrossOrigin(origins="http://localhost:4200")	
public class EmployeeCtrlWithAngular
{
//	@Autowired
//	@Qualifier("ob")
//	EmployeeService empService;
	@RequestMapping(value= "/person",method = RequestMethod.POST) 
	public void getAllEmployees( @RequestParam MultipartFile file) throws Exception 
	{
	System.out.println("hii");	
//	emp.setFileContent(emp.getFilename());	
	 byte[] fileData = file.getBytes();
//	 emp.setFile(fileData);
//	System.out.println(emp.getFile());
//	System.out.println(emp.getName());
//	System.out.println();	
	}
}
	