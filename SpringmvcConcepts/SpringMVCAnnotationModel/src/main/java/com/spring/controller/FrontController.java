package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.bean.EmpData;
import com.spring.dao.InsertDao;

@Controller
public class FrontController
{
	@Autowired
	private InsertDao dao;
	
   @RequestMapping("/DAOdata")
   public String addData(@ModelAttribute EmpData emp) 
   {
	   return "add";
   }
   
   @RequestMapping("/done")
   public String addedDB(@ModelAttribute EmpData emp) 
   {
	   dao.addindData(emp);
	   return "dbadd";
   }
   
	
	
}
