package com.diczag.carloan.business.entity;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Driver extends User {
	
	private String license;
	private GregorianCalendar birthDate;
	
	public Driver (String taxCode, String name, String surname,
			char gender, String address, String telNumber, String eMail, String license, GregorianCalendar birthDate) {
		
		super(taxCode, name, surname, gender, address, telNumber, eMail);
		this.license = license;
		this.birthDate = birthDate;
	}
	
	public int getAge () {
		
		int birthDay = birthDate.get(Calendar.DAY_OF_MONTH);
		int birthMonth = birthDate.get(Calendar.MONTH);
		int birthYear = birthDate.get(Calendar.YEAR);
		
		int currentDay = GregorianCalendar.getInstance().get(Calendar.DAY_OF_MONTH);
		int currentMonth = GregorianCalendar.getInstance().get(Calendar.MONTH);
		int currentYear = GregorianCalendar.getInstance().get(Calendar.YEAR);
		
		if (((birthMonth == currentMonth) && (birthDay <= currentDay)) || (birthMonth <= currentMonth))
			return currentYear - birthYear;
		else 
			return (currentYear - birthYear) - 1;		
	}
}
