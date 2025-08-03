package com.inheritance_programs.lambda;
interface Vehicle{
	void run();
}
public class LambdaDemo1 {
	public static void main(String[] args) {
		Vehicle car = () -> System.out.println("Car is Running ");
		car.run();
		Vehicle bike = ()-> System.out.println("Bike is Running ");
		bike.run();
		Vehicle bus = ()-> System.out.println("Bus is Running ");
		bus.run();
		Vehicle truck = ()-> System.out.println("Truck is Running ");
		truck.run();
		Vehicle bikes = ()-> System.out.println("Bikes ");
		bikes.run();
	}
}
