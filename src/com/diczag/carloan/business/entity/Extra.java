package com.diczag.carloan.business.entity;

import java.math.BigDecimal;

public abstract class Extra {
	
	private BigDecimal price;
	
	protected int day;
	
	protected boolean active;
	
	public Extra(int day, boolean active) {
		this.day = day;
	}
	
	public boolean isActive() {
		return active;
	}

	public BigDecimal getPrice() {
		return price;
	}
	
	protected void setPrice(BigDecimal price) {
		this.price = price;
	}
	
}
