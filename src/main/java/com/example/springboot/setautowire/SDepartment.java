package com.example.springboot.setautowire;

import org.springframework.stereotype.Component;

@Component
public class SDepartment {

	private String deptName;

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

}