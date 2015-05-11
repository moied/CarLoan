package com.diczag.carloan.business.entity;

public class Employee extends User{
	
	Agency employer;
	
	public Employee (String taxCode, String name, String surname,
			char gender, String address, String telNumber, String eMail) {
		
		super(taxCode, name, surname, gender, address, telNumber, eMail);
		this.isEmployee = true;
	}

	public Agency getAgency() {
		return employer;
	}

	public void setAgency(Agency agency) {
		this.employer = agency;
	}

}
