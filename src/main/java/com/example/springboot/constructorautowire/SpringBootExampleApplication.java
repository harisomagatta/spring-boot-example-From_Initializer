package com.example.springboot.constructorautowire;

import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootExampleApplication {
	
	/**
	 * Example to show how the logger works. - watch for log statements in console instead of system out.
	 * Also Constructor dependency Injection is used
	 */

	static Logger log = Logger.getLogger(SpringBootExampleApplication.class.getName());
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootExampleApplication.class, args);
		log.info("About to create Employee Bean ");
		Employee emp = context.getBean(Employee.class);
		log.info(" Employee Bean Created");
		emp.setEid(104);
		emp.setEname("Spring Framework Guru");
		emp.showEmployeeDetails();
	}

}
