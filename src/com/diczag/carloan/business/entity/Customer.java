package com.diczag.carloan.business.entity;

public class Customer extends User {

	public Customer() {
		super();
		super.setActor(ACTOR.CUSTOMER);
	}
	
}
