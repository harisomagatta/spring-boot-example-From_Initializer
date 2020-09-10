package com.example.springboot.awdefaultValues;

import org.springframework.stereotype.Component;

@Component
public class ADepartment {

	private String deptName;
	
	public ADepartment() {
		System.out.println("ADepartment instantiated");
		this.deptName = "MyDepartment";
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

}