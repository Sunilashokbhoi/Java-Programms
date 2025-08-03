package com.Overriding.Variable_Hiding;
class Vehicle{
	public void run() {
		System.out.println("Generic Vehicle is running");
	}
}
class Car extends Vehicle{
	protected void run() {
		System.out.println("Car Vehicle is running");
	}
}
public class AccessibilityLevel {
	public static void main(String[] args) {
		Vehicle v = new Car();
		v.run();
	}
}
