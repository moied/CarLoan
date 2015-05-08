package com.diczag.carloan.business.entity;

import java.math.BigDecimal;

import com.diczag.carloan.business.utility.PricePerDay;

public class Insurance extends Extra {
	
	public static final BigDecimal UNITPRICE = new BigDecimal("141.42");
	
	public Insurance(int day, boolean active) {
		super(day, active);
		if (active)
			super.setPrice(PricePerDay.calculate(UNITPRICE, day));
		else
			super.setPrice(new BigDecimal("0"));
	}
	
}
