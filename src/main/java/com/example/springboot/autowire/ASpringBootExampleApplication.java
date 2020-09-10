package com.example.springboot.autowire;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ASpringBootExampleApplication {
	
	/**
	 * Example to show the Springboot app with @Autowire for ADepartment
	 * @param args
	 */
	//static Logger log = Logger.getLogger(AEmployee.class.getName());
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ASpringBootExampleApplication.class, args);
		AEmployee emp = context.getBean(AEmployee.class);
		emp.setEid(104);
		emp.setEname("Spring Framework is awesome");
		emp.showEmployeeDetails();
	}

}
