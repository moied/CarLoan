package com.diczag.carloan.business.entity;

public class Administrator extends User {

	public Administrator() {
		super();
		super.setActor(ACTOR.ADMINISTRATOR);
	}

}
