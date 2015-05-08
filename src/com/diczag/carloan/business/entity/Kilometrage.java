package com.diczag.carloan.business.entity;

import java.math.BigDecimal;

import com.diczag.carloan.business.utility.PricePerDay;

public class Kilometrage extends Extra {
	
	public static final BigDecimal UNITPRICE = new BigDecimal("2.71");
	
	private static final int KMPERDAY = 100;
	
	private int kmTotal;

	public Kilometrage(int day, boolean active) {
		super(day, active);
		if (active)
			super.setPrice(PricePerDay.calculate(UNITPRICE, day));
		else
			super.setPrice(new BigDecimal("0"));
		kmTotal = KMPERDAY * day;
	}
	
	public int getKmTotal() {
		return kmTotal;
	}

}
