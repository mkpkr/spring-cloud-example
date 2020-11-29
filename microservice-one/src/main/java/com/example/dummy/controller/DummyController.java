package com.example.dummy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyController {
	
	private String applicationName;
	private String instanceId;
	
	@Autowired
	public DummyController(@Value("${spring.application.name}") String applicationName, 
			               @Value("${eureka.instance.instance-id}") String instanceId) {
		this.applicationName = applicationName;
		this.instanceId = instanceId;
	}

	@GetMapping("/")
	public String dummyEndpoint() {
		return "Welcome to " + applicationName + ", you are on instance " + instanceId;
		
	}

}
