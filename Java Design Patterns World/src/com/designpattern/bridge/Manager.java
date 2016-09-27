package com.designpattern.bridge;

public class Manager extends Employee {
	String employeeName;
	int numberOfDays;
	
	protected Manager(String employeeName, int numberOfDays, EmployeeLeave leave) {
		super(leave);
		this.employeeName = employeeName;
		this.numberOfDays = numberOfDays;
		
	}

	@Override
	void processLeave() {
		System.out.println("Processing leave for employee " + employeeName + " for " + numberOfDays + " days");
		leave.takingLeave();
	}

	

}
