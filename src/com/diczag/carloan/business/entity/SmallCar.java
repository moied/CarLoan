package com.diczag.carloan.business.entity;

import java.math.BigDecimal;

import com.diczag.carloan.business.utility.PricePerDay;

public class SmallCar extends CategoryCar {
	
	public static final BigDecimal UNITPRICE = new BigDecimal("100");
	
	public SmallCar(int day) {
		super(day);
		super.setPrice(PricePerDay.calculate(UNITPRICE, day));
	}

}
