package com.interface_.Default_Method;
interface Vehicle{
	void run();
	void horn();
	default void digitalMeter() {
		System.out.println("Digital Meter Facility is coming soon !!!");
	}
}
class Car implements Vehicle{
	@Override
	public void run() {
		System.out.println("Car is runing");
	}
	@Override
	public void horn() {
		System.out.println("Car has Horn");
	}
	public void digitalMeter() {
		System.out.println("Car has Digital Meter Facility");
	}
}
class Bike implements Vehicle {
	public void run() {
		System.out.println("Bike is Running");
	}
	public void horn() {
		System.out.println("Bike has Horn");
	}
}
public class DefaultMethod {
	public static void main(String[] args) {
		Vehicle v = null;
		v = new Car();
		v.run();
		v.horn();v.digitalMeter();
		
		v = new Bike(); 
		v.run(); v.horn();
		v.digitalMeter();
	}
}
