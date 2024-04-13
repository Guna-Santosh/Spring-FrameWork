package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/c1")
//@Service
public class Controller2 
{

	@RequestMapping("/delete")
	public String delete()
	{
		return "delete";
		
	}
	
	
}
