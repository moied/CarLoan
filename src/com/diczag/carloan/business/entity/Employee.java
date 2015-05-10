package com.diczag.carloan.business.entity;

public class Employee extends Person{
	
	String agency;
	
	public Employee (String taxCode, String name, String surname,
			char gender, String address, String telNumber, String eMail, String agency) {
		
		super(taxCode, name, surname, gender, address, telNumber, eMail);
		this.agency = agency;
	}

	public String getAgency() {
		return agency;
	}

	public void setAgency(String agency) {
		this.agency = agency;
	}

}
