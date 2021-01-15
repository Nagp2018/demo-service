package com.nagarro.microservices.userservice;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import org.springframework.cloud.openfeign.EnableFeignClients;



@EnableFeignClients("com.nagarro.microservices.userservice")
@SpringBootApplication
@EnableAutoConfiguration
public class UserServiceApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
	}
	
	


}
