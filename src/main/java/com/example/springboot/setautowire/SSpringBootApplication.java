/**
 * 
 */
package com.example.springboot.setautowire;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;



/**
 * @author Hari Somagatta
 *
 */
@SpringBootApplication
public class SSpringBootApplication {
	
	//Util logger
	static Logger logger = Logger.getLogger(SSpringBootApplication.class.getName());
	
	/***
	 * Example to see spring beans loaded using commandLineRunner
	 * 
	 * Also setter injection is used
	 */

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SSpringBootApplication.class, args);
		SEmployee emp = context.getBean(SEmployee.class);
		emp.setEid(104);
		emp.setEname("----->Spring Framework<----------");
		
		emp.showEmployeeDetails();
	}
	
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			logger.log(Level.INFO, "Let's inspect the beans provided by Spring Boot:");
			//System.out.println("Let's inspect the beans provided by Spring Boot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}

		};
	}

}
