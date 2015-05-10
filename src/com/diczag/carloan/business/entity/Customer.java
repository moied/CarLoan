package com.diczag.carloan.business.entity;

import com.diczag.carloan.business.utility.LogIn;

public class Customer extends Person {
	
	private CreditCard card;
	private LogIn user;

	public Customer (String taxCode, String name, String surname,
			char gender, String address, String telNumber, String eMail, CreditCard card) {
		
		super(taxCode, name, surname, gender, address, telNumber, eMail);
		this.card = card;
	}
	
	public CreditCard getCard() {
		return card;
	}

	public void setCard(CreditCard card) {
		this.card = card;
	}
	
	public void setUser(String username, String password) {
		this.user = new LogIn(username, password);
	}
	
	public Boolean changePwd (String oldPwd, String newPwd) {
		return (user.changePassword(oldPwd, newPwd));
	}
	

}
