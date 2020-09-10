/**
 * 
 */
package com.example.springboot.autowire;



import java.util.logging.Logger;

/**
 * @author Hari Somagatta
 *
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AEmployee {
	
	static Logger log = Logger.getLogger(AEmployee.class.getName());
	
	private int eid;
	private String ename;
	@Autowired
	private ADepartment department;
	
	public AEmployee() {
		System.out.println("AEmployee instantiated");
	}

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

	public ADepartment getDepartment() {
		return department;
	}

	public void showEmployeeDetails() {
		log.info("Employee Id : " + eid);
		System.out.println("Employee Id : " + eid);
		log.info("Employee Name : " + ename);
		//department.setDeptName("Information Technology");
		log.info("Department : " + department.getDeptName());
	}
}