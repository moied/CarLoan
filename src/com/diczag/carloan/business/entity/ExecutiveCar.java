package com.diczag.carloan.business.entity;

import java.math.BigDecimal;

import com.diczag.carloan.business.utility.PricePerDay;

public class ExecutiveCar extends CategoryCar {
	
	public static final BigDecimal UNITPRICE = new BigDecimal("250");
	
	public ExecutiveCar(int day) {
		super(day);
		super.setPrice(PricePerDay.calculate(UNITPRICE, day));
	}

}
