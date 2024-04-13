package com.hrms.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController 
{
	

	@RequestMapping(value = "test1", method = RequestMethod.GET)
	public String test() {
		return "test";
	}
}
