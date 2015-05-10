package com.diczag.carloan.business.entity;

import java.math.BigDecimal;

import com.diczag.carloan.business.utility.PricePerDay;

public class SafetySeat extends Extra {

	public static final BigDecimal UNITPRICE = new BigDecimal("1.62");	//sezione aurea
	
	private int number;

	public SafetySeat(int day, boolean active, int number) {
		super(day, active);
		if (active) {
			BigDecimal priceSafetySeat = UNITPRICE.multiply(new BigDecimal(String.valueOf(number)));
			super.setPrice(PricePerDay.calculate(priceSafetySeat, day));
		} else {
			super.setPrice(new BigDecimal("0"));
		}
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}


}
