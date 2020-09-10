/**
 * 
 */
package com.example.springboot.setautowire;



import java.util.logging.Logger;

/**
 * @author Hari Somagatta
 *
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SEmployee {
	
	static Logger log = Logger.getLogger(SEmployee.class.getName());
	
	private int eid;
	private String ename;
	private SDepartment department;

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

	public SDepartment getDepartment() {
		return department;
	}

	@Autowired
	//@Autowired(required=false)
	public void setDepartment(SDepartment department) {
		this.department = department;
	}

	public void showEmployeeDetails() {
		log.info("Employee Id : " + eid);
		System.out.println("Employee Id : " + eid);
		log.info("Employee Name : " + ename);
		department.setDeptName("Spppprrringgggggg");
		log.info("Department : " + department.getDeptName());
	}
}