package com.designpattern.bridge;

public class SickLeave implements EmployeeLeave{

	@Override
	public void takingLeave() {
		System.out.println("Taking sick leave");
		
	}

}
