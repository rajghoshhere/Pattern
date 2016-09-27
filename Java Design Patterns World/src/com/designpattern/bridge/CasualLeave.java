package com.designpattern.bridge;

public class CasualLeave implements EmployeeLeave{

	@Override
	public void takingLeave() {
		System.out.println("Taking casual leave");
		
	}

}
