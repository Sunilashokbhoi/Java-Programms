package com.java.Assignment_6;

class Vehicle {
	protected String make;
	protected String model;
	protected int year;
	public Vehicle(String make, String model, int year) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
	}
	public void displayDetails() {
		System.out.println("Make: "+make);
		System.out.println("Model: "+model);
		System.out.println("Year: "+year);
	}
}
class Car extends Vehicle{
	protected int numberOfDoors;

	protected Car(String make, String model, int year, int numberOfDoors) {
		super(make, model, year);
		this.numberOfDoors = numberOfDoors;
	}
	
	
	public void displayDetails() {
		System.out.println("Make: "+make);
		System.out.println("Model: "+model);
		System.out.println("Year: "+year);
	}
	
}




