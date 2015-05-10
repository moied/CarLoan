package com.diczag.carloan.business.entity;

public class Driver extends Person {
	
	String license;
	
	public Driver (String taxCode, String name, String surname,
			char gender, String address, String telNumber, String eMail, String license) {
		
		super(taxCode, name, surname, gender, address, telNumber, eMail);
		this.license = license;
	}
}
