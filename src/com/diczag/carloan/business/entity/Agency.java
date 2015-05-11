package com.diczag.carloan.business.entity;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Agency {
	
	private int code = 0;
	
	private String city;
	
	private String address;
	
	private String telNumber;
	
	private String faxNumber;
	
	private List<Employee> employee;
	
	private List<Car> cars;

	public Agency (int code, String city, String address, String telNumber, String faxNumber) {
		this.code = code;
		
		this.city = city;
		this.address = address;
		this.telNumber = telNumber;
		this.faxNumber = faxNumber;	
		
		cars = new LinkedList<Car>();
	}
	
	
	public int getCode () {
		return code;
	}
	
	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getTelNumber() {
		return telNumber;
	}


	public void setTelNumber(String telNumber) {
		this.telNumber = telNumber;
	}


	public String getFaxNumber() {
		return faxNumber;
	}


	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}
	
	// metodi per employee
	
	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	
	public void addEmployee (Employee e) {
		employee.add(e);
	}
	
	public void addAllEmployee (List<Employee> emp) {
		employee.addAll(emp);
	}
	
	public Boolean searchEmployee (Employee e) {
		return employee.contains(e);
	}
	
	public Boolean removeEmployee (Employee e) {
		return employee.remove(e);
	}
	
	// metodi per cars
	
	public List<Car> getCars() {
		return cars;
	}
	
	public void addCar (Car c) {
		c.setAgency(this);
		this.cars.add(c);
	}
	
	public void addAllCars (List<Car> cars) {
		for(Car c : cars) 
			addCar(c);	
	}
	
	public Boolean removeCar (Car c) {
		return cars.remove(c);
	}


}
