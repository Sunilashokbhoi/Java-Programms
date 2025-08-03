package com.Overriding.Intance_Operators;
class Vehicle{
	public void run() {
		System.out.println("Vehicle is running");
	}
}
class BMW extends Vehicle{
	
}
class Audi extends Vehicle{
	
}
public class InstanceOfDemo4 {
	public static void main(String[] args) {
		Audi a = new Audi();
		acceptCarType(a);
		BMW b = new BMW();
		acceptCarType(b);
	}
	public static void acceptCarType(Vehicle v) {
		if(v instanceof BMW) {
			//System.out.println(""+v);
			System.out.println("BMW car");
		}
		else {
			//System.out.println(v);
			System.out.println("Audi Car");
		}
	}
}

