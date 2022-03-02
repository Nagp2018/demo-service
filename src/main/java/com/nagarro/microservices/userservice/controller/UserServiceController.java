package com.nagarro.microservices.userservice.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.ImmutableList;
import com.nagarro.microservices.userservice.Configuration;



@RestController
@RequestMapping("/api/user")
public class UserServiceController {

	
	@Autowired
	Configuration configuration;
	
	
	
	@GetMapping("/test")
	public String getOrderTest() {
		
		return "Welcome to NAGP Batch 2022 : Microservices Session 3";
	}

	
	
	
	

}

