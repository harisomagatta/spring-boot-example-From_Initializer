/**
 * 
 */
package com.example.springboot.awdefaultValues;



import java.util.logging.Logger;

/**
 * @author Hari Somagatta
 *
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AEmployee {
	
	static Logger log = Logger.getLogger(AEmployee.class.getName());
	
	@Value("1000")
	private int eid;
	
	@Value("Harikrishna")
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