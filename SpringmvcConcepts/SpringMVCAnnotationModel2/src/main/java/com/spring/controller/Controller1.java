package com.spring.controller;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.bean.EmpData;
import com.spring.dao.InsertDao;

@Controller
//@RequestMapping("/c1")
public class Controller1
{
   @Autowired
   private InsertDao dao;
   @RequestMapping("/DAOdata")
   public String addData(@ModelAttribute EmpData emp)   {
	   
	   
	   System.out.println("hi");
	   return "add";
   }
   
   @RequestMapping("/done")
   public String addedDB(@ModelAttribute EmpData emp) 
   {
//	   System.out.println("bye");
//	   File file = emp.getFile();
//	 
//	   EmpData emp2 = emp;
	   
	   dao.addindData(emp);
	   
	   System.out.println(emp.getId());
	   System.out.println(emp.getName());
	   System.out.println(emp.getAddress());
//	   File file = emp.getFile();
	   System.out.println(emp.getFile());
//	   System.out.println(emp.getSlot());
//	   System.out.println(emp.getDomain());
//	   System.out.println(emp.getExperince());
//	   
//	   System.out.println(emp.getFile());
	   return "dbadd";
   }
   
   
	
	
}
