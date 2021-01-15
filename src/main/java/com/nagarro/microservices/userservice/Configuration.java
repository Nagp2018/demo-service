package com.nagarro.microservices.userservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


import lombok.Data;

@Data
@Component
@ConfigurationProperties("user-service")
public class Configuration {
	
	private int sla;

	public int getSla() {
		return sla;
	}

	public void setSla(int sla) {
		this.sla = sla;
	}
	
	


}
