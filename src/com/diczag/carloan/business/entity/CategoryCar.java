package com.diczag.carloan.business.entity;

import java.math.BigDecimal;
import java.util.List;

public abstract class CategoryCar {
	
	private List<Car> cars;

	private BigDecimal price;
	
	protected int day;
	
	public CategoryCar(int day) {
		this.day = day;
	}
	
	public void addCar(Car car) {
		cars.add(car);
	}
	
	public void addAllCar(List<Car> cars) {
		cars.addAll(cars);
	}
	
	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	
	public BigDecimal getPrice() {
		return price;
	}
	
	protected void setPrice(BigDecimal price) {
		this.price = price;
	}
	
}
