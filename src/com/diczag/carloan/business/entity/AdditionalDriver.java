package com.diczag.carloan.business.entity;

import java.math.BigDecimal;
import com.diczag.carloan.business.utility.PricePerDay;

public class AdditionalDriver extends Extra {
	
	public static final BigDecimal UNITPRICE = new BigDecimal("3.14");
	
	private int number;
	
	public AdditionalDriver(int day, boolean active, int number) {
		super(day, active);
		if (active) {
			BigDecimal priceAdditionalDriver = UNITPRICE.multiply(new BigDecimal(String.valueOf(number)));
			super.setPrice(PricePerDay.calculate(priceAdditionalDriver, day));
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
