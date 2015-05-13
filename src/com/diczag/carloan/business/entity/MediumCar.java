package com.diczag.carloan.business.entity;

import java.math.BigDecimal;

import com.diczag.carloan.business.utility.PricePerDay;

public class MediumCar extends CategoryCar {

	public static final BigDecimal UNITPRICE = new BigDecimal("150");

	public MediumCar(int day) {
		super(day);
		super.setPrice(PricePerDay.calculate(UNITPRICE, day));
	}

}
