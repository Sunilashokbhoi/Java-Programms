package com.collections.Tasks.day;
final class Car implements Vehicle{
	public void run() {
		System.out.println("Car is running");
	}
}
final class Bike implements Vehicle{
	public void run() {
		System.out.println("Bike is Running..");
	}
}
public class Main {
	public static void main(String[] args) {
		Vehicle[] vehicle = {new Bike(),new Car()};		
		for(Vehicle v : vehicle)
		{
			v.run();
		}
	}
}

