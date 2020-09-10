/**
 * 
 */
package com.example.springboot.constructorautowire;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author Hari Somagatta
 *
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {

	// Notice Logger here ******************
	private static final Logger logger = LogManager.getLogger(Employee.class);

	private int eid;
	private String ename;
	private Department department;

//	public Employee() {
//		logger.debug("Employee instance is creating.");
//
//	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Department getDepartment() {
		return department;
	}
	
	public void setDepartment(Department department) {
        this.department = department;
    }


	@Autowired
	public Employee(Department dept) {
		System.out.println("*** Autowiring by using @Autowire annotation on constructor ***");
		this.department = dept;
	}

	public void showEmployeeDetails() {
		try {
			logger.info("Employee Id : " + eid);
			System.out.println("Employee Id : " + eid);
			logger.info("Employee Name : " + ename);
			department.setDeptName("Information Technology");
			logger.info("Department : " + department.getDeptName());
			throw new Exception("Hmmmm...Error occured");
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
	}
}