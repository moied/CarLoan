package com.diczag.carloan.business.entity;

public class Customer extends User {;

	public Customer (String taxCode, String name, String surname,
			char gender, String address, String telNumber, String eMail) {
		
		super(taxCode, name, surname, gender, address, telNumber, eMail);
		this.isEmployee = false;
	}
}
