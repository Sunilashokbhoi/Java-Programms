
package com.Overriding.method_overriding;
class Vehicle {
	public int fuelCapacity() {
		return 40;
	}
	public void printTankCapacity() {
		System.out.println(this.fuelCapacity());
	}
}
class Car extends Vehicle{
	public int fuelCapacity(){
		return 18;
	}
	public void printTankCapacity() {
		System.out.println(super.fuelCapacity());
	}
}
public class IQ {
	public static void main(String[] args) {
		Vehicle v = new Car();
		v.printTankCapacity();//40
	}
}
