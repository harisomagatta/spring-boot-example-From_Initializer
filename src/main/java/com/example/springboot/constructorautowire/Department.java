package com.example.springboot.constructorautowire;



import org.springframework.stereotype.Component;

@Component
public class Department {

	private String deptName;
	
	public Department() {
		System.out.println("Department instanance created");
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

}