package com.diczag.carloan.business.entity;

import java.math.BigDecimal;

import com.diczag.carloan.business.utility.PricePerDay;

public class LuxuryCar extends CategoryCar {
	
	public static final BigDecimal UNITPRICE = new BigDecimal("300");
	
	public LuxuryCar(int day) {
		super(day);
		super.setPrice(PricePerDay.calculate(UNITPRICE, day));
	}

}