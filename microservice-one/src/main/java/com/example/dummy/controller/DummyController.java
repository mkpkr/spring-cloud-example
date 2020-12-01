package com.example.dummy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dummy.service.MicroserviceTwoClient;

@RestController
public class DummyController {
	
	private String applicationName;
	private String instanceId;
	private MicroserviceTwoClient microserviceTwoClient;
	
	@Autowired
	public DummyController(@Value("${spring.application.name}") String applicationName, 
			               @Value("${eureka.instance.instance-id}") String instanceId,
			               MicroserviceTwoClient microserviceTwoClient) {
		this.applicationName = applicationName;
		this.instanceId = instanceId;
		this.microserviceTwoClient = microserviceTwoClient;
	}

	@GetMapping("/")
	public String hello() {
		//not handling any exceptions in microservice communication for this example application
		String microserviceTwoInstanceId = microserviceTwoClient.getMicroserviceTwoInstanceId();
		
		return String.format("Welcome to %s, you are on instance %s. I made a request to microservice-two and got instance %s", 
				applicationName, 
				instanceId, 
				microserviceTwoInstanceId);
	}

}
