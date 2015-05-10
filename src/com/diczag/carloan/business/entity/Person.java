package com.diczag.carloan.business.entity;

public class Person {
	
	protected String taxCode;
	
	protected String name;
	
	protected String surname;
	
	protected char gender;
		
	protected String address;
	
	protected String telNumber;
	
	protected String eMail;
	
	public Person (String taxCode, String name, String surname,
			char gender, String address, String telNumber, String eMail) {
		this.taxCode = taxCode;
		this.name = name;
		this.surname = surname;
		this.gender = gender;
		this.address = address;
		this.telNumber = telNumber;
		this.eMail = eMail;
	}

	public String getTaxCode() {
		return taxCode;
	}

	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelNumber() {
		return telNumber;
	}

	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}
	
	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
}
