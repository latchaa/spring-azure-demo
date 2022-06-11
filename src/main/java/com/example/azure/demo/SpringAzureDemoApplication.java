package com.example.azure.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringAzureDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAzureDemoApplication.class, args);
	}
	@Getmapping("/azureint")
	public String message(){
		return "Welcome to Azure portal!!!"
	}
}
