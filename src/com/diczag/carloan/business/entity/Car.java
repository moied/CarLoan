package com.diczag.carloan.business.entity;

public class Car {

	private String plate;

	private String brand;
	
	private String model;
	
	private CategoryCar category;
	
	/*private Agency agency;

	public Car(String plate, String brand, String model, CategoryCar category, Agency agency) {
		this.plate = plate;
		this.brand = brand;
		this.model = model;
		this.category = category;
		this.agency = agency;
	}*/
	
	public String getPlate() {
		return plate;
	}

	public void setPlate(String plate) {
		this.plate = plate;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public CategoryCar getCategory() {
		return category;
	}

	public void setCategory(CategoryCar category) {
		this.category = category;
	}
	
	/*public Agency getAgency() {
		return agency;
	}

	public void setAgency(Agency agency) {
		this.agency = agency;
	}*/

}
