package com.example.dummy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroserviceTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceTwoApplication.class, args);
	}

}
