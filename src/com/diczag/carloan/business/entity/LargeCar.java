package com.diczag.carloan.business.entity;

import java.math.BigDecimal;

import com.diczag.carloan.business.utility.PricePerDay;

public class LargeCar extends CategoryCar {
	
	public static final BigDecimal UNITPRICE = new BigDecimal("200");
	
	public LargeCar(int day) {
		super(day);
		super.setPrice(PricePerDay.calculate(UNITPRICE, day));
	}

}