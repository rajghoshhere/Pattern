package com.designpattern.bridge;

public class Employee {

	protected EmployeeLeave leave;
	public Employee(EmployeeLeave leave) {
		this.leave = leave;
	}
	void processLeave(){
		
	}
}
