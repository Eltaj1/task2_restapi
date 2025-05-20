package com.restapi.apifirst;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "First Rest API",
				version = "1.0",
				description = "Our First Spring Boot REST API"
		)
)
public class ApifirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApifirstApplication.class, args);
	}
}