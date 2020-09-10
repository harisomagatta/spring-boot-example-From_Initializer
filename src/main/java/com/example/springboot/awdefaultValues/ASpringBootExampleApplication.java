package com.example.springboot.awdefaultValues;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ASpringBootExampleApplication {


	/**
	 * Example to show default values set for Employee and displaying them with @Autowire
	 * @param args
	 */
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ASpringBootExampleApplication.class, args);
		AEmployee aEmployee = context.getBean(AEmployee.class);
		
		aEmployee.showEmployeeDetails();
	}
	
}
