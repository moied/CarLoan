package com.diczag.carloan.business.entity;

public class Employee extends User {
	
	public Employee() {
		super();
		super.setActor(ACTOR.EMPLOYEE);
	}

}
