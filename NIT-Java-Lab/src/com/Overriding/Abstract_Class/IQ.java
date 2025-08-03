package com.Overriding.Abstract_Class;

abstract class Vehicle {
	protected int speed = 120;

	public Vehicle() {
		System.out.println("Vehicle class Contructore ");
	}

	public  void getVehicleDetails() {
		System.out.println("Vehicle has 4 wheels ...");
	}

	public abstract void run();
}

class Car extends Vehicle{
	public void run() {
		System.out.println("Car is Running");
	}
}
public class IQ {
	public static void main(String[] args) {
		Vehicle v = new Car();
		System.out.println("Speed is :"+v.speed);
		v.getVehicleDetails();
		v.run();
		
	}
}
