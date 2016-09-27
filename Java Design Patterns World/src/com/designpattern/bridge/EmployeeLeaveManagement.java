package com.designpattern.bridge;

import com.designpattern.bridge.Employee;

public class EmployeeLeaveManagement {

	public static void main(String[] args) {
		Employee employee = new Manager("Rajesh", 10, new CasualLeave());
		employee.processLeave();
		employee = new Manager("Vaishali", 1, new SickLeave());
		employee.processLeave();
	}

}
