package com.zip;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class McZipCodeValidatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(McZipCodeValidatorApplication.class, args);
	}

}
