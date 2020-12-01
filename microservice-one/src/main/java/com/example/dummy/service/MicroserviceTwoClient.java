package com.example.dummy.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * We are not using a circuit breaker like Hystrix.
 * We would use this in production to fall back to default values if microservice communication fails
 */
@FeignClient("microservice-two")
public interface MicroserviceTwoClient {
	
	@GetMapping("/instance")
    public String getMicroserviceTwoInstanceId();
}
