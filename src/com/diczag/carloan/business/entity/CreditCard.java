package com.diczag.carloan.business.entity;

import java.util.GregorianCalendar;

public class CreditCard {

	private String circuito;
	
	private String cardNumber;
	
	private String CVV;
	
	private GregorianCalendar expiration;
	
	public CreditCard (String circuito, String cardNumber, String CVV, int month, int year) {
		this.circuito = circuito;
		this.cardNumber = cardNumber;
		this.CVV = CVV;
		setExpiration(month, year);
	}
	
	public String getCircuito() {
		return circuito;
	}

	public void setCircuito(String circuito) {
		this.circuito = circuito;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCVV() {
		return CVV;
	}

	public void setCVV(String cVV) {
		CVV = cVV;
	}

	public GregorianCalendar getExpiration () {
		return expiration;
	}
	
	public void setExpiration (int month, int year) {
		expiration.set(year, month, 1);
	}	
}
